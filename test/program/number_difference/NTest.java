package program.number_difference;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NTest extends NumberDifferenceTest {
    
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0, false},		// TC18
			{11, false},	// TC19
			{5, true}
		});
	}

	private final int n;
	private final boolean expected;

	public NTest(int n, boolean expected) {
		this.n = n;
		this.expected = expected;
	}

	@Test
	public void doTest() {
		// (1) setup (arrange, build)
		boolean actual;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(n);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

}
