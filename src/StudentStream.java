import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.Student;

public class StudentStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students =Arrays.asList(
				new Student("jkhsajd",'m',10,20, new Address(414002,"gujrat","india","surat")),
				new Student("abc",'m',20,90, new Address(414002,"gujrat","Up","surat")),
				new Student("jkh",'m',10,100, new Address(414002,"punjab","USA","surat")),
				new Student("jkh",'m',10,100)
				
				);
		
		
//       String str = students.stream()
//       .filter(elements -> elements.marks > 80)
//       .map(element ->element.name)
//       .collect(Collectors.joining(","));
//       System.out.println(str);
//       double average = students.stream()
//       .collect(Collectors.averagingDouble(student -> student.marks));
//       System.out.println(average);
//       
//       DoubleSummaryStatistics ds= students.stream()
//       .collect(Collectors.summarizingDouble(student -> student.marks));
//       System.out.println(ds);
//       System.out.println(ds.getAverage());
//       System.out.println(ds.getMax());
//       System.out.println(ds.getMin());
//       System.out.println(ds.getSum());
//       // group by gender
//       Map<Character, List<Student>> genderMap = students.stream()
//       .collect(Collectors.groupingBy(student -> student.getgender()));
//       System.out.println(genderMap);
//       
//       //from above student
//       //1.scored more than or equal to 80
//       //2.scored less than 80 marks
//       Map<Boolean , List<Student>> marksmap = students.stream()
//       .collect(Collectors.partitioningBy(student -> student.marks >=80));
//       System.out.println(marksmap);
//       
       
       String add = students.stream().filter(ele -> ele.getAddress() != null && ele.getAddress().getCountry().equals("USA"))
    		   .map(ele -> ele.name)
    		   .collect(Collectors.joining(","));
       
       System.out.println(add);
       System.out.println("Finally Done");
       
	}
	

}
