package com.borodenko.seabattle.veiw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Set;

import javax.swing.JPanel;

import com.borodenko.seabattle.model.Cell;

public class FieldPanel extends JPanel{
	private int sizeWidth;
	private int sizeHeight;
	private Set<Cell> fieldOfShips;
	
	public FieldPanel(int sizeWidth, int sizeHeight, Set<Cell> fieldOfShips) {
		this.fieldOfShips = fieldOfShips;
		this.sizeWidth = sizeWidth;
		this.sizeHeight = sizeHeight;
		this.setPreferredSize(new Dimension(sizeWidth, sizeHeight));
		this.setBackground(Color.GREEN);
	}
	
	
	public FieldPanel (Set<Cell> fieldOfShips) {
		this.fieldOfShips = fieldOfShips;
	}


	public void setFieldOfShips(Set<Cell> fieldOfShips) {
		this.fieldOfShips = fieldOfShips;
	}


	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, sizeWidth, sizeHeight);
		
		drawField(g);
		drawGrid(g);		
	}


	private void drawField(Graphics g) {
		int stepWidth = (sizeWidth / 10);
		int stepHeight = (sizeHeight / 10);
		for(Cell cell : fieldOfShips) {
			switch(cell.getStatus()) {
				case ALIVE_SHIP : {
					g.setColor(Color.GREEN);
					break;
				}
				case EMPTY : {
					g.setColor(Color.BLUE);
					break;
				}
				case MISS : {
					g.setColor(Color.GRAY);
					break;
				}
				case DESTROYED_SHIP : {
					g.setColor(Color.RED);
					break;
				}
			}
			int realY = cell.getY() * stepHeight;
			int realX = cell.getX() * stepWidth;
			g.fillRect(realX, realY, stepWidth, stepHeight);
		}
	}

	private void drawGrid(Graphics g) {
		//create grid
		int step = (sizeWidth / 10);
		for(int i = 0; i < sizeWidth; i += step) {
			g.setColor(Color.BLACK);
			g.drawLine(i, 0, i, sizeHeight);			
		}
		step = (sizeHeight / 10);
		for(int i = 0; i < sizeHeight; i += step) {
			g.setColor(Color.BLACK);
			g.drawLine(0, i, sizeWidth, i);			
		}
	}
	

}
