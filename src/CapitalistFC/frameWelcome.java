package CapitalistFC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frameWelcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationData.frame1 = new frameWelcome();
					ApplicationData.frame2 = new frameCharacterSelect();
					ApplicationData.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 * @throws LineUnavailableException 
	 */
	public frameWelcome() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Capitalist FC");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 50));
		lblNewLabel.setBounds(10, 11, 414, 67);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Please enter your team name:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 78, 414, 39);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(122, 135, 187, 39);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnContinue = new JButton("CONTINUE");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get team name
				ApplicationData.teamName = textField.getText();
				// used for testing purposes - ApplicationData.teamName = "Test Name FC Xyther";

				// next frame
				ApplicationData.frame1.setVisible(false);
				ApplicationData.frame2.setVisible(true);
			}
		});
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnContinue.setBounds(151, 196, 129, 39);
		contentPane.add(btnContinue);

		AudioInputStream songs;
		ApplicationData.clip = AudioSystem.getClip();

		// get song as audio input stream
		URL url = this.getClass().getResource("CapitalistMusic.wav");
		songs = AudioSystem.getAudioInputStream(url);

		// Open audio clip and load samples from the audio input stream.
		ApplicationData.clip.open(songs);

		// play the clip continuously until it is stopped by user
		ApplicationData.clip.loop(Clip.LOOP_CONTINUOUSLY);
		
		/*
		 * URL musicUrl = this.getClass().getResource("music.wav"); try { File audioFile
		 * = new
		 * File("\"D:\\Java Workspace\\CapitalistFCHome\\resources\\CapitalistFC\\music.wav\""
		 * ); AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
		 * Clip audioClip = AudioSystem.getClip(); audioClip.open(audioStream);
		 * audioClip.start(); } catch (UnsupportedAudioFileException | IOException |
		 * LineUnavailableException e) { e.printStackTrace(); }
		 */
	}
	
}
