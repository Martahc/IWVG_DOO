package view;

import model.Game;

public class GameView extends View {

	private PlayView playView;
	private RestartView restartView;

	public GameView(Game game) {
		super(game);
		this.playView = new PlayView(this.game);
		this.restartView = new RestartView(this.game);
	}

	public void play() {
		playView.play();
	}

	public boolean restart() {
		return this.restartView.askToPlayAgain();
	}
}
