package n2ex01;

public class ItalianPhone implements Phone {

	private String phoneNum;
	private static final String PREFIX = "+39";
	
	public  ItalianPhone(String phoneNum) {
		
		this.phoneNum = PREFIX + phoneNum;	
	}
	
	
	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	@Override
	public String toString() {
		return "Italian Phone [phoneNum=" + phoneNum + "]";
	}
	@Override
	public void showPhoneNum() {
		System.out.println(phoneNum);
			
	}

}
