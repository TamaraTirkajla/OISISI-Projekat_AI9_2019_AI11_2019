
import java.time.LocalDate;

public class Zaposleni {
	private long Id;
	private String Ime;
	private String Prezime;
	private String Jmbg;
	private String DatumRodjenja;
	private String Email;
	private Adresa AdresaStanovanja;
	private Softver Softver;
	private String Pozicija;
		
	// Seteri
	
	public void setId(long id) {		//NOVO
	this.Id = id;
	}
	public void setIme(String ime) {
	this.Ime = ime;
	}
	public void setPrezime(String prezime) {
	this.Prezime = prezime;
	}
	public void setJmbg(String jmbg) {
	this.Jmbg = jmbg;
	}	
	public void setDatumRodjenja(String datumRodjenja) {
	this.DatumRodjenja = datumRodjenja;
	}
	public void setEmail(String email) {
	this.Email = email;
	}
	public void setAdresaSanovanja(Adresa adresaStanovanja) {
	this.AdresaStanovanja = adresaStanovanja;
	}
	public void setSoftver(Softver softver) {
	this.Softver = softver;
	}
	public void setPozicija(String pozicija) {
	this.Pozicija = pozicija;
	}
	
	// Geteri
	
	public long getId() {
	return Id;
	}
	public String getIme() {
	return Ime;
	}
	public String getPrezime() {
	return Prezime;
	}
	public String getJmbg() {
	return Jmbg;
	}
	public String getDatumRodjenja() {
	return DatumRodjenja;
	}
	public String getEmail() {
	return Email;
	}
	public Adresa getAdresaStanovanja() {
	return AdresaStanovanja;
	}
	public Softver getSoftver() {
	return Softver;
	}
	public String getPozicija() {
	return Pozicija;
	}
	
	// Zaposleni
	
	public Zaposleni(long id,String ime, String prezime, String jmbg, String datumRodjenja, String email, Adresa adresaStanovanja, Softver softver, String pozicija) {
	super();
	this.Id = id;
	this.Ime = ime;
	this.Prezime = prezime;
	this.Jmbg = jmbg;
	this.DatumRodjenja = datumRodjenja;
	this.Email = email;
	this.AdresaStanovanja = adresaStanovanja;
	this.Softver = softver;
	this.Pozicija = pozicija;
	}
}