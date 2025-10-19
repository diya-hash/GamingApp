package com.games.games;

import com.games.games.game.GameRunner;
import com.games.games.game.MarioGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}
}
