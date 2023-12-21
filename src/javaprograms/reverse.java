package javaprograms;
import java.util.*;
import java.io.*;
import java.lang.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="TNS Foundation";
		char[] tempArray=name.toCharArray();
		int n=tempArray.length;
		
		int left,right=0;
		right=tempArray.length-1;
		
		for(left=0;left<right;left++,right--) {
			char temp=tempArray[left];
			tempArray[left]=tempArray[right];
			tempArray[right]=temp;
		}
		
		String reverse=new String(tempArray);
		System.out.println("Reversed String: "+reverse);
	}

}
