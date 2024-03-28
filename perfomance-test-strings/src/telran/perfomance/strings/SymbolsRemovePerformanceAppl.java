package telran.perfomance.strings;

import java.util.Random;

import telran.perfomance.PerformanceTest;
import telran.perfomance.SymbolsRemovePerformanceTest;
import telran.strings.SymbolsRemove;
import telran.strings.SymbolsRemoveCharArray;
import telran.strings.SymbolsRemoveStandard;

public class SymbolsRemovePerformanceAppl {
	private static final int N_RUNS = 100000;
	private static final int N_SYMBOLS = 100000;
	
	public static void main (String[] args) {
		String str = randomASCIIStringGeneration();
		char symbol = randomASCIISymbolGeneration();
		PerformanceTest symbolsRemoveCharArrayTest = 
				getTest("test of removing by SymbolsRemoveCharArray",new SymbolsRemoveCharArray(), str, symbol);
		PerformanceTest symbolsRemoveStandardTest = 
				getTest("test of removing by SymbolsRemoveStandard",new SymbolsRemoveStandard(),str, symbol);
		symbolsRemoveCharArrayTest.run();
		symbolsRemoveStandardTest.run();
	}
	private static String randomASCIIStringGeneration() {
		char[] array = new char[N_SYMBOLS];
		for(int i = 0; i < array.length; i++) {
			array[i] = randomASCIISymbolGeneration();
		}
		return new String(array);
	}

	private static char randomASCIISymbolGeneration() {
		int minValue = 32;
		int maxValue = 126;
		Random randomSymbol = new Random();
		int randomValue = randomSymbol.nextInt (maxValue - minValue +1) + minValue;
		char randomChar = (char) randomValue;
		return randomChar;
	}
	private static PerformanceTest getTest(String displayName, SymbolsRemove symbolsRemove, String str,
			char symbol) {
		
		return new SymbolsRemovePerformanceTest(displayName, N_RUNS, str, symbolsRemove, symbol);
	}
	
}
