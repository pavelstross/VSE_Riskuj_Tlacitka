package cz.vse.riskujlacitka.shop;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TeamPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private int account = 0;
	private Random generator;

	private JLabel accountState;
	private JTextField jeopardyFinalState;
	private JButton equalityWithJeopardyButton;
	private JButton sellServerButton;
	private JButton buyServerButton;
	private JButton sellSwitchButton;
	private JButton buySwitchButton;
	private JButton sellDiskButton;
	private JButton buyDiskButton;
	private JButton sellDiskArrayButton;
	private JButton buyDiskArrayButton;

	public TeamPanel() {
		generator = new Random();
		this.setLayout(new GridLayout(6, 2));
		accountState = new JLabel("Stav účtu: " + account);
		Font font = new Font("Serif", Font.BOLD, 32);
		accountState.setFont(font);
		jeopardyFinalState = new JTextField("0");
		jeopardyFinalState.setFont(font);
		this.add(accountState);
		this.add(new JLabel());
		this.add(jeopardyFinalState);
		initializebuttons();
	}

	// int randomNum = rand.nextInt((max - min) + 1) + min;

	private void initializebuttons() {
		equalityWithJeopardyButton = new JButton("Vyrovnat s Riskuj");
		equalityWithJeopardyButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int jeopardyAccount = Integer.parseInt(jeopardyFinalState
						.getText());
				account = account + jeopardyAccount;
				jeopardyFinalState.setText("Vyrovnáno");
				equalityWithJeopardyButton.setEnabled(false);
				refresh();

			}
		});
		this.add(equalityWithJeopardyButton);
		sellServerButton = new JButton("Prodat server");
		sellServerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				account = account
						+ (generator
								.nextInt((Main.serverMaxCost - Main.serverMinCost) + 1) + Main.serverMinCost);
				refresh();
			}
		});
		this.add(sellServerButton);

		buyServerButton = new JButton("Koupit server");
		buyServerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				account = account
						- (generator
								.nextInt((Main.serverMaxCost - Main.serverMinCost) + 1) + Main.serverMinCost);
				refresh();

			}
		});
		this.add(buyServerButton);

		sellSwitchButton = new JButton("Prodat switch");
		sellSwitchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				account = account
						+ (generator
								.nextInt((Main.switchMaxCost - Main.switchMinCost) + 1) + Main.switchMinCost);
				refresh();
			}

		});
		this.add(sellSwitchButton);

		buySwitchButton = new JButton("Koupit switch");
		buySwitchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				account = account
						- (generator
								.nextInt((Main.switchMaxCost - Main.switchMinCost) + 1) + Main.switchMinCost);
				refresh();
			}

		});
		this.add(buySwitchButton);

		sellDiskButton = new JButton("Prodat disk");
		sellDiskButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				account = account
						+ (generator
								.nextInt((Main.diskMaxCost - Main.diskMinCost) + 1) + Main.diskMinCost);
				refresh();

			}
		});
		this.add(sellDiskButton);
		buyDiskButton = new JButton("Koupit disk");
		buyDiskButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				account = account
						- (generator
								.nextInt((Main.diskMaxCost - Main.diskMinCost) + 1) + Main.diskMinCost);
				refresh();

			}
		});
		this.add(buyDiskButton);
		sellDiskArrayButton = new JButton("Prodat diskove pole");
		sellDiskArrayButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				account = account
						+ (generator
								.nextInt((Main.diskArrayMaxCost - Main.diskArrayMinCost) + 1) + Main.diskArrayMinCost);
				refresh();

			}
		});
		this.add(sellDiskArrayButton);
		buyDiskArrayButton = new JButton("Koupit diskove pole");
		buyDiskArrayButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				account = account
						- (generator
								.nextInt((Main.diskArrayMaxCost - Main.diskArrayMinCost) + 1) + Main.diskArrayMinCost);
				refresh();

			}
		});
		this.add(buyDiskArrayButton);
	}

	private void refresh() {
		accountState.setText("Stav účtu: " + account);
	}
}
