import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathSeries {
	Random random;
	
	public MathSeries(Random random) {
		
		this.random = random;
	}

	public  String fibo(Integer n) {
		
		
		 Integer ntouse = n;
		 Random random =new Random();
		  ntouse =this.random.nextInt(11);
		 List<Integer> nos = new ArrayList<>();
		 int a=0;
		 int b=1;
		 int c;
		
		
		nos.add(a);
		nos.add(b);
		int i=2;
		while(i<ntouse) {
			c=a+b;
			nos.add(c);
			a=b;
			b=c;
			i++;
			
		}
		return nos.stream()
		.map(no ->no.toString())
		.collect(Collectors.joining(","));
				
		
	}

}
