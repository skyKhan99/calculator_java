package denemeler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculator {
	static JButton btnEqual = new JButton("=");
	static JButton btnPlus = new JButton("+");
	static JButton btnMinus = new JButton("-");
	static JButton btnCross = new JButton("×");
	static JButton btnDivorce = new JButton("∕");
	
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Calculator");
		jFrame.setSize(200, 350);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel sign = new JLabel("skyKhan99");
		sign.setBounds(0,0,100,20);
		jFrame.add(sign);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(0,270,80,45);
		JButton btn1 = new JButton("1");
		btn1.setBounds(0,230,40,40);
		JButton btn2 = new JButton("2");
		btn2.setBounds(40,230,40,40);
		JButton btn3 = new JButton("3");
		btn3.setBounds(80,230,40,40);
		JButton btn4 = new JButton("4");
		btn4.setBounds(0,190,40,40);
		JButton btn5 = new JButton("5");
		btn5.setBounds(40,190,40,40);
		JButton btn6 = new JButton("6");
		btn6.setBounds(80,190,40,40);
		JButton btn7 = new JButton("7");
		btn7.setBounds(0,150,40,40);
		JButton btn8 = new JButton("8");
		btn8.setBounds(40,150,40,40);
		JButton btn9 = new JButton("9");
		btn9.setBounds(80,150,40,40);
		btnEqual.setBounds(120,110,65,40);		
		btnPlus.setBounds(120,270,65,45);		
		btnMinus.setBounds(120,230,65,40);		
		btnCross.setBounds(120,190,65,40);		
		btnDivorce.setBounds(120,150,65,40);
		JButton btnClean = new JButton("C");
		btnClean.setBounds(0,110,120,40);
		JButton btnDelete = new JButton("↩");
		btnDelete.setBounds(120,70,65,40);
		JButton btnVirgule = new JButton(",");
		btnVirgule.setBounds(80,270,40,45);
		
		
		JTextField tf = new JTextField();
		tf.setEditable(false);
		tf.setBounds(0,30,185,40);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		jFrame.add(btn0);
		jFrame.add(btn1);
		jFrame.add(btn2);
		jFrame.add(btn3);
		jFrame.add(btn4);
		jFrame.add(btn5);
		jFrame.add(btn6);
		jFrame.add(btn7);
		jFrame.add(btn8);
		jFrame.add(btn9);
		jFrame.add(btnEqual);
		jFrame.add(btnPlus);
		jFrame.add(btnMinus);
		jFrame.add(btnCross);
		jFrame.add(btnDivorce);
		jFrame.add(btnClean);
		jFrame.add(btnDelete);
		jFrame.add(btnVirgule);
		jFrame.add(tf);
		tf.setText("0");	
		
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (!txt.equals("0")){
					tf.setText(txt + "0");	
				}
				
			}});
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("1");	
				}
				else {tf.setText(txt + "1");
				}
			}
			
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("2");	
				}
				else {tf.setText(txt + "2");
				}
			}
			
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("3");	
				}
				else {tf.setText(txt + "3");
				}
			}
			
		});
		
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("4");	
				}
				else {tf.setText(txt + "4");
				}
			}
			
		});
		
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("5");	
				}
				else {tf.setText(txt + "5");
				}
			}
			
		});
		
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("6");	
				}
				else {tf.setText(txt + "6");
				}
			}
			
		});
		
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("7");	
				}
				else {tf.setText(txt + "7");
				}
			}
			
		});
		
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("8");	
				}
				else {tf.setText(txt + "8");
				}
			}
			
		});
		
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnEqual.setEnabled(true);
				String txt = tf.getText();
				if (txt.equals("0")){
					tf.setText("9");	
				}
				else {tf.setText(txt + "9");
				}
			}
			
		});
		
		btnPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				disableButtons();
				String txt = tf.getText();
				tf.setText(txt + "+");
			}
			
		});
		
		btnMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				disableButtons();
				String txt = tf.getText();
				tf.setText(txt + "-");
			}
			
		});
		
		btnDivorce.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				disableButtons();
				String txt = tf.getText();
				tf.setText(txt + "/");
			}
			
		});
		
		btnCross.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				disableButtons();
				String txt = tf.getText();
				tf.setText(txt + "×");
			}			
		});
		
		btnVirgule.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = tf.getText();
				tf.setText(txt + ".");
			}
			
		});
		
		btnEqual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				enableButtons();
				String txt = tf.getText();
				if(txt.contains("+")) {
					String[] addingNumbers = txt.split("\\+");
					System.out.println(addingNumbers);
					float result = Float.parseFloat(addingNumbers[0]) + Float.parseFloat(addingNumbers[1]);
					tf.setText(String.valueOf(result));
				} else if(txt.contains("-")) {
					String[] addingNumbers = txt.split("\\-");
					System.out.println(addingNumbers);
					float result = Float.parseFloat(addingNumbers[0]) - Float.parseFloat(addingNumbers[1]);
					tf.setText(String.valueOf(result));
				} else if(txt.contains("×")) {
					String[] addingNumbers = txt.split("×");
					System.out.println(addingNumbers);
					float result = Float.parseFloat(addingNumbers[0]) * Float.parseFloat(addingNumbers[1]);
					tf.setText(String.valueOf(result));
				} else if(txt.contains("/")) {
					String[] addingNumbers = txt.split("\\/");
					System.out.println(addingNumbers);
					float result = Float.parseFloat(addingNumbers[0]) / Float.parseFloat(addingNumbers[1]);
					tf.setText(String.valueOf(result));
				}
				
			}
			
		});
		
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				enableButtons();
				String txt = tf.getText();
				if(txt.length()<=1) {
					tf.setText("0");
				} else {
					tf.setText(txt.substring(0, txt.length()-1));
				}
			}
			
		});
		
		btnClean.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				enableButtons();
				tf.setText("0");
			}
			
		});
		
		
					
	}
	
	public static void enableButtons() {
		btnMinus.setEnabled(true);
		btnDivorce.setEnabled(true);
		btnCross.setEnabled(true);
		btnPlus.setEnabled(true);
		btnEqual.setEnabled(true);
	}
	
	public static void disableButtons() {
		btnMinus.setEnabled(false);
		btnDivorce.setEnabled(false);
		btnCross.setEnabled(false);
		btnPlus.setEnabled(false);
		btnEqual.setEnabled(false);
	}

}