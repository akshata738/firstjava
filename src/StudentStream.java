import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.Student;

public class StudentStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students =Arrays.asList(
				new Student("jkhsajd",'m',10,20),
				new Student("abc",'m',20,90),
				new Student("jkh",'m',10,100)
				);
		
       String str = students.stream()
       .filter(elements -> elements.marks > 80)
       .map(element ->element.name)
       .collect(Collectors.joining(","));
       System.out.println(str);
       
	}
	

}
