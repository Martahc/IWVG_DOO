package view;

import model.Game;
import types.Coordinate;

public class BoardView {

	public void printBoard(Game connectFour) {
		for (int row = 0; row < Coordinate.rows; row++) {
			Console.getInstance().writeln("---------------");
			Console.getInstance().write("| ");
			for (int col = 0; col < Coordinate.cols; col++) {
				if (connectFour.getColor(new Coordinate(row, col)) == null) {
					Console.getInstance().write("| ");
				} else {
					new ColorView().printColor(connectFour.getColor(new Coordinate(row, col)));
					Console.getInstance().write("| ");
				}

			}

			Console.getInstance().writeln();
		}
		Console.getInstance().writeln("---------------");

	}

}
