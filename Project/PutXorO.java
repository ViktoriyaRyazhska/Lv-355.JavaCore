package project;

import java.awt.Font;
import javax.swing.JButton;

public class PutXorO {
	static String turnText = "";

	static void putText(JButton jButton, JButton jTurnButtons) {
		if (JavaFrame.clickCount % 2 == 0) {
			jButton.setText("X");
			jTurnButtons.setText("Turn: O");
		} else {
			jButton.setText("O");
			jTurnButtons.setText("Turn: X");
		}
		jButton.setFont(new Font("TimesRoman", Font.BOLD, 85));
		JavaFrame.clickCount++;
		jButton.setEnabled(false);
	}
}
