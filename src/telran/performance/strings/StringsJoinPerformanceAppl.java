package telran.performance.strings;

import telran.strings.StringsJoin;
import telran.strings.StringsJoinBuilder;
import telran.strings.StringsJoinOperator;
import telran.strings.StringsJoinPerformance;

public class StringsJoinPerformanceAppl {
	
	private static final int N_STRINGS = 10000;
	private static final int N_RUNS = 10000;

	public static void main(String[] args) {
		String[] array = getArray(N_STRINGS);
		StringsJoinPerformance testBuilder = getTest(array, N_RUNS, "test of StringsJoinBuilder", new StringsJoinBuilder());
		StringsJoinPerformance testOperator = getTest(array, N_RUNS, "test of StringsJoinOperator",  new StringsJoinOperator());
		testBuilder.run();
		testOperator.run();
	}

	private static StringsJoinPerformance getTest(String[] array, int nRuns, String string, StringsJoin stringsJoin) {
		return new StringsJoinPerformance(string, nRuns, stringsJoin, array);
	}

	private static String[] getArray(int nStrings) {
		String[] res = new String[nStrings];
		for (int i = 0; i < res.length; i++) {
			res[i] = "STRING";
		}
		return res;
	}

}
