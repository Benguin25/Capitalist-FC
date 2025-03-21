package CapitalistFC;

import java.awt.EventQueue;
import java.lang.Thread;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frameGame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int add1 = 1;
	private int add2 = 5;
	private int add3 = 25;
	private int add4 = 125;
	private int cost1 = 5;
	private int cost2 = 25;
	private int cost3 = 100;
	private int cost4 = 500;
	private int overallMultiplier = 1;

	/**
	 * Create the frame.
	 */
	public frameGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ApplicationData.lblFansValue = new JLabel("0");
		ApplicationData.lblFansValue.setBounds(234, 37, 498, 59);
		ApplicationData.lblFansValue.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 38));
		ApplicationData.lblFansValue.setForeground(Color.BLACK); // Set text color to black
		contentPane.add(ApplicationData.lblFansValue);

		JButton btnManagers = new JButton("MANAGERS");
		btnManagers.setBackground(new Color(0, 128, 64));
		btnManagers.setForeground(new Color(0, 0, 0));
		btnManagers.setFont(new Font("Dialog", Font.BOLD, 24));
		btnManagers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.frame4 == null) {
					ApplicationData.frame4 = new frameManagers();
				}
				ApplicationData.frame4.setVisible(true);
			}
		});
		btnManagers.setBounds(525, 146, 295, 95);
		contentPane.add(btnManagers);

		JButton btnUpgrades = new JButton("UPGRADES");
		btnUpgrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.frame7 == null) {
					ApplicationData.frame7 = new frameUpgrades();
				}
				ApplicationData.frame7.setVisible(true);
			}
		});
		btnUpgrades.setBackground(new Color(0, 128, 64));
		btnUpgrades.setForeground(new Color(0, 0, 0));
		btnUpgrades.setFont(new Font("Dialog", Font.BOLD, 24));
		btnUpgrades.setBounds(525, 266, 295, 95);
		contentPane.add(btnUpgrades);

		JButton btnSettings = new JButton("SETTINGS");
		btnSettings.setForeground(new Color(0, 0, 0));
		btnSettings.setBackground(new Color(0, 128, 64));
		btnSettings.setFont(new Font("Dialog", Font.BOLD, 24));
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.frame5 == null) {
					ApplicationData.frame5 = new frameSettings();
				}
				ApplicationData.frame5.setVisible(true);
			}
		});
		btnSettings.setBounds(525, 391, 295, 95);
		contentPane.add(btnSettings);

		ApplicationData.lblTeamName = new JLabel("team name goes here");
		ApplicationData.lblTeamName.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
		ApplicationData.lblTeamName.setBounds(131, 5, 630, 50);
		ApplicationData.lblTeamName.setForeground(Color.BLACK); // Set text color to black
		contentPane.add(ApplicationData.lblTeamName);

		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(10, 11, 111, 95);
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setVerticalAlignment(SwingConstants.CENTER);
		URL url2;
		if (ApplicationData.rdbtn1.isSelected()) {
			url2 = this.getClass().getResource("jersey1.png");
		} else if (ApplicationData.rdbtn2.isSelected()) {
			url2 = this.getClass().getResource("jersey2.png");
		} else if (ApplicationData.rdbtn3.isSelected()) {
			url2 = this.getClass().getResource("jersey3.png");
		} else {
			url2 = this.getClass().getResource("jersey4.png");
		}
		ImageIcon icon2 = new ImageIcon(url2);
		Image image2 = icon2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		lblIcon.setIcon(new ImageIcon(image2));
		contentPane.add(lblIcon);

		JSeparator separator = new JSeparator();
		separator.setToolTipText("");
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(10, 108, 843, 12);
		contentPane.add(separator);

		JLabel lblFans = new JLabel("Fans:");
		lblFans.setForeground(new Color(0, 0, 0));
		lblFans.setBounds(120, 36, 120, 59);
		lblFans.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 38));
		contentPane.add(lblFans);

		JProgressBar progressBar1 = new JProgressBar();
		progressBar1.setBackground(new Color(255, 255, 255));
		progressBar1.setBounds(100, 153, 373, 22);
		contentPane.add(progressBar1);

		JButton btnBuy1 = new JButton("Cost: 5 Fans");
		btnBuy1.setForeground(new Color(0, 0, 0));
		btnBuy1.setBackground(new Color(0, 128, 64));
		btnBuy1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnBuy1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(cost1, (Integer.parseInt(ApplicationData.lblFansValue.getText())))) {
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - (cost1) + "");
					add1 = add1 + 1;
					cost1 = cost1 * 2;
					btnBuy1.setText("Cost: " + cost1 + " Fans");
				} else {
					JOptionPane.showMessageDialog(ApplicationData.lblFansValue, "Error: Not enough money.");
				}
			}
		});

		JButton btnUpgrade1 = new JButton("");
		btnUpgrade1.setForeground(new Color(0, 128, 64));
		btnUpgrade1.setBackground(new Color(0, 255, 128));
		btnUpgrade1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (progressBar1.getValue() == 0) {
					Thread t = new Thread() {
						public void run() {
							while (true) {
								for (int i = 0; i < 101; i++) {
									progressBar1.setValue(i);
									try {
										Thread.sleep(5);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								ApplicationData.lblFansValue
										.setText(Integer.parseInt(ApplicationData.lblFansValue.getText())
												+ (add1 * overallMultiplier) + "");
								progressBar1.setValue(0);

								if (ApplicationData.managerOwned1 == false) {
									break;
								}

							}
						}
					};
					t.start();
				}
			}
		});
		btnUpgrade1.setBounds(26, 153, 52, 52);
		contentPane.add(btnUpgrade1);
		btnBuy1.setBounds(100, 179, 373, 26);
		contentPane.add(btnBuy1);

		JLabel lblUpgrade1 = new JLabel("Kevin De Bruyne");
		lblUpgrade1.setForeground(new Color(0, 0, 0));
		lblUpgrade1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpgrade1.setOpaque(true); // Make the label opaque
		lblUpgrade1.setBackground(new Color(0, 128, 64)); // Set the background color to green
		lblUpgrade1.setBounds(100, 117, 373, 33);
		lblUpgrade1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		contentPane.add(lblUpgrade1);

		JProgressBar progressBar2 = new JProgressBar();
		progressBar2.setBackground(Color.WHITE);
		progressBar2.setBounds(100, 252, 373, 22);
		contentPane.add(progressBar2);

		JButton btnUpgrade2 = new JButton("");
		btnUpgrade2.setBackground(new Color(0, 255, 128));
		btnUpgrade2.setForeground(new Color(0, 128, 64));
		btnUpgrade2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (progressBar2.getValue() == 0) {
					Thread t = new Thread() {
						public void run() {
							while (true) {
								for (int i = 0; i < 101; i++) {
									progressBar2.setValue(i);
									try {
										Thread.sleep(20);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								ApplicationData.lblFansValue
										.setText(Integer.parseInt(ApplicationData.lblFansValue.getText())
												+ (add2 * overallMultiplier) + "");
								progressBar2.setValue(0);

								if (ApplicationData.managerOwned2 == false) {
									break;
								}

							}
						}
					};
					t.start();
				}
			}
		});
		btnUpgrade2.setBounds(26, 252, 52, 52);
		contentPane.add(btnUpgrade2);

		JLabel lblUpgrade2 = new JLabel("Erling Haaland");
		lblUpgrade2.setForeground(new Color(0, 0, 0));
		lblUpgrade2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpgrade2.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		lblUpgrade2.setOpaque(true); // Make the label opaque
		lblUpgrade2.setBackground(new Color(0, 128, 64)); // Set the background color to green
		lblUpgrade2.setBounds(100, 216, 373, 33);
		contentPane.add(lblUpgrade2);

		JButton btnBuy2 = new JButton("Cost: 25 Fans");
		btnBuy2.setForeground(new Color(0, 0, 0));
		btnBuy2.setFont(new Font("Dialog", Font.BOLD, 16));
		btnBuy2.setBackground(Color.WHITE);
		btnBuy2.setBounds(100, 278, 373, 26);
		btnBuy2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(cost2, (Integer.parseInt(ApplicationData.lblFansValue.getText())))) {
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - (cost2) + "");
					add2 = add2 + 5;
					cost2 = cost2 * 2;
					btnBuy2.setText("Cost: " + cost2 + " Fans");
				} else {
					JOptionPane.showMessageDialog(ApplicationData.lblFansValue, "Error: Not enough money.");
				}
			}
		});
		contentPane.add(btnBuy2);

		JProgressBar progressBar3 = new JProgressBar();
		progressBar3.setBackground(Color.WHITE);
		progressBar3.setBounds(100, 351, 373, 22);
		contentPane.add(progressBar3);

		JLabel lblUpgrade3 = new JLabel("Lionel Messi");
		lblUpgrade3.setForeground(new Color(0, 0, 0));
		lblUpgrade3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpgrade3.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		lblUpgrade3.setOpaque(true); // Make the label opaque
		lblUpgrade3.setBackground(new Color(0, 128, 64)); // Set the background color to green
		lblUpgrade3.setBounds(100, 315, 373, 33);
		contentPane.add(lblUpgrade3);

		JButton btnUpgrade3 = new JButton("");
		btnUpgrade3.setBackground(new Color(0, 255, 128));
		btnUpgrade3.setForeground(new Color(0, 128, 64));
		btnUpgrade3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (progressBar3.getValue() == 0) {
					Thread t = new Thread() {
						public void run() {
							while (true) {
								for (int i = 0; i < 101; i++) {
									progressBar3.setValue(i);
									try {
										Thread.sleep(50);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								ApplicationData.lblFansValue
										.setText(Integer.parseInt(ApplicationData.lblFansValue.getText())
												+ (add3 * overallMultiplier) + "");
								progressBar3.setValue(0);

								if (ApplicationData.managerOwned3 == false) {
									break;
								}

							}
						}
					};
					t.start();
				}
			}
		});
		btnUpgrade3.setBounds(26, 351, 52, 52);
		contentPane.add(btnUpgrade3);

		JButton btnBuy3 = new JButton("Cost: 100 Fans");
		btnBuy3.setForeground(new Color(0, 0, 0));
		btnBuy3.setFont(new Font("Dialog", Font.BOLD, 16));
		btnBuy3.setBackground(Color.WHITE);
		btnBuy3.setBounds(100, 377, 373, 26);
		btnBuy3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(cost3, (Integer.parseInt(ApplicationData.lblFansValue.getText())))) {
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - (cost3) + "");
					add3 = add3 + 15;
					cost3 = cost3 * 2;
					btnBuy3.setText("Cost: " + cost3 + " Fans");
				} else {
					JOptionPane.showMessageDialog(ApplicationData.lblFansValue, "Error: Not enough money.");
				}
			}
		});
		contentPane.add(btnBuy3);

		JProgressBar progressBar4 = new JProgressBar();
		progressBar4.setBackground(Color.WHITE);
		progressBar4.setBounds(100, 450, 373, 22);
		contentPane.add(progressBar4);

		JLabel lblUpgrade4 = new JLabel("Cristiano Ronaldo");
		lblUpgrade4.setForeground(new Color(0, 0, 0));
		lblUpgrade4.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpgrade4.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		lblUpgrade4.setOpaque(true); // Make the label opaque
		lblUpgrade4.setBackground(new Color(0, 128, 64)); // Set the background color to green
		lblUpgrade4.setBounds(100, 414, 373, 33);
		contentPane.add(lblUpgrade4);

		JButton btnUpgrade4 = new JButton("");
		btnUpgrade4.setBackground(new Color(0, 255, 128));
		btnUpgrade4.setForeground(new Color(0, 128, 64));
		btnUpgrade4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (progressBar4.getValue() == 0) {
					Thread t = new Thread() {
						public void run() {
							while (true) {
								for (int i = 0; i < 101; i++) {
									progressBar4.setValue(i);
									try {
										Thread.sleep(150);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								ApplicationData.lblFansValue
										.setText(Integer.parseInt(ApplicationData.lblFansValue.getText())
												+ (add4 * overallMultiplier) + "");
								progressBar4.setValue(0);

								if (ApplicationData.managerOwned4 == false) {
									break;
								}

							}
						}
					};
					t.start();
				}
			}
		});
		btnUpgrade4.setBounds(26, 450, 52, 52);
		contentPane.add(btnUpgrade4);

		JButton btnBuy4 = new JButton("Cost: 500 Fans");
		btnBuy4.setForeground(new Color(0, 0, 0));
		btnBuy4.setFont(new Font("Dialog", Font.BOLD, 16));
		btnBuy4.setBackground(Color.WHITE);
		btnBuy4.setBounds(100, 476, 373, 26);
		btnBuy4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(cost4, (Integer.parseInt(ApplicationData.lblFansValue.getText())))) {
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - (cost4) + "");
					add4 = add4 + 125;
					cost4 = cost4 * 2;
					btnBuy4.setText("Cost: " + cost4 + " Fans");
				} else {
					JOptionPane.showMessageDialog(ApplicationData.lblFansValue, "Error: Not enough money.");
				}
			}
		});
		contentPane.add(btnBuy4);

		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(718, 36, 135, 52);
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 38));
		contentPane.add(lblNewLabel);

		JLabel lblBackground = new JLabel("");
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setVerticalAlignment(SwingConstants.CENTER);
		URL url = this.getClass().getResource("background.png");
		ImageIcon icon = new ImageIcon(url);
		Image image = icon.getImage().getScaledInstance(863, 512, Image.SCALE_SMOOTH);
		lblBackground.setIcon(new ImageIcon(image));
		lblBackground.setBounds(0, 0, 863, 512);
		contentPane.add(lblBackground);

		// thread to constantly check if user can afford upgrade - if so, turn button
		// orange
		Thread upgradeCheck = new Thread() {
			public void run() {
				long startTime = System.currentTimeMillis();
				int secondsElapsed = 0;

				while (true) {

					if (Integer.parseInt(ApplicationData.lblFansValue.getText()) >= 10000) {
						JOptionPane.showMessageDialog(ApplicationData.lblFansValue,
								"Congratulations! You beat the game in " + lblNewLabel.getText() + " seconds!");
						System.exit(0);
					}

					long currentTime = System.currentTimeMillis();
					int newSecondsElapsed = (int) ((currentTime - startTime) / 1000);

					if (newSecondsElapsed != secondsElapsed) {
						secondsElapsed = newSecondsElapsed;
						lblNewLabel.setText(String.valueOf(secondsElapsed));
					}

					if (ApplicationData.upgradeOwned1 == true) {
						overallMultiplier = 2;
					} else if (ApplicationData.upgradeOwned2 == true) {
						overallMultiplier = 3;
					} else if (ApplicationData.upgradeOwned3 == true) {
						overallMultiplier = 4;
					}

					if (Integer.parseInt(ApplicationData.lblFansValue.getText()) >= cost1) {
						btnBuy1.setBackground(new Color(255, 128, 0));
					} else {
						btnBuy1.setBackground(new Color(0, 255, 64));
					}
					if (Integer.parseInt(ApplicationData.lblFansValue.getText()) >= cost2) {
						btnBuy2.setBackground(new Color(255, 128, 0));
					} else {
						btnBuy2.setBackground(new Color(0, 255, 64));
					}
					if (Integer.parseInt(ApplicationData.lblFansValue.getText()) >= cost3) {
						btnBuy3.setBackground(new Color(255, 128, 0));
					} else {
						btnBuy3.setBackground(new Color(0, 255, 64));
					}
					if (Integer.parseInt(ApplicationData.lblFansValue.getText()) >= cost4) {
						btnBuy4.setBackground(new Color(255, 128, 0));
					} else {
						btnBuy4.setBackground(new Color(0, 255, 64));
					}

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		upgradeCheck.start();

	}
}
