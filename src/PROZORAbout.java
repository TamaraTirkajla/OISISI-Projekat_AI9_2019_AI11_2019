import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PROZORAbout extends JFrame {
	
	public PROZORAbout() {
		
		JDialog dijalogAbout;  
 
        JFrame frameAbout = new JFrame();  
        dijalogAbout = new JDialog(frameAbout, "About", true); 
        dijalogAbout.setSize(500,500);
        setLocationRelativeTo(null);
        
        JPanel center = new JPanel();
		BoxLayout boxCenter = new BoxLayout(center, BoxLayout.Y_AXIS);
		center.setLayout(boxCenter);
		dijalogAbout.add(center,BorderLayout.CENTER);
		
		Dimension d = new Dimension(300,30);
			
		JPanel pan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblAbout = new JLabel("Ovo je prica o nama");
        lblAbout.setPreferredSize(d);
        pan.add(lblAbout);
       
        dijalogAbout.setResizable(false);
        dijalogAbout.setVisible(true); 
		pack();
}
}

