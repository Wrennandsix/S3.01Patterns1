package n2ex01;

public class ItalianContactsFactory implements AbstractFactory {

	@Override
	public Phone createPhone(String number) {
	
		return new ItalianPhone(number);
	}

	@Override
	public Address createAddress(String city, String street, int streetNumber, int postalCode, int floor, char door) {
	
		return new ItalianAddress(city, street,streetNumber, postalCode, floor, door);
	}

	public PhoneBook createPhoneBook() {
		
		return new ItalianPhoneBook();
	}

}
