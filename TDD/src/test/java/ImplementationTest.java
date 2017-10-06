import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {
	private Implementation obj;

	@Before
	public void setUp() throws Exception {
	obj = new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		
	}
	

	@Test
	public void testSub() {
		long ans = 99-34-(-40);
		assertEquals(ans, obj.sub(99,34,-40));
		
		ans = 15-39;
		assertEquals(ans, obj.sub(15-39));
		
		ans = 0;
		assertEquals(ans, obj.sub(0,0,0));
		
		
	}
	
	public void testAdd() {
		long ans= 49+ (-27) + 13 + (-19);
		assertEquals(ans, obj.add(49, -27, 13, -19)); 
		
		
		ans= 24+10+23;
		assertEquals(ans, obj.add(24, 10, 23));
		
		ans=5;
		assertEquals(ans, obj.add(5));
		
		
	}
	

}
