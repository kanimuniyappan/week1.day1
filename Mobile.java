package week1.day1;

public class Mobile {
	
	String mobileModule = "REAL123";
	Float mobileWeight = 5.6f;
	Boolean isFullCharged = true;
	int mobileCost = 10000;
	
	

	public void makeCall() {
		System.out.println("Calling");

	}
	public void sendMsg() {
		System.out.println("Message Send");

	}
	public static void main(String[] args) {

		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println(myMobile.mobileModule);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.isFullCharged);
		System.out.println(myMobile.mobileCost);
	}

	}

