package project;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Logic {
	static int answer;
	static boolean b = false;

	static void winner(JButton[] jButtons) {
		if ((jButtons[0].getText().equals(jButtons[1].getText()))
				&& (jButtons[0].getText().equals(jButtons[2].getText())) && (!jButtons[0].getText().isEmpty())) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel,
					"Player " + jButtons[0].getText() + " is winner! Do u want to exit?", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			tryAgain();
		}
		if ((jButtons[3].getText().equals(jButtons[4].getText()))
				&& (jButtons[3].getText().equals(jButtons[5].getText())) && (!jButtons[3].getText().isEmpty())) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel,
					"Player " + jButtons[3].getText() + " is winner! Do u want to exit?", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			tryAgain();
		}
		if ((jButtons[6].getText().equals(jButtons[7].getText()))
				&& (jButtons[6].getText().equals(jButtons[8].getText())) && (!jButtons[6].getText().isEmpty())) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel,
					"Player " + jButtons[6].getText() + " is winner! Do u want to exit?", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			tryAgain();
		}
		if ((jButtons[0].getText().equals(jButtons[3].getText()))
				&& (jButtons[0].getText().equals(jButtons[6].getText())) && (!jButtons[0].getText().isEmpty())) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel,
					"Player " + jButtons[0].getText() + " is winner! Do u want to exit?", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			tryAgain();
		}
		if ((jButtons[1].getText().equals(jButtons[4].getText()))
				&& (jButtons[1].getText().equals(jButtons[7].getText())) && (!jButtons[1].getText().isEmpty())) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel,
					"Player " + jButtons[1].getText() + " is winner! Do u want to exit?", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			tryAgain();
		}
		if ((jButtons[2].getText().equals(jButtons[5].getText()))
				&& (jButtons[2].getText().equals(jButtons[8].getText())) && (!jButtons[2].getText().isEmpty())) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel,
					"Player " + jButtons[2].getText() + " is winner! Do u want to exit?", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			tryAgain();
		}
		if ((jButtons[0].getText().equals(jButtons[4].getText()))
				&& (jButtons[0].getText().equals(jButtons[8].getText())) && (!jButtons[0].getText().isEmpty())) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel,
					"Player " + jButtons[0].getText() + " is winner! Do u want to exit?", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			tryAgain();
		}
		if ((jButtons[2].getText().equals(jButtons[4].getText()))
				&& (jButtons[2].getText().equals(jButtons[6].getText())) && (!jButtons[2].getText().isEmpty())) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel,
					"Player " + jButtons[2].getText() + " is winner! Do u want to exit?", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			tryAgain();
		}
		if ((JavaFrame.clickCount == 9) && (!b)) {
			answer = JOptionPane.showConfirmDialog(JavaFrame.jPanel, "Draw! Do u want to exit?" + "", "Congradulation!",
					JOptionPane.YES_NO_OPTION);
			JavaFrame.clickCount = 0;
			if (answer == JOptionPane.YES_OPTION) {
				System.exit(0);
			} else {
				JavaFrame.loadGame();
			}
		}
	}

	private static void tryAgain() {
		if (answer == JOptionPane.YES_OPTION) {
			System.exit(0);
		} else {
			JavaFrame.loadGame();
		}
		b = true;
	}
}