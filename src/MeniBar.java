import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MeniBar extends JMenuBar{

	public MeniBar() {
		//deo koda uradjen po ugledu sa vezbi - Termin3
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
		miZaposleni.addActionListener(new ActionListener() {
			
			// referenca za metode setSelectedIndex() i getSelectedIndex()
			//https://stackoverflow.com/questions/4157293/how-to-switch-tabs-in-jtabbedpane-by-clicking-a-button
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = GlavniFrame.getInstance().getTab().getSelectedIndex();
				if (i == 1) {
					GlavniFrame.getInstance().getTab().setSelectedIndex(0);
				}
				
			}
		});
		
		JMenuItem miSoftver = new JMenuItem("Softver", new ImageIcon ("ikonice/menubar_softveri_25.png"));
		miSoftver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = GlavniFrame.getInstance().getTab().getSelectedIndex();
				if (i == 0) {
					GlavniFrame.getInstance().getTab().setSelectedIndex(1);
				}
				
			}
		});
		
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
		//Akcija koja se izvrsi klikom na opciju About
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
		        + "svetu, a inzenjeri obrazovani na ovom Fakultetu, rade i postizu zapazene rezultate"  + "\n"
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
		        + "za resavanje konkretnih poslovnih problema. Fakultet je prvi u bivsoj Jugoslaviji,"  + "\n"
		        + "2000. godine sertifikovao sistem kvaliteta prema medjunarodnom standardu ISO"  + "\n"
		        + "kod Saveznog zavoda za standardizaciju i kod Medjunarodne sertifikacione organizacije"  + "\n"
		        + "RWTZV iz Esena."  + "\n";
		    
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