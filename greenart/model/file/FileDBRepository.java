package kr.co.greenart.model.file;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
@Primary
public class FileDBRepository implements FileRepository{
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public Resource getByname(String fileName) {
		byte[] blob = jdbc.queryForObject("SELEC file FROM files WHERE name=?"
				, byte[].class
				, fileName);
		return new ByteArrayResource(blob); //?? 이진자원을바로?
	}

	@Override
	public List<String> getAllnames() {
		return jdbc.queryForList("SELECT name FROM files", String.class);
	}

	@Override
	public int save(MultipartFile file) {
		
		try {
		return jdbc.update("INSERT INTO files (name, file) VALUES (?,?)"
				, file.getOriginalFilename()
				, file.getClass());
		} catch(DataAccessException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	

}
