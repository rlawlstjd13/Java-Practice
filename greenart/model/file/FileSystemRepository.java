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
	//���ϰ��ã��
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
		File[] filearr = saveFolder.listFiles(new FileFilter() { // ���ͷ� ���͸��� �ƴѰ͵鸸 ���������� �� (�������� ���ϸ� ����������)
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
		// ��Ʈ������ ���������������ִµ� ���ϴ°͸� ��� �־��ټ��ִ�.
				// �ڹٴ� �Լ��� ��ü�� ǥ�����ϱ⿡ �������̽��� �Լ� �ϳ��� �����Ѵ�. (���ٽ��̶�� ǥ������ ����)
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
