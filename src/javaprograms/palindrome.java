package javaprograms;

public class palindrome {
	
	static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Aabbaa";
		str=str.toLowerCase();
		
		if(isPalindrome(str)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}

	}

}
