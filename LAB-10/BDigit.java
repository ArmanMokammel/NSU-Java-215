import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BDigit extends JButton{

	private JTextField txtField ;
	
	BDigit ()
	{
		
	}
	
	BDigit (JTextField txt, String title)
	{
		super (title) ;
		this.txtField = txt ;
		this.addActionListener(new ActionListener () {
        	public void actionPerformed(ActionEvent e){
        		click () ;
        	}
        });
		
	}
	public void click () 
	{
        String in = this.txtField.getText();
        in += this.getText() ;
        this.txtField.setText(in);
	}
}
