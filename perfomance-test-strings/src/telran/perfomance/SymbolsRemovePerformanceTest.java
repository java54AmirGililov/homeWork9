package telran.perfomance;

import telran.strings.SymbolsRemove;

public class SymbolsRemovePerformanceTest extends PerformanceTest{
		public SymbolsRemovePerformanceTest(String displayName, int nRuns,
				String str,SymbolsRemove SymbolsRemove, char symbol) {
			super(displayName, nRuns);
			this.str = str;
			this.SymbolsRemove = SymbolsRemove;
			this.symbol = symbol;
	}
		String str;
		SymbolsRemove SymbolsRemove;
		char symbol;
	@Override
	protected void runTest() {
		SymbolsRemove.removeSymbol(str, symbol);
	}
}
