package view;

import model.Game;

public class PlayerView {

	private Game game;

	public PlayerView(Game game) {
		this.game = game;
	}

	public void putToken() {
		int column;
		boolean isInvalidMove;
		do {
			column = this.readColumn("Write a number of column please ");
			isInvalidMove = this.game.getErrorPutToken(column);
		} while (isInvalidMove);
		this.game.putToken(column);
	}

	public int readColumn(String message) {
		return new PlayerInputView().readColumn(message);
	}

}
