import java.util.InputMismatchException;
import java.util.Scanner;
public class Wrapper {
	public static void main(String[] args) {
		String a="52";
		
//		int b = a.wrapper();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number n: ");
		int n;
		try {
			 n =scanner.nextInt();
			 System.out.println(n%2==0 ? "it is even" : "It is odd");
			
		} catch(InputMismatchException e) {
			System.out.println("please enter only integer value");
			
			
		}
//		int m =scanner.nextInt();
		
		scanner.close(); // it is not necessary but it is good habit
		System.out.println("Program End");
		
		
		
		
		
	}
	
	

}
