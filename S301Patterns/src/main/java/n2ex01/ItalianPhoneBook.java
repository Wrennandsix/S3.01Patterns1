package n2ex01;

import java.util.ArrayList;

public class ItalianPhoneBook implements PhoneBook {
	
	private ArrayList<Address> italianAddresses = new ArrayList<Address>();	
	private ArrayList<Phone> italianPhones = new ArrayList<Phone>();
	
	@Override
	public void addAddressValue(Address address) {
		italianAddresses.add(address);
		
	}

	@Override
	public void addPhoneValue(Phone phone) {
	italianPhones.add(phone);
		
	}

	@Override
	public void showPhones() {
		System.out.println(italianPhones);
		
	}

	@Override
	public void showAddresses() {
		System.out.println(italianAddresses);
		
	}

}
