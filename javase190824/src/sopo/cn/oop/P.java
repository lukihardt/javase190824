package sopo.cn.oop;

public class P {
	private String id;
	private int age;
	private String telString;
	private String addressString;
	private String carBandString;
	private String occupyString;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelString() {
		return telString;
	}
	public void setTelString(String telString) {
		this.telString = telString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public String getCarBandString() {
		return carBandString;
	}
	public void setCarBandString(String carBandString) {
		this.carBandString = carBandString;
	}
	public String getOccupyString() {
		return occupyString;
	}
	public void setOccupyString(String occupyString) {
		this.occupyString = occupyString;
	}
	@Override
	public String toString() {
		return "P [id=" + id + ", age=" + age + ", telString=" + telString + ", addressString=" + addressString
				+ ", carBandString=" + carBandString + ", occupyString=" + occupyString + "]";
	}
	
}
