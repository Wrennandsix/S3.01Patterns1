package n2ex01;

import java.util.ArrayList;

public class SpanishPhoneBook implements PhoneBook {

	
		private ArrayList<Address> spanishAddresses = new ArrayList<Address>();	
		private ArrayList<Phone> spanishPhones = new ArrayList<Phone>();
		
		@Override
		public void addAddressValue(Address address) {
			spanishAddresses.add(address);
			
		}

		@Override
		public void addPhoneValue(Phone phone) {
		spanishPhones.add(phone);
			
		}

		@Override
		public void showPhones() {
			System.out.println(spanishPhones);
			
		}

		@Override
		public void showAddresses() {
			System.out.println(spanishAddresses);
			
		}

	}