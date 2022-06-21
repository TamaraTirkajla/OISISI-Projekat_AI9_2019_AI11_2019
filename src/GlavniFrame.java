import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

public class GlavniFrame extends JFrame{

	public static GlavniFrame instance = null;
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
		Object[][] podaciZ = {
				{"Dunja", 
				"Spanovic",
				"0904000815000",
				"9.4.2000.",
				"Svetozara Miletica bb, Conoplja",
				"spanovic2000@gmail.com",
				"PhotoShop",
				"Ilustrator"
				},
				{"Tamara", 
				"Tirkajla",
				"2309000815000",
				"23.09.2000.",
				"Radnicka 25, Novi Sad", 
				"tamara.tirkajla00@gmail.com",
				"ZBrush",
				"Riger"
				}
			};
		
		JTable TabelaZaposleni = new JTable(podaciZ, koloneZ) {
	        
	        public boolean isCellEditable(int row, int column) {    
	        	return false;               
	        };
	    };
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
		Object[][] podaciS = {
				{"ZBrush", 
				"Standard, Dodavanje mase, Crvena",
				".max",
				"Cut",
				"Bend",
				"Staklo, Top, Model1, Plane light"
				},
				{"PhotoShop", 
				"Deform, Iscrtavanje, Crna",
				".psd",
				"Mirror",
				"Chamfer",
				"Staklo, Front, Model2, Disc light"
				},
				};
		
		JTable TabelaSoftver = new JTable(podaciS, redoviS) {
	        
	        public boolean isCellEditable(int row, int column) {    
	        	return false;               
	        };
	    };
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
