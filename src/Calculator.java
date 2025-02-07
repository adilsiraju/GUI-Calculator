import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked = false;
	
	JFrame window;
	
	JLabel screen;
	JButton nineButton, eightButton, sevenButton, sixButton, fiveButton, fourButton, threeButton, twoButton, oneButton, zeroButton;
	JButton equalButton, dotButton, plusButton, minusButton, multiButton, divButton, clearButton;
	
	String oldValue;
	
	String currentOperator="";
	
	Calculator(){
		
		window = new JFrame("The Calculator Project");
		
		window.setBounds(750, 200, 425, 650);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.WHITE);
		window.setVisible(true);
		
		screen = new JLabel("");
		screen.setBounds(10, 40, 390, 100);
		screen.setBackground(Color.black);
		screen.setForeground(Color.white);
		screen.setFont(new Font("Serif", Font.PLAIN, 30));
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.setOpaque(true);
		window.add(screen);
		
//		Clear
		clearButton = new JButton("Clear");
		clearButton.setBounds(15, 160, 380, 20);
		clearButton.setBackground(new java.awt.Color(60, 115, 2));
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		window.add(clearButton);
//		Row 789
		sevenButton = new JButton("7");
		sevenButton.setBounds(20, 200, 70, 70);
		sevenButton.setBackground(new java.awt.Color(59, 89, 182));
		sevenButton.setForeground(Color.white);
		sevenButton.setFont(new Font("Serif", Font.PLAIN, 30));
		sevenButton.addActionListener(this);
		window.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(120, 200, 70, 70);
		eightButton.setBackground(new java.awt.Color(59, 89, 182));
		eightButton.setForeground(Color.white);
		eightButton.setFont(new Font("Serif", Font.PLAIN, 30));
		eightButton.addActionListener(this);
		window.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(220, 200, 70, 70);
		nineButton.setBackground(new java.awt.Color(59, 89, 182));
		nineButton.setForeground(Color.white);
		nineButton.setFont(new Font("Serif", Font.PLAIN, 30));
		nineButton.addActionListener(this);
		window.add(nineButton);
		
//		Row 456
		fourButton = new JButton("4");
		fourButton.setBounds(20, 300, 70, 70);
		fourButton.setBackground(new java.awt.Color(59, 89, 182));
		fourButton.setForeground(Color.white);
		fourButton.setFont(new Font("Serif", Font.PLAIN, 30));
		fourButton.addActionListener(this);
		window.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(120, 300, 70, 70);
		fiveButton.setBackground(new java.awt.Color(59, 89, 182));
		fiveButton.setForeground(Color.white);
		fiveButton.setFont(new Font("Serif", Font.PLAIN, 30));
		fiveButton.addActionListener(this);
		window.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(220, 300, 70, 70);
		sixButton.setBackground(new java.awt.Color(59, 89, 182));
		sixButton.setForeground(Color.white);
		sixButton.setFont(new Font("Serif", Font.PLAIN, 30));
		sixButton.addActionListener(this);
		window.add(sixButton);
		
//		Row 123
		oneButton = new JButton("1");
		oneButton.setBounds(20, 400, 70, 70);
		oneButton.setBackground(new java.awt.Color(59, 89, 182));
		oneButton.setForeground(Color.white);
		oneButton.setFont(new Font("Serif", Font.PLAIN, 30));
		oneButton.addActionListener(this);
		window.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(120, 400, 70, 70);
		twoButton.setBackground(new java.awt.Color(59, 89, 182));
		twoButton.setForeground(Color.white);
		twoButton.setFont(new Font("Serif", Font.PLAIN, 30));
		twoButton.addActionListener(this);
		window.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(220, 400, 70, 70);
		threeButton.setBackground(new java.awt.Color(59, 89, 182));
		threeButton.setForeground(Color.white);
		threeButton.setFont(new Font("Serif", Font.PLAIN, 30));
		threeButton.addActionListener(this);
		window.add(threeButton);
//		Row 0
		zeroButton = new JButton("0");
		zeroButton.setBounds(120, 500, 70, 70);
		zeroButton.setBackground(new java.awt.Color(59, 89, 182));
		zeroButton.setForeground(Color.white);
		zeroButton.setFont(new Font("Serif", Font.PLAIN, 30));
		zeroButton.addActionListener(this);
		window.add(zeroButton);
//		
		dotButton = new JButton(".");
		dotButton.setBounds(20, 500, 70, 70);
		dotButton.setBackground(new java.awt.Color(60, 115, 2));
		dotButton.setForeground(Color.white);
		dotButton.setFont(new Font("Serif", Font.PLAIN, 30));
		dotButton.addActionListener(this);
		window.add(dotButton);
