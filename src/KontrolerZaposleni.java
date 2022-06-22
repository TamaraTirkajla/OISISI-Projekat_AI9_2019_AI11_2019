
import java.util.List;

import javax.swing.JOptionPane;


public class KontrolerZaposleni {

private static KontrolerZaposleni instance = null;
	
private  BazaZaposleni bazaZaposleni = BazaZaposleni.getInstance();

	public static KontrolerZaposleni getInstance() {
		if (instance == null) {
			instance = new KontrolerZaposleni();
		}
		return instance;
	}
	

	public void dodajZaposlenog(String ime, String prezime, String jmbg, String datumRodjenja, String email, Adresa adresaStanovanja, Softver softver, String pozicija) {
		long id = bazaZaposleni.dobaviZaposlene().size();
	    Zaposleni zaposleni = new Zaposleni( id, ime,  prezime,  jmbg,  datumRodjenja,  email,  adresaStanovanja,  softver,  pozicija);
		bazaZaposleni.dodajZaposlenog(zaposleni);
	}
	
	public void izbrisiZaposlenog (int index) {			
		int input = JOptionPane.showConfirmDialog(null,
					    "Jeste sigurni da zelite obrisati zaposlenog?", "Potvrda", 
					    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if (input == 0) {
			bazaZaposleni.izbrisiZaposlenog(index);
		}
	}
	
	public void izmeniZaposlenog(long id,String ime, String prezime, String jmbg, String datumRodjenja, String email, Adresa adresaStanovanja, Softver softver, String pozicija) {
		bazaZaposleni.izmeniZaposlenog(prezime, prezime, jmbg, datumRodjenja, email, adresaStanovanja, softver, ime, jmbg);
	}
	
	public List<Zaposleni> dobaviZaposlene (){
		return bazaZaposleni.dobaviZaposlene();
	}
}
