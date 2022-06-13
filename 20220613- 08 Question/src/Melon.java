
public class Melon extends Food {
	private String originfarm;

	

	public Melon(int kcal, int price, double weight, String originfarm) {
		super(kcal, price, weight);
		this.originfarm = originfarm;
	}

	public String getOriginfarm() {
		return originfarm;
	}

	public void setOriginfarm(String originfarm) {
		this.originfarm = originfarm;
	}
	@Override
	public String toString() {
		return super.toString() + "경장 농원정보:" + originfarm;
	}
	

	
	
	

}
