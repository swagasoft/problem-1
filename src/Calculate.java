import java.io.*;

public class Calculate {
	
//	method to divide integer a and b
	static int divideMethod (int dividend, int divisor) {
		
//		sign will be negative if either one of them is negative, otherwise sign = positive
		int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
		
		
////		update both value as positive
//		dividend = Math.abs(dividend);
//		divisor = Math.abs(divisor);
//		
//		quotient initialize
		int quotient = 0;
	
		
				
		while (dividend >= divisor ) {
			dividend -= divisor;
			++quotient;
			
			
			
		}
		
		
		//calculate remainder	
		int remainder = Math.round(dividend);
		System.out.println("Remaider : "+ remainder);
		
		
		return sign * quotient;
		
	}
	

	public static void main(String[] args) {
		
		
		int a = 7;
		int b = 5;
		System.out.printf("input value is %d and  %d  ",a ,b );
		System.out.println(" Result....");
		System.out.println("quotient is : "+ divideMethod(a, b));
		

	
	}

}
