package javaprograms;

public class prime {
	
	 static boolean isprime(int num) {
		 if(num<=1) {
			 return false;
		 }
		 
		 for(int i=2;i<num;i++) {
			 if(num%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isprime(16)) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		if(isprime(5)) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}

}
