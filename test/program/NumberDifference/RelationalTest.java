package program.NumberDifference;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class RelationalTest extends NumberDifferenceTest {
    
	@Test
	public void equal_01() { // TC14
		// (1) setup (arrange, build)
        ArrayList<Integer> series;
		int actual, expected;
        series = new ArrayList<Integer>(Arrays.asList(100, 100));
        expected = 0;

		// (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(series);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void min_01() { // TC13
		// (1) setup (arrange, build)
        ArrayList<Integer> series;
		int actual, expected;
        series = new ArrayList<Integer>(Arrays.asList(100, 200));
        expected = 100;

		// (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(series);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void max_01() { // TC14
		// (1) setup (arrange, build)
        ArrayList<Integer> series;
		int actual, expected;
        series = new ArrayList<Integer>(Arrays.asList(200, 100));
        expected = 100;

		// (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(series);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

}
