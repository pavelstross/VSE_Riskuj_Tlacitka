package cz.vse.riskujtlacitka.gui;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {

	private final int screenDivisor = 4;  
	private JFrame mainWindow;
	private JButton clearButton;
	private List<JButton> ButtonList;
	private ActionListener clearButtonListener;

	public Gui() {
		drawComponentsWithoutResolution();
	}

	public Gui(int x, int y) {
		drawComponentsToResolution(x, y);
	}

	public Gui(String s) {
		if (s.equals("auto")) {
			GraphicsDevice gd = GraphicsEnvironment
					.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			int screenWidth = gd.getDisplayMode().getWidth();
			int screenHeight = (gd.getDisplayMode().getHeight());
			drawComponentsToResolution(screenWidth, screenHeight);
		} else {
			drawComponentsWithoutResolution();
		}
	}

	private void initializeComponents() {
		mainWindow = new JFrame();
		clearButton = new JButton();
		ButtonList = new ArrayList<JButton>();
		for (int i = 0; i < 8; i++) {
			ButtonList.add(new JButton());
		}
		clearButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				deactivateTeamButtons();

			}
		};
	}

	private void deactivateTeamButtons() {
		for (JButton button : ButtonList) {
			button.setBackground(Color.gray);
		}
	}

	private void drawComponents() {
		mainWindow.setLayout(new GridLayout(1, 9));
		for (int i = 0; i < ButtonList.size(); i++) {
			ButtonList.get(i).setText("Team " + (i + 1));
		}
		for (JButton button : ButtonList) {
			deactivateTeamButtons();
			mainWindow.add(button);
		}
		clearButton.setText("Clear");
		clearButton.addActionListener(clearButtonListener);
		mainWindow.add(clearButton);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void drawComponentsWithoutResolution() {
		initializeComponents();
		drawComponents();
		mainWindow.setVisible(true);
	}

	private void drawComponentsToResolution(int screenWidth, int screenHeight) {
		initializeComponents();
		drawComponents();
		int mainWindowWidth = screenWidth;
		int mainWindowHeight = screenHeight / screenDivisor;
		mainWindow.setSize(mainWindowWidth, mainWindowHeight);
		mainWindow.setLocation(0, (screenHeight - mainWindowHeight));
		mainWindow.setVisible(true);
	}

	public void setActiveButton(int i) {
		ButtonList.get(i).setBackground(Color.red);
	}
}
