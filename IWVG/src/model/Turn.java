package model;

import types.Color;

public class Turn {

	private int currentPlayer;
	private Board board;
	private Player players[];

	public Turn(Board board) {
		this.board = board;
		this.players = new Player[2];
		initPlayers();

	}

	public void initPlayers() {
		for (int i = 0; i < 2; i++) {
			players[i] = new Player(Color.getColor(i), this.board);
		}
		this.currentPlayer = 0;
	}

	public void putToken(int col) {
		this.getCurrentPlayer().putToken(col);
		if (!this.board.isGameOver(this.getCurrentColor().ordinal())) {
			this.nextTurn();
		}
	}

	private void nextTurn() {
		this.currentPlayer = (this.currentPlayer == 0) ? 1 : 0;

	}

	public boolean getErrorPutToken(int col) {
		return this.getCurrentPlayer().getErrorPutToken(col);
	}

	public Color getCurrentColor() {
		return this.getCurrentPlayer().getColor();
	}

	public Player getCurrentPlayer() {
		return players[this.currentPlayer];
	}

}
