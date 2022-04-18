package assignments;

import java.util.Arrays;

public class StringEqual {
	   public static void main(String[] args)
	    {
		   String str1 = "amar";
		   String str2 = "rama";
		   System.out.println(sameChars(str1,str2));
		   
	    }
	   
	   static boolean sameChars(String str1, String str2) {
		   char[] first = str1.toCharArray();
		   char[] second = str2.toCharArray();
		   Arrays.sort(first);
		   Arrays.sort(second);
		   return Arrays.equals(first, second);
		 }
	    

}
