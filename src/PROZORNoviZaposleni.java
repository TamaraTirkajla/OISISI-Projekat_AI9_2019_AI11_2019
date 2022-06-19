import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PROZORNoviZaposleni extends JFrame {

public PROZORNoviZaposleni() {
		
			JDialog dijalogZaposleni;  
	 
	        JFrame frameZaposleni = new JFrame();  
	        dijalogZaposleni = new JDialog(frameZaposleni, "Zaposleni", true); 
	        dijalogZaposleni.setSize(500,500);
	        setLocationRelativeTo(null);
	        
	        JPanel center = new JPanel();
			BoxLayout boxCenter = new BoxLayout(center, BoxLayout.Y_AXIS);
			center.setLayout(boxCenter);
			dijalogZaposleni.add(center,BorderLayout.CENTER);
			
			Dimension d = new Dimension(300,30);
						
			// Ime
			
			JPanel pan = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JLabel lblIme = new JLabel("Ime:");
	        lblIme.setPreferredSize(d);
	        JTextField txtIme = new JTextField();
	        txtIme.setPreferredSize(d);
	        pan.add(lblIme);
	        pan.add(txtIme);
	        
	        // Prezime
	        
	        JLabel lblPrezime = new JLabel("Prezime:");
	        lblIme.setPreferredSize(d);
	        JTextField txtPrezime = new JTextField();
	        txtPrezime.setPreferredSize(d);
	        pan.add(lblPrezime);
	        pan.add(txtPrezime);
	        
	        // Jmbg
	        
	        JLabel lblJmbg = new JLabel("Jmbg:");
	        lblIme.setPreferredSize(d);
	        JTextField txtJmbg = new JTextField();
	        txtPrezime.setPreferredSize(d);
	        pan.add(lblJmbg);
	        pan.add(txtJmbg);

	        // Datum rodjenja
	        
	        JLabel lblDatumR = new JLabel("Datum rodjenja");
	        lblDatumR.setPreferredSize(d);
	        JTextField txtDatumR = new JTextField();
	        txtDatumR.setPreferredSize(d);
	        pan.add(lblDatumR);
	        pan.add(txtDatumR);

	        // Adresa
	        
	        JLabel lblAdresa = new JLabel("Adresa:");
	        lblAdresa.setPreferredSize(d);
	        JTextField txtAdresa = new JTextField();
	        txtAdresa.setPreferredSize(d);
	        pan.add(lblAdresa);
	        pan.add(txtAdresa);
	        
	        // Email
	        
	        JLabel lblEmail = new JLabel("email:");
	        lblEmail.setPreferredSize(d);
	        JTextField txtEmail = new JTextField();
	        txtEmail.setPreferredSize(d);
	        pan.add(lblEmail);
	        pan.add(txtEmail);
	        
	        // SOFTVERI
	        // Bilo bi dobro neki vizuelni razmak u dijalogu napraviti
	        
	        
	        
	        
	        
	        
	        
	        
	        dijalogZaposleni.setResizable(false);
	        dijalogZaposleni.setVisible(true); 
			pack();
	}
}