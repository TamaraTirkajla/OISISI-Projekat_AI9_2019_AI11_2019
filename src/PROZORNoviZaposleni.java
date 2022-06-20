
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


//import gui.panels.focus.FocusListenerPanel;

public class PROZORNoviZaposleni extends JFrame {

public PROZORNoviZaposleni() {

	JDialog dijalogZaposleni;
	 
	JFrame frameZaposleni = new JFrame();
	dijalogZaposleni = new JDialog(frameZaposleni, "Zaposleni", true); 
	dijalogZaposleni.setSize(500,500);
	setLocationRelativeTo(null);
	
	frameZaposleni.setLayout(new FlowLayout());
	JTextField ImeNovogZaposlenog = new JTextField(10);
	JTextField PrezimeNovogZaposlenog = new JTextField(10);
	JTextField JMBGNovogZaposlenog = new JTextField(10);
	JTextField DatumRNovogZaposlenog = new JTextField(10);
	JTextField UlicaNovogZaposlenog = new JTextField(10);
	JTextField BrojNovogZaposlenog = new JTextField(10);
	JTextField GradNovogZaposlenog = new JTextField(10);
	JTextField EmailNovogZaposlenog = new JTextField(10);
	JTextField SoftverNovogZaposlenog = new JTextField(10);
	
	JPanel myPanel = new JPanel();
	
	myPanel.add(new JLabel("Ime:"));
	myPanel.add(ImeNovogZaposlenog);
	myPanel.add(new JLabel("Prezime:"));
	myPanel.add(PrezimeNovogZaposlenog);
	myPanel.add(new JLabel("JMBG:"));
	myPanel.add(JMBGNovogZaposlenog);
	myPanel.add(new JLabel("Datum rodjenja:"));
	myPanel.add(DatumRNovogZaposlenog);
	myPanel.add(new JLabel("Ulica:"));
	myPanel.add(UlicaNovogZaposlenog);
	myPanel.add(new JLabel("Broj:"));
	myPanel.add(BrojNovogZaposlenog);
	myPanel.add(new JLabel("Grad:"));
	myPanel.add(GradNovogZaposlenog);
	myPanel.add(new JLabel("email:"));
	myPanel.add(EmailNovogZaposlenog);
	myPanel.add(new JLabel("Softver:"));
	myPanel.add(SoftverNovogZaposlenog);
	
	myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
	int result = JOptionPane.showConfirmDialog(
		    null, myPanel, "Unos novog zaposlenog", JOptionPane.OK_CANCEL_OPTION);
	//verovatno treba dodati sta ce se desiti klikom na OK i CANCEL pomocu result-a
	if (result!=JOptionPane.OK_OPTION){
		
		frameZaposleni.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	}
	else{
		frameZaposleni.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
//			JDialog dijalogZaposleni;
//	 
//	        JFrame frameZaposleni = new JFrame();  
//	        dijalogZaposleni = new JDialog(frameZaposleni, "Zaposleni", true); 
//	        dijalogZaposleni.setSize(500,500);
//	        setLocationRelativeTo(null);
//	        
//	        JPanel center = new JPanel();
//			BoxLayout boxCenter = new BoxLayout(center, BoxLayout.Y_AXIS);
//			center.setLayout(boxCenter);
//			dijalogZaposleni.add(center,BorderLayout.CENTER);
//			
//			Dimension d = new Dimension(300,30);
						
//			// Ime
//			
//			JPanel pan = new JPanel(new FlowLayout(FlowLayout.LEFT));
//	        JLabel lblIme = new JLabel("Ime:");
//	        lblIme.setPreferredSize(d);
//	        JTextField txtIme = new JTextField();
//	        txtIme.setPreferredSize(d);
//	        pan.add(lblIme);
//	        pan.add(txtIme);
//	        
//	        // Prezime
//	        
//	        JLabel lblPrezime = new JLabel("Prezime:");
//	        lblIme.setPreferredSize(d);
//	        JTextField txtPrezime = new JTextField();
//	        txtPrezime.setPreferredSize(d);
//	        pan.add(lblPrezime);
//	        pan.add(txtPrezime);
//	        
//	        // Jmbg
//	        
//	        JLabel lblJmbg = new JLabel("Jmbg:");
//	        lblIme.setPreferredSize(d);
//	        JTextField txtJmbg = new JTextField();
//	        txtPrezime.setPreferredSize(d);
//	        pan.add(lblJmbg);
//	        pan.add(txtJmbg);
//
//	        // Datum rodjenja
//	        
//	        JLabel lblDatumR = new JLabel("Datum rodjenja");
//	        lblDatumR.setPreferredSize(d);
//	        JTextField txtDatumR = new JTextField();
//	        txtDatumR.setPreferredSize(d);
//	        pan.add(lblDatumR);
//	        pan.add(txtDatumR);
//
//	        // Adresa
//	        
//	        JLabel lblAdresa = new JLabel("Adresa:");
//	        lblAdresa.setPreferredSize(d);
//	        JTextField txtAdresa = new JTextField();
//	        txtAdresa.setPreferredSize(d);
//	        pan.add(lblAdresa);
//	        pan.add(txtAdresa);
//	        
//	        // Email
//	        
//	        JLabel lblEmail = new JLabel("email:");
//	        lblEmail.setPreferredSize(d);
//	        JTextField txtEmail = new JTextField();
//	        txtEmail.setPreferredSize(d);
//	        pan.add(lblEmail);
//	        pan.add(txtEmail);
//	        
//	        // SOFTVERI
//	        // Bilo bi dobro neki vizuelni razmak u dijalogu napraviti
//	        
//	        
//	        
//	        
//	        
//	        
	        
	        
//	        dijalogZaposleni.setResizable(false);
//	        dijalogZaposleni.setVisible(true); 
			pack();
	}
}