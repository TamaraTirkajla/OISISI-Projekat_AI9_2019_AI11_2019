import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JTextArea;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Projekat {

	public static void main (String[] args) {
		
		Frame PROZOR = new Frame();
		PROZOR.setVisible(true);
	} 
}

// Deo koda preuzet iz materijala sa vezbi - Termin 3
class Frame extends JFrame {

	private static final long serialVersionUID = -7240939624608584060L;

	public Frame() {

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
		
		MyMenuBar menu = new MyMenuBar();
		this.setJMenuBar(menu);
			
		// Dodavanje Toolbar-a
		
		MyToolbar toolbar = new MyToolbar();
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
		
		JTabbedPane tabs = new JTabbedPane();
		tabs.setBackground(Color.WHITE);
			
		
		/*MOZDA JE BOLJE OVO RESITI SA PANELOM A NE TABELOM
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
				"Naziv cetkice:",
				"Namena cetkice:",
				"Boja cetkice:",
				"Fajl format:",
				"Alati:",
				"Modifikatori:",
				"Materijal:",
				"Kamera:",
				"Objekti:",
				"Svetlo:"
				};
		Object[][] podaciS = {
				{"ZBrush", 
				"Standard",
				"Dodavanje mase",
				"Lilava",
				".max",
				"Cut",
				"Bend",
				"Staklo",
				"Top",
				"prozor2",
				"Plane light"
				},
				{"PhotoShop", 
				"Deform",
				"Iscrtavanje",
				"Crna",
				".psd",
				"Mirror",
				"Chamfer",
				"Staklo",
				"Front",
				"glava1",
				"Disc light"
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
	*/

}}

// Kreiranje Menu Bar-a

class MyMenuBar extends JMenuBar {

	private static final long serialVersionUID = -7863806568418316202L;

