public class Board {
	final int DEFAULT_SIDE = 4; // Boards are always square, all sides are the same length.
	int boardArray[][];
	
	public Board() {
		this.boardArray[][] = new int[DEFAULT_SIDE][DEFAULT_SIDE];
		this.initializeRandomly();
	}
	
	public Board(int side) {
		this.boardArray[][] = new int[side][side];
		this.initializeRandomly();
	}

	public void initializeRandomly() {
		// add two new values to random squares on the board
	}

	public boolean addRandom() {
		// add one new value in a random, unused space
	}

	public boolean addSpecific(int row, int col) {
		// add a new random value to a specific unused space
	}

	public boolean addSpecificValue(int row, int col, int val) {
		// add a new specific value to a specific unused space
	}
}