//		Equal
		equalButton = new JButton("=");
		equalButton.setBounds(220, 500, 70, 70);
		equalButton.setBackground(new java.awt.Color(60, 115, 2));
		equalButton.setForeground(Color.white);
		equalButton.setFont(new Font("Serif", Font.BOLD, 30));
		equalButton.addActionListener(this);
		window.add(equalButton);
//		Operators
		divButton = new JButton("/");
		divButton.setBounds(320, 200, 70, 70);
		divButton.setBackground(new java.awt.Color(60, 115, 2));
		divButton.setForeground(Color.white);
		divButton.setFont(new Font("Serif", Font.BOLD, 30));
		divButton.addActionListener(this);
		window.add(divButton);
		
		multiButton = new JButton("x");
		multiButton.setBounds(320, 300, 70, 70);
		multiButton.setBackground(new java.awt.Color(60, 115, 2));
		multiButton.setForeground(Color.white);
		multiButton.setFont(new Font("Serif", Font.PLAIN, 30));
		multiButton.addActionListener(this);
		window.add(multiButton);
		
		minusButton = new JButton("-");
		minusButton.setBounds(320, 400, 70, 70);
		minusButton.setBackground(new java.awt.Color(60, 115, 2));
		minusButton.setForeground(Color.white);
		minusButton.setFont(new Font("Serif", Font.BOLD, 30));
		minusButton.addActionListener(this);
		window.add(minusButton);
		
		plusButton = new JButton("+");
		plusButton.setBounds(320, 500, 70, 70);
		plusButton.setBackground(new java.awt.Color(60, 115, 2));
		plusButton.setForeground(Color.white);
		plusButton.setFont(new Font("Serif", Font.BOLD, 30));
		plusButton.addActionListener(this);
		window.add(plusButton);
	}
	
	
	
	public static void main(String[] args) {
		new Calculator();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
//		Numbers
		if (e.getSource()==nineButton) {
			if (isOperatorClicked) {
				screen.setText("9");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"9");
			}
		}
		else if (e.getSource()==eightButton) {
			if (isOperatorClicked) {
				screen.setText("8");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"8");
			}
		}
		else if (e.getSource()==sevenButton) {
			if (isOperatorClicked) {
				screen.setText("7");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"7");
			}
		}
		else if (e.getSource()==sixButton) {
			if (isOperatorClicked) {
				screen.setText("6");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"6");
			}
		}
		else if (e.getSource()==fiveButton) {
			if (isOperatorClicked) {
				screen.setText("5");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"5");
			}
		}
		else if (e.getSource()==fourButton) {
			if (isOperatorClicked) {
				screen.setText("4");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"4");
			}
		}
		else if (e.getSource()==threeButton) {
			if (isOperatorClicked) {
				screen.setText("3");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"3");
			}
		}
		else if (e.getSource()==twoButton) {
			if (isOperatorClicked) {
				screen.setText("2");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"2");
			}
		}
		else if (e.getSource()==oneButton) {
			if (isOperatorClicked) {
				screen.setText("1");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"1");
			}
		}
		else if (e.getSource()==zeroButton) {
			if (isOperatorClicked) {
				screen.setText("0");
				isOperatorClicked = false;
			}
			else {
				screen.setText(screen.getText()+"0");
			}
		}
		else if (e.getSource()==dotButton) {
			screen.setText(screen.getText()+".");
		}
		
//		Operators
		else if (e.getSource()==plusButton) {
			oldValue = screen.getText();
			isOperatorClicked = true;
			currentOperator = "+";
			
		}
		else if (e.getSource()==minusButton) {
			oldValue = screen.getText();
			isOperatorClicked = true;
			currentOperator = "-";
		}
		else if (e.getSource()==multiButton) {
			oldValue = screen.getText();
			isOperatorClicked = true;
			currentOperator = "x";
		}
		else if (e.getSource()==divButton) {
			oldValue = screen.getText();
			isOperatorClicked = true;
			currentOperator = "/";
		}
		else if (e.getSource()==equalButton) {
			Float result = 0f;
			
			String newValue = screen.getText();
			
			Float newValueF = Float.parseFloat(newValue);
			Float oldValueF = Float.parseFloat(oldValue);
			
			if (currentOperator.equals("+")) {
				result = newValueF + oldValueF;
			}
			else if (currentOperator.equals("-")) {
				result = newValueF - oldValueF;
			}
			else if (currentOperator.equals("x")) {
				result = newValueF * oldValueF;
			}
			else if (currentOperator.equals("/")) {
				result = newValueF / oldValueF;
			}
			
			screen.setText(result+"");
		}
		else if (e.getSource()==clearButton) {
			screen.setText("");
		}
		
		
	}

}
