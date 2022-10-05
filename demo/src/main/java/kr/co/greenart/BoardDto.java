package kr.co.greenart;

import java.util.List;
//data transform (전송객체?)
public class BoardDto {
	private List<Article> list;
	private int totalpage;

	public BoardDto() {
		
	}

	public BoardDto(List<Article> list, int totalpage) {
		super();
		this.list = list;
		this.totalpage = totalpage;
	}

	public List<Article> getList() {
		return list;
	}

	public void setList(List<Article> list) {
		this.list = list;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	
}
