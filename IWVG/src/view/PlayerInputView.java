package view;

public class PlayerInputView {

	public int readColumn(String message) {
		Console console = Console.getInstance();
		console.write(message);
		int col = console.readInt();
		return col;
	}

}
