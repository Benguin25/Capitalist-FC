package CapitalistFC;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Dimension;

public class frameCharacterSelect extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public frameCharacterSelect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(450, 300));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(0, 128, 64));
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JLabel lblJersey1 = new JLabel("");
		lblJersey1.setBounds(95, 63, 80, 80);
		lblJersey1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJersey1.setVerticalAlignment(SwingConstants.CENTER);
		URL url = this.getClass().getResource("jersey1.png");
		ImageIcon icon = new ImageIcon(url);
		Image image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		lblJersey1.setIcon(new ImageIcon(image));

		JLabel lblJersey2 = new JLabel("");
		lblJersey2.setBounds(95, 154, 80, 80);
		lblJersey2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJersey2.setVerticalAlignment(SwingConstants.CENTER);
		URL url2 = this.getClass().getResource("jersey2.png");
		ImageIcon icon2 = new ImageIcon(url2);
		Image image2 = icon2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		lblJersey2.setIcon(new ImageIcon(image2));

		JLabel lblJersey3 = new JLabel("");
		lblJersey3.setBounds(317, 63, 80, 80);
		lblJersey3.setHorizontalAlignment(SwingConstants.CENTER);
		lblJersey3.setVerticalAlignment(SwingConstants.CENTER);
		URL url3 = this.getClass().getResource("jersey3.png");
		ImageIcon icon3 = new ImageIcon(url3);
		Image image3 = icon3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		lblJersey3.setIcon(new ImageIcon(image3));

		JLabel lblJersey4 = new JLabel("");
		lblJersey4.setBounds(317, 154, 80, 80);
		lblJersey4.setHorizontalAlignment(SwingConstants.CENTER);
		lblJersey4.setVerticalAlignment(SwingConstants.CENTER);
		URL url4 = this.getClass().getResource("jersey4.png");
		ImageIcon icon4 = new ImageIcon(url4);
		Image image4 = icon4.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		lblJersey4.setIcon(new ImageIcon(image4));

		JLabel lblNewLabel = new JLabel("JERSEY SELECT");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(79, 11, 278, 36);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton.setBounds(10, 11, 59, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplicationData.frame1.setVisible(true);
				ApplicationData.frame2.setVisible(false);
			}
		});

		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNext.setBounds(367, 11, 57, 23);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplicationData.frame3 = new frameGame();
				ApplicationData.frame3.setVisible(true);
				ApplicationData.frame2.setVisible(false);
				ApplicationData.lblTeamName.setText(ApplicationData.teamName);
			}
		});

		ApplicationData.rdbtn1 = new JRadioButton("");
		ApplicationData.rdbtn1.setBounds(44, 63, 45, 84);
		buttonGroup.add(ApplicationData.rdbtn1);
		ApplicationData.rdbtn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ApplicationData.rdbtn1.setBackground(new Color(0, 128, 64));

		ApplicationData.rdbtn2 = new JRadioButton("");
		ApplicationData.rdbtn2.setBounds(46, 154, 45, 80);
		buttonGroup.add(ApplicationData.rdbtn2);
		ApplicationData.rdbtn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ApplicationData.rdbtn2.setBackground(new Color(0, 128, 64));

		ApplicationData.rdbtn3 = new JRadioButton("");
		ApplicationData.rdbtn3.setBounds(258, 63, 45, 80);
		buttonGroup.add(ApplicationData.rdbtn3);
		ApplicationData.rdbtn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ApplicationData.rdbtn3.setBackground(new Color(0, 128, 64));

		ApplicationData.rdbtn4 = new JRadioButton("");
		ApplicationData.rdbtn4.setBounds(258, 166, 45, 68);
		buttonGroup.add(ApplicationData.rdbtn4);
		ApplicationData.rdbtn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ApplicationData.rdbtn4.setBackground(new Color(0, 128, 64));

		contentPane.add(lblJersey2);
		contentPane.add(lblJersey3);
		contentPane.add(lblJersey4);
		contentPane.add(lblJersey1);
		contentPane.add(lblNewLabel);
		contentPane.add(btnNewButton);
		contentPane.add(btnNext);
		contentPane.add(ApplicationData.rdbtn1);
		contentPane.add(ApplicationData.rdbtn2);
		contentPane.add(ApplicationData.rdbtn3);
		contentPane.add(ApplicationData.rdbtn4);
	}

}
