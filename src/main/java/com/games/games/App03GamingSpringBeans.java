package com.games.games;

import com.games.games.game.GameRunner;
import com.games.games.game.MarioGame;
import com.games.games.game.PacManGame;
import com.games.games.game.SuperContraGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
//		var game = new MarioGame();
		var game = new PacManGame(); //Object creation
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game); // Object creation + Wiring of dependency
		//Game is a dependency of GameRunner
		gameRunner.run();
	}
}
