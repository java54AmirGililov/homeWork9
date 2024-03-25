package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import telran.strings.RegularExpresions;

class RegularExpressionsTest {

	@Test
	@DisplayName("Test of the method javaVariableTrue")
	void javaVariableTrueTest() {
		
		String regex = RegularExpresions.javaVariable();
		assertTrue("abs".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("$123".matches(regex));
		assertTrue("$1_23".matches(regex));
		assertTrue("abs_".matches(regex));
		assertTrue("__".matches(regex));
		assertTrue("Abs_".matches(regex));
	}
	@Test
	@DisplayName ("Test of the method javaVariableFalse")
	void javaVariableFalseTest() {
		String regex = RegularExpresions.javaVariable();
		assertFalse("1abc".matches(regex));
		assertFalse("_".matches(regex));
		assertFalse("a-2".matches(regex));
		assertFalse("a 2".matches(regex));
		assertFalse("a?2".matches(regex));
		assertFalse("i*nt".matches(regex));
	}
	@Test
	@DisplayName ("Test of the method zero300True")
	void zero_300TrueTest() {
		String regex = RegularExpresions.zero_300();
		assertTrue("0".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("30".matches(regex));
		assertTrue("33".matches(regex));
		assertTrue("198".matches(regex));
		assertTrue("299".matches(regex));
		assertTrue("300".matches(regex));
	}
	@Test
	@DisplayName ("Test of the method zero300False")
	void zero_300TFalseTest() {
		String regex = RegularExpresions.zero_300();
		assertFalse("00".matches(regex));
		assertFalse("01".matches(regex));
		assertFalse("19s".matches(regex));
		assertFalse("-30".matches(regex));
		assertFalse("330".matches(regex));
		assertFalse("398".matches(regex));
		assertFalse("2990".matches(regex));
		assertFalse("301".matches(regex));
	}
	@Test
	@DisplayName ("Test of the method ipOctet")
	void ipOctetTest() {
		String regex = RegularExpresions.ipOctet();
		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("009".matches(regex));
		assertTrue("255".matches(regex));
		assertTrue("250".matches(regex));
		assertTrue("249".matches(regex));
		assertFalse("-0".matches(regex));
		assertFalse("00 ".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("10?".matches(regex));
		assertFalse("1900".matches(regex));
		assertFalse("299".matches(regex));
		assertFalse("00a".matches(regex));
		assertFalse("256".matches(regex));
		assertFalse("260".matches(regex));
		assertFalse("300".matches(regex));	
	}
	@Test
	@DisplayName ("Test of the method mobileIsraelPhone")
	void mobileIsraelPhoneTest() {
		String regex = RegularExpresions.mobileIsraelPhone();
		assertTrue ("+972-598765432".matches(regex));
		assertTrue ("0598765432".matches(regex));
		assertTrue ("+972-508267911".matches(regex));
		assertTrue ("0556728932".matches(regex));
		assertFalse ("+972-59875432".matches(regex));
		assertFalse ("05987654132".matches(regex));
		assertFalse ("+973-508267911".matches(regex));
		assertFalse ("0651234456".matches(regex));
	}
	@Test
	@DisplayName ("Test of the method ipV4Address")
	void ipV4AddressTest() {
		String ipV4Regex = RegularExpresions.ipV4Address();
		assertTrue("1.2.3.4".matches(ipV4Regex));
		assertFalse("1.2.3".matches(ipV4Regex));
		assertFalse("1 2.3.4".matches(ipV4Regex));
		assertFalse("1.2.3.4.5".matches(ipV4Regex));
		assertFalse("1.2.3&4".matches(ipV4Regex));
	}
	@Test
	@DisplayName ("Test of the method simpeArithmeticExpressions")
	void simpeArithmeticExpressionsTest() {
		String regex =RegularExpresions.simpleArithmeticExpression();
		assertTrue("20".matches(regex));
		assertTrue("20+3 /2 *100".matches(regex));
		assertTrue("10000 - 1".matches(regex));
		assertTrue("10000 -1 ".matches(regex));	
		assertFalse("-20".matches(regex));
		assertFalse("20 **".matches(regex));
		assertFalse(" 20 +3 /2 *100 +".matches(regex));
		assertFalse(" 20 +3 //2 *100".matches(regex));
	}
	@Test
	@DisplayName ("Test of the method arithmeticExpressions")
	void arithmeticExpressionTest() {
		String regex = RegularExpresions.arithmeticExpression();
		assertTrue("(20.5 + abc)*2".matches(regex));
		assertTrue("(20.5 + abc))*2".matches(regex));
		assertTrue("(20.5 + abc / 3))*(2".matches(regex));
		assertTrue("(abc)".matches(regex));
		assertTrue("(__)".matches(regex));
		assertFalse("2 + _".matches(regex));
		assertFalse("2 + a12 * ".matches(regex));
		assertFalse("2 + )a12 * ".matches(regex));
	}
}
