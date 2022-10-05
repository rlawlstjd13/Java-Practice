package kr.co.greenart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {
//보드맵퍼(인터페이스)가져와서 서비스로만들기-> 다시컨트롤러감
	@Autowired
	private BoardMapper dao;
	
	//최초에 dao였는데 dto로바꿈?
	@Transactional(readOnly = true)
	public BoardDto getAll() {
		return new BoardDto(dao.getAll(), dao.getCount());
	}

	public int write(Article a) {
		 return dao.write(a);
		
	}
}
