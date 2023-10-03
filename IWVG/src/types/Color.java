package types;

public enum Color {

	X, O;

	public static Color getColor(int ordinal) {

		assert ordinal >= 0 && ordinal < 2;

		return Color.values()[ordinal];
	}
}
