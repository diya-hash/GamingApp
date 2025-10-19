package com.games.games.game;

public class GameRunner {
	MarioGame game;
	public GameRunner(MarioGame game) {
		this.game = game;
	}
	public void run() {
		System.out.print("Running game : " + game);
	}
}
