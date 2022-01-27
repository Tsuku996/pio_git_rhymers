package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int FULL = 11;

	private static final int DEFAULT = -1;

	private static final int NUMBERS_SIZE = 12;

	private final int[] numbers = new int[NUMBERS_SIZE];

	public int getTotal() {
		return total;
	}

	private int total = DEFAULT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == DEFAULT;
	}
	
	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT;
		return numbers[total--];
	}

}
