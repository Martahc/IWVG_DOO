package types;

public class Coordinate {

	public static final int rows = 6;
	public static final int cols = 7;

	private int row;
	private int col;

	public Coordinate(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}

}
