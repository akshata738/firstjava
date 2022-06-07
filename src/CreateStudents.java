
public class CreateStudents {
	public static void main(String[] args) {
		Student s1= new Student("Ramesh",'m',55,82);
		Student s2 =new Student();
		Student s4 =new Student();
		System.out.println(s4.Name);
		Student s3=new Student("Ram",'m',50,92);
//	    System.out.println(s1);
	    System.out.println(s3.Name);
	    System.out.println(s1.Name);
	    System.out.println(s1.getDetails());
	    System.out.println(s4.count);
//	    System.out.println(s1.Rno);
//	    System.out.println(s1.Marks);
	    Student s6= Student.newInstance("aaru",'m',6,85);
	    System.out.println(s6.Marks);
	    Student[] arr={s1,s3};
	    for(int i=0;i<=arr.length-1;i++) {
	    	System.out.println("Name: "+arr[i].Name + " Gender: " +arr[i].Gender);
	    }
	    s1.Name="Akshata";
//	    s1.Gender='f';
//	    s1.Rno=51;
//	    s1.Marks=95;
//		System.out.println(s1.Name);
//		
//		System.out.println(s1.getDetails());
//		System.out.println(s1.getGrade());
//		
		
		
				
	}
	

}
