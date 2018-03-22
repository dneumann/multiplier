package mult.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiplierTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Multiplier mult = new Multiplier();
		mult.createNewExercise();
		System.out.println(mult.getExercise());
		System.out.println(mult.getHint());
		System.out.println(mult.getAnswer());
	}

}
