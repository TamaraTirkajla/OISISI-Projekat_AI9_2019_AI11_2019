import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
		
		// Kreiranje panela p
		
		JPanel p = new JPanel();
		p.setBackground(Color.WHITE); 
		p.setLayout(new BorderLayout());
		this.add(p, BorderLayout.CENTER); 

		// Dodavanje Menu Bar-a
		
		MyMenuBar menu = new MyMenuBar();
		this.setJMenuBar(menu);
		
		// Dodavanje Toolbar-a
		
		MyToolbar toolbar = new MyToolbar();
		p.add(toolbar, BorderLayout.NORTH); 

		// Kreiranje Status Bar-a sa Datumom 

		// deo koda preuzet sa sajta stackoverflow.com
		// link: https://stackoverflow.com/questions/3035880/how-can-i-create-a-bar-in-the-bottom-of-a-java-app-like-a-status-bar
		JPanel StatusBar = new JPanel();	
		StatusBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
		StatusBar.setPreferredSize(new Dimension(getWidth(), 30));
		StatusBar.setLayout(new BoxLayout(StatusBar, BoxLayout.X_AXIS));
		this.add(StatusBar, BorderLayout.SOUTH);
		String DatePattern = "dd.MM.yyyy.";
		DateFormat formatter = new SimpleDateFormat(DatePattern);
		Date Datum = new Date();
	    String DanasnjiDatum = formatter.format(Datum);
		JLabel DatumLabel = new JLabel(DanasnjiDatum);
		StatusBar.add(Box.createHorizontalGlue());
		StatusBar.add(DatumLabel);
		StatusBar.add(Box.createRigidArea(new Dimension(10,0)));
	}

}

// Kreiranje Menu Bar-a

class MyMenuBar extends JMenuBar {

	private static final long serialVersionUID = -7863806568418316202L;

	public MyMenuBar() {

		// File
		JMenu file = new JMenu("File");
		
		// New
		JMenu miNew = new JMenu("New");
		JMenuItem miZaposleni = new JMenuItem("Zaposleni");
		JMenuItem miSoftver = new JMenuItem("Softver");
		miNew.add(miZaposleni);
		miNew.addSeparator();
		miNew.add(miSoftver);

		// Open
		JMenu miOpen = new JMenu("Open");
		
		miOpen.add(miZaposleni);
		miOpen.addSeparator();
		miOpen.add(miSoftver);
		
		// Exit
		JMenuItem miExit = new JMenuItem("Exit");

		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miExit);

		// Edit
		JMenu edit = new JMenu("Edit");
		JMenuItem miEdit = new JMenuItem("Edit");
		JMenuItem miDelete = new JMenuItem("Delete");
		
		edit.add(miEdit);
		edit.addSeparator();
		edit.add(miDelete);
		
		// Help
		JMenu help = new JMenu("Help");
		JMenuItem miAbout = new JMenuItem("About");
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