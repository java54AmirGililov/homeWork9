package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import telran.strings.SymbolsRemoveCharArray;
import telran.strings.SymbolsRemoveStandard;

class SymbolRemoveTests {

	@Test
	@DisplayName("Test of the method SymbolsRemoveCharArray")
	void SymbolsRemoveCharArrayTest () {
		removeSymbolTest(new SymbolsRemoveCharArray());
	}
	private void removeSymbolTest(SymbolsRemoveCharArray symbolsRemoveCharArray) {
		String str = "Telran java";
		String noA = "Telrn jv";
		String noB = "Telran java";
		String noT = "elran java";
		String noE = "Tlran java";
		String noL = "Teran java";
		assertEquals(noA, symbolsRemoveCharArray.removeSymbol(str, 'a'));
		assertEquals(noB, symbolsRemoveCharArray.removeSymbol(str, 'b'));
		assertEquals(noT, symbolsRemoveCharArray.removeSymbol(str, 'T'));
		assertEquals(noE, symbolsRemoveCharArray.removeSymbol(str, 'e'));
		assertEquals(noL, symbolsRemoveCharArray.removeSymbol(str, 'l'));
	}
	@Test
	@DisplayName("Test of the method SymbolsRemoveStandard")
	void SymbolsRemoveStandardTest () {
		removeSymbolTest(new SymbolsRemoveStandard());
	}
	private void removeSymbolTest(SymbolsRemoveStandard symbolsRemoveStandard) {
		String str = "Telran java";
		String noA = "Telrn jv";
		String noB = "Telran java";
		String noT = "elran java";
		String noE = "Tlran java";
		String noR = "Telan java";
		assertEquals(noA, symbolsRemoveStandard.removeSymbol(str, 'a'));
		assertEquals(noB, symbolsRemoveStandard.removeSymbol(str, 'b'));
		assertEquals(noT, symbolsRemoveStandard.removeSymbol(str, 'T'));
		assertEquals(noE, symbolsRemoveStandard.removeSymbol(str, 'e'));
		assertEquals(noR, symbolsRemoveStandard.removeSymbol(str, 'r'));
	}
}
