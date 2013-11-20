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
	
	public Gui (String s) {
		if (s.equals("auto")) {
			initializeComponents();
			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			int x = gd.getDisplayMode().getWidth();
			int y = gd.getDisplayMode().getHeight();
			drawComponentsToResolution(x, y);
			mainWindow.setVisible(true);
		} else {
			drawComponentsWithoutResolution();
		}
	}

	private JFrame mainWindow;
	private JButton team1Button;
	private JButton team2Button;
	private JButton team3Button;
	private JButton team4Button;
	private JButton team5Button;
	private JButton team6Button;
	private JButton team7Button;
	private JButton team8Button;
	private JButton clearButton;
	private List<JButton> ButtonList;
    private ActionListener clearButtonListener;
    
	private void initializeComponents() {
		mainWindow = new JFrame();
		ButtonList = new ArrayList<JButton>();
		team1Button = new JButton();
		team2Button = new JButton();
		team3Button = new JButton();
		team4Button = new JButton();
		team5Button = new JButton();
		team6Button = new JButton();
		team7Button = new JButton();
		team8Button = new JButton();
		clearButton = new JButton();
		ButtonList.add(team1Button);
		ButtonList.add(team2Button);
		ButtonList.add(team3Button);
		ButtonList.add(team4Button);
		ButtonList.add(team5Button);
		ButtonList.add(team6Button);
		ButtonList.add(team7Button);
		ButtonList.add(team8Button);
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
			ButtonList.get(i).setText("Team " + (i+1));
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
