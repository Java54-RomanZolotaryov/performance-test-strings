package telran.strings;

public class StringsJoinBuilder implements StringsJoin{

	@Override
	public String joinStrings(String[] array, String delimiter) {
		StringBuilder builder = new StringBuilder(array[0]);
		for (int i = 1; i < array.length; i++) {
			builder.append(delimiter).append(array[i]);
		}
		return builder.toString();
	}

}
