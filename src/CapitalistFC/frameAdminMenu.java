package CapitalistFC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frameAdminMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public frameAdminMenu() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// try to make spinner increase by 500 each click
		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100000, 500);
		JSpinner spinner = new JSpinner(model);
		spinner.setBounds(114, 147, 80, 49);
		contentPane.add(spinner);

		JLabel lblNewLabel = new JLabel("Please enter the amount of fans you would like:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 64, 414, 87);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplicationData.lblFansValue.setText(spinner.getValue().toString());
			}
		});
		btnNewButton.setBounds(223, 160, 89, 23);
		contentPane.add(btnNewButton);
	}
}
