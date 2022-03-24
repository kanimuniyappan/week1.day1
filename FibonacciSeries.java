package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int FirstNumber =0, SecNum =1, Sum =0, range  =8;
		
		
		for (int i=2; i<=range; i++) {
		
		 Sum = FirstNumber+SecNum;
		System.out.println(""+Sum);
		FirstNumber=SecNum;
		SecNum=Sum;
		
				
				
	}
	}

}
