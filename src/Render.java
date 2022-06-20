import java.util.List;

public class Render {
	private String Materijali;
	private List<String> Kamera;
	private String Objekti;
	private List<String> Svetlo;
		
	// Seteri
	
	public void setMaterijali(String materijali) {
	this.Materijali = materijali;
	}
	public void setKamera(List<String> kamera) {
	this.Kamera = kamera;
	}
	public void setObjekti(String objekti) {
	this.Objekti = objekti;
	}
	public void setSvetlo(List<String> svetlo) {
	this.Svetlo = Svetlo;
	}
	
	// Geteri
	
	public String getMaterijali() {
	return Materijali;
	}
	public List<String> getKamera() {
	return Kamera;
	}
	public String getObjekti() {
	return Objekti;
	}
	public List<String> getSvetlo() {
	return Svetlo;
	}
	
	// Render
	
	public Render(String materijali, List<String> kamera, String objekti, List<String> svetlo) {
	this.Materijali = materijali;
	this.Kamera = kamera;
	this.Objekti = objekti;
	this.Svetlo = svetlo;
	}
	
	/*
	@Override
	public String toString() {
	return "\nMaterijali:"+this.Materijali+"\nKamera:"+this.Kamera+"\nObjekti: "+this.Objekti+"\nNaziv rendera: "+this.NazivRend;
	}*/
}