
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PROZORNoviSoftver extends JFrame  {

public PROZORNoviSoftver(){
	
	JDialog dijalogSoftver;  
	 
    JFrame frameSoftver = new JFrame();  
    dijalogSoftver = new JDialog(frameSoftver, "Softver", true); 
    dijalogSoftver.setSize(500,500);    
    setLocationRelativeTo(null);
    
    JPanel center = new JPanel();
	BoxLayout boxCenter = new BoxLayout(center, BoxLayout.Y_AXIS);
	center.setLayout(boxCenter);
	dijalogSoftver.add(center,BorderLayout.CENTER);
	
	Dimension d = new Dimension(300,30);
	
	// Naziv
	
	JPanel pan = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JLabel lblNazivSoftvera = new JLabel("Naziv Softvera:");
    lblNazivSoftvera.setPreferredSize(d);
    JTextField txtNazivSoftvera = new JTextField();
    txtNazivSoftvera.setPreferredSize(d);
    pan.add(lblNazivSoftvera);
    pan.add(txtNazivSoftvera);
	
	// CETKICE
    // Bilo bi dobro neki vizuelni razmak u dijalogu napraviti
	
    
    
    
	// Fajl format
	
    JLabel lblFormat = new JLabel("Fajl format:");
    lblFormat.setPreferredSize(d);
    JTextField txtFormat = new JTextField();
    txtFormat.setPreferredSize(d);
    pan.add(lblFormat);
    pan.add(txtFormat);
    
	// Alati
    
    JLabel lblAlati = new JLabel("Alati:");
    lblAlati.setPreferredSize(d);
    JTextField txtAlati = new JTextField();
    txtAlati.setPreferredSize(d);
    pan.add(lblAlati);
    pan.add(txtAlati);
    
	
	// RENDER
    // Bilo bi dobro neki vizuelni razmak u dijalogu napraviti
	
	
	
	dijalogSoftver.setResizable(false);
	dijalogSoftver.setVisible(true); 
	pack();
}
}