package com.borodenko.seabattle.veiw;

import java.util.*;

import javax.swing.JFrame;

import com.borodenko.seabattle.model.Cell;
import com.borodenko.seabattle.model.CellStatus;
import com.borodenko.seabattle.model.Ship;

public class GameFrame extends JFrame{
	private final int DEFAULT_WIDTH = 750;
	private final int DEFAULT_HEIGHT = 450;
	private MainPanel mainPanel;
	private Set<Cell> setShips;
	
	private Map<Cell, Ship> ships;
	
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		
		mainPanel = new MainPanel(DEFAULT_WIDTH, DEFAULT_HEIGHT,
				Collections.EMPTY_SET, Collections.EMPTY_SET);
		
		add(mainPanel);
		setVisible(true);
	//	pack();
		
	}
	
	private void initMap() {
		Ship ship1 = new Ship();
		ship1.setDeckSize(2);
		ships = new HashMap<>();
		ships.put(new Cell(1, 1), ship1);
		ships.put(new Cell(1, 2), ship1);
		
	}
	
	private void initSet(){
		setShips = new HashSet<>();
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				Cell cell = new Cell(i, j);
				cell.setStatus(CellStatus.EMPTY);
				setShips.add(cell);
			}
		}
		
		for (Cell cell : ships.keySet()) {
			for (Cell cellShip : setShips) {
				if(cell.equals(cellShip)){
					cellShip.setStatus(CellStatus.ALIVE_SHIP);
				}
			}
		}
	}
	

}
