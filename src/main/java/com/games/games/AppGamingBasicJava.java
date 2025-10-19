package com.games.games;

import com.games.games.game.GameRunner;
import com.games.games.game.MarioGame;
import com.games.games.game.SuperContraGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}
}
