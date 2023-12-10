package n2ex01;

public class ItalianAddress implements Address {
	
	private String city;
	private String street;
	private int streetNumber;
	private int postalCode;
	private int floor;
	private char door;
	private static final String COUNTRY  = "Italy";
	

	public ItalianAddress(String city, String street, int streetNumber, int postalCode, int floor,char door){	
		this.city = city;
		this.street = street;
		this.streetNumber = streetNumber;
		this.postalCode = postalCode;
		this.floor = floor;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Country: "+COUNTRY+" [city=" + city + ", street=" + street + ", streetNumber=" + streetNumber
				+ ", postalCode=" + postalCode + ", floor=" + floor + ", door=" + door + "]";
	}

	@Override
	public void showAddress() {
		System.out.println("Country: "+COUNTRY+" [city=" + city + ", street=" + street + ", streetNumber=" + streetNumber
				+ ", postalCode=" + postalCode + ", floor=" + floor + ", door=" + door + "]");	
	}

	public static String getCountry() {
		return COUNTRY;
	}
}
