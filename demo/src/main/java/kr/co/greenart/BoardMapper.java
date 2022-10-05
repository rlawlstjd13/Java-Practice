package kr.co.greenart;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
//매퍼라고하면 마이바티스(일회용db) 매퍼가됨 바로 sql적을수있ㅇ므.
//dao 기능
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {
	@Select("SELECT * FROM board")
	@Results(id = "boardResult", value = { @Result(property = "no", column = "no", id = true),
			@Result(property = "title", column = "title"), @Result(property = "writer", column = "writer") })
	List<Article> getAll();
	
	//개수?(dto?)
	@Select("SELECT COUNT(*) FROM board")
	int getCount();

	@Insert("INSERT INTO board(title, writer) values(#{title}, #{writer})")
	int write(Article a);

}
