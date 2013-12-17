package cz.vse.riskujlacitka.shop;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUI() {
		JTabbedPane tabbedPane = new JTabbedPane();
		this.add(tabbedPane);
		for (int i = 1; i <= Main.teamCount; i++) {
			tabbedPane.add("Tým " + i,new TeamPanel());
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDevice gd = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int screenWidth = gd.getDisplayMode().getWidth();
		int screenHeight = (gd.getDisplayMode().getHeight());
		this.setSize(new Dimension(screenWidth, screenHeight));
		this.setVisible(true);
		
	}

}
