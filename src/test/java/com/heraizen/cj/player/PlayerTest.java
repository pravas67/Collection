package com.heraizen.cj.player;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PlayerTest {

	static PlayerImpl playimpl;
	static List<Player> cricket=new ArrayList<Player>();
	static List<Player> football=new ArrayList<Player>();
	@BeforeAll
	public static void objectCreation()
	{
		playimpl=new PlayerImpl();
		cricket.add(new Player("virat","cricket"));
		cricket.add(new Player("Dhoni","cricket"));
		cricket.add(new Player("Rohit","cricket"));
		cricket.add(new Player("Messi","cricket"));
		
		
		football.add(new Player("Ronald","football"));
		football.add(new Player("ggg","football"));
		football.add(new Player("Sunil","football"));
		football.add(new Player("Messi","football"));
		football.add(new Player("virat","football"));
		football.add(new Player("Dhoni","football"));
		
	}
	@Test
	public void getAllPalyerTest()
	{
	assertEquals(3, playimpl.getPlayers(cricket, football).size());
	}
	

}
