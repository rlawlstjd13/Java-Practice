import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Animal {
	private String type; // 종
	private int age; // 나이
	private double weight; // 무게
	private boolean category; // 육식 or 초식
	//AnimalType Type;
	
	public Animal() {
		
	}
	public Animal(String type, int age, double weight, boolean category) {
		super();
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isCategory() {
		return category;
	}
	public void setCategory(boolean category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", weight=" + weight + ", category=" + category + "]";
	}
}
	
	
