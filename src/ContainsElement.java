import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

import com.globalpayex.college.entities.Student;

import java.util.*;

public class ContainsElement {
	public static void main(String[] args) {
		List<Student> students=Arrays.asList(
				new Student("Akshata",'f',10,95),
				new Student("Komal",'f',11,92)
				
				);
		System.out.println("Enter Roll No of Student You Want To Choose : ");
		Scanner scanner = new Scanner(System.in);
		int roll=scanner.nextInt();
		boolean isfound = students.contains(new Student("na",'f',roll,0));
		System.out.println(roll);
		System.out.println(isfound ? "Found" : "Not Found");
		
//		for (Student student:students) {
//			if (student.roll== roll) {
//				System.out.println(student.getdetails());
//			}
//			
//		}
//		System.out.println("Not Found");
//		for (Student student:students) {
//			if (student.roll!
//		= roll) {
//				System.out.println("not found");
//			}
//		}
			
			
		
				
		
	}

	

}
