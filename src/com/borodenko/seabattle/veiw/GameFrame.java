package com.borodenko.seabattle.veiw;

import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.JFrame;

import com.borodenko.seabattle.constants.VeiwConstants;
import com.borodenko.seabattle.model.Cell;
import com.borodenko.seabattle.model.Ship;
import com.borodenko.seabattle.model.type.CellStatus;

public class GameFrame extends JFrame{
	
	private MainPanel mainPanel;
	private Set<Cell> fieldShips;
	private Map<Cell, Ship> ships;
	
	public GameFrame(Set<Cell> fieldShips) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sea Battle");
		setSize(VeiwConstants.DEFAULT_FRAME_WIDTH,
				VeiwConstants.DEFAULT_FRAME_HEIGHT);
		
				
		mainPanel = new MainPanel(VeiwConstants.DEFAULT_FRAME_WIDTH,
				VeiwConstants.DEFAULT_FRAME_HEIGHT,
				Collections.EMPTY_SET, fieldShips);
		
		add(mainPanel);
		setVisible(true);
		
	}
	
	public void addMouseListenerOnFieldPanel(MouseListener listener) {
		mainPanel.getFieldOfShipsPanel().addMouseListener(listener);
	}
	
	
	
	

	

}
