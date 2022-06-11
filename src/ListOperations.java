import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class ListOperations {
	//Stream API

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> nos = Arrays.asList(4,5,9,7,1,7,17,15,16,19,22,23);
		Stream<Integer> stream = nos.stream();
		int [] m= {4,2,6,9,8,7,3};
		IntStream intStream = Arrays.stream(m);
		//build up astring for specific values
		Stream<Integer> st = Stream.of(5,4,6,2,5,8,3);
		List<Integer> odds =
		stream.filter(element -> element%2 !=0 && element > 3).collect(Collectors.toList())	;
		System.out.println(odds);
//		System.out.println(!isEven(nos) ? "it is even" : "it is odd");
		//even numbers separated by comma
		String s = nos.stream()
		.filter(element -> element %2 ==0 && element>2)
		.map(element -> element.toString())
		.collect(Collectors.joining(","));
		System.out.println(s);
		//create a new list suare it and sort in descending
//		Stream<Integer> st = Stream.of(1,2,3,4,5,6);
	    List<Integer> nn=
		nos.stream()
		.filter(element -> element > 4)
		.distinct()
		.map(element -> element*element )
		.sorted((o1,o2) -> o2.compareTo(o1))
		.collect(Collectors.toList());
		System.out.println(nn);
		
		
		
		
				
		
		
//		List<Integer> odd = new ArrayList<>();
		
//        for (Integer n:nos) {
//        	if(n%2!=0 && n>=3) {
//        		System.out.println(odd.add(n));
//        	}
//			
//		}
//        System.out.println(odd);
//        
//		}
//	
		
	}
}

	


