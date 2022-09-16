package kr.co.greenart.model.file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
@Repository
public class FileSystemRepository implements FileRepository{

	private final File saveFolder = new File("d:\\temp\\");
	private final Path root = Paths.get("d:\\temp\\");
	//파일경로찾기
	@Override
	public Resource getByname(String fileName) {
		try {
			return new UrlResource(new File(saveFolder.getAbsolutePath() 
					+ File.separatorChar 
					+ fileName).toURI());
		} catch (MalformedURLException e) {
			return null;
		}
	}


	@Override
	public List<String> getAllnames() {
		File[] filearr = saveFolder.listFiles(new FileFilter() { // 필터로 디렉터리가 아닌것들만 가져오려고 씀 (폴더말고 파일만 가져오려고)
			@Override
			public boolean accept(File pathname) {
				return !pathname.isDirectory();
			}
		});
		List<String> list = new ArrayList<String>();
		for (File f : filearr) {
			list.add(f.getName());
		}
		
		return list;
		// 스트림에는 여러개가있을수있는데 원하는것만 골라서 넣어줄수있다.
				// 자바는 함수를 객체로 표현못하기에 인터페이스로 함수 하나를 구현한다. (람다식이라는 표현으로 만듬)
	}

	@Override
	public int save(MultipartFile file) {
		File saveFolder = new File("d:\\temp\\");
		if(!saveFolder.exists()) {
			saveFolder.mkdir();
		}
		try {
			file.transferTo(new File(saveFolder.getAbsolutePath() 
					+ File.separatorChar 
					+ file.getOriginalFilename()));
			return 1;
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

}
