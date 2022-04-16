package program.number_difference;

import static org.junit.Assert.*;

import org.junit.Test;

public class NTest extends NumberDifferenceTest {
    
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

}
