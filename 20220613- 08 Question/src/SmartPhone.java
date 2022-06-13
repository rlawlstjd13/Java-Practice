
public class SmartPhone extends Phone{
	private String ost;
	private String osv;
	private String memory;
	private String camera;
	private String bluetooth;
	public SmartPhone(String make, int price, String type, String ost, String osv, String memory, String camera,
			String bluetooth) {
		super(make, price, type);
		this.ost = ost;
		this.osv = osv;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}
	public String getOst() {
		return ost;
	}
	public void setOst(String ost) {
		this.ost = ost;
	}
	public String getOsv() {
		return osv;
	}
	public void setOsv(String osv) {
		this.osv = osv;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
	@Override
	public String toString() {
		return super.toString() +"운영체제" + ost + ", 운영버젼" + osv + ", 메모리크기" 
				+ memory + ", 카메라 유무" + camera + ", 블루투스 유무" + bluetooth;
	}
	
	
	

}
