package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 436, 659);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Weight and Mass");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(12, 0, 503, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn2 = new JButton(".");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(288, 545, 119, 54);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("0");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(157, 545, 119, 54);
		frame.getContentPane().add(btn1);
		
		JButton btn5 = new JButton("3");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn5.setBounds(288, 478, 119, 54);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("2");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn4.setBounds(157, 478, 119, 54);
		frame.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("1");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn3.setBounds(26, 478, 119, 54);
		frame.getContentPane().add(btn3);
		
		JButton btn8 = new JButton("6");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn8.setBounds(288, 411, 119, 54);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("5");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn7.setBounds(157, 411, 119, 54);
		frame.getContentPane().add(btn7);
		
		JButton btn6 = new JButton("4");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn6.getText();
				textField.setText(number);
			}
			
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn6.setBounds(22, 411, 119, 54);
		frame.getContentPane().add(btn6);
		
		JButton btn11 = new JButton("9");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn11.getText();
				textField.setText(number);
			}
		});
		btn11.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn11.setBounds(288, 344, 119, 54);
		frame.getContentPane().add(btn11);
		
		JButton btn10 = new JButton("8");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn10.getText();
				textField.setText(number);
			}
		});
		btn10.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn10.setBounds(157, 344, 119, 54);
		frame.getContentPane().add(btn10);
		
		JButton btn9 = new JButton("7");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number  = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn9.setBounds(22, 344, 119, 54);
		frame.getContentPane().add(btn9);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace = null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.BOLD, 19));
		btnB.setBounds(288, 277, 119, 54);
		frame.getContentPane().add(btnB);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnCe.setBounds(157, 277, 119, 54);
		frame.getContentPane().add(btnCe);
		
		JLabel lblNewLabel_1 = new JLabel("Weight");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 50, 84, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mass");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(22, 139, 84, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField.setBounds(12, 93, 142, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 181, 142, 37);
		frame.getContentPane().add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("kg");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(207, 99, 55, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("kg");
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		radioButton.setBounds(207, 184, 55, 25);
		frame.getContentPane().add(radioButton);
	}
}
