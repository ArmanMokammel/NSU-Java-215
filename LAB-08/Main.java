import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		/* Taking input directly */
		String s1 = JOptionPane.showInputDialog("Enter 1st number");
		String s2 = JOptionPane.showInputDialog("Enter 2nd number");
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int sum1 = n1 + n2;
    		JOptionPane.showMessageDialog(null, "Result: " + sum1, "Sum", JOptionPane.INFORMATION_MESSAGE);
		/* END */

		/* Making a new window to take and display input */
		JFrame frame = new JFrame("My First GUI");
	    	frame.setLayout(null);
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	frame.setSize(400,300);
	      
        	JLabel l1 = new JLabel("Number 1: ");        
        	l1.setBounds(20, 20, 80, 20);
	        frame.add(l1);
	
	        
	        JTextField txt1 = new JTextField () ;
	        txt1.setBounds(110, 20, 200, 20);
	        frame.add(txt1) ;
	        
	        JLabel l2 = new JLabel("Number 2: ");        
	        l2.setBounds(20, 60, 80, 20);
	        frame.add(l2);
	
	        
	        JTextField txt2 = new JTextField () ;
	        txt2.setBounds(110, 60, 200, 20);
	        frame.add(txt2) ;
	        
	        JButton b1 = new JButton("Add");
	        b1.setBounds(110, 100, 80, 40);
	        
	        frame.add(b1) ;
	        
	        
	        JLabel label = new JLabel("Result: ");
	        label.setBounds(20, 180, 80, 20);
	        frame.add(label);
	        
	        frame.setVisible(true);
        
	        b1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	int val1 = Integer.parseInt(txt1.getText());
	                int val2 = Integer.parseInt(txt2.getText());
	                int sum = val1 + val2;
	            	JOptionPane.showMessageDialog (null, "Result: " + sum) ;
	            	label.setText("Result: " + sum);
	            }
	         });
	        
	        /* END */        
	}	
}
