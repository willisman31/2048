public class Game {
	public Game() {
		// play game
		// set game configs here- board size, special value adds, time constraints, etc.
	}

	public Game(boolean gui) {
		if (gui) super();
		else {
			// play game with no gui
			// set game configs here
		}
	}

	public void play() {
		// play game with gui
	}

	public void playNoGui() {
		// play with no gui
	}
}

