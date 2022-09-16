package kr.co.greenart.model.file;

import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
@Repository
public interface FileRepository {
	public org.springframework.core.io.Resource getByname(String fileName);
	public List<String> getAllnames();
	public int save(MultipartFile file);

}
