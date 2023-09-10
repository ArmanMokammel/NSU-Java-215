import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Hello {

    public static void main(String[] args) {
       
    	JFrame Frame = new JFrame("Calculator");
        Frame.setLayout(null);
        Frame.setSize(250,400);
        JTextField Input = new JTextField();
        Input.setBounds(0,0,250,40);
        Frame.add(Input);
        BDigit B0 = new BDigit (Input, "0");
        BDigit B1 = new BDigit (Input, "1");
        BDigit B2 = new BDigit (Input, "2");
        BDigit B3 = new BDigit (Input, "3");

        BDigit B4 = new BDigit (Input, "4");
        BDigit B5 = new BDigit (Input, "5");
        BDigit B6 = new BDigit (Input, "6");

        BDigit B7 = new BDigit (Input, "7");
        BDigit B8 = new BDigit (Input, "8");
        BDigit B9 = new BDigit (Input, "9");

//        JButton B4 = new JButton("4");
//        JButton B5 = new JButton("5");
//        JButton B6 = new JButton("6");
//        JButton B7 = new JButton("7");
//        JButton B8 = new JButton("8");
//        JButton B9 = new JButton("9");
        B0.setBounds(50,240,50,30);
        B1.setBounds(0,150,50,30);
        B2.setBounds(50,150,50,30);
        B3.setBounds(100,150,50,30);
        B4.setBounds(0,180,50,30);
        B5.setBounds(50,180,50,30);
        B6.setBounds(100,180,50,30);
        B7.setBounds(0,210,50,30);
        B8.setBounds(50,210,50,30);
        B9.setBounds(100,210,50,30);
        Frame.add(B0);
        Frame.add(B1);
        Frame.add(B2);
        Frame.add(B3);
        Frame.add(B4);
        Frame.add(B5);
        Frame.add(B6);
        Frame.add(B7);
        Frame.add(B8);
        Frame.add(B9);
        BOperator JX = new BOperator(Input, "*");
        BOperator JD = new BOperator(Input, "/");
        BOperator JP = new BOperator(Input, "+");
        BOperator JS = new BOperator(Input, "-");
        JX.setBounds(0,120,50,30);
        JD.setBounds(50,120,50,30);
        JP.setBounds(100,120,50,30);
        JS.setBounds(0,240,50,30);
        Frame.add(JX);
        Frame.add(JD);
        Frame.add(JP);
        Frame.add(JS);
        JButton JE = new JButton("=");
        JE.setBounds(100,240,50,30);
        Frame.add(JE);
        JButton JDot = new JButton(".");
        JDot.setBounds(50,270,50,30);
        Frame.add(JDot);
        JButton JB = new JButton("<-");
        JB.setBounds(0,270,50,30);
        Frame.add(JB);
        JButton JPer = new JButton("%");
        JPer.setBounds(100,270,50,30);
        Frame.add(JPer);
//        B0.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="0";
//            Input.setText(in);
//        	}
//        });
//        B1.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="1";
//            Input.setText(in);
//        	}
//        });
//        B2.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="2";
//            Input.setText(in);
//        	}
//        });
//        B3.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="3";
//            Input.setText(in);
//        	}
//        });
//        B4.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="4";
//            Input.setText(in);
//        	}
//        });
//        B5.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="5";
//            Input.setText(in);
//        	}
//        });
//        B6.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="6";
//            Input.setText(in);
//        	}
//        });
//        B7.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){  
//            String in = Input.getText();
//            in+="7";
//            Input.setText(in);
//        	}
//        });
//               
//        B8.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="8";
//            Input.setText(in);
//        	}
//        });
//        B9.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="9";
//            Input.setText(in);
//        	}
//        });
//        JX.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="*";
//            Input.setText(in);
//        	}
//        });
//        JD.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="/";
//            Input.setText(in);
//        	}
//        });
//        JP.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="+";
//            Input.setText(in);
//        	}
//        });
//        JS.addActionListener(new ActionListener () {
//        	public void actionPerformed(ActionEvent e){
//            String in = Input.getText();
//            in+="-";
//            Input.setText(in);
//        	}
//        });
        JDot.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
            String in = Input.getText();
            in+=".";
            Input.setText(in);
        	}
        });
        JPer.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
            String in = Input.getText();
            in+="%";
            Input.setText(in);
        	}
        });
        JB.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
            String in = Input.getText();
            in = in.substring(0, in.length() - 1);
            Input.setText(in);
        	}
        });

        JE.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
            String in = Input.getText();
            String[] parts = in.split("[\\+\\-*/%]");
            char[] operators = in.replaceAll("[^+\\-*/%]", "").toCharArray();

            double result;

            if (parts.length >= 2 && parts.length == operators.length + 1) {
                result = Double.parseDouble(parts[0]);

                for (int i = 1; i < parts.length; i++) {
                    double operand = Double.parseDouble(parts[i]);
                    char operator = operators[i - 1];

                    switch (operator) {
                        case '+' : result += operand; break;
                        case '-' : result -= operand; break;
                        case '*' : result *= operand; break;
                        case '%' : result *= operand / 100.0; break;
                        case '/' : {
                            if (operand != 0) {
                                result /= operand;
                            } else {
                                result = Double.NaN;
                            }
                        }
                    }
                }

                Input.setText(Double.toString(result));
            }
        	}
        });
        JButton JC = new JButton("Clear");
        JC.setBounds(40,300,80,30);
        Frame.add(JC);
        JC.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
            String in = "";
            Input.setText(in);
        	}
        });

        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
    }


}
