package program.number_difference;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GroupTest extends NumberDifferenceTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0},	// TC01
			{5}, 	// TC10	
			{1},	// TC11 
			{10},	// TC12 
			{25},	// TC07
			{11},	// TC08
			{50}, 	// TC09
			{100},	// TC03
			{51}	// TC04
		});
	}

	private final int diff;

	public GroupTest(int diff) {
		this.diff = diff;
	}
    
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
	public void doTest() {
		// (1) setup (arrange, build)
		String actual, expected;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

}
