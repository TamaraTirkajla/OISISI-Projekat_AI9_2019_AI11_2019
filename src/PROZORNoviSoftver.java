
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class PROZORNoviSoftver extends JFrame  {

public PROZORNoviSoftver(){
	
	JDialog dijalogSoftver;  
	 
    JFrame frameSoftver = new JFrame();  
    dijalogSoftver = new JDialog(frameSoftver, "Softver", true); 
    dijalogSoftver.setSize(500,500);    
    setLocationRelativeTo(null);
    
    frameSoftver.setLayout(new FlowLayout());
	JTextField NazivSoftvera = new JTextField(10);
	JTextField NazivCet = new JTextField(10);
	JTextField Namena = new JTextField(10);
	JTextField Boja = new JTextField(10);
	JTextField FajlFormat = new JTextField(10);
	JTextField Alati = new JTextField(10);
	JTextField Materijali = new JTextField(10);
	JTextField Kamera = new JTextField(10);
	JTextField Objekti = new JTextField(10);
	JTextField NazivRend = new JTextField(10);
	JTextField Modifikator = new JTextField(10);
	
	JPanel myPanel = new JPanel();
	
	myPanel.add(new JLabel("Naziv Softvera:"));
	myPanel.add(NazivSoftvera);
	myPanel.add(new JLabel("Naziv cetkice:"));
	myPanel.add(NazivCet);
	myPanel.add(new JLabel("Namena:"));
	myPanel.add(Namena);
	myPanel.add(new JLabel("Boja:"));
	myPanel.add(Boja);
	myPanel.add(new JLabel("Fajl format:"));
	myPanel.add(FajlFormat);
	myPanel.add(new JLabel("Alati:"));
	myPanel.add(Alati);
	myPanel.add(new JLabel("Materijali:"));
	myPanel.add(Materijali);
	myPanel.add(new JLabel("Kamera:"));
	myPanel.add(Kamera);
	myPanel.add(new JLabel("Objekti:"));
	myPanel.add(Objekti);
	myPanel.add(new JLabel("Naziv rendera:"));
	myPanel.add(NazivRend);
	myPanel.add(new JLabel("Modifikator:"));
	myPanel.add(Modifikator);
	
	myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
	int result = JOptionPane.showConfirmDialog(
		    null, myPanel, "Unos novog Softvera", JOptionPane.OK_CANCEL_OPTION);
	//verovatno treba dodati sta ce se desiti klikom na OK i CANCEL pomocu result-a
	if (result!=JOptionPane.OK_OPTION){
		
		frameSoftver.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	}
	else{
		frameSoftver.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
    
	
    /*
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
	pack();*/
    
}
}