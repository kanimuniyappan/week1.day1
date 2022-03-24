package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int input= 13;
		boolean flag= false;
		
for(int i =2;i<input; i++) {
	if(i%2 ==0) {
		System.out.println("it is not a prime number");
		flag = true;
		break;
	}
	if(flag == false) {
		System.out.println("it is prime number");
	}
}
	}

}
