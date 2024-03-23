package telran.performance;

public abstract class PerformanceTest {
	private int nRuns;
	private String displayName;
	
	protected PerformanceTest(String displayName, int nRuns) {
		this.nRuns = nRuns;
		this.displayName = displayName;
	}
	
	protected abstract void runTest();
	
	public void run() {
		long timestamptStart = System.currentTimeMillis();
		for (int i = 0; i < nRuns; i++) {
			runTest();
		}
		long timestamptFinish = System.currentTimeMillis();
		long runningTime = timestamptFinish - timestamptStart;
		System.out.printf("%s; number of runs: %d; running time: %d\n", displayName, nRuns, runningTime);
	}
}
