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

	public Gui() {
		super();
		drawComponentsWithoutResolution();
	}

	public Gui(int x, int y) {
		super();
		initializeComponents();
		drawComponentsToResolution(x, y);
		mainWindow.setVisible(true);
	}

	public Gui(String s) {
		if (s.equals("auto")) {
			initializeComponents();
			GraphicsDevice gd = GraphicsEnvironment
					.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			int x = gd.getDisplayMode().getWidth();
			int y = gd.getDisplayMode().getHeight();
			drawComponentsToResolution(x, y);
			mainWindow.setVisible(true);
		} else {
			drawComponentsWithoutResolution();
		}
	}

	private JFrame mainWindow;
	private JButton clearButton;
	private List<JButton> ButtonList;
	private ActionListener clearButtonListener;

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

	private void drawComponentsToResolution(int x, int y) {
		drawComponents();
		mainWindow.setSize(x, y);
	}

	public void setActiveButton(int i) {
		ButtonList.get(i).setBackground(Color.red);
	}
}
