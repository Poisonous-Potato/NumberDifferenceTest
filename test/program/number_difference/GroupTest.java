package program.number_difference;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroupTest extends NumberDifferenceTest {

    private String messageBuilder(int diff) {
        String message;

        message = "Difference: " + diff;

        if (diff == 0) {
            message = message + "\nNon group, There's no difference";
        } else if ((diff >= 1) && (diff <= 10)) {
            message = message + "\nGroup 1, Small Difference";
        } else if ((diff >= 11) && (diff <= 50)) {
            message = message + "\nGroup 2, Medium Difference";
        } else if (diff >= 51) {
            message = message + "\nGroup 3, Large Difference";
        } 

        return message;
    }
    
	@Test
	public void nonGroup_01() { // TC01
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 0;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void group1_01() { // TC10
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 5;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void group1_02() { // TC11
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 1;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void group1_03() { // TC12
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 10;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void group2_01() { // TC07
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 25;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void group2_02() { // TC08
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 11;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void group2_03() { // TC09
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 50;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void group3_01() { // TC03
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 100;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void group3_02() { // TC04
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 51;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

}
