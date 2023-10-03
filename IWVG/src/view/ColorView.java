package view;

import types.Color;

public class ColorView {

	public void printColor(Color color) {
		String nameColor = color.name();
		Console.getInstance().write(nameColor);
	}
}
