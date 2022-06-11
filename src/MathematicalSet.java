import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MathematicalSet {
	public static void main(String[] args) {
		List<Integer> a1 =Arrays.asList(41,52,63,64,35,86,27,78,99);
		List<Integer> a2 =Arrays.asList(4,2,3,4,3,8,7,7,99);
		HashSet<Integer> sd1 = new HashSet<>(a1);// we can put LinkedHashSet also it will work fine
		HashSet<Integer> sd2 = new HashSet<>(a2);
		HashSet<Integer> csd1 = (HashSet<Integer>) sd1.clone();
		System.out.println(csd1);
		//union
		csd1.addAll(sd2);
		System.out.println(csd1);
		//intersection
		csd1= (HashSet<Integer>) sd1.clone();
		csd1.retainAll(sd2);
		System.out.println(csd1);
		
		 
	}

}
