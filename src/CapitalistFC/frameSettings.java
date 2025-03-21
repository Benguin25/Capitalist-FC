package CapitalistFC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.sound.sampled.FloatControl;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class frameSettings extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public frameSettings() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter password for access to admin menu:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 22, 408, 72);
		contentPane.add(lblNewLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(133, 88, 159, 20);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = new String(passwordField.getPassword());
				if (password.equals("FCADMIN")) {
					// correct password
					if (ApplicationData.frame6 == null) {
						ApplicationData.frame6 = new frameAdminMenu();
					}
					ApplicationData.frame5.setVisible(false);
					ApplicationData.frame6.setVisible(true);
				} else {
					// wrong password
					JOptionPane.showMessageDialog(passwordField, "Error: Incorrect Password.");
				}
			}
		});
		btnNewButton.setBounds(169, 132, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("AUDIO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(56, 177, 103, 41);
		contentPane.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setBounds(169, 182, 200, 26);
		slider.setValue((int) ApplicationData.volume);
		contentPane.add(slider);
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent event) {
				JSlider source = (JSlider)event.getSource();
				if (!source.getValueIsAdjusting()) {
					double value = source.getValue();
					ApplicationData.volume = value;
					FloatControl gainControl = (FloatControl) ApplicationData.clip.getControl(FloatControl.Type.MASTER_GAIN); 
					value = mapRange(value, gainControl);

					gainControl.setValue((int) value);
				}
			}
		});
		
	}
	
    public static double mapRange(double value, FloatControl gainControl) {
        return -20 + (value - 0) * (gainControl.getMaximum() - -20) / (100 - 0);
    }
}
