
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

public class PROZORNoviSoftver extends JFrame  {

	public static PROZORNoviSoftver instance = null;
	public static PROZORNoviSoftver getInstance() {
		if (instance == null)
			instance = new PROZORNoviSoftver();

		return instance;
	}
	
    public PROZORNoviSoftver(){
	
	JDialog dijalogSoftver;  
	 
    JFrame frameSoftver = new JFrame();  
    dijalogSoftver = new JDialog(frameSoftver, "Softver", true); 
    dijalogSoftver.setSize(640,810);    
    setLocationRelativeTo(null);
    
    // UNOS PODATAKA
    
    JPanel center1 = new JPanel();
	BoxLayout boxCenter = new BoxLayout(center1, BoxLayout.Y_AXIS);
	center1.setLayout(boxCenter);
	dijalogSoftver.add(center1,BorderLayout.CENTER);
    
	Dimension d1 = new Dimension(610,20); // dimenzija kod teksta
	Dimension d2 = new Dimension(250,20); // dimenzija kod selekcije
	
	JPanel pan1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	// Naziv sofvera
	
	JLabel lblNazivSoftvera = new JLabel("Naziv Softvera:");
	lblNazivSoftvera.setPreferredSize(d1);
	String[] NazivSoftvera= {"3dsMax","ZBrush","Blender","Photoshop"};
    JComboBox<String> cbNazivSoftvera = new JComboBox<String>(NazivSoftvera);
    cbNazivSoftvera.setVisible(true);
    cbNazivSoftvera.setPreferredSize(d2);
	pan1.add(lblNazivSoftvera);
	pan1.add(cbNazivSoftvera);
    
    // Cetkica
	
	JLabel lblNazivCet=new JLabel("Naziv cetkice:");
    lblNazivCet.setPreferredSize(d1);
    String[] NazivCet= {"Standard","Deform","Move","Smooth"};
    JComboBox<String> cbNazivCet = new JComboBox<String>(NazivCet);
    cbNazivCet.setVisible(true);
    cbNazivCet.setPreferredSize(d2);
    pan1.add(lblNazivCet);
	pan1.add(cbNazivCet);
    
	JLabel lblNamenaCet=new JLabel("Namena cetkice:");
    lblNamenaCet.setPreferredSize(d1);
    JTextField txtNamenaCet=new JTextField();
    txtNamenaCet.setPreferredSize(d1);
    txtNamenaCet.addKeyListener(new KeyListener() {
		
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
    pan1.add(lblNamenaCet);
	pan1.add(txtNamenaCet);
	
	JLabel lblBojaCet=new JLabel("Boja cetkice:");
    lblBojaCet.setPreferredSize(d1);
    JColorChooser BojaCet = new JColorChooser();
    pan1.add(lblBojaCet);
	pan1.add(BojaCet);
	
	// Fajl format
	
	JLabel lblFajlFormat=new JLabel("Fajl format:");
    lblFajlFormat.setPreferredSize(d2);
    String[] FajlFormat= {".max",".fbx",".obj",".psd",".jpg",".png"};
    JComboBox<String> cbFajlFormat = new JComboBox<String>(FajlFormat);
    cbFajlFormat.setVisible(true);
    cbFajlFormat.setPreferredSize(d2);
    pan1.add(lblFajlFormat);
	pan1.add(cbFajlFormat);
	
	// Alati
	
	JLabel lblAlati=new JLabel("Alati:");
	lblAlati.setPreferredSize(d2);
	String[] Alati = {"Mirror","Cut","Move","Clone"};
    JComboBox<String> cbAlati = new JComboBox<String>(Alati);
    cbAlati.setVisible(true);
    cbAlati.setPreferredSize(d2);
	pan1.add(lblAlati);
	pan1.add(cbAlati);
    
	 // Modifikator
	
	JLabel lblModifikator=new JLabel("Modifikator:");
	lblModifikator.setPreferredSize(d2);
	String[] Modifikator = {"Bend","Chamfer","Lattice","Melt","Displace","FFD","HSDS","Ripple"};
    JComboBox<String> cbModifikator = new JComboBox<String>(Modifikator);
    cbModifikator.setVisible(true);
    cbModifikator.setPreferredSize(d2);
	pan1.add(lblModifikator);
	pan1.add(cbModifikator);
	
    // Render
	
	JLabel lblMaterijali=new JLabel("Materijal:");
	lblMaterijali.setPreferredSize(d1);
	JTextField txtMaterijali=new JTextField();
	txtMaterijali.setPreferredSize(d1);
	txtMaterijali.addKeyListener(new KeyListener() {
		
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
	
	pan1.add(lblMaterijali);
	pan1.add(txtMaterijali);
	
	JLabel lblKamera=new JLabel("Kamera:");
	lblKamera.setPreferredSize(d2);
	String[] Kamera= {"Top","Front","Left","Perspektiva"};
    JComboBox<String> cbKamera = new JComboBox<String>(Kamera);
    cbKamera.setVisible(true);
    cbKamera.setPreferredSize(d2);
    pan1.add(lblKamera);
	pan1.add(cbKamera);
	
	JLabel lblObjekti=new JLabel("Objekti:");
	lblObjekti.setPreferredSize(d1);
	JTextField txtObjekti=new JTextField();
	txtObjekti.setPreferredSize(d1);
	txtObjekti.addKeyListener(new KeyListener() {
		
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
	pan1.add(lblObjekti);
	pan1.add(txtObjekti);

	JLabel lblSvetlo=new JLabel("Svetlo:");
    lblSvetlo.setPreferredSize(d2);
    String[] Svetlo= {"Plane light","Disc light","Sphere light","Mesh light", "Dome light"};
    JComboBox<String> cbSvetlo = new JComboBox<String>(Svetlo);
    cbSvetlo.setVisible(true);
    cbSvetlo.setPreferredSize(d2);
    
    pan1.add(lblSvetlo);
	pan1.add(cbSvetlo);
    	
	center1.add(pan1);
	
	// Dugmici
	
	JPanel bottom1=new JPanel();
	BoxLayout box1=new BoxLayout(bottom1, BoxLayout.X_AXIS); 
	bottom1.setLayout(box1);
	dijalogSoftver.add(bottom1,BorderLayout.PAGE_END);
		
	// Ok
		
	JButton btnOk1=new JButton("Ok");
	btnOk1.setPreferredSize(new Dimension(90,30));
	bottom1.add(Box.createGlue());
	bottom1.add(btnOk1);
		
	// Cancel
		
	JButton btnCancel1 = new JButton("Cancel");
	btnCancel1.setPreferredSize(new Dimension(90,30));
	bottom1.add(Box.createGlue());
	bottom1.add(btnCancel1);
	btnCancel1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent arg0) {
        	dijalogSoftver.dispatchEvent(new WindowEvent(frameSoftver, WindowEvent.WINDOW_CLOSING)); }
    });
		
	bottom1.add(Box.createRigidArea(new Dimension(150,40)));
	
	dijalogSoftver.setResizable(false);
	dijalogSoftver.setVisible(true); 
	pack();
	
}
}