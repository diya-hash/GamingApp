package com.games.games;

import com.games.games.game.GameRunner;
import com.games.games.game.MarioGame;
import com.games.games.game.PacManGame;
import com.games.games.game.SuperContraGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
//		var game = new MarioGame();
		var game = new PacManGame();
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
