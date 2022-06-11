import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AdvancedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nos =Arrays.asList(4,5,6,6,3,8,2,7,9);
		System.out.println(nos);
		System.out.println(nos.getClass());
		LinkedList<Integer> lnos = new LinkedList<>(nos);
		
		nos.forEach(n -> System.out.println(n));// functional programming pass funnction into the function
		//to print even no from list without explicitly using the loop
		nos.forEach(n -> System.out.println(   n%2 ==0? "it is even" : "it is odd"));
		System.out.println("**********EVEN NUMBERS***************");
		nos.forEach(n -> System.out.println(   n%2 ==0? n : ""));
		nos.forEach(n -> {
			if (n%2 ==0){
				System.out.println(n);
			}
		});
		// method References
	    nos.forEach(System.out::println);
		
		

	}

}
