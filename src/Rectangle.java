
public class Rectangle {
	static boolean isEven(int a) {
		return a%2 ==0;
	}
	public static void main(String[] args) {
		int a= 9;
//		if(isEven(a)) {
//			System.out.println("it is even");
//		
//		}
//		else {
//			System.out.println("odd");
//		}
		System.out.println(isEven(a) ? "it is even" : "it is odd");
		
	}
	

}
