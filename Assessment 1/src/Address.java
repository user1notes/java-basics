
public class Address {

	private String city;
	private String state;
	private String pin;
	private String phone;
	private String house;
	private String street;

	public Address(String city, String state, String pin, String phone, String house, String street) {
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.phone = phone;
		this.house = house;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "\nHouse :" + house + "\nStreet :" + street + "\nCity: " + city + "\nState :" + state + "\nPIN :" + pin
				+ "\nPhone number :" + phone + "\n";
	}

}
