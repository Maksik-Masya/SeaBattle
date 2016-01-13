package com.borodenko.seabattle.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;
import java.util.Set;

import com.borodenko.seabattle.constants.VeiwConstants;
import com.borodenko.seabattle.model.Cell;
import com.borodenko.seabattle.model.Game;
import com.borodenko.seabattle.model.Ship;
import com.borodenko.seabattle.service.impl.GameServiceImpl;
import com.borodenko.seabattle.veiw.GameFrame;

public class MainController implements MouseListener{

	private GameFrame gameFrame;
	private Game game;

	
	public MainController() {
		initGame();
		initFrame();
	}
	
	private void initFrame() {
		gameFrame = new GameFrame(game.getMainPlayer().getFieldOfShips());
		gameFrame.addMouseListenerOnFieldPanel(this);

		
	}
	
	private void initGame() {
		game = new Game();
		
		GameServiceImpl gameServiceImpl = new GameServiceImpl();
		Set<Cell> fieldOfTurns = gameServiceImpl.createEmptyField();		
		Map<Cell, Ship> ships = gameServiceImpl.randomPlaceShips();				
		Set<Cell> fieldOfShips = gameServiceImpl.createFieldWithShips(ships);
		
		game.getMainPlayer().setAliveShips(10);
		game.getMainPlayer().setFieldOfShips(fieldOfShips);
		game.getMainPlayer().setFieldOfTurns(fieldOfTurns);
		game.getMainPlayer().setShips(ships);
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Cell cell = normalizeCoordinatesToCell(e);
		
	}


	private Cell normalizeCoordinatesToCell(MouseEvent e) {
		int stepX = VeiwConstants.DEFAULT_FIELD_PANEL_WIDTH / 10;
		int stepY = VeiwConstants.DEFAULT_FIELD_PANEL_HEIGHT / 10;
		int realX = e.getX() / stepX;
		int realY = e.getY() / stepY;
 		System.out.println("X = " + realX + " Y = " + realY);
 		return new Cell(realX, realY);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//System.out.println("X = " + e.getX() + " Y = " + e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println("X = " + e.getX() + " Y = " + e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("X = " + e.getX() + " Y = " + e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {		
	
	}
	
	

}
