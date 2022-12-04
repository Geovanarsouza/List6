package question1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
	public Window() {
		setSize(400,600);
		setBackground(Color.WHITE);
		setVisible(true);
		exchangeColors();
	}

	private void exchangeColors() {
		this.setLayout(new BorderLayout());
		JPanel panel1=new JPanel();
		panel1.setBackground(Color.LIGHT_GRAY);
		this.add(panel1,BorderLayout.NORTH);
		JPanel panel2=new JPanel();
		this.add(panel2,BorderLayout.CENTER);
		JButton buttonYellow=new JButton("yellow");
		buttonYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setBackground(Color.yellow);
			}
		});
		panel1.add(buttonYellow);
		JButton buttonBlue=new JButton("blue");
		buttonBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setBackground(Color.blue);
			}
		});
		panel1.add(buttonBlue);
		JButton buttonGreen=new JButton("green");
		buttonGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setBackground(Color.green);
			}
		});
		panel1.add(buttonGreen);
	}

}
