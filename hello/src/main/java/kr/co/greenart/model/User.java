package kr.co.greenart.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;



public class User {
	private int id;
	//자동 유효성 검사 pom에 라이브러리추가햇음
	@NotBlank(message = "이름을 입력해주세요")
	@Size(min = 1, max = 4, message = "이름은 1 ~ 4자 사이여야합니다.")
	private String name;
	@Positive(message = "양수를 입력하세요")
	@Max(value = 100, message = "최대값(100)을 초과했습니다.")
	private int age;
	
	public User() {
		
	}
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	

}
