
public class func {
	public static void main(String[] args) {
		float Marks=85;
		String a= getDetails("Ram",'m',51,Marks);
		System.out.println(a);
		String Grade=findgrade(Marks);
		System.out.println("Grade is " +Grade);
		 
		
		
	}
	static String getDetails(String Name,char Gender, int Rno, float Marks) {
		String result="";
		result += "Name:" + Name + "\nGender:" + Gender + "\nRno:" + Rno + "\nMarks:" + Marks;
	    return result;
	    
		
	}
	static String findgrade(float a) {
		if (a>100 || a<0) {
			return "I";
			
					
		}
		
		else if (a>=70) {
			return "A";
			
					
		}
		else if (a>=60) {
			return "B";
			
					
		}
		else if (a>=50) {
			return "c";
			
					
		}
		else   {
			return "F";
			
					
		}
		
		
	}
}
