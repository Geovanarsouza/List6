package question2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame{
	private JLabel label;
	public Window() {
		setSize(600,800);
		setBackground(Color.WHITE);
		setVisible(true);
		//add(createLabel());
		JLabel label=new JLabel();
		label.setText("teste");
		this.label=label;
		//label.setText("s");
		add(this.label,BorderLayout.NORTH);
		createButton();
	}
//	public JLabel createLabel() {
//		JLabel label=new JLabel();
//		label.setText("s");
//		return label;
//	}
	public void createButton() {
		JPanel panel=new JPanel();
		this.add(panel);
		JButton java=new JButton("JAVA");
		java.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("JAVA");
			}
		});
		panel.add(java);
		JButton javaScript=new JButton("JAVASCRIPT");
		javaScript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("JAVASCRIPT");
			}
		});
		panel.add(javaScript);
		JButton python=new JButton("PYTHON");
		python.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("PYTHON");
			}
		});
		panel.add(python);
		JButton c1=new JButton("C++");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("C++");
			}
		});
		panel.add(c1);
		JButton c2=new JButton("C#");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("C#");
			}
		});
		panel.add(c2);
		JButton c3=new JButton("C");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("C");
			}
		});
		panel.add(c3);
	}
}
