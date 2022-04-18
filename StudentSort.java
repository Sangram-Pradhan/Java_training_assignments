package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentSort {
	
	 public static void main(String[] args) {
	        List<Student> studentList= new ArrayList<>();
	        studentList.add(new Student("Ram", 58, 8.00));
	        studentList.add(new Student("Ajay", 40, 6.00));
	        studentList.add(new Student("Jag", 25, 7.00));
	        studentList.add(new Student("Anil", 35, 5.00));
	        
	        
	        System.out.println("printing student list" + studentList);


	        Collections.sort(studentList);
	        System.out.println("sorted list");
	        for (Student student : studentList) {
	            System.out.println(student);
	        }

	        for (Student student : studentList){
	            if(student.getName().startsWith("A") || student.getName().startsWith("J")){
	                studentList.remove(student);
	            }
	        }
	        System.out.println("printing student list");
	        for (Student student : studentList) {
	            System.out.println(student);
	        }



	    }
}
