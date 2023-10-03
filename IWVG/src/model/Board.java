package model;

import java.util.List;

import types.Color;
import types.Coordinate;
import types.Direction;

public class Board {

	private Color[][] board;
	private Coordinate lastTokenCoordinates;

	public Board() {
		this.board = new Color[Coordinate.rows][Coordinate.cols];
		this.lastTokenCoordinates = null;
	}

	public void reset() {
		for (int row = 0; row < Coordinate.rows; row++) {
			for (int col = 0; col < Coordinate.cols; col++) {
				this.board[row][col] = null;
			}
		}

	}

	public boolean isCellOccupied(Coordinate coord) {
		return this.board[coord.getRow()][coord.getCol()] != null;
	}

	public boolean isColumnFull(int col) {
		return this.board[0][col] != null;
	}

	public Color getColor(Coordinate coord) {
		return this.board[coord.getRow()][coord.getCol()];
	}

	public void putToken(Color color, int col) {
		int row = this.findEmptyRow(col);
		Coordinate coordinate = new Coordinate(row, col);
		this.board[coordinate.getRow()][coordinate.getCol()] = color;
		this.lastTokenCoordinates = coordinate;
	}

	private int findEmptyRow(int col) {
		boolean found = false;
		int result = -1;
		for (int row = 0; row < Coordinate.rows && !found; row++) {
			if (this.board[row][col] != null) {
				found = true;
				result = row - 1;
			}
		}
		if (result == -1) {
			result = Coordinate.rows - 1;
		}
		return result;
	}

	public boolean isGameOver(int ordinalColor) {
		return isConnectFour(ordinalColor) || isBoardFull();

	}

	private boolean isConnectFour(int ordinalColor) {
		for (int i = 0; i < Direction.values().length; i++) {
			Line line = new Line(Direction.getDirection(i));
			List<List<Coordinate>> coordinateLists = line.getCoordinateListsInDirection(this.lastTokenCoordinates);
			for (List<Coordinate> coordinates : coordinateLists) {
				if (checkCoordinatesForColorMatch(coordinates, ordinalColor)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkCoordinatesForColorMatch(List<Coordinate> coordinates, int ordinalColor) {
		for (int j = 0; j < coordinates.size(); j++) {
			if (this.board[coordinates.get(j).getRow()][coordinates.get(j).getCol()] == null
					|| this.board[coordinates.get(j).getRow()][coordinates.get(j).getCol()].ordinal() != ordinalColor) {
				return false;
			}
		}

		return true;
	}

	private boolean isBoardFull() {
		boolean isOcuppied = true;
		for (int row = 0; row < Coordinate.rows && isOcuppied; row++) {
			for (int col = 0; col < Coordinate.cols && isOcuppied; col++) {
				Coordinate coord = new Coordinate(row, col);
				if (!this.isCellOccupied(coord)) {
					isOcuppied = false;
				}
			}

		}
		return isOcuppied;
	}

}
