import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Projekat {

	public static void main (String[] args) {
		
		Frame1 frame1 = new Frame1();
		frame1.setVisible(true);
		
	} 
}

//Deo koda preuzet iz materijala sa vezbi - Termin 3
class Frame1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7240939624608584060L;

	public Frame1() {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		// Podesavamo dimenzije prozora na polovinu dimenzija ekrana
		setSize(3*screenWidth / 4, 3*screenHeight / 4);
		// Podesavamo naslov
		setTitle("Glavni prozor");
		// Postavljamo akciju pri zatvaranju prozora
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// postavljamo JFrame na centar ekrana
		setLocationRelativeTo(null);
		
		// kreiranje naslednika klase JMenuBar i njeno postavljanje u glavni prozor
		// aplikacije
		MyMenuBar menu = new MyMenuBar();
		this.setJMenuBar(menu);
		
		// kreiramo instancu klase Toolbar
		MyToolbar toolbar = new MyToolbar();
		// dodajemo u Frame nas Toolbar, klasa BorderLayout se odnosi na rad sa
		// prostorim rasporedom
		// komponenti, za sada je dovoljno znati da na ovaj nacin Toolbar se postavlja
		// na vrh glavne forme
		add(toolbar, BorderLayout.NORTH);

		// kreiramo jedan panel i dodajemo ga u JFrame
		JPanel panel = new JPanel();
		this.add(panel);
		
		//deo koda preuzet sa sajta stackoverflow.com
		//link: https://stackoverflow.com/questions/3035880/how-can-i-create-a-bar-in-the-bottom-of-a-java-app-like-a-status-bar
		
		// create the status bar panel and shove it down the bottom of the frame
		JPanel statusPanel = new JPanel();
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		add(statusPanel, BorderLayout.SOUTH);
		statusPanel.setPreferredSize(new Dimension(getWidth(), 20));
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		JLabel statusLabel = new JLabel(LocalDate.now().format(formatter));
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		statusPanel.add(statusLabel);
		
	}

}

class MyMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7863806568418316202L;

	public MyMenuBar() {

		//FILE
		JMenu file = new JMenu("File");
		
		//new
		JMenu miNew = new JMenu("New");
		JMenuItem miZaposleni = new JMenuItem("Zaposleni");
		JMenuItem miSoftver = new JMenuItem("Softver");
		miNew.add(miZaposleni);
		miNew.addSeparator();
		miNew.add(miSoftver);

		//open
		JMenu miOpen = new JMenu("Open");
		miOpen.add(miZaposleni);
		miOpen.addSeparator();
		miOpen.add(miSoftver);
		
		//exit
		JMenuItem miExit = new JMenuItem("Exit");

		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miExit);

		//EDIT
		JMenu edit = new JMenu("Edit");
		JMenuItem miEdit = new JMenuItem("Edit");
		JMenuItem miDelete = new JMenuItem("Delete");
		
		edit.add(miEdit);
		edit.addSeparator();
		edit.add(miDelete);
		
		//HELP
		JMenu help = new JMenu("Help");
		JMenuItem miAbout = new JMenuItem("About");
		help.add(miAbout);

		add(file);
		add(edit);
		add(help);

	}

}

class MyToolbar extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1209699209668701828L;

	public MyToolbar() {
		// u konstruktor nadklase, tj klase JToolbar prosledjuje
		// se orijentacija toolbar-a, moguca i sa konstantom: SwingConstants.VERTICAL

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

		// toolbar je pokretljiv, probati i sa staticnim toolbarom
		setFloatable(true);
		setBackground(new Color(255, 255, 204));

	}

}
