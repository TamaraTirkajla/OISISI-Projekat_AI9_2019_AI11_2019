import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main {

	public static void main(String[] args) {
		
		Frame1 frame1 = new Frame1();
		frame1.setVisible(true);
		
//		Zaposleni Z1 = new Zaposleni("Petar","Petrovic",225);
//		Zaposleni Z2 = new Zaposleni("Marko","Markovic",256);
//		
//		ArrayList<Zaposleni> zaposleni = new ArrayList<>();
//		zaposleni.add(Z1);
//		zaposleni.add(Z2);
//		
//		for (Zaposleni Z: zaposleni) {
//			System.out.println(Z.Ime);
//			System.out.println(Z.Prezime);
//			System.out.println(Z.Jmbg);
//		}
//	} 
}
	
class Frame1 extends JFrame {

	Frame1() {

			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int screenHeight = screenSize.height;
			int screenWidth = screenSize.width;
			// Podesavamo dimenzije prozora na polovinu dimenzija ekrana
			setSize(screenWidth / 2, screenHeight / 2);
			// Podesavamo naslov
			setTitle("Primer 1 - Java kontejneri");
			// Postavljamo akciju pri zatvaranju prozora
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// postavljamo JFrame na centar ekrana
			setLocationRelativeTo(null);

			// kreiramo jedan panel i dodajemo ga u JFrame
			JPanel panel = new JPanel();
			panel.setBackground(Color.YELLOW);
			this.add(panel);
			// kreiramo prvo dugme i dodajemo ga u panel
			JButton btn = new JButton("JButton 1");
			panel.add(btn);

			// kreiramo drugo dugme i dodajemo ga u panel
			JButton btn2 = new JButton("JButton 2");
			panel.add(btn2);
			// kreiramo trece dugme i dodajemo ga u panel
			JButton btn3 = new JButton("JButton 3");
			panel.add(btn3);
			// kreiramo cetvrto dugme i dodajemo ga u trece dugme
			JButton btn4 = new JButton("JButton 4");
			btn3.add(btn4);
			// kreiramo peto dugme i dodajemo ga u cetvrto dugme
			JRadioButton btn5 = new JRadioButton("JRadioButton");
			btn4.add(btn5);
		}

}

class Zaposleni {
	String Ime;
	String Prezime;
	int Jmbg;
	int DatumRodjenja;
	String Email;
	String AdresaStanovanja;
	String Softver;
	
	Zaposleni (String Ime, String Prezime,int Jmbg){
		this.Ime = Ime;
		this.Prezime = Prezime;
		this.Jmbg = Jmbg;
	}
}

class Adresa {
	String Grad;
	String Ulica;
	int Broj;
}

class Softver {
	String Naziv;
	String Cetkice;
	String FajlFormat;
	String Alati;
	String Render;
}

class Cetkica {
	
	String Naziv;
	String Namena;
	String Boja;
}

class Render {
	String Materijali;
	String Kamere;
	String Objekti;
	String Naziv;
}}