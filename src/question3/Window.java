package question3;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame{
	private JTextField text;
	
	public Window() {
		text=createJTextField(10);
		this.setSize(600, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(createPanel());
		setVisible(true);
	}
	
	public JPanel createPanel() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(this.text);
		panel.add(createButton());
		return panel;
		
	}
	
	public JButton createButton() {
		JButton button = new JButton ("ENVIAR");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, text.getText());
			}
		});
		return button;
	}
	
	public JTextField createJTextField(int columns) {
		JTextField text=new JTextField(columns);
		return text;
	}

}
