package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import telran.strings.Validations;

class ValidationsTest {

	@Test
	@DisplayName("Test of the method isArithmeticExpression")
	void testIsArithmeticExpression() {
		assertTrue(Validations.isArithmeticExpression("(a+b)*(b+a)"));
		assertTrue(Validations.isArithmeticExpression("((a+b)*(b+a)) / 5"));
		assertTrue(Validations.isArithmeticExpression("41.5 + 28.3"));
		assertFalse(Validations.isArithmeticExpression("2 + () 3"));;
		assertFalse(Validations.isArithmeticExpression("20.5 +abc12))*2"));;
	}

}
