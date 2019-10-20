package com.heraizen.cj.player;

public class Player {
	private String  name;
	private String game;
	public Player(String name,String game)
	{
		this.name=name;
		this.game=game;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", game=" + game + "]";
	}
	

	

}
