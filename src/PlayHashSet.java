import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class PlayHashSet {
	public static void main(String[] args) {
		List<Integer> nos =Arrays.asList(41,52,63,64,35,86,27,78,99);
		HashSet<Integer> hashSet = new HashSet<>(nos);
		
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Lichi");
		fruits.add("Apple");
		fruits.add("Grapes");
		System.out.println(fruits);
		fruits.remove("Mango");
		System.out.println(fruits);
		System.out.println(fruits.contains("Grapes"));
		
		
		
		
	}

}
