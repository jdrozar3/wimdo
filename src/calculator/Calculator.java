package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	
	
	double num1, num2;
	String operator;
	
	
	

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
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 293, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(14, 11, 250, 41);
		textField.setBorder(null);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//first row
		JButton allClear = new JButton("AC");
		allClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		allClear.setBackground(Color.LIGHT_GRAY);
		allClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		allClear.setBounds(14, 63, 61, 65);
		frame.getContentPane().add(allClear);
		
		JButton backSpace = new JButton("\u2190");
		backSpace.setBackground(Color.LIGHT_GRAY);
		backSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().length() > 0) {
				StringBuffer txt = new StringBuffer(textField.getText());
				txt.deleteCharAt(textField.getText().length() - 1);
				textField.setText(txt.toString());
				} 
				
				
				
			}
		});
		backSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		backSpace.setBounds(77, 63, 61, 65);
		frame.getContentPane().add(backSpace);
		
		JButton modulus = new JButton("%");
		modulus.setBackground(Color.LIGHT_GRAY);
		modulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				operator = "%";
				num1 = Double.parseDouble(textField.getText());
				num1 /= 100;
				textField.setText(String.format("%.2f", num1));
				} catch (Exception err) {
					err.getMessage();
				}
			}
		});
		modulus.setFont(new Font("Tahoma", Font.BOLD, 20));
		modulus.setBounds(140, 63, 61, 65);
		frame.getContentPane().add(modulus);
		
		JButton divide = new JButton("/");
		divide.setForeground(Color.WHITE);
		divide.setBackground(Color.ORANGE);
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					operator = "/";
					num1 = Double.parseDouble(textField.getText());
					textField.setText("");
					} catch (Exception err) {
						err.getMessage();
					}
			}
		});
		divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		divide.setBounds(203, 63, 61, 65);
		frame.getContentPane().add(divide);
		
		//second row
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn7.getText();
				textField.setText(text);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(14, 130, 61, 65);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setForeground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn8.getText();
				textField.setText(text);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(77, 130, 61, 65);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setForeground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn9.getText();
				textField.setText(text);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(140, 130, 61, 65);
		frame.getContentPane().add(btn9);

		JButton multiply = new JButton("x");
		multiply.setForeground(Color.WHITE);
		multiply.setBackground(Color.ORANGE);
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					operator = "*";
					num1 = Double.parseDouble(textField.getText());
					textField.setText("");
					} catch (Exception err) {
						err.getMessage();
					}
			}
		});
		multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		multiply.setBounds(203, 130, 61, 65);
		frame.getContentPane().add(multiply);
		
		
		//third row
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setForeground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn4.getText();
				textField.setText(text);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(14, 197, 61, 65);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setForeground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn5.getText();
				textField.setText(text);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(77, 197, 61, 65);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setForeground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn6.getText();
				textField.setText(text);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(140, 197, 61, 65);
		frame.getContentPane().add(btn6);

		JButton subtract = new JButton("-");
		subtract.setForeground(Color.WHITE);
		subtract.setBackground(Color.ORANGE);
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					operator = "-";
					num1 = Double.parseDouble(textField.getText());
					textField.setText("");
					} catch (Exception err) {
						err.getMessage();
					}
			}
		});
		subtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		subtract.setBounds(203, 197, 61, 65);
		frame.getContentPane().add(subtract);
		
		
		
		//fourth row
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn1.getText();
				textField.setText(text);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(14, 264, 61, 65);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setForeground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn2.getText();
				textField.setText(text);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(77, 264, 61, 65);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setForeground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn3.getText();
				textField.setText(text);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(140, 264, 61, 65);
		frame.getContentPane().add(btn3);

		JButton add = new JButton("+");
		add.setForeground(Color.WHITE);
		add.setBackground(Color.ORANGE);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				operator = "+";
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				} catch (Exception err) {
					err.getMessage();
				}
				
			
				
			
			}
		});
		add.setFont(new Font("Tahoma", Font.BOLD, 20));
		add.setBounds(203, 264, 61, 65);
		frame.getContentPane().add(add);
		
		
		//fifth row
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setForeground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn0.getText();
				textField.setText(text);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(14, 331, 61, 65);
		frame.getContentPane().add(btn0);

		JButton decimal = new JButton(".");
		decimal.setBackground(Color.DARK_GRAY);
		decimal.setForeground(Color.WHITE);
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".")) {
				String text = textField.getText() + decimal.getText();
				textField.setText(text);
				}
			}
		});
		decimal.setFont(new Font("Tahoma", Font.BOLD, 20));
		decimal.setBounds(140, 331, 61, 65);
		frame.getContentPane().add(decimal);

		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				double ans = 0;
				num2 = Double.parseDouble(textField.getText());
				
				switch (operator) {
				case "+":
						ans = num1 + num2;
						break;
				case "-":
					ans = num1 - num2;
					break;
				case "*":
					ans = num1 * num2;
					break;
				case "/":
					ans = num1 / num2;
					break;
				default:
					//do nothing
				}
				
				answer = String.format("%.2f", ans);
				if(answer.contains(".00") ) {
					answer = String.format("%.0f", ans);

				}

				textField.setText(answer);
	
			}
		});
		equal.setForeground(Color.WHITE);
		equal.setBackground(Color.ORANGE);
		equal.setFont(new Font("Tahoma", Font.BOLD, 20));
		equal.setBounds(203, 331, 61, 65);
		frame.getContentPane().add(equal);
		
		JButton positiveAndNegative = new JButton("\u00B1");
		positiveAndNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				
				if(s.length() != 0) {
					double num = Double.parseDouble(s) * -1;
					s =String.valueOf(num);
					textField.setText(s);
		
				}
				
			}
		});
		positiveAndNegative.setForeground(Color.WHITE);
		positiveAndNegative.setFont(new Font("Tahoma", Font.BOLD, 20));
		positiveAndNegative.setBackground(Color.DARK_GRAY);
		positiveAndNegative.setBounds(77, 331, 61, 65);
		frame.getContentPane().add(positiveAndNegative);
	}
}
