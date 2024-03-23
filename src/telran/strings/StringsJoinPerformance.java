package telran.strings;

import telran.performance.PerformanceTest;

public class StringsJoinPerformance extends PerformanceTest{

	private String[] array;
	private StringsJoin stringsJoin;
	
	public StringsJoinPerformance(String displayName, int nRuns, StringsJoin stringsJoin, String[] array) {
		super(displayName, nRuns);
		this.array = array;
		this.stringsJoin = stringsJoin;
	}

	@Override
	protected void runTest() {
		stringsJoin.joinStrings(array, ";");
	}

}
