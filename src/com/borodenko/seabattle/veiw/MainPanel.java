package com.borodenko.seabattle.veiw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Set;

import javax.swing.JPanel;

import com.borodenko.seabattle.model.Cell;

public class MainPanel extends JPanel{
	private int sizeWidth;
	private int sizeHeight;
	private JPanel fieldOfTurnsPanel;
	private JPanel fieldOfShipsPanel;
	private final int FIELD_PANEL_SIZE_WIDTH = 350;
	private final int FIELD_PANEL_SIZE_HEIGHT = 350;
	
	public MainPanel(int sizeWidth, int sizeHeight, 
			Set<Cell>fieldOfTurns, Set<Cell>fieldOfShips){
		
		this.sizeWidth = sizeWidth;
		this.sizeHeight = sizeHeight;
		this.setPreferredSize(new Dimension(sizeWidth, sizeHeight));
		this.setBackground(Color.RED);
		fieldOfTurnsPanel = new FieldPanel(FIELD_PANEL_SIZE_WIDTH, 
				FIELD_PANEL_SIZE_HEIGHT, fieldOfTurns);
		
		fieldOfShipsPanel = new FieldPanel(FIELD_PANEL_SIZE_WIDTH, 
				FIELD_PANEL_SIZE_HEIGHT, fieldOfShips);
		
		init();
	}
	
	private void init(){
		this.setLayout(new FlowLayout());
		this.add(fieldOfTurnsPanel);
		this.add(fieldOfShipsPanel);
		//this.add(new JPanel());
		
	}

	public void setFieldOfTurnsPanel(JPanel fieldOfTurnsPanel) {
		this.fieldOfTurnsPanel = fieldOfTurnsPanel;
	}

	public void setFieldOfShipsPanel(JPanel fieldOfShipsPanel) {
		this.fieldOfShipsPanel = fieldOfShipsPanel;
	}
	
	
	
	

}
