package game;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 700, 600);
		frame.setTitle("Brick Breaker");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePlay gamePlay = new GamePlay();
		frame.add(gamePlay);
		frame.setVisible(true);
	}
}