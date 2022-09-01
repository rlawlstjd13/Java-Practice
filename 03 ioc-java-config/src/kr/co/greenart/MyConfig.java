package kr.co.greenart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//config를 클래스로만듬.
@Configuration
//component이며 설정을 가지고있는 component
@ComponentScan(value = "kr.co.greenart")
public class MyConfig {
	@Bean
	//Bean의 이름으로 쓰고싶은것을 메소드명으로 정의.
	public List<Integer> myList() {
		return new ArrayList<>(Arrays.asList(1,2,3,4,5));
	}
	
	@Bean
	public Set<Integer> mySet() {
		return new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
	}
	

}
