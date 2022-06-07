
public class Student {
	//instance atribute
	String Name;
	char Gender;
	int Rno;
	float Marks;
	static int count;
	Student(){
		this("NA",'n',12, 0.0f);
	}
	
	        Student(String Name,char Gender,int Rno,float Marks){
	        	this.Name=Name;
	        	this.Rno=Rno;
	        	this.Gender=Gender;
	        	this.Marks=Marks;
	        	++Student.count;
	        }
			
			String getDetails() {
//				return "Name:" + this.Name + "\nGender:" + this.Gender + "\nRno:" + this.Rno + "\nMarks:" + this.Marks;
			    return String.format("Name:%s\n gender:%s\n Rno:%s\n Marks:%s/n",this.Name,this.Gender,this.Rno,this.Marks);
			    
				
			}
			char getGrade() {
				float n=this.Marks;
						if (n>100 || n<0) {
							return 'I';
							
									
						}
						
						else if (n>=70) {
							return 'a';
							
									
						}
						else if (n>=60) {
							return 'b';
							
									
						}
						else if (n>=50) {
							return 'c';
							
									
						}
						else   {
							return 'F';
							
									
						}
				
			}
			static Student newInstance(String Name ,char Gender, int Rno,float Marks) {
				return new Student(Name,Gender,Rno,Marks);
			}
			
}
			

