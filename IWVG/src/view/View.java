package view;

import model.Game;

abstract class View {

	public Game game;

	public View(Game game) {
		this.game = game;
	}

}
