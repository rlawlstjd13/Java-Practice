package Car;

public class Car {
	private String model;
	
	public Car(String model) 
	{this.model = model;}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car)
			return model.equals(((Car)obj).model); // equals 재정의 String equals를 호출해 문자열이 동일한지 검사.
			else
				return false;
	}

}
