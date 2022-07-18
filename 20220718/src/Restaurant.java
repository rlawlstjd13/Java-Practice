// 레스토랑 클래스
public class Restaurant {
	private int restaurantID;
	private String name;
	private String number;
	private String address;

	public Restaurant(int restaurantID, String name, String number, String address) {
		super();
		this.restaurantID = restaurantID;
		this.name = name;
		this.number = number;
		this.address = address;
	}
	
	public Restaurant(String name, String number, String address) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
	}

	public int getRestaurantsID() {
		return restaurantID;
	}
	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantID=" + restaurantID + ", name=" + name + ", number=" + number + ", address="
				+ address + "]";
	}
	
	
	
	
	

}
