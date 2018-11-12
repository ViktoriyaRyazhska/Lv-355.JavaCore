package project;

import java.awt.Font;
import javax.swing.JButton;

public class PutXorO {
	static void putText(JButton jButton) {
		if (JavaFrame.clickCount % 2 == 0) {
			jButton.setText("X");
		} else {
			jButton.setText("O");
		}
		jButton.setFont(new Font("TimesRoman", Font.BOLD, 85));
		JavaFrame.clickCount++;
		jButton.setEnabled(false);
	}
}
