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
	public void nOutOfRange_01() {
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
	public void nOutOfRange_02() {
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

}
