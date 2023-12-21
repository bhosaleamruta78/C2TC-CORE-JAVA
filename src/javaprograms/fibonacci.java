package javaprograms;

public class fibonacci {
	
	static void fibonacci(int n) {
		int num1=0,num2=1;
		for(int i=0;i<n;i++) {
			System.out.print(num1+" ");
			
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		
		fibonacci(num);
	}

}
