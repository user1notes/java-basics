import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends CalcSuper{
	
//	Calculator calculator;
//	
//	@Before
//	public void init() {
//		calculator = new Calculator();
//	}

	@Test
	public void testDivideWithZero() {
		int result = calculator.divide(6,0);
		assertEquals(0,result);
	}
	
	
	@Test
	public void testDivide() {
		int result = calculator.divide(6,2);
		assertEquals(3,result);
	}

	@Test
	public void testSubtract() {
		int result = calculator.subtract(5,3);
		assertEquals(2,result);
	}
	
//	@Test
//	public void testAdd() {
//		//fail("Not yet implemented");
//		//AAA - Arrange Act Assert(Validate)
//		//Calculator calculator = new Calculator();//Arrange
//		
//		int result = calculator.add(2, 3);//Act
//		assertEquals(5,result);//Assert
//	}
//	@Test
//	public void testAddWithZero() {
//		//fail("Not yet implemented");
//		//AAA - Arrange Act Assert(Validate)
//		//Calculator calculator = new Calculator();//Arrange
//		
//		int result = calculator.add(0, 3);//Act
//		assertEquals(3,result);//Assert
//	}


}
