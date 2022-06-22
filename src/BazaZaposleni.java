
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class BazaZaposleni {

	private static BazaZaposleni instance = null;
	
	public static List<Zaposleni > listaZaposleni  = new ArrayList<Zaposleni>();

	// referenca za getInstance()
	// https://stackoverflow.com/questions/24214148/java-getinstance-vs-static
	public static BazaZaposleni getInstance() {
		if (instance == null) {
			instance = new BazaZaposleni();
			InicijalizujZaposlene();
		}
		return instance;
	}
	
	
	private static void InicijalizujZaposlene() {
		BazaSoftver bazaSoftver = BazaSoftver.getInstance();
		List<Softver> softveri = bazaSoftver.dobaviSoftvere();
		
		 Adresa adress_a = new Adresa ("Svetozara Miletica", "bb", "Conoplja");
		 Adresa adress_b= new Adresa ("Radnicka", "25", "Novi Sad");
		
		Zaposleni zaposleniA = new Zaposleni(0, "Dunja", "Spanovic", "0904000815000", "9.4.2000",
				"spanovic2000@gmail.com", adress_a, softveri.get(0), "Ilustrator");
		Zaposleni zaposleniB = new Zaposleni(1, "Tamara", "Tirkajla", "2309000815000", "23.09.2000",
				"tamara.tirkajla00@gmail.com", adress_b, softveri.get(1), "Riger");
		
         listaZaposleni.add(zaposleniA);
         listaZaposleni.add(zaposleniB); 	
         
       
	}
	
	public void izbrisiZaposlenog(long id) {
		for (Zaposleni zaposleni : listaZaposleni) {
			if (zaposleni.getId() == id) {
				listaZaposleni.remove(zaposleni);
				break;
			}
		}
	}
	
	public void dodajZaposlenog (Zaposleni zaposleni) {
		listaZaposleni.add(zaposleni);
	}
	
	public List<Zaposleni> dobaviZaposlene() {
		return listaZaposleni;
	}
	
	// referenca za for (Zaposleni zaposleni : listaZaposleni) - iterating through the array
	// https://www.programiz.com/java-programming/for-loop
	// https://www.w3schools.com/java/java_arrays_loop.asp
	public Zaposleni nadjiZaposlenogPoJmbg(String jmbg) {
		for (Zaposleni zaposleni : listaZaposleni) {
			if (zaposleni.getJmbg() == jmbg )
				return zaposleni;
		}
		return null;
	}
	
	public void izmeniZaposlenog(String ime, String prezime, String jmbg, String datumRodjenja,
			String email, Adresa adresa, Softver softver, String radnoMesto, String stariJmbg) {
		Zaposleni zaposleni = nadjiZaposlenogPoJmbg(jmbg);
		
			if (zaposleni != null) {
				zaposleni.setIme(ime);
				zaposleni.setPrezime(prezime);
				zaposleni.setJmbg(jmbg);
				zaposleni.setDatumRodjenja(datumRodjenja);
				zaposleni.setEmail(email);
				zaposleni.setAdresaSanovanja(adresa);
				zaposleni.setSoftver(softver);
				zaposleni.setPozicija(radnoMesto);
			}
		}
	
	// referenca za getValueAt
	// http://www.java2s.com/Code/JavaAPI/javax.swing/JTablegetValueAtintrowintcolumn.htm
	// https://docs.oracle.com/javase/7/docs/api/javax/swing/JTable.html
	public Object getValueAt(int row, int column) {
		Zaposleni zaposleni;
		zaposleni = listaZaposleni.get(row);
		switch (column) {
		case 0:
			return zaposleni.getIme();
		case 1:
			return zaposleni.getPrezime();
		case 2:
			return zaposleni.getJmbg();
		case 3:
			return zaposleni.getDatumRodjenja();
		case 4:
			return zaposleni.getEmail();
		case 5:
			return zaposleni.getAdresaStanovanja().toString();
		case 6:
			return zaposleni.getSoftver().getNazivSoft();
		case 7:
			return zaposleni.getPozicija();
		default:
		return null;
	
		}
	}
}