import com.globalpayex.college.entities.Studentold;

public class CreateStudents {
	//once we assign final to varibale we cannor define it AGAIN
	public static void main(String[] args) {
		Studentold s1= new Studentold("Ramesh",'m',55,82);
		final Studentold s2 =new Studentold("red",'f',65,85);
//		Studentold s2 =new Studentold("red",'f',65,85);
		
//		Student s4 =new Student();
//		System.out.println(s4.Name);
		Studentold s3=new Studentold("Ram",'m',50,92);
	    System.out.println(s2.Name);
	    System.out.println(s3.Gender);
	    System.out.println(s1.Name);
	    System.out.println(s1.getDetails());
//	    System.out.println(s4.count);
//	    System.out.println(s1.Rno);
//	    System.out.println(s1.Marks);
	    Studentold s6= Studentold.newInstance("aaru",'m',6,85);
	    System.out.println(s6.Marks);
	    Studentold[] arr={s1,s3};
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
