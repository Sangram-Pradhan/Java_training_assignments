package assignments;

import java.util.Scanner;

public class StringException {
	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string: "); 
		str = sc.nextLine();
		
		System.out.println("Length of the String: "+str.length());
		for(int i=0; i<str.length(); i++) {
	         System.out.println(str.charAt(i));
	      }
		
		System.out.println("Enter the String index value to access: ");
		int len = sc.nextInt();
		
		System.out.println(str.charAt(len));
		
		 
	}

}
