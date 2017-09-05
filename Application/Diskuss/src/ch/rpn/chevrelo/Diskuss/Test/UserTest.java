package ch.rpn.chevrelo.Diskuss.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.rpn.chevrelo.Diskuss.User;

public class UserTest {

	@Test
	public void testGetName() {
		
		User u = new User();
		
		String name = u.getName("Lorin");
		
		assertEquals("Lorin", name);
		
	}

	@Test
	public void testSetName() {
		
		User u = new User();
		
		String name = u.setName("Vincent");
		
		assertEquals("Vincent", name);
		
	}

	@Test
	public void testGetInfos() {
		
		User u = new User();
		
		String name = u.getInfos("Jon");
		
		assertEquals("Jon", name);
		
	}

}