	public MyMenuBar() {

		// File
		JMenu file = new JMenu("File");
		
		// New
		JMenu miNew = new JMenu("New");
		miNew.setIcon(new ImageIcon("ikonice/toolbar_new25.png"));
		
		JMenuItem miNoviZaposleni = new JMenuItem("Zaposleni", new ImageIcon ("ikonice/menubar_zaposleni_25.png"));
		miNoviZaposleni.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PROZORNoviZaposleni PROZORZaposleni = new PROZORNoviZaposleni();
				
			}
		});
		JMenuItem miNoviSoftver = new JMenuItem("Softver", new ImageIcon ("ikonice/menubar_softveri_25.png"));
		miNoviSoftver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PROZORNoviSoftver PROZORSoftver = new PROZORNoviSoftver();
				
			}
		});
		miNew.add(miNoviZaposleni);
		miNew.addSeparator();
		miNew.add(miNoviSoftver);

		// Open
		JMenu miOpen = new JMenu("Open");
		miOpen.setIcon(new ImageIcon("ikonice/menubar_open_25.png"));
		
		JMenuItem miZaposleni = new JMenuItem("Zaposleni", new ImageIcon ("ikonice/menubar_zaposleni_25.png"));
		JMenuItem miSoftver = new JMenuItem("Softver", new ImageIcon ("ikonice/menubar_softveri_25.png"));
		miOpen.add(miZaposleni);
		miOpen.addSeparator();
		miOpen.add(miSoftver);
		
		// Exit
		JMenuItem miExit = new JMenuItem("Exit", new ImageIcon("ikonice/menubar_exit_25.png"));
		miExit.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
		}
		});

		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miExit);

		// Edit
		JMenu edit = new JMenu("Edit");
		JMenuItem miEdit = new JMenuItem("Edit", new ImageIcon("ikonice/toolbar_edit25.png"));
		JMenuItem miDelete = new JMenuItem("Delete", new ImageIcon("ikonice/toolbar_delete25.png"));
		
		edit.add(miEdit);
		edit.addSeparator();
		edit.add(miDelete);
		
		// Help
		JMenu help = new JMenu("Help");
		JMenuItem miAbout = new JMenuItem("About",new ImageIcon("ikonice/menubar_about_25.png"));
		miAbout.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			
			// kod preuzet sa sajta
			//https://www.sanfoundry.com/java-program-display-some-text-frame-help-label/
			//http://www.java2s.com/Tutorials/Java/Swing_How_to/JTextArea/Add_text_to_JTextArea.htm
			JFrame frameAbout = new JFrame("About");
		
			frameAbout.setLayout(new FlowLayout());
		    String text = "Fakultet tehnickih nauka je jedna od najsavremenije organizovanih visokoobrazovnih"  + "\n" 
		        + "institucija u regionu sa tradicijom dugom preko sest decenija, poznat i priznat u celom"  + "\n"
		        + "svetu, a inzenjeri obrazovani na ovom Fakultetu, rade i postižu zapazene rezultate"  + "\n"
		        + "u svakom preduzecu koje ima veze sa tehnologijom, proizvodnjom ili obrazovanjem,"  + "\n"
		        + "jer od svih zanimanja koja se u nasoj zemlji obrazuju, tehnika je i dalje najtrazenija."  + "\n"
		       
				+ "\n" 
		        
		        + "Fakultet je osnovan 18. maja 1960. godine kao Masinski fakultet. Snazan razvoj privrede"  + "\n"
		        + "i potrebe drustva doprinele su pokretanju novih struka elektrotehnike i gradjevinarstva,"  + "\n"
		        + "tako da je 1974. godine Masinski fakultet prerastao u Fakultet tehnickih nauka."  + "\n"
		        
				+ "\n" 
				
		        + "Fakultet tehnickih nauka je u 2007. godini akreditovan za obavljanje naucne delatnosti,"  + "\n"
		        + "reakreditovan 2010. godine. Maja 2008. godine je medju prvima u Srbiji akreditovan i kao"  + "\n"
		        + "visokoskolska ustanova za obavljanje nastavne delatnosti."  + "\n"
		        
		        + "\n" 
		        
		        + "Danas je akreditovano ukupno 85 studijskih programa svih nivoa, koji pokrivaju"  + "\n"
		        + "tehnicko-tehnolosko polje, prirodno-matematicko polje, umetnicko polje i medicinsko polje"  + "\n"
		        + "kroz interdisciplinarne studije. Svi studijski programi osnovnih, master i doktorskih"  + "\n"
		        + "akademskih studija su akreditovani za izvodjenje nastave na engleskom jeziku."  + "\n"

		        + "\n" 
		        
		        + "Prvi je na ovim prostorima, 2004. godine, pre potpisivanja Bolonjske deklaracije,"  + "\n"
		        + "poceo sa izdavanjem dodatka diplomi koji je nakon toga usvojen kao model za izdavanje"  + "\n"
		        + "na Univerzitetu u Novom Sadu, a na preporuku Ministarstva prosvete i sporta Republike"  + "\n"
		        + "Srbije i na ostalim Univerzitetima u zemlji. Od 2006. godine i master diploma se izdaje"  + "\n"
		        + "na srpskom i engleskom jeziku sto je u velikoj meri olaksalo prohodnost i zaposljavanje"  + "\n"
		        + "nasih studenata u Evropi i svetu."  + "\n"

		        + "\n" 
		        
		        + "Stalne inovacije nastavnog procesa imaju za rezultat visoku spremnost nasih inzenjera"  + "\n"
		        + "za resavanje konkretnih poslovnih problema. Fakultet je prvi u bivšoj Jugoslaviji,"  + "\n"
		        + "2000. godine sertifikovao sistem kvaliteta prema medjunarodnom standardu ISO"  + "\n"
		        + "kod Saveznog zavoda za standardizaciju i kod Medjunarodne sertifikacione organizacije"  + "\n"
		        + "RWTÜV iz Esena."  + "\n";
		    
		    JTextArea textAreal = new JTextArea(text, 5, 10);
		    textAreal.setPreferredSize(new Dimension(500, 500));
		    textAreal.setEditable(false);
		    
		    textAreal.setLineWrap(true);
		    frameAbout.add(textAreal);
		    frameAbout.pack();
		    frameAbout.setVisible(true);
		    frameAbout.setResizable(false);
		}});
		
		help.add(miAbout);
			
		add(file);
		add(edit);
		add(help);
	}
}

// Kreiranje Toolbar-a

class MyToolbar extends JToolBar {

	private static final long serialVersionUID = 1209699209668701828L;

	public MyToolbar() {
		
		super(SwingConstants.HORIZONTAL);
		JButton btnNew = new JButton();
		btnNew.setToolTipText("New");
		btnNew.setIcon(new ImageIcon("ikonice/toolbar_new25.png"));
		add(btnNew);

		addSeparator();

		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Edit");
		btnOpen.setIcon(new ImageIcon("ikonice/toolbar_edit25.png"));
		add(btnOpen);

		addSeparator();

		JToggleButton tglBtnBold = new JToggleButton();
		tglBtnBold.setToolTipText("Delete");
		tglBtnBold.setIcon(new ImageIcon("ikonice/toolbar_delete25.png"));
		add(tglBtnBold);

		setFloatable(true);
		setBackground(new Color(255, 255, 200));
	}
}