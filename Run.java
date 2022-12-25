public class Run {
	public static void main(String[] args) {
		Game game;
		if (args[0].toLowerCase().equals("nogui") {
			game = new Game(false);
			game.playNoGui();
		} else {
			game = new Game(true);
			game.play();
		}
	}
}

