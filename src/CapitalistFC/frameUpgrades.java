package CapitalistFC;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class frameUpgrades extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public frameUpgrades() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUpgrade1 = new JLabel("Profit x2: ");
		lblUpgrade1.setBounds(10, 36, 263, 40);
		lblUpgrade1.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		contentPane.add(lblUpgrade1);

		JButton btnUpgrade1 = new JButton("<html>Purchase for<br>500 Fans</html>");
		btnUpgrade1.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnUpgrade1.setForeground(new Color(0, 0, 0));
		btnUpgrade1.setEnabled(true);
		btnUpgrade1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(500, Integer.parseInt(ApplicationData.lblFansValue.getText()))) {
					ApplicationData.upgradeOwned1 = true;
					ApplicationData.upgradeOwned2 = false;
					ApplicationData.upgradeOwned3 = false;
					btnUpgrade1.setEnabled(false);
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - 500 + "");
				} else {
					JOptionPane.showMessageDialog(lblUpgrade1, "Error: Not enough money.");
				}
			}
		});
		btnUpgrade1.setBounds(281, 36, 143, 40);
		contentPane.add(btnUpgrade1);

		JLabel lblUpgrade2 = new JLabel("Profit x3: ");
		lblUpgrade2.setBounds(10, 108, 263, 40);
		lblUpgrade2.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		contentPane.add(lblUpgrade2);

		JButton btnUpgrade2 = new JButton("<html>Purchase for<br>1000 Fans</html>");
		btnUpgrade2.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnUpgrade2.setForeground(new Color(0, 0, 0));
		btnUpgrade2.setEnabled(true);
		btnUpgrade2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(1000, Integer.parseInt(ApplicationData.lblFansValue.getText()))) {
					ApplicationData.upgradeOwned2 = true;
					ApplicationData.upgradeOwned1 = false;
					ApplicationData.upgradeOwned3 = false;

					btnUpgrade2.setEnabled(false);
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - 1000 + "");
				} else {
					JOptionPane.showMessageDialog(lblUpgrade2, "Error: Not enough money.");
				}
			}
		});
		btnUpgrade2.setBounds(281, 108, 143, 40);
		contentPane.add(btnUpgrade2);

		JLabel lblUpgrade3 = new JLabel("Profit x4: ");
		lblUpgrade3.setBounds(10, 184, 263, 40);
		lblUpgrade3.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		contentPane.add(lblUpgrade3);

		JButton btnUpgrade3 = new JButton("<html>Purchase for<br>1500 Fans</html>");
		btnUpgrade3.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnUpgrade3.setForeground(new Color(0, 0, 0));
		btnUpgrade3.setEnabled(true);
		btnUpgrade3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(1500, Integer.parseInt(ApplicationData.lblFansValue.getText()))) {
					ApplicationData.upgradeOwned3 = false;
					ApplicationData.upgradeOwned2 = false;
					ApplicationData.upgradeOwned1 = false;
					btnUpgrade3.setEnabled(false);
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - 1500 + "");
				} else {
					JOptionPane.showMessageDialog(lblUpgrade3, "Error: Not enough money.");
				}
			}
		});
		btnUpgrade3.setBounds(281, 184, 143, 40);
		contentPane.add(btnUpgrade3);
	}
}
