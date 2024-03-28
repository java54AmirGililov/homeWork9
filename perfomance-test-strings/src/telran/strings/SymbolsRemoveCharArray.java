package telran.strings;

public class SymbolsRemoveCharArray implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char currentSymbol = str.charAt(i);
			if (currentSymbol != symbol) {
				result.append(currentSymbol);
			}
		}
		return result.toString();
	}
}
