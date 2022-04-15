package program.NumberDifference;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberDifferenceTest {
	private CalcNUmberDifference sut;
	
	/**
	 * Setup = inisiasi sebelum test dijalankan, preparation object
	 * --> pay attention to keep components and test cases small, 
	 * --> the trade-off seems acceptable. 
	 * --> implicit setup can be used to deine the fixture common for all tests. 
	 * --> Small in-line and delegate setup statements may supplement .. 
	 *     the speciic preconditions on per-test basis. 
	 * */
	@Before
	public void setUp() throws Exception {
		sut = new CalcNUmberDifference();
	}

	@Test
	public void nOutOfRange_01() { // TC18
		// (1) setup (arrange, build)
		int n;
		boolean actual, expected;
		n = 0; // n below range
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(n);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
	
	@Test
	public void nOutOfRange_02() { // TC19
		// (1) setup (arrange, build)
		int n;
		boolean actual, expected;
		n = 11; // n above range
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(n);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
	
	@Test
	public void nInsideOfRange_01() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = 5; // berada pada range 1-10
		expected = true;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void nonGroup_01() { // TC01
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 0;
		expected = "Difference: " + diff; 
		expected = expected + "\nNon group, ";
		expected = expected + "There's no difference";

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
		expected = "Difference: " + diff; 
		expected = expected + "\nGroup 1, ";
		expected = expected + "Small Difference";

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
		expected = "Difference: " + diff; 
		expected = expected + "\nGroup 2, ";
		expected = expected + "Medium Difference";

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
		expected = "Difference: " + diff; 
		expected = expected + "\nGroup 3, ";
		expected = expected + "Large Difference";

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

}
