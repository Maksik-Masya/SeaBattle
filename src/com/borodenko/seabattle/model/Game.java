package com.borodenko.seabattle.model;

public class Game {
	
	private Player mainPlayer;
	private Player enemyPlayer;
	
	public Game() {
		mainPlayer = new Player();
		enemyPlayer = new Player();
	}

	public Player getMainPlayer() {
		return mainPlayer;
	}

	public void setMainPlayer(Player mainPlayer) {
		this.mainPlayer = mainPlayer;
	}

	public Player getEnemyPlayer() {
		return enemyPlayer;
	}

	public void setEnemyPlayer(Player enemyPlayer) {
		this.enemyPlayer = enemyPlayer;
	}

}
