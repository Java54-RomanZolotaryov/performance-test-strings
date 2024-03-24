package telran.performance.strings;

import java.util.Random;

import telran.strings.SymbolsRemove;
import telran.strings.SymbolsRemoveCharArray;
import telran.strings.SymbolsRemovePerformanceTest;
import telran.strings.SymbolsRemoveStandard;

public class SymbolsRemovePerformanceAppl {

	private static final int N_SYMBOLS = 10_000;
	private static final int N_RUNS = 10_000;
	private static final Random RANDOM = new Random();
	
	public static void main(String[] args) {
		String str = getStringWithNRandomPrintableASCIISymbols(N_SYMBOLS);
		char symbolToRemove = getRandomPrintableAsciiSymbol();
		SymbolsRemovePerformanceTest symbolsRemoveArray = getTest(str, symbolToRemove, N_RUNS, "test of SymbolsRemoveCharArray", new SymbolsRemoveCharArray());
		SymbolsRemovePerformanceTest symbolsRemoveString = getTest(str, symbolToRemove, N_RUNS, "test of SymbolsRemoveStandard", new SymbolsRemoveStandard());
		symbolsRemoveArray.run();
		symbolsRemoveString.run();
	}

	private static SymbolsRemovePerformanceTest getTest(String str, char symbolToRemove, int nRuns, String displayName,
			SymbolsRemove symbolsRemove) {
		return new SymbolsRemovePerformanceTest(displayName, nRuns, str, symbolToRemove, symbolsRemove);
	}

	private static char getRandomPrintableAsciiSymbol() {
		return (char) (32 + RANDOM.nextInt(95));
	}

	private static String getStringWithNRandomPrintableASCIISymbols(int nSymbols) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < nSymbols; i++) {
			builder.append(Character.valueOf(getRandomPrintableAsciiSymbol()));
		}
		return builder.toString();
	}
}
