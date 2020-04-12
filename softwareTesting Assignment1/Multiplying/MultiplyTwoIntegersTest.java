package Multiplying;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTwoIntegersTest {

	@Test
	void MultiplyTwoIntegersTest1() {
		MultiplyTwoIntegers m=new MultiplyTwoIntegers();
		int x=2;
		int y=3;
		assertNotNull(x);
		assertNotNull(y);
		
		int result= m.MultiplyTwoIntegers(2,3);
		assertEquals(6,result);
		
	}
	@Test
	void MultiplyTwoIntegersTest2()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=2;
		int y=2;
		assertNotNull(x);
		assertNotNull(y);
		
		int result= n.MultiplyTwoIntegers(2,2);
		assertSame(x,y);
	}
	@Test
	void MultiplyTwoIntegersTest3()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=2;
		int y=6;
		assertNotNull(x);
		assertNotNull(y);
		
		int result= n.MultiplyTwoIntegers(2,6);
		assertSame(x,y);
	}
	@Test
	void MultiplyTwoIntegersTest4()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=4;
		int y=5;
		assertNotNull(x);
		assertNotNull(y);
		
		int result= n.MultiplyTwoIntegers(4,4);
		assertNotSame(x,y);
	}
	@Test
	void MultiplyTwoIntegersTest5()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=6;
		int y=6;
		assertNotNull(x);
		assertNotNull(y);
		
		int result= n.MultiplyTwoIntegers(6,6);
		assertNotSame(x,y);
	}
	@Test
	void MultiplyTwoIntegersTest6()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=2;
		int y=6;
		assertNotNull(x);
		assertNotNull(y);
		
		int result= n.MultiplyTwoIntegers(2,6);
		assertNotEquals(x,y);
	}
	@Test
	void MultiplyTwoIntegersTest7()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=2;
		int y=2;
		assertNotNull(x);
		assertNotNull(y);
		
		int result= n.MultiplyTwoIntegers(2,2);
		assertNotEquals(x,y);
	}
	@Test
	void MultiplyTwoIntegersTest8()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=2;
		int y=2;
		assertNotNull(x);
		assertNotNull(y);
		assertTrue(n.MultiplyTwoIntegers(2, 2)==7);
	}
	@Test
	void MultiplyTwoIntegersTest9()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=2;
		int y=2;
		assertNotNull(x);
		assertNotNull(y);
		assertTrue(n.MultiplyTwoIntegers(2, 3)==6);
	}
	@Test
	void MultiplyTwoIntegersTest10()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=2;
		int y=2;
		assertNotNull(x);
		assertNotNull(y);
		assertTrue(n.MultiplyTwoIntegers(2, 2)==4);
	}
	@Test
	void MultiplyTwoIntegersTest11()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=1;
		int y=2;
		assertNotNull(x);
		assertNotNull(y);
		assertFalse(n.MultiplyTwoIntegers(1, 2)==7);
	}
	@Test
	void MultiplyTwoIntegersTest12()
	{
		MultiplyTwoIntegers n=new MultiplyTwoIntegers();
		int x=1;
		int y=2;
		assertNotNull(x);
		assertNotNull(y);
		assertFalse(n.MultiplyTwoIntegers(1, 2)==2);
	}






}
