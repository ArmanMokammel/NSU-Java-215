import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BOperator extends JButton{
	
	private JTextField txtField;
	
	public BOperator(JTextField txt, String title) {
		super(title);
		this.txtField = txt;
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click();				
			}
		});
	}
	
	public void click() {
		String in = this.txtField.getText();
        in+=this.getText();
        this.txtField.setText(in);
	}

}
