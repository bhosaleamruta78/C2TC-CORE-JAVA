package javaprograms;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Amruta";
		 System.out.println("The string is:" + str);
		str=str.toLowerCase();
	      char[] carray = str.toCharArray();
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	}

}
