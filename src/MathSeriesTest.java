import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.matchers.Matches;
import org.mockito.junit.jupiter.MockitoExtension;


//@ExtendWith()

@ExtendWith(MockitoExtension.class)
class MathSeriesTest {
	@Mock
	MathSeries mathseries ;
	@InjectMocks
	Random random;

	@Test
	void fibo() {
//		fail("Not yet implemented");
		MathSeries mathseries =new MathSeries(new Random());
		String actual = mathseries.fibo(8);
		String expect = "0,1,1,2,3,5,8,13";
		assertEquals(actual,expect);
		
		
}
	@Test
	void fibosurpriseme() {
		
	}
	

}
