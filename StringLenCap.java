package assignments;

import java.util.Scanner;

public class StringLenCap {
	   public static void main(String[] args)
	    {
		   
		   	System.out.print("Enter a string: "); 
			 Scanner sc = new Scanner(System.in); 
			 
			 
			 StringBuffer strbuf = new StringBuffer(); 
			 strbuf.append(sc.nextLine());
			 
			 System.out.println("The StringBuffer String Capacity is: " + strbuf.capacity());
			 System.out.println("The StringBuffer String Length is: " + strbuf.length());
			 
			 System.out.println("=======================================");
			 
			 System.out.print("Enter a string: "); 
			 StringBuilder strbuild = new StringBuilder(); 
			 strbuild.append(sc.nextLine());
			 System.out.println("The StringBuilder String Capacity is: " + strbuild.capacity());
			 System.out.println("The StringBuilder String Length is: " + strbuild.length());
	    }
}
