package com.borodenko.seabattle.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.borodenko.seabattle.model.Cell;
import com.borodenko.seabattle.model.Ship;
import com.borodenko.seabattle.model.type.CellStatus;

public class GameServiceImpl {

	public Set<Cell> createEmptyField() {
		Set<Cell> setShips = new HashSet<>();
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				Cell cell = new Cell(i, j);
				cell.setStatus(CellStatus.EMPTY);
				setShips.add(cell);
			}
		}	
		return setShips;
	}
	
	public Set<Cell> createFieldWithShips(Map<Cell, Ship> ships) {
		Set<Cell> setShips = createEmptyField();		
		for (Cell cell : ships.keySet()) {
			for (Cell cellShip : setShips) {
				if(cell.equals(cellShip)){
					cellShip.setStatus(CellStatus.ALIVE_SHIP);
				}
			}
		}
		return setShips;
	}
	
	public Map<Cell, Ship> randomPlaceShips() {
		return initMap();		
	}
		
	private Map<Cell, Ship> initMap() {
		Ship ship1 = new Ship();
		ship1.setDeckSize(2);
		Map<Cell, Ship> ships = new HashMap<>();
		ships.put(new Cell(1, 1), ship1);
		ships.put(new Cell(1, 2), ship1);
		return ships;
	}
}
