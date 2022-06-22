import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class GlavniFrame extends JFrame{

	public static GlavniFrame instance = null;
	public KontrolerSoftver kontrolerSoftver = KontrolerSoftver.getInstance();
	public KontrolerZaposleni kontrolerZaposleni = KontrolerZaposleni.getInstance();
	JTabbedPane tabs;
	
	public GlavniFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(3*screenWidth / 4, 3*screenHeight / 4); // Dimenzije prozora
		setTitle("Glavni prozor"); // Naslov prozora
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Akcija pri zatvaranju prozora
		setLocationRelativeTo(null); // PostavljenJFrame na centar ekrana
		
		// dodajemo Window Listener da bi se prikazao opcioni dijalog pri izlasku iz aplikacije
		addWindowListener(new WListener());
		
		// Kreiranje panela p
		
		JPanel p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY); 
		p.setLayout(new BorderLayout());
		this.add(p, BorderLayout.CENTER); 

		// Dodavanje Menu Bar-a
		
		MeniBar menu = new MeniBar();
		this.setJMenuBar(menu);
			
		// Dodavanje Toolbar-a
		
		ToolBar toolbar = new ToolBar();
		toolbar.setBackground(Color.WHITE);
		this.add(toolbar, BorderLayout.NORTH); 
		
		// Kreiranje Status Bar-a sa Datumom 

		// deo koda preuzet sa sajta stackoverflow.com
		// link: https://stackoverflow.com/questions/3035880/how-can-i-create-a-bar-in-the-bottom-of-a-java-app-like-a-status-bar
		JPanel StatusBar = new JPanel();	
		StatusBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
		StatusBar.setPreferredSize(new Dimension(getWidth(), 30));
		StatusBar.setLayout(new BoxLayout(StatusBar, BoxLayout.X_AXIS));
		StatusBar.setBackground(Color.LIGHT_GRAY);
		this.add(StatusBar, BorderLayout.SOUTH);
		String DatePattern = "dd.MM.yyyy.";
		DateFormat formatter = new SimpleDateFormat(DatePattern);
		Date Datum = new Date();
	    String DanasnjiDatum = formatter.format(Datum);
		JLabel DatumLabel = new JLabel(DanasnjiDatum);
		StatusBar.add(Box.createHorizontalGlue());
		StatusBar.add(DatumLabel);
		StatusBar.add(Box.createRigidArea(new Dimension(10,0)));
		
		// Tabovi
		
		tabs = new JTabbedPane();
		tabs.setBackground(Color.WHITE);

		// ASISTENT KAZE DA JE LAKSE POPUNITI TABOVE SA PANELIMA NEGO SA TABELOM			

		// Tab zaposleni
		
		
		String[] koloneZ = {"Ime:", 
				"Prezime:",
				"Jmbg:",
				"Datum rodjenja:",
				"Adresa:",
				"Email:",
				"Softveri:",
				"Pozicija:"
				};
		

		List<Zaposleni> zaposleni = kontrolerZaposleni.dobaviZaposlene();
		
		DefaultTableModel modelZaposleni = new DefaultTableModel(koloneZ, 0);
		for (Zaposleni zaposlen : zaposleni) {
			modelZaposleni.addRow( new String[] {zaposlen.getIme(), zaposlen.getPrezime(), zaposlen.getJmbg(), zaposlen.getDatumRodjenja(), zaposlen.getAdresaStanovanjaFull(), zaposlen.getEmail(), zaposlen.getSoftver().getNazivSoft(),zaposlen.getPozicija()});
		}

		
		JTable TabelaZaposleni = new JTable() {
	        
	        public boolean isCellEditable(int row, int column) {    
	        	return false;               
	        };
	    };
	    TabelaZaposleni.setModel(modelZaposleni);
	    JScrollPane scrollPZaposleni = new JScrollPane(TabelaZaposleni);
	    
		tabs.addTab("Zaposleni", scrollPZaposleni);
		p.add(tabs, BorderLayout.CENTER);
				
		// Tab softveri
		
		String[] redoviS = {"Naziv Softvera:", 
				"Naziv, namena i boja cetkice:",
				"Fajl format:",
				"Alati:",
				"Modifikatori:",
				"Materijal, kamera, objekti i svetlo:"
				};
		
		List<Softver> softveri = kontrolerSoftver.dobaviSoftvere();
		
		DefaultTableModel modelSoftver = new DefaultTableModel(redoviS, 0);
		for (Softver softver : softveri) {
			modelSoftver.addRow( new String[] {softver.getNazivSoft(), softver.dobaviNaziveCetkica(), softver.getFajlFormat(), softver.dobaviNaziveAlata(), softver.getModifikator(), softver.getRender().getNaziv()});
		}
		JTable TabelaSoftver = new JTable() {
	        
	        public boolean isCellEditable(int row, int column) {    
	        	return false;               
	        };
	    };
	    TabelaSoftver.setModel(modelSoftver);
	    JScrollPane scrollPSoftver = new JScrollPane(TabelaSoftver);
		tabs.addTab("Sofver", scrollPSoftver);
		p.add(tabs, BorderLayout.CENTER);
	}

	public static GlavniFrame getInstance() {
		// TODO Auto-generated method stub
			if(instance==null) {
			
				instance = new GlavniFrame();
			}
			return instance;
			}

	public JTabbedPane getTab() {
		return tabs;
	}
}