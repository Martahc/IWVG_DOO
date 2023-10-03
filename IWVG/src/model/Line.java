package model;

import java.util.ArrayList;
import java.util.List;

import types.Coordinate;
import types.Direction;

public class Line {

	private Direction adress;

	public Line(Direction adress) {
		this.adress = adress;
	}

	public List<List<Coordinate>> getCoordinateListsInDirection(Coordinate coordinate) {
		List<List<Coordinate>> coordinateLists = new ArrayList<>();
		if (this.adress.name().equalsIgnoreCase(Direction.NORTH.name())) {
			if (coordinate.getRow() < 3) {
				List<Coordinate> coordinates = new ArrayList<>();
				for (int i = coordinate.getRow(); i < coordinate.getRow() + 4; i++) {
					coordinates.add(new Coordinate(i, coordinate.getCol()));
				}
				coordinateLists.add(coordinates);
			}
			if (coordinate.getRow() > 2) {
				List<Coordinate> coordinates = new ArrayList<>();
				for (int i = coordinate.getRow(); i > coordinate.getRow() - 4; i--) {
					coordinates.add(new Coordinate(i, coordinate.getCol()));
				}
				coordinateLists.add(coordinates);
			}
			if (coordinate.getRow() > 0 && coordinate.getRow() + 2 < Coordinate.rows) {
				List<Coordinate> coordinates = new ArrayList<>();
				coordinates.add(new Coordinate(coordinate.getRow() - 1, coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow() + 1, coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow() + 2, coordinate.getCol()));
				coordinateLists.add(coordinates);

			}
			if (coordinate.getRow() > 1 && coordinate.getRow() < Coordinate.rows - 1) {
				List<Coordinate> coordinates = new ArrayList<>();
				coordinates.add(new Coordinate(coordinate.getRow() + 1, coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow() - 1, coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow() - 2, coordinate.getCol()));
				coordinateLists.add(coordinates);
			}

		}

		if (this.adress.name().equalsIgnoreCase(Direction.WEST.name())) {
			if (coordinate.getCol() < 4) {
				List<Coordinate> coordinates = new ArrayList<>();
				for (int i = coordinate.getCol(); i < coordinate.getCol() + 4; i++) {
					coordinates.add(new Coordinate(coordinate.getRow(), i));
				}
				coordinateLists.add(coordinates);
			}
			if (coordinate.getCol() > 2) {
				List<Coordinate> coordinates = new ArrayList<>();
				for (int i = coordinate.getCol(); i > coordinate.getCol() - 4; i--) {
					coordinates.add(new Coordinate(coordinate.getRow(), i));
				}
				coordinateLists.add(coordinates);
			}
			if (coordinate.getCol() > 0 && coordinate.getCol() + 2 < Coordinate.cols) {
				List<Coordinate> coordinates = new ArrayList<>();
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol() - 1));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol() + 1));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol() + 2));
				coordinateLists.add(coordinates);
			}
			if (coordinate.getCol() > 1 && coordinate.getCol() < Coordinate.cols - 1) {
				List<Coordinate> coordinates = new ArrayList<>();
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol() + 1));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol() - 1));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol() - 2));
				coordinateLists.add(coordinates);
			}
		}

		if (this.adress.name().equalsIgnoreCase(Direction.NORTHWEST.name())) {
			if (coordinate.getRow() < 3 && coordinate.getCol() < 4) {
				List<Coordinate> coordinates = new ArrayList<>();
				for (int i = coordinate.getCol(), j = coordinate.getRow(); i < coordinate.getCol() + 4
						&& j < coordinate.getRow() + 4; i++, j++) {
					coordinates.add(new Coordinate(j, i));
				}
				coordinateLists.add(coordinates);
			}
			if (coordinate.getRow() > 2 && coordinate.getCol() > 2) {
				List<Coordinate> coordinates = new ArrayList<>();
				for (int i = coordinate.getCol(), j = coordinate.getRow(); i > coordinate.getCol() - 4
						&& j > coordinate.getRow() - 4; i--, j--) {
					coordinates.add(new Coordinate(j, i));
				}
				coordinateLists.add(coordinates);
			}

			if (coordinate.getRow() > 0 && coordinate.getCol() > 0 && coordinate.getRow() < Coordinate.rows - 2
					&& coordinate.getCol() < Coordinate.cols - 2) {
				List<Coordinate> coordinates = new ArrayList<>();
				coordinates.add(new Coordinate(coordinate.getRow() - 1, coordinate.getCol() - 1));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow() + 1, coordinate.getCol() + 1));
				coordinates.add(new Coordinate(coordinate.getRow() + 2, coordinate.getCol() + 2));
				coordinateLists.add(coordinates);

			}
			if (coordinate.getRow() > 1 && coordinate.getCol() > 1 && coordinate.getRow() < Coordinate.rows - 1
					&& coordinate.getCol() < Coordinate.cols - 1) {
				List<Coordinate> coordinates = new ArrayList<>();
				coordinates.add(new Coordinate(coordinate.getRow() + 1, coordinate.getCol() + 1));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow() - 1, coordinate.getCol() - 1));
				coordinates.add(new Coordinate(coordinate.getRow() - 2, coordinate.getCol() - 2));
				coordinateLists.add(coordinates);
			}
		}

		if (this.adress.name().equalsIgnoreCase(Direction.SOUTHWEST.name())) {
			if (coordinate.getRow() > 2 && coordinate.getCol() < 4) {
				List<Coordinate> coordinates = new ArrayList<>();
				for (int i = coordinate.getCol(), j = coordinate.getRow(); i < coordinate.getCol() + 4
						&& j > coordinate.getRow() - 4; i++, j--) {
					coordinates.add(new Coordinate(j, i));
				}
				coordinateLists.add(coordinates);
			}
			if (coordinate.getRow() < 3 && coordinate.getCol() > 2) {
				List<Coordinate> coordinates = new ArrayList<>();
				for (int i = coordinate.getCol(), j = coordinate.getRow(); i > coordinate.getCol() - 4
						&& j < coordinate.getRow() + 4; i--, j++) {
					coordinates.add(new Coordinate(j, i));
				}
				coordinateLists.add(coordinates);
			}
			if (coordinate.getRow() > 0 && coordinate.getRow() < Coordinate.rows - 2
					&& coordinate.getCol() < Coordinate.cols - 1 && coordinate.getCol() > 1) {
				List<Coordinate> coordinates = new ArrayList<>();
				coordinates.add(new Coordinate(coordinate.getRow() - 1, coordinate.getCol() + 1));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow() + 1, coordinate.getCol() - 1));
				coordinates.add(new Coordinate(coordinate.getRow() + 2, coordinate.getCol() - 2));
				coordinateLists.add(coordinates);
			}

			if (coordinate.getRow() > 1 && coordinate.getRow() < Coordinate.rows - 1 && coordinate.getCol() > 0
					&& coordinate.getCol() < Coordinate.cols - 2) {
				List<Coordinate> coordinates = new ArrayList<>();
				coordinates.add(new Coordinate(coordinate.getRow() + 1, coordinate.getCol() - 1));
				coordinates.add(new Coordinate(coordinate.getRow(), coordinate.getCol()));
				coordinates.add(new Coordinate(coordinate.getRow() - 1, coordinate.getCol() + 1));
				coordinates.add(new Coordinate(coordinate.getRow() - 2, coordinate.getCol() + 2));
				coordinateLists.add(coordinates);
			}

		}

		return coordinateLists;

	}

}
