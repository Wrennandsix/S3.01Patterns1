package n2ex01;

public class SpanishPhone implements Phone{

	private String phoneNum;
	private static final String PREFIX = "+34";
	
	public  SpanishPhone(String phoneNum) {
		
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
		return "Spanish Phone [phoneNum=" + phoneNum + "]";
	}
	@Override
	public void showPhoneNum() {
		System.out.println(phoneNum);
			
	}

}
