package telran.strings;

public class SymbolsRemoveStandard implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		String metacharacters = ".^$*+?()[{\\|";
		String charAsString = String.valueOf(symbol);
		if (metacharacters.contains(Character.toString(symbol))) {
			charAsString = "\\" + charAsString;
		}
		return str.replaceAll(charAsString, "");
	}
	
}
