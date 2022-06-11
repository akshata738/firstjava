import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.globalpayex.college.entities.Student;

public class SearchStdent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student> map = new HashMap<>();
		map.put(10, new Student("Akshata",'f',10,95));
		map.put(20,  new Student("Ajinkya",'M',11,98));
		map.put(30,  new Student("Aishu",'f',12,90));
		map.put(40,  new Student("Akshay",'M',13,91));
		map.put(50,  new Student("Komal",'f',14,92));
		System.out.println("Enter Roll No of Student You Want To Choose : ");
		Scanner scanner = new Scanner(System.in);
		int roll=scanner.nextInt();
		Student student = map.get(roll);
		Set<Integer> keys =map.keySet();
		Set<Map.Entry<Integer , Student>> entries = map.entrySet();
		for (Map.Entry<Integer,Student> entry : entries) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
		
		
		Collection<Student> students = map.values();
		System.out.println(students);
		System.out.println(keys);
	    if (map.containsKey(roll)) {
	    	
	    	System.out.println("Found");
	    	System.out.println(student.getdetails());
//	    	System.out.println();
	    }
	    else {
	    	System.out.println("Not Found");
	    }
		
		

	}

}
