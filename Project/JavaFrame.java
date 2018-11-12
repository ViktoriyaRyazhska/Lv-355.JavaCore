package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JavaFrame {
	static JFrame jFrame = JavaFrame.getFrame();
	static JPanel jPanel = new JPanel();
	static int clickCount = 0;
	static JButton[] jButtons = new JButton[9];

	static JFrame getFrame() {
		jFrame = new JFrame() {
			private static final long serialVersionUID = 1L;
		};
		jFrame.setVisible(true);
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setBounds(-3, 0, 329, 372);
		jFrame.setTitle("XvsO");
		return jFrame;

	}

	public static void button() {
		for (int i = 0; i < jButtons.length; i++) {
			jButtons[i] = new JButton();
			jButtons[i].setText("");
			jButtons[i].setPreferredSize(new Dimension(100, 100));
			jPanel.add(jButtons[i]);
		}
		for (JButton b : jButtons) {
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					PutXorO.putText(b);
					Logic.winner(jButtons);
				}
			});
		}
	}

	public static void menu(JButton[] jButtons) {
		JMenuBar jMenuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu changeColor = new JMenu("Edit");
		JMenu about = new JMenu("About");
		jMenuBar.add(file);
		jMenuBar.add(changeColor);
		jMenuBar.add(about);
		changeColor.add(new JMenuItem("Buttom color")).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color1 = JColorChooser.showDialog(jPanel, "What color do u want?", Color.white);
				jPanel.setForeground(color1);
				ButtonColor.changeButtonColor(jButtons, color1);
			}
		});
		changeColor.add(new JMenuItem("Background color")).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color color2 = JColorChooser.showDialog(jPanel, "What color do u want?", Color.white);
				jPanel.setBackground(color2);
			}
		});
		file.add(new JMenuItem("Play again")).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadGame();
			}
		});
		about.add(new JMenuItem("About")).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jPanel, "Program: XvsO \n Version: 0.0.04 \n \u00a9 Danylo Hlynsky", "About program", JOptionPane.CANCEL_OPTION);
			}
		});

		jFrame.setJMenuBar(jMenuBar);
		jFrame.revalidate();

	}

	public static void startGame() {
		jFrame.add(jPanel);
		button();
		menu(jButtons);
		for (int i = 0; i < jButtons.length; i++) {
			jButtons[i].setText("");
			jButtons[i].setEnabled(true);
		}
	}

	public static void loadGame() {
		for (int i = 0; i < jButtons.length; i++) {
			jButtons[i].setText("");
			jButtons[i].setEnabled(true);
			clickCount = 0;
		}
	}
//	public static void windowCloser()  {
//		jFrame.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent we) {
//				String ObjButtons[] = { "Yes", "No" };
//				int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?",
//						"Online Examination System", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
//						null, ObjButtons, ObjButtons[1]);
//				if (PromptResult == JOptionPane.YES_OPTION) {
//					System.exit(0);
//				}
//			}
//		});
//	}
}
