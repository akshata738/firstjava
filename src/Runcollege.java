import com.globalpayex.college.entities.*;
public class Runcollege {
	public static void main(String[] args) {
		int i =10;
		Student s1= new Student("Akshata",'f', 10 , 89.3f);
		String[] subjects = {"maths","physics"};
		Professor p=new Professor("sham",'m',subjects);
		System.out.println(s1.marks);
		System.out.println(s1.getdetails());
		System.out.println(p.getdetails());
		System.out.println(i);
		System.out.println(s1);
		System.out.println(p.subjects);
		
		
	}
	

}
