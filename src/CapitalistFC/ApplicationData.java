package CapitalistFC;

import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ApplicationData {
	static frameWelcome frame1;
	static frameCharacterSelect frame2;
	static frameGame frame3;
	static frameManagers frame4;
	static frameSettings frame5;
	static frameAdminMenu frame6;
	static frameUpgrades frame7;
	static String teamName;
	static JLabel lblTeamName;
	static String teamIcon;
	static JRadioButton rdbtn1;
	static JRadioButton rdbtn2;
	static JRadioButton rdbtn3;
	static JRadioButton rdbtn4;
	static boolean managerOwned1 = false;
	static boolean managerOwned2 = false;
	static boolean managerOwned3 = false;
	static boolean managerOwned4 = false;
	static JLabel lblFansValue;
	static boolean upgradeOwned1 = false;
	static boolean upgradeOwned2 = false;
	static boolean upgradeOwned3 = false;
	
	static double volume = 50;
	static Clip clip;

	public static boolean canAfford(int cost, int balance) {
		if (balance >= cost) {
			return true;
		} else {
			return false;
		}
	}
}
