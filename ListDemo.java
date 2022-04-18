package assignments;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String args[])
    {
    
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(42);
        list.add(78);
        list.add(34);
        list.add(36);
        list.add(63);
        list.add(73);
        list.add(13);
        list.add(93);
        list.add(83);
        list.add(53);
        
        System.out.println("ArrayList : " + list);
        System.out.println("The element at index 10 is " + list.get(9));
        
}
}