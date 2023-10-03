import model.Game;
import view.GameView;

public class ConnectFour {

	private Game game;
	private GameView gameView;

	public ConnectFour() {
		this.game = new Game();
		this.gameView = new GameView(this.game);

	}

	private void play() {
		do {
			this.gameView.play();
		} while (this.gameView.restart());
	}

	public static void main(String[] args) {
		new ConnectFour().play();

	}

}
