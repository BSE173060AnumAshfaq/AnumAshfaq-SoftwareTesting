package Multiplying;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTwoIntegersTest {

	@Test
	void  DivideTwoIntegersTest1() {
		MultiplyTwoIntegers mu=new MultiplyTwoIntegers();
		int x=3;
		int y=2;
		assertNotNull(x);
		assertNotNull(y);
		
		int result= mu.MultiplyTwoIntegers(3,2);
		assertEquals(1,result);
		
	}
	@Test
	void  DivideTwoIntegersTest2() {
		MultiplyTwoIntegers mu=new MultiplyTwoIntegers();
		int x = 9;
        int y  = 3;
 
        assertNotNull(x);
        assertNotNull(y);
        MultiplyTwoIntegers nu = new MultiplyTwoIntegers();
        int ress = nu.DivideTwoIntegers(x,y);
        assertNotEquals(3,ress);    
		
	}
	@Test
	void  DivideTwoIntegersTest3() {
		MultiplyTwoIntegers mu=new MultiplyTwoIntegers();
		int x = 3;
        int y  = 3;
 
        assertNotNull(x);
        assertNotNull(y);
        MultiplyTwoIntegers nu = new MultiplyTwoIntegers();
        int ress = nu.DivideTwoIntegers(x,y);
        assertSame(x,y);    
		
	}
	@Test
	void  DivideTwoIntegersTest4() {
		MultiplyTwoIntegers mu=new MultiplyTwoIntegers();
		int x = 9;
        int y  = 3;
 
        assertNotNull(x);
        assertNotNull(y);
        MultiplyTwoIntegers nu = new MultiplyTwoIntegers();
        int ress = nu.DivideTwoIntegers(x,y);
        assertSame(x,y);    
		
	}
	@Test
	void  DivideTwoIntegersTest5() {
		MultiplyTwoIntegers mu=new MultiplyTwoIntegers();
		int x = 3;
        int y  = 3;
 
        assertNotNull(x);
        assertNotNull(y);
        MultiplyTwoIntegers nu = new MultiplyTwoIntegers();
        int ress = nu.DivideTwoIntegers(x,y);
        assertNotSame(x,y);    
		
	}
	@Test
	void  DivideTwoIntegersTest6() {
		MultiplyTwoIntegers mu=new MultiplyTwoIntegers();
		int x = 9;
        int y  = 3;
 
        assertNotNull(x);
        assertNotNull(y);
        MultiplyTwoIntegers nu = new MultiplyTwoIntegers();
        int ress = nu.DivideTwoIntegers(x,y);
        assertNotSame(x,y);    
		
	}
	@Test
	void  DivideTwoIntegersTest7() {
	MultiplyTwoIntegers nu=new MultiplyTwoIntegers();
	int x=2;
	int y=3;
	assertNotNull(x);
	assertNotNull(y);
	assertTrue(nu.DivideTwoIntegers(2, 3)==6);
	}
	@Test
	void  DivideTwoIntegersTest8() {
	MultiplyTwoIntegers nu=new MultiplyTwoIntegers();
	int x=4;
	int y=2;
	assertNotNull(x);
	assertNotNull(y);
	assertTrue(nu.DivideTwoIntegers(4, 2)==2);
	}
	@Test
	void  DivideTwoIntegersTest9() {
	MultiplyTwoIntegers nu=new MultiplyTwoIntegers();
	int x=9;
	int y=3;
	assertNotNull(x);
	assertNotNull(y);
	assertFalse(nu.DivideTwoIntegers(9, 3)==6);
	}
	@Test
	void  DivideTwoIntegersTest10() {
	MultiplyTwoIntegers nu=new MultiplyTwoIntegers();
	int x=9;
	int y=3;
	assertNotNull(x);
	assertNotNull(y);
	assertFalse(nu.DivideTwoIntegers(9, 3)==3);
	}




}
