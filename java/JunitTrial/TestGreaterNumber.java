package JunitTrial;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestGreaterNumber extends TestCase {
	
	int x;
	int y;
	
	public TestGreaterNumber()
	{
		
	}


	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("in set up");
		x=10;
		y=20;
	}


	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("in tear down");
		x=0;
		y=0;
	}


	@Test
	public void testIsGreater() {
		assertEquals(1, new GreaterNumber(x,y).isGreater());
	}
	
	@Test
	public void testIsNotGreater()
	{
		assertEquals(1, new GreaterNumber(x,y).isNotGreater());
	}
	
	public static TestSuite createTestSuite()
	{
		TestSuite ts = new TestSuite("AllTest");
		ts.addTest(new TestGreaterNumber());
		return ts;
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(createTestSuite());
	}

}
