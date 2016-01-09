package com.borodenko.seabattle.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.borodenko.seabattle.constants.VeiwConstants;
import com.borodenko.seabattle.model.Cell;
import com.borodenko.seabattle.veiw.GameFrame;

public class MainController implements MouseListener{

	private GameFrame gameFrame;
	
	public MainController() {
		gameFrame = new GameFrame();
		gameFrame.addMouseListenerOnFieldPanel(this);
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
