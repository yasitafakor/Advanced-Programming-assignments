import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class Calculator{
	
	static double numOne;
	static double numTwo;
	static double result;
	static char command;
	
	public static void main(String[] args) {
		
		Font myFont = new Font("Serif", Font.BOLD,18);
		Font myFont2 = new Font("Serif", Font.ITALIC,16);
		Font myFont3 = new Font("Serif", Font.CENTER_BASELINE,16);
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(410,400);
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(null);
		panel.setOpaque(true);
		panel.setBackground(Color.black);
		
		JLabel label1 = new JLabel();
		
		label1.setOpaque(true);
		label1.setBackground(Color.orange);
		label1.setText("Calculator");
		label1.setForeground(Color.black);
		
//Buttons:		
		
		JTextField textfield = new JTextField();
		
		JButton buttonPI = new JButton();
		buttonPI.setBounds(30, 130, 80, 30);
		buttonPI.setBackground(Color.BLACK);
		buttonPI.setText(" PI ");
		buttonPI.setForeground(Color.white);
		buttonPI.setFont(myFont2);
		buttonPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonPI) {
					numOne = 3.141592653589793;
					textfield.setText("3.1415926535897932384626433832795");
				}
			}
		});
		JButton buttonE = new JButton();
		buttonE.setBounds(115, 130, 80, 30);
		buttonE.setBackground(Color.BLACK);
		buttonE.setText(" e ");
		buttonE.setForeground(Color.white);
		buttonE.setFont(myFont);
		buttonE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonE) {
					numOne = 2.718281828459045;
					textfield.setText("2.7182818284590452353602874713527");
				}
			}
		});
		JButton buttonFac = new JButton();
		buttonFac.setBounds(200, 130, 80, 30);
		buttonFac.setBackground(Color.BLACK);
		buttonFac.setText(" n! ");
		buttonFac.setForeground(Color.white);
		buttonFac.setFont(myFont);
		buttonFac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonFac) {
					numOne = Double.parseDouble(textfield.getText());
					textfield.setText(String.valueOf(Factorial(numOne)));
					numOne = Factorial(numOne);
				}
			}
		});
		JButton buttonClear = new JButton();
		buttonClear.setBounds(285, 130, 80, 30);
		buttonClear.setBackground(Color.ORANGE);
		buttonClear.setText(" Clear ");
		buttonClear.setForeground(Color.BLACK);
		buttonClear.setFont(myFont2);
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonClear) {
					textfield.setText(" ");
				}
			}
		});
		JButton buttonPow = new JButton();
		buttonPow.setBounds(30, 165, 80, 30);
		buttonPow.setBackground(Color.BLACK);
		buttonPow.setText(" 10^x ");
		buttonPow.setForeground(Color.white);
		buttonPow.setFont(myFont3);
		buttonPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonPow) {
					numOne = Double.parseDouble(textfield.getText());
					textfield.setText(String.valueOf(Pow10X(numOne)));
					numOne = Pow10X(numOne);
				}
			}
		});
		JButton buttonPow2 = new JButton();
		buttonPow2.setBounds(115, 165, 80, 30);
		buttonPow2.setBackground(Color.BLACK);
		buttonPow2.setText(" x² ");
		buttonPow2.setForeground(Color.white);
		buttonPow2.setFont(myFont);
		buttonPow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonPow2) {
					numOne = Double.parseDouble(textfield.getText());
					textfield.setText(String.valueOf(Pow2X(numOne)));
					numOne = Pow2X(numOne);
				}
			}
		});
		JButton buttonSqr = new JButton();
		buttonSqr.setBounds(200, 165, 80, 30);
		buttonSqr.setBackground(Color.BLACK);
		buttonSqr.setText(" √x ");
		buttonSqr.setForeground(Color.white);
		buttonSqr.setFont(myFont);
		buttonSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonSqr) {
					numOne = Double.parseDouble(textfield.getText());
					textfield.setText(String.valueOf(Sqr(numOne)));
					numOne = Sqr(numOne);
				}
			}
		});
		JButton buttonDiv = new JButton();
		buttonDiv.setBounds(285, 165, 80, 30);
		buttonDiv.setBackground(Color.BLACK);
		buttonDiv.setText(" ÷ ");
		buttonDiv.setForeground(Color.white);
		buttonDiv.setFont(myFont);
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonDiv) {
					numOne = Double.parseDouble(textfield.getText());
					command = '/';
					textfield.setText(" ");
				}
			}
		});
		JButton button7 = new JButton();
		button7.setBounds(30, 200, 80, 30);
		button7.setBackground(Color.BLACK);
		button7.setText(" 7 ");
		button7.setForeground(Color.white);
		button7.setFont(myFont);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button7) {
					textfield.setText(textfield.getText().concat("7"));
				}
			}
		});
		JButton button8 = new JButton();
		button8.setBounds(115, 200, 80, 30);
		button8.setBackground(Color.BLACK);
		button8.setText(" 8 ");
		button8.setForeground(Color.white);
		button8.setFont(myFont);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button8) {
					textfield.setText(textfield.getText().concat("8"));
				}
			}
		});
		JButton button9 = new JButton();
		button9.setBounds(200, 200, 80, 30);
		button9.setBackground(Color.BLACK);
		button9.setText(" 9 ");
		button9.setForeground(Color.white);
		button9.setFont(myFont);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button9) {
					textfield.setText(textfield.getText().concat("9"));
				}
			}
		});
		JButton buttonMul = new JButton();
		buttonMul.setBounds(285, 200, 80, 30);
		buttonMul.setBackground(Color.BLACK);
		buttonMul.setText(" * ");
		buttonMul.setForeground(Color.white);
		buttonMul.setFont(myFont);
		buttonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonMul) {
					numOne = Double.parseDouble(textfield.getText());
					command = '*';
					textfield.setText(" ");
				}
			}
		});
		JButton button4 = new JButton();
		button4.setBounds(30, 235, 80, 30);
		button4.setBackground(Color.BLACK);
		button4.setText(" 4 ");
		button4.setForeground(Color.white);
		button4.setFont(myFont);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button4) {
					textfield.setText(textfield.getText().concat("4"));
				}
			}
		});
		JButton button5 = new JButton();
		button5.setBounds(115, 235, 80, 30);
		button5.setBackground(Color.BLACK);
		button5.setText(" 5 ");
		button5.setForeground(Color.white);
		button5.setFont(myFont);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(e.getSource() == button5) {
					textfield.setText(textfield.getText().concat("5"));
				}
			}
		});
		JButton button6 = new JButton();
		button6.setBounds(200, 235, 80, 30);
		button6.setBackground(Color.BLACK);
		button6.setText(" 6 ");
		button6.setForeground(Color.white);
		button6.setFont(myFont);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button6) {
					textfield.setText(textfield.getText().concat("6"));
				}
			}
		});
		JButton buttonMin = new JButton();
		buttonMin.setBounds(285,235, 80, 30);
		buttonMin.setBackground(Color.BLACK);
		buttonMin.setText(" - ");
		buttonMin.setForeground(Color.white);
		buttonMin.setFont(myFont);
		buttonMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonMin) {
					numOne = Double.parseDouble(textfield.getText());
					command = '-';
					textfield.setText(" ");
				}
			}
		});
		JButton button1 = new JButton();
		button1.setBounds(30, 270, 80, 30);
		button1.setBackground(Color.BLACK);
		button1.setText(" 1 ");
		button1.setForeground(Color.white);
		button1.setFont(myFont);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button1) {
					textfield.setText(textfield.getText().concat("1"));
				}
			}
		});
		JButton button2 = new JButton();
		button2.setBounds(115, 270, 80, 30);
		button2.setBackground(Color.BLACK);
		button2.setText(" 2 ");
		button2.setForeground(Color.white);
		button2.setFont(myFont);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(e.getSource() == button2) {
					textfield.setText(textfield.getText().concat("2"));
				}
			}
		});
		JButton button3 = new JButton();
		button3.setBounds(200, 270, 80, 30);
		button3.setBackground(Color.BLACK);
		button3.setText(" 3 ");
		button3.setForeground(Color.white);
		button3.setFont(myFont);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(e.getSource() == button3) {
					textfield.setText(textfield.getText().concat("3"));
				}
			}
		});
		JButton buttonSum = new JButton();
		buttonSum.setBounds(285,270,80, 30);
		buttonSum.setBackground(Color.BLACK);
		buttonSum.setText(" + ");
		buttonSum.setForeground(Color.white);
		buttonSum.setFont(myFont);
		buttonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonSum) {
					numOne = Double.parseDouble(textfield.getText());
					command = '+';
					textfield.setText(" ");
				}
			}
		});
		JButton buttonNeg = new JButton();
		buttonNeg.setBounds(30,305, 80, 30);
		buttonNeg.setBackground(Color.BLACK);
		buttonNeg.setText("-X ");
		buttonNeg.setForeground(Color.white);
		buttonNeg.setFont(myFont2);
		buttonNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonNeg) {
					double tempforNeg = Double.parseDouble(textfield.getText());
					tempforNeg *= -1;
					textfield.setText(String.valueOf(tempforNeg));
				}
			}
		});
		JButton button0 = new JButton();
		button0.setBounds(115, 305, 80, 30);
		button0.setBackground(Color.BLACK);
		button0.setText(" 0 ");
		button0.setForeground(Color.white);
		button0.setFont(myFont);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(e.getSource() == button0) {
					textfield.setText(textfield.getText().concat("0"));
				}
			}
		});
		JButton buttonDot = new JButton();
		buttonDot.setBounds(200, 305, 80, 30);
		buttonDot.setBackground(Color.BLACK);
		buttonDot.setText(" . ");
		buttonDot.setForeground(Color.white);
		buttonDot.setFont(myFont);
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(e.getSource() == buttonDot) {
					textfield.setText(textfield.getText().concat("."));
				}
			}
		});
		JButton buttonEqu = new JButton();
		buttonEqu.setBounds(285, 305, 80, 30);
		buttonEqu.setBackground(Color.orange);
		buttonEqu.setText(" = ");
		buttonEqu.setForeground(Color.BLACK);
		buttonEqu.setFont(myFont);
		buttonEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(e.getSource() == buttonEqu) {
					numTwo = Double.parseDouble(textfield.getText());
					switch(command) {
					case '+':
						result = add(numOne,numTwo);
						break;
					case '-':
						result = subtract(numOne,numTwo);
						break;
					case '*':
						result = multiply(numOne,numTwo);
						break;
					case '/':
							result = divide(numOne,numTwo);
						break;
					}
					if(String.valueOf(result) == "Infinity") {
						textfield.setText("Not Valid!");
					}
					else{
						textfield.setText(String.valueOf(result));
					}
					numOne = result;
				}
			}
		});
		
		textfield.setOpaque(true);
		textfield.setBounds(48, 50, 300, 40);
		textfield.setBackground(Color.orange);
		textfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
	
		label1.setBounds(0,10,600,30);
		
		panel.add(label1);
		panel.add(buttonPI);
		panel.add(buttonE);
		panel.add(buttonFac);
		panel.add(buttonClear);
		panel.add(buttonPow);
		panel.add(buttonPow2);
		panel.add(buttonDiv);
		panel.add(buttonSqr);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonMul);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonMin);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonSum);
		panel.add(buttonNeg);
		panel.add(button0);
		panel.add(buttonDot);
		panel.add(buttonEqu);
		frame.add(textfield);
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
		

	public static double add(double numOne, double numTwo) {
	    // sum two number
		return numOne + numTwo;
	}

	public static double subtract(double numOne, double numTwo) {
	    // minus two number
		return numOne - numTwo;
	}

	public static double divide(double numOne, double numTwo) {
	    // divide two number
		return numOne / numTwo;
	}

	public static double multiply(double numOne, double numTwo) {
	    // multiply two number
		return numOne * numTwo;
	}
	public static double Factorial(double numOne) {
	    // multiply two number
		long s = 1;
		for(int i = 1; i <= numOne; i++) {
			s *= i;
		}
		return s;
	}
	public static double Pow10X(double numOne) {
	    // multiply two number
		return Math.pow(10, numOne);
	}
	public static double Pow2X(double numOne) {
	    // multiply two number
		return Math.pow(numOne, 2);
	}
	public static double Sqr(double numOne) {
	    // multiply two number
		return Math.sqrt(numOne);
	}
}