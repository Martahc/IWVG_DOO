package types;

public enum Direction {

	NORTH, WEST, NORTHWEST, SOUTHWEST;

	public static Direction getDirection(int ordinal) {

		assert ordinal >= 0 && ordinal < 4;

		return Direction.values()[ordinal];
	}
}
