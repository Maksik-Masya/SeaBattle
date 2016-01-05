package com.borodenko.seabattle.model;

import java.util.Set;

public class Player {
	
	private Set<Cell> fieldOfTurns;
	private Set<Cell> fieldOfShips;
	private int aliveShips;
	
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
