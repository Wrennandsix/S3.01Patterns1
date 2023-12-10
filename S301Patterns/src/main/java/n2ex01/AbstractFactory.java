package n2ex01;	

public interface AbstractFactory {
	
	public Phone createPhone(String number);
	
	
	public Address createAddress(String city, String street,int streetNumber, int postalCode, int floor, char door);

	
	public PhoneBook createPhoneBook();

}
