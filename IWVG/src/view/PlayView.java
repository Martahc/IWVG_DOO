package view;

import model.Game;

public class PlayView extends View {

	public PlayView(Game game) {
		super(game);

	}

	public void play() {
		do {
			new BoardView().printBoard(this.game);
			new PlayerView(this.game).putToken();
		} while (!this.game.isGameOver());

		new BoardView().printBoard(this.game);
		Console.getInstance().writeln("Congratulations the player " + this.game.getCurrentColor().name() + " win");

	}

}
