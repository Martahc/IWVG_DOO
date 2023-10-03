package model;

import types.Color;
import types.Coordinate;

public class Game {

	Turn turn;
	Board board;

	public Game() {
		this.board = new Board();
		this.turn = new Turn(this.board);
	}

	public void reset() {
		this.board.reset();
		this.turn.initPlayers();
	}

	public boolean isGameOver() {
		return this.board.isGameOver(this.turn.getCurrentPlayer().getColor().ordinal());
	}

	public Color getColor(Coordinate coord) {
		return this.board.getColor(coord);
	}

	public Color getCurrentColor() {
		return this.turn.getCurrentColor();
	}

	public void putToken(int col) {
		this.turn.putToken(col);
	}

	public boolean getErrorPutToken(int col) {
		return this.turn.getErrorPutToken(col);
	}

}
