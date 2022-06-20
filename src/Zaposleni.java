
import java.time.LocalDate;

public class Zaposleni {
	private String Ime;
	private String Prezime;
	private String Jmbg;
	private LocalDate DatumRodjenja;
	private String Email;
	private Adresa AdresaStanovanja;
	private Softver Softver;
		
	// Seteri
	
	public void setIme(String ime) {
	this.Ime = ime;
	}
	public void setPrezime(String prezime) {
	this.Prezime = prezime;
	}
	public void setJmbg(String jmbg) {
	this.Jmbg = jmbg;
	}	
	public void setDatumRodjenja(LocalDate datumRodjenja) {
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
	
	// Geteri
	
	public String getIme() {
	return Ime;
	}
	public String getPrezime() {
	return Prezime;
	}
	public String getJmbg() {
	return Jmbg;
	}
	public LocalDate getDatumRodjenja() {
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
	
	// Zaposleni
	
	public Zaposleni(String ime, String prezime, String jmbg, LocalDate datumRodjenja, String email, Adresa adresaStanovanja, Softver softver) {
	this.Ime = ime;
	this.Prezime = prezime;
	this.Jmbg = jmbg;
	this.DatumRodjenja = datumRodjenja;
	this.Email = email;
	this.AdresaStanovanja = adresaStanovanja;
	this.Softver = softver;
	}
}