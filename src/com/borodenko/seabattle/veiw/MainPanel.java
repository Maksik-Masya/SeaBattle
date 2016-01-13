package com.borodenko.seabattle.veiw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Set;

import javax.swing.JPanel;

import com.borodenko.seabattle.constants.VeiwConstants;
import com.borodenko.seabattle.model.Cell;

public class MainPanel extends JPanel{
	private JPanel fieldOfTurnsPanel;
	private JPanel fieldOfShipsPanel;
	
	
	public MainPanel(int sizeWidth, int sizeHeight, 
			Set<Cell>fieldOfTurns, Set<Cell>fieldOfShips){
		
		this.setPreferredSize(new Dimension(VeiwConstants.DEFAULT_FRAME_WIDTH, 
				VeiwConstants.DEFAULT_FRAME_HEIGHT));
		this.setBackground(Color.RED);
		fieldOfTurnsPanel = new FieldPanel(VeiwConstants.DEFAULT_FIELD_PANEL_WIDTH, 
				VeiwConstants.DEFAULT_FIELD_PANEL_HEIGHT, fieldOfTurns);
		
		fieldOfShipsPanel = new FieldPanel(VeiwConstants.DEFAULT_FIELD_PANEL_WIDTH, 
				VeiwConstants.DEFAULT_FIELD_PANEL_HEIGHT, fieldOfShips);
		
		init();
	}
	
	private void init(){
		this.setLayout(new FlowLayout());
		this.add(fieldOfTurnsPanel);
		this.add(fieldOfShipsPanel);		
	}

	public void setFieldOfTurnsPanel(JPanel fieldOfTurnsPanel) {
		this.fieldOfTurnsPanel = fieldOfTurnsPanel;
	}

	public void setFieldOfShipsPanel(JPanel fieldOfShipsPanel) {
		this.fieldOfShipsPanel = fieldOfShipsPanel;
	}
	
	public JPanel getFieldOfTurnsPanel() {
		return fieldOfTurnsPanel;
	}

	public JPanel getFieldOfShipsPanel() {
		return fieldOfShipsPanel;
	}
	
	

}
