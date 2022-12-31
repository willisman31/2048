public class Game {

	private Board board;
	int boardSize = Board.DEFAULT_SIZE;
	private boolean useGui = true;

	public Game() {
		// play game
		// set game configs here- board size, special value adds, time constraints, etc.
		this.board = new Board(boardSize);
	}

	public Game(boolean gui) {
		this.useGui = gui;
		if (useGui) super();
		else {
			// play game with no gui
			// set game configs here
		}
	}

	public void play() {
		// play game with gui
		while(Board.hasPossibleMove()) {
			// TODO
		}
	}

	public void playNoGui() {
		// play with no gui
	}

	public void setBoardSize(int sideLength) {
		this.boardSize = sideLength;
	}

	public int getBoardSize() {
		return this.boardSize;
	}

	public boolean useGui() {
		return this.useGui;
	}

	public void setUseGui(boolean gui) {
		this.useGui = gui;
	}
}

