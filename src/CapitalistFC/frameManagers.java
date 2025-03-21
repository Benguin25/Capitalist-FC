package CapitalistFC;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frameManagers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public frameManagers() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblManager1 = new JLabel("Kevin De Bruyne's "
				+ "Manager: ");
		lblManager1.setBounds(24, 25, 263, 40);
		lblManager1.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		contentPane.add(lblManager1);

		JButton btnButton1 = new JButton("<html>Purchase for<br>50 Fans</html>");
		btnButton1.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnButton1.setForeground(new Color(0, 0, 0));
		btnButton1.setEnabled(true);
		btnButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(50, Integer.parseInt(ApplicationData.lblFansValue.getText()))) {
					ApplicationData.managerOwned1 = true;
					btnButton1.setEnabled(false);
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - 50 + "");
				} else {
					JOptionPane.showMessageDialog(lblManager1, "Error: Not enough money.");
				}
			}
		});
		btnButton1.setBounds(281, 25, 143, 40);
		contentPane.add(btnButton1);

		JLabel lblManager2 = new JLabel("Erling Haaland's Manager: ");
		lblManager2.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblManager2.setBounds(24, 76, 263, 40);
		contentPane.add(lblManager2);

		JButton btnButton2 = new JButton("<html>Purchase for<br>100 Fans</html>");
		btnButton2.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnButton2.setForeground(new Color(0, 0, 0));
		btnButton2.setEnabled(true);
		btnButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(100, Integer.parseInt(ApplicationData.lblFansValue.getText()))) {
					ApplicationData.managerOwned2 = true;
					btnButton2.setEnabled(false);
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - 100 + "");
				} else {
					JOptionPane.showMessageDialog(lblManager1, "Error: Not enough money.");
				}
			}
		});
		btnButton2.setBounds(281, 76, 143, 40);
		contentPane.add(btnButton2);

		JLabel lblManager3 = new JLabel("Lionel Messi's Manager:");
		lblManager3.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblManager3.setBounds(24, 127, 263, 40);
		contentPane.add(lblManager3);

		JButton btnButton3 = new JButton("<html>Purchase for<br>500 Fans</html>");
		btnButton3.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnButton3.setForeground(new Color(0, 0, 0));
		btnButton3.setEnabled(true);
		btnButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(500, Integer.parseInt(ApplicationData.lblFansValue.getText()))) {
					ApplicationData.managerOwned3 = true;
					btnButton3.setEnabled(false);
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - 500 + "");
				} else {
					JOptionPane.showMessageDialog(lblManager1, "Error: Not enough money.");
				}
			}
		});
		btnButton3.setBounds(281, 127, 143, 40);
		contentPane.add(btnButton3);

		JLabel lblManager4 = new JLabel("Kevin De Bruyne's Manager: ");
		lblManager4.setFont(new Font("Rockwell Condensed", Font.BOLD, 18));
		lblManager4.setBounds(24, 178, 263, 40);
		contentPane.add(lblManager4);

		JButton btnButton4 = new JButton("<html>Purchase for<br>1500 Fans</html>");
		btnButton4.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnButton4.setForeground(new Color(0, 0, 0));
		btnButton4.setEnabled(true);
		btnButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ApplicationData.canAfford(1000, Integer.parseInt(ApplicationData.lblFansValue.getText()))) {
					ApplicationData.managerOwned4 = true;
					btnButton4.setEnabled(false);
					ApplicationData.lblFansValue
							.setText(Integer.parseInt(ApplicationData.lblFansValue.getText()) - 1000 + "");
				} else {
					JOptionPane.showMessageDialog(lblManager1, "Error: Not enough money.");
				}
			}
		});
		btnButton4.setBounds(281, 178, 143, 40);
		contentPane.add(btnButton4);
	}
}
