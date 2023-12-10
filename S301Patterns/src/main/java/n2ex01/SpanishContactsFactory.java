package n2ex01;

public class SpanishContactsFactory implements AbstractFactory {

	@Override
	public Phone createPhone(String number) {
	
		return new SpanishPhone(number);
	}

	@Override
	public Address createAddress(String city, String street, int streetNumber, int postalCode, int floor, char door) {
	
		return new SpanishAddress(city, street,streetNumber, postalCode, floor, door);
	}

	public PhoneBook createPhoneBook() {
		
		return new SpanishPhoneBook();
	}

}
