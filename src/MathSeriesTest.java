import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MathSeriesTest {

	@Test
	void fibo() {
		
//		fail("Not yet implemented");
		String actual = MathSeries.fibo(8);
		String expect = "0,1,1,2,3,5,8,13";
		assertEquals(actual,expect);
		
		
		
		
		
		
	}

}
