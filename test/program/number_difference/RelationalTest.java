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
public class RelationalTest extends NumberDifferenceTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{new ArrayList<Integer>(Arrays.asList(100, 100)), 0},		// TC14
			{new ArrayList<Integer>(Arrays.asList(100, 200)), 100},		// TC13
			{new ArrayList<Integer>(Arrays.asList(200, 100)), 100}		// TC03
		});
	}
    
	private final ArrayList<Integer> series;
	private final int expected;

	public RelationalTest(ArrayList<Integer> series, int expected) {
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
