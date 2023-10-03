package model;

import types.Color;

public class Player {

	private Color color;
	private Board board;

	public Player(Color color, Board board) {
		this.color = color;
		this.board = board;
	}

	public void putToken(int col) {
		this.board.putToken(color, col);
	}

	public boolean getErrorPutToken(int col) {
		if (!(col >= 0 && col <= 6) || this.board.isColumnFull(col)) {
			return true;
		}
		return false;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
