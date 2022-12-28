import java.util.Math;

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

	public boolean addRandomValueToSpecificCell(int row, int col) {
		// add a new random value to a specific unused space
		this.boardArray[row][col] = 
	}

	/*
	 * Add a specific value to a specific cell; return false and exit if the cell is already occupied.
	 */
	public boolean addSpecificValueToSpecificCell(int row, int col, int val) {
		if (this.isOccupied(row, col) return false;
		else {
			this.boardArray[row][col] = val;
			return true;
		}
	}

	public boolean isOccupied(int row, int col) {
		return this.getCellContents(row, col) != null;
	}

	public int getCellContents(int row, int col) {
		return this.boardArray[row][col];
	}

	public int[] getRandomUnusedSpot(int side) {
		// 
	}
}

