package telran.strings;

import java.util.Arrays;

public class SymbolsRemoveCharArray implements SymbolsRemove{

	@Override
	public String removeSymbol(String str, char symbol) {
		char[] characters = str.toCharArray();
		char[] charactersWithoutSymbol = new char[characters.length];
		int insertIndex = 0;
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] != symbol) {
				charactersWithoutSymbol[insertIndex++] = characters[i];
			}
		}
		return String.valueOf(Arrays.copyOf(charactersWithoutSymbol, insertIndex));
	}

}
