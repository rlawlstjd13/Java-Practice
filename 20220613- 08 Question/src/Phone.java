
public class Phone {
	private String make;
	private int price;
	private String type;

//	public Phone() {
//
//	}

	public Phone(String make, int price, String type) {
		this.make = make;
		this.price = price;
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "제조사" + make + ", 가격:" + price + ", 통신타입" + type;
	}

}
