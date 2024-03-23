package telran.strings;

public class StringsJoinOperator implements StringsJoin{

	@Override
	public String joinStrings(String[] array, String delimiter) {
		String str = array[0];
		for (int i = 1; i < array.length; i++) {
			str += (delimiter + array[i]);
		}
		return str;
	}

}
