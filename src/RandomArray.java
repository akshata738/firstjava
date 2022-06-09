import java.util.Random;

public class RandomArray {
	static <T> T randomElement(T[] elements) {
		Random random = new Random();
		int index = random.nextInt(elements.length);
		return elements[index];
		
	}
	public static void main(String[] args) {
		String [] cars = {"BMW","Swift","Audi"};
		String element = randomElement(cars);
		System.out.println(element);
		
		Integer[] nos = {13,11,22,6,12,0,44,56};
		int n =randomElement(nos);
		System.out.println(n);
		float [] Marks = {11.11f,12.12f,5.6f};
		float f = randomElement(nos);
		System.out.println(f);
		
	}
	
	

}
