package question4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame{
	private JTextField imputNumbers;
	private JTextField maior;
	private JTextField menor;
	private JTextField media;
	private int aux;
	private ArrayList<Integer> listNumbers;

	public Window() {
		imputNumbers=createJTextField(7);
		maior=createJTextField(7);
		menor=createJTextField(7);
		media=createJTextField(7);
		listNumbers=new ArrayList<Integer>();
		this.setSize(1400, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2, 1));
		this.add(createPanel1());
		this.add(createPanel2());
		setVisible(true);
	}
	public JPanel createPanel1() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("DIGITE O NUMERO: "));
		panel.add(this.imputNumbers);
		panel.add(createButtonOk());
		return panel;
	}
	
	public JPanel createPanel2() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("MAIOR>>>"));
		panel.add(maior);
		panel.add(createLabel("MENOR>>>"));
		panel.add(menor);
		panel.add(createLabel("MEDIA>>>"));
		panel.add(media);
		panel.add(createButtonExibir());
		return panel;

	}
	
	
	public JButton createButtonOk() {
		JButton button = new JButton ("OK");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listNumbers.add(Integer.parseInt(imputNumbers.getText()));
				aux=Integer.parseInt(imputNumbers.getText());
				imputNumbers.setText(null);
			}
		});
		return button;
	}
	
	public JButton createButtonExibir() {
		JButton button = new JButton ("EXIBIR");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maior.setText(""+maiorCalculate());
				menor.setText(""+menorCalculate());
				media.setText(""+mediaCalculate());
			}
		});
		return button;
	}
	
	public int mediaCalculate() {
		int media=0;
		for (int  aux : listNumbers) {
			media+=aux;
		}
		media=media/listNumbers.size();
		return media;
	}
	
	public int maiorCalculate() {
		int maior=aux;
		for (int number : listNumbers) {
			if(number>=maior) {
				maior=number;
			}
		}
		return maior;
	}
	
	public int menorCalculate() {
		int menor=aux;
		for (int number : listNumbers) {
			if(number<=menor) {
				menor=number;
			}
		}
		return menor;
	}
	
	public JLabel createLabel(String s) {
		JLabel label=new JLabel(s);
		label.setForeground(Color.WHITE);
		return label;
	}
	
	public JTextField createJTextField(int columns) {
		JTextField text=new JTextField(columns);
		return text;
	}
}
