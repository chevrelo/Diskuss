package ch.rpn.chevrelo.Diskuss.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import ch.rpn.chevrelo.Diskuss.Channel;

public class ChannelTest {

	@Test
	public void testShowMessage(List<String> list) {
		
		
		Channel c = new Channel();
		
		list.add("Mon premier channel");
		list.add("Mon deuxième channel");
		
		assertEquals(c.showMessage("Mon premier channel"),list.get(1));
		assertEquals("Mon deuxième channel", list.get(2));
	}

}
