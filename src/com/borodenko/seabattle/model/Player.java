package com.borodenko.seabattle.model;

import java.util.Map;
import java.util.Set;

public class Player {
	
	private Set<Cell> fieldOfTurns;
	private Set<Cell> fieldOfShips;
	private int aliveShips;
	private Map<Cell, Ship> ships;
	
	
	
	public Map<Cell, Ship> getShips() {
		return ships;
	}
	public void setShips(Map<Cell, Ship> ships) {
		this.ships = ships;
	}
	public Set<Cell> getFieldOfTurns() {
		return fieldOfTurns;
	}
	public void setFieldOfTurns(Set<Cell> fieldOfTurns) {
		this.fieldOfTurns = fieldOfTurns;
	}
	public Set<Cell> getFieldOfShips() {
		return fieldOfShips;
	}
	public void setFieldOfShips(Set<Cell> fieldOfShips) {
		this.fieldOfShips = fieldOfShips;
	}
	public int getAliveShips() {
		return aliveShips;
	}
	public void setAliveShips(int aliveShips) {
		this.aliveShips = aliveShips;
	}
	
}
