package program.number_difference;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LoopTest extends NumberDifferenceTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{new ArrayList<Integer>(Arrays.asList(200, 100)), 100},											// TC03
			{new ArrayList<Integer>(Arrays.asList(300, 200, 100)), 200},									// TC15
			{new ArrayList<Integer>(Arrays.asList(1000, 900, 800, 700, 600, 500, 400, 300, 200, 100)), 900}	// TC16
		});
	}

	private final ArrayList<Integer> series;
	private final int expected;

	public LoopTest(ArrayList<Integer> series, int expected) {
		this.series = series;
		this.expected = expected;
	}

	@Test
	public void doTest() {
		// (1) setup (arrange, build)
		int actual;

		// (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(series);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

}
