package view;

import model.Game;

public class RestartView extends View {

	public RestartView(Game game) {
		super(game);
	}

	public boolean askToPlayAgain() {
		Console.getInstance().write("Do you want to play again? (YES/NO): ");
		String response = Console.getInstance().readString();
		if (response.equals("YES")) {
			this.game.reset();
		}
		return response.equals("YES");
	}

}
