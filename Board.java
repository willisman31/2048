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
		this.addRandom();
		this.addRandom();
		// add two new values to random squares on the board
	}

	public boolean addRandom() {
		// add one new value in a random, unused space
		int[] hold = this.getRandomUnusedSpot();
		int unusedRow = hold[0];
		int unusedCol = hold[1];
		this.addRandomValueToSpecificCell(unusedRow, unusedCol);
		return true;
	}

	/*
	 * Add a random value to a specific unused cell
	 */
	public boolean addRandomValueToSpecificCell(int row, int col) {
		if (this.isOccupied(row, col)) return false;
		this.boardArray[row][col] = calculateValue();
		return true;
	}

	/*
	 * Add a specific value to a specific cell; return false and exit if the cell is already occupied.
	 */
	public boolean addSpecificValueToSpecificCell(int row, int col, int val) {
		if (!this.isOccupied(row, col)) {
			this.boardArray[row][col] = val;
			return true;
		} return false;
	}

	public boolean isOccupied(int row, int col) {
		return this.getCellContents(row, col) != null;
	}

	public int getCellContents(int row, int col) {
		return this.boardArray[row][col];
	}

	public int[] getRandomUnusedSpot() {
		// Count unused spots, iterate
		int[] cells = new boolean[this.boardArray.length**2];
		int occupiedCount = 0;
		for (int i = 0; i < this.boardArray.length; i++){
			for (int j = 0; j < this.boardArray[].length; j++) {
				if (this.isOccupied(i, j)) {
					cells[i * boardArray.length + j] = true;
					occupiedCount++;
				}
			}
		}
		int space = (int) Math.random() * occupiedCount;
		int[] spot = new int[2];
		int row = 0, col = 0, counter = 0;
		while (counter <= space) {
			if (counter == space) {
				row = i % boardArray[].length;
				col = i / boardArray[].length;
				spot[0] = row;
				spot[1] = col;
			} else {
				counter++;
			}
		}
		return spot; 
	}

	/*
	 * Calculate a random value either 2, 4, or 8 based on board sum
	 */
	public static int calculateValue() {
		int max = log2(this.getBoardSum()) / 2 - 2;
		int val = (int) Math.random() * max + 2;
		return val;
	}

	public static int log2(int n) {
		return (int) Math.log(n) / Math.log(2);
	}

	/*
	 * Return the sum of all spaces on the board
	 */
	public int getBoardSum() {
		int sum = 0;
		for (int i = 0; i < this.boardArray[].length; i++) {
			for (int j = 0; j < this.boardArray.length; j++) {
				sum += this.boardArray[i][j];
			}
		}
		return sum;
	}

	public boolean hasPossibleMove() {
		return false;
		// TODO
	}
}

