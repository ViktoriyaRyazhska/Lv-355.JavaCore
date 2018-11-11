package project;

import java.awt.Color;
import javax.swing.JButton;

public class ButtonColor {
	static void changeButtonColor(JButton[] jButtons, Color color) {
		for (int i = 0; i < jButtons.length; i++) {
			jButtons[i].setBackground(color);
		}
	}
}
