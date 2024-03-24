package telran.strings;

import telran.performance.PerformanceTest;

public class SymbolsRemovePerformanceTest extends PerformanceTest {
	
	private String str;
	private char symbolToRemove;
	private SymbolsRemove symbolsRemove;
	
	public SymbolsRemovePerformanceTest(String displayName, int nRuns, String str, char symbolToRemove, SymbolsRemove symbolsRemove) {
		super(displayName, nRuns);
		this.str = str;
		this.symbolToRemove = symbolToRemove;
		this.symbolsRemove = symbolsRemove;
	}

	@Override
	protected void runTest() {
		symbolsRemove.removeSymbol(str, symbolToRemove);
	}

}
