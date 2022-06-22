
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class PROZORNoviZaposleni extends JFrame {

	public static PROZORNoviZaposleni instance = null;
	public static PROZORNoviZaposleni getInstance() {
		if (instance == null)
			instance = new PROZORNoviZaposleni();

		return instance;
	}
	
public PROZORNoviZaposleni() {

	JDialog dijalogZaposleni;  
	 
    JFrame frameZaposleni = new JFrame();  
    dijalogZaposleni = new JDialog(frameZaposleni, "Novi zaposleni", true); 
    dijalogZaposleni.setSize(640,590);    
    setLocationRelativeTo(null);
    
    // UNOS PODATAKA
    
    JPanel center2 = new JPanel();
	BoxLayout boxCenter2 = new BoxLayout(center2, BoxLayout.Y_AXIS);
	center2.setLayout(boxCenter2);
	dijalogZaposleni.add(center2,BorderLayout.CENTER);
    
	Dimension d3 = new Dimension(610,20); // dimenzija kod teksta
	Dimension d4 = new Dimension(250,20); // dimenzija kod selekcije
	
	JPanel pan2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	// Ime korisnika
	
	JLabel lblIme=new JLabel("Ime:");
    lblIme.setPreferredSize(d3);
    JTextField txtIme=new JTextField();
    txtIme.setPreferredSize(d3);
    //delovi sa KeyListener-ima su uradjeni po primeru sa vezbi - Termin 4
    txtIme.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub	
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			JTextField txt = (JTextField) e.getComponent();
    		String str = txt.getText();
    		System.out.println(str);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub	
		}
	});
    pan2.add(lblIme);
	pan2.add(txtIme);
	    
	// Prezime korisnika
	
	JLabel lblPrezime=new JLabel("Prezime:");
	lblIme.setPreferredSize(d3);
	JTextField txtPrezime=new JTextField();
	txtPrezime.setPreferredSize(d3);
	txtPrezime.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			JTextField txt = (JTextField) e.getComponent();
    		String str = txt.getText();
    		System.out.println(str);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	});
	
	pan2.add(lblPrezime);
	pan2.add(txtPrezime);
	
	// Jmbg
	
	JLabel lblJmbg=new JLabel("Jmbg:");
	lblJmbg.setPreferredSize(d3);
	JTextField txtJmbg=new JTextField();
	txtJmbg.setPreferredSize(d3);
	KeyListener KListenerJMBG=new KListenerJMBG();
	txtJmbg.addKeyListener(KListenerJMBG);
	pan2.add(lblJmbg);
	pan2.add(txtJmbg);
	
	// Datum rodjenja
	
	JLabel lblDatumRodjenja=new JLabel("Datum rodjenja:");
	lblDatumRodjenja.setPreferredSize(d3);
	JTextField txtDatumRodjenja=new JTextField();
	txtDatumRodjenja.setPreferredSize(d3);
	KeyListener KListenerDatum=new KListenerDatum();
	txtDatumRodjenja.addKeyListener(KListenerDatum);	
	pan2.add(lblDatumRodjenja);
	pan2.add(txtDatumRodjenja);
	
	// Ulica
	
	JLabel lblUlica=new JLabel("Ulica:");
	lblUlica.setPreferredSize(d3);
	JTextField txtUlica=new JTextField();
	txtUlica.setPreferredSize(new Dimension(300,20));
	txtUlica.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			JTextField txt = (JTextField) e.getComponent();
    		String str = txt.getText();
    		System.out.println(str);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	});
	
	pan2.add(lblUlica);
	pan2.add(txtUlica);	
	
	// Broj
	
	JLabel lblBroj=new JLabel("Broj:");
	lblBroj.setPreferredSize(d3);
	JTextField txtBroj=new JTextField();
	txtBroj.setPreferredSize(new Dimension(50,20));
	txtBroj.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			JTextField txt = (JTextField) e.getComponent();
    		String str = txt.getText();
    		System.out.println(str);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	});
	
	pan2.add(lblBroj);
	pan2.add(txtBroj);	
	
	// Grad
	
	JLabel lblGrad=new JLabel("Grad:");
	lblGrad.setPreferredSize(d3);
	JTextField txtGrad=new JTextField();
	txtGrad.setPreferredSize(new Dimension(135,20));
	txtGrad.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			JTextField txt = (JTextField) e.getComponent();
    		String str = txt.getText();
    		System.out.println(str);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	});
	
	pan2.add(lblGrad);
	pan2.add(txtGrad);	
	
	// Email
		
	JLabel lblEmail=new JLabel("Email:");
	lblEmail.setPreferredSize(d3);
	JTextField txtEmail=new JTextField();
	txtEmail.setPreferredSize(d3);
	txtEmail.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			JTextField txt = (JTextField) e.getComponent();
    		String str = txt.getText();
    		System.out.println(str);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	});
	
	pan2.add(lblEmail);
	pan2.add(txtEmail);
		
	// Sofver
	
	JLabel lblSoftveri = new JLabel("Softveri:");
	lblSoftveri.setPreferredSize(d3);
	JCheckBox check1 = new JCheckBox("3dsMax"),
	check2 = new JCheckBox("ZBrush"),
    check3 = new JCheckBox("Blender"),
    check4 = new JCheckBox("Photoshop");
	pan2.add(lblSoftveri);
	pan2.add(check1);
	pan2.add(check2);
	pan2.add(check3);
	pan2.add(check4);	
	
	
/*
 JLabel lblSoftveri=new JLabel("Softveri:");
	lblSoftveri.setPreferredSize(d3);
	String[] Softveri= {"3dsMax","ZBrush","Blender","Photoshop"};
    JComboBox<String> cbSoftveri = new JComboBox<String>(Pozicija);
    cbSoftveri.setVisible(true);
    cbSoftveri.setPreferredSize(d4);
    pan2.add(lblSoftveri);
	pan2.add(cbSoftveri);
 */
	
	// Pozicija
	
	JLabel lblPozicija=new JLabel("Pozicija:");
	lblPozicija.setPreferredSize(d3);
	String[] Pozicija= {"Modelator","Riger","Animator","Ilustrator"};
    JComboBox<String> cbPozicija = new JComboBox<String>(Pozicija);
    cbPozicija.setVisible(true);
    cbPozicija.setPreferredSize(d4);
    pan2.add(lblPozicija);
	pan2.add(cbPozicija);
	
	center2.add(pan2);

	// Dugmici
	
	JPanel bottom2=new JPanel();
	BoxLayout box2=new BoxLayout(bottom2, BoxLayout.X_AXIS); 
	bottom2.setLayout(box2);
	dijalogZaposleni.add(bottom2,BorderLayout.PAGE_END);
	
	// Ok
	
	JButton btnOk2=new JButton("Ok");
	btnOk2.setPreferredSize(new Dimension(90,30));
	bottom2.add(Box.createGlue());
	bottom2.add(btnOk2);
	
	// Cancel
	
	JButton btnCancel2 = new JButton("Cancel");
	btnCancel2.setPreferredSize(new Dimension(90,30));
	bottom2.add(Box.createGlue());
	bottom2.add(btnCancel2);
	btnCancel2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	dijalogZaposleni.dispatchEvent(new WindowEvent(frameZaposleni, WindowEvent.WINDOW_CLOSING)); }
	});
		
	bottom2.add(Box.createRigidArea(new Dimension(150,40)));
		
	dijalogZaposleni.setResizable(false);
	dijalogZaposleni.setVisible(true); 
	pack();
	}
}