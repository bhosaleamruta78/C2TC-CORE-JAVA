package javaprograms;

public class factorial {
	
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return(n*factorial(n-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=6;
		int fact=factorial(number);
		System.out.println("factorial of "+number+" is "+fact);

	}

}
