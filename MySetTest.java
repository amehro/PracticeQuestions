package misc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MySetTest<T> {
	
	private MySet<Integer> ob;
	
	@Before // before every test
	public void setUpBefore() throws Exception {
		System.out.println("before");
		ob = new MySet<Integer>();
	}

	
	@After // after every test
	public void setupAfter() throws Exception {
		System.out.println("after");
		ob = null;
	}
	
	
//	public void testCreateMySetObject() {
//		
//	}

	@Test
	public final void testAdd() {
		ob.add(1);
		assertTrue(ob.existsKey(1));		
	}

	@Test
	public final void testDelete() {
		ob.add(1);
		ob.delete(1);
		assertFalse(ob.existsKey(1));
	}
	


	@Test
	public final void testIsEmpty() {
		assertTrue(ob.isEmpty());
	}
	


	@Test
	public final void testExistsKey() {
		ob.add(1);
		ob.existsKey(1);
	}

}
