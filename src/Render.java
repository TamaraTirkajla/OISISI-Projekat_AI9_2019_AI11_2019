
public class Render {
	private String Materijali;
	private String Kamera;
	private String Objekti;
	private String NazivRend;
		
	// Seteri
	
	public void setMaterijali(String materijali) {
	this.Materijali = materijali;
	}
	public void setKamera(String kamera) {
	this.Kamera = kamera;
	}
	public void setObjekti(String objekti) {
	this.Objekti = objekti;
	}
	public void setNazivRend(String nazivRend) {
	this.Kamera = nazivRend;
	}
	
	// Geteri
	
	public String getMaterijali() {
	return Materijali;
	}
	public String getKamera() {
	return Kamera;
	}
	public String getObjekti() {
	return Objekti;
	}
	public String getNazivRend() {
	return NazivRend;
	}
	
	// Render
	
	public Render(String materijali, String kamera, String objekti, String nazivRend) {
	this.Materijali = materijali;
	this.Kamera = kamera;
	this.Objekti = objekti;
	this.NazivRend = nazivRend;
	}
	
	@Override
	public String toString() {
	return Materijali + "," + Kamera + "," + Objekti + "," + Kamera ;
	}
}