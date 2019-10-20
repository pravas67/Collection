package com.heraizen.cj.player;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayerImpl {

	public List<String> getPlayers(List<Player> cricket, List<Player> football) {

		List<String> name = cricket.stream().map(e -> e.getName()).collect(Collectors.toList());
		return football.stream().map(Player::getName).filter(e -> name.contains(e)).collect(Collectors.toList());

	}

}
