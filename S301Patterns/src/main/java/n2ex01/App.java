package n2ex01;



public class App {

	public static void main(String[] args) {
		
	   	AbstractFactory italianFactory = new ItalianContactsFactory();
	 	AbstractFactory spanishFactory = new SpanishContactsFactory();
	 	
    	PhoneBook italianPhoneBook = italianFactory.createPhoneBook();
    	Phone italianPhone = italianFactory.createPhone("783985442");
    	Address italianAddress = italianFactory.createAddress("Sicilia","Pasta street",25,556984,3,'2');
    	italianPhoneBook.addAddressValue(italianAddress);
    	italianPhoneBook.addPhoneValue(italianPhone);
    	italianPhoneBook.showAddresses();
    	italianPhoneBook.showPhones();
    	
    			
	   	
    	PhoneBook spanishPhoneBook = spanishFactory.createPhoneBook();
    	Phone spanishPhone = spanishFactory.createPhone("669854112");
    	Address spanishAddress = spanishFactory.createAddress("Barcelona","Carrer llull",25,556984,5,'B');
    	spanishPhoneBook.addAddressValue(spanishAddress);
    	spanishPhoneBook.addPhoneValue(spanishPhone);
    	spanishPhoneBook.showAddresses();
    	spanishPhoneBook.showPhones();
		
	}
}

