
import java.time.LocalDate;

public class Zaposleni {
	private String Ime;
	private String Prezime;
	private String Jmbg;
	private LocalDate DatumRodjenja;
	private String Email;
	private Adresa AdresaStanovanja;
	private Softver Softver;
	private String Pozicija;
		
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
	public void setPozicija(String pozicija) {
	this.Pozicija = pozicija;
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
	public String getPozicija() {
	return Pozicija;
	}
	
	// Zaposleni
	
	public Zaposleni(String ime, String prezime, String jmbg, LocalDate datumRodjenja, String email, Adresa adresaStanovanja, Softver softver, String pozicija) {
	this.Ime = ime;
	this.Prezime = prezime;
	this.Jmbg = jmbg;
	this.DatumRodjenja = datumRodjenja;
	this.Email = email;
	this.AdresaStanovanja = adresaStanovanja;
	this.Softver = softver;
	this.Pozicija = pozicija;
	}
	
	@Override
    public String toString() {
        return "\nIme: "+this.Ime+"\nPrezime:"+this.Prezime+"\nJmbg: "+this.Jmbg+"\nDatum rodjenja:"+
        this.DatumRodjenja+"\nEmail: "+this.Email+"\nAdresa stanovanja: "+this.AdresaStanovanja+"\nSoftver: "+this.Softver+"\nPozicija: "+this.Pozicija;
    }
}