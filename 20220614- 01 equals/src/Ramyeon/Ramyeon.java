package Ramyeon;

public class Ramyeon {
	private String make;
	private String name;
	private int price;

	public Ramyeon(String make, String name, int price) {
		super();
		
		this.make = make;
		this.name = name;
		this.price = price;
	}


	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ramyeon [make=" + make + ", name=" + name + ", price=" + price + "]";
	}
//    @Override
//	public boolean equals(Object o) {
//		if (o instanceof Ramyeon) {// 맞으면true 아니면 false
//			Ramyeon other = (Ramyeon) o;
//			return this.make.equals(other.make) && this.name.equals(other.name);
//		}else {
//				return false;
//			}
//		}


	@Override
	public int hashCode() { // 숫자표현..
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ramyeon))
			return false;
		Ramyeon other = (Ramyeon) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
			
    }


