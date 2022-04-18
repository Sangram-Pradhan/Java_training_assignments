package assignments;

import java.util.Scanner;

public class SubstringDemo {
	
	 public static void main(String[] args) {
		 
		 StringBuffer strbuf = new StringBuffer();
		 
		 System.out.print("Enter a string: "); 
		 Scanner sc = new Scanner(System.in); 
		 strbuf.append(sc.nextLine());
		 
		 System.out.print("Enter a Substring index: ");
		 int val = sc.nextInt();
		 
		 System.out.println("SubString is : "+ strbuf.substring(val));
		 
	 }
	    
		 
		 
}
