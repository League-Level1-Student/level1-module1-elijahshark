package _07_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	public void run() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField answer = new JTextField(20);
		JButton button = new JButton();
		JLabel label = new JLabel();
	
	
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(answer);
	frame.setSize(400,80);
	panel.add(button);
	button.setText("Convert");
	panel.add(label);
	
	
	
	
	
	
	
	
	
	}
	}
