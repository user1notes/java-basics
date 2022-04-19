import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFile extends CalcSuper {
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		//AAA - Arrange Act Assert(Validate)
		//Calculator calculator = new Calculator();//Arrange
		
		int result = calculator.add(2, 3);//Act
		assertEquals(5,result);//Assert
	}
	@Test
	public void testAddWithZero() {
		//fail("Not yet implemented");
		//AAA - Arrange Act Assert(Validate)
		//Calculator calculator = new Calculator();//Arrange
		
		int result = calculator.add(0, 3);//Act
		assertEquals(3,result);//Assert
	}


}
