import java.util.List;

public class Render {
	private long id;
	private String Naziv;
	private List<String> Materijali;
	private List<String> Kamere;
	private List<String> Objekti;
	private String Svetlo;
		
	// Seteri
	
	public void setId(long id) {
	this.id = id;
	}
	public void setMaterijali(List<String> materijali) {
	this.Materijali = materijali;
	}
	public void setKamera(List<String> kamere) {
	this.Kamere = kamere;
	}
	public void setObjekti(List<String> objekti) {
	this.Objekti = objekti;
	}
	public void setSvetlo(String svetlo) {
	this.Svetlo = svetlo;
	}
	
	public void setNaziv(String naziv) {
		this.Naziv = naziv;
		}
	
	// Geteri
	
	public long getId() {
	return id;
	}
	public List<String> getMaterijali() {
	return Materijali;
	}
	public String getNaziv() {
		return Naziv;
	}
	public List<String> getKamere() {
	return Kamere;
	}
	public List<String> getObjekti() {
	return Objekti;
	}
	public String getSvetlo() {
	return Svetlo;
	}
	
	// Render
	
	public Render(String naziv, List<String> materijali, List<String> kamere,String svetlo,  List<String> objekti ) {
	super();
	this.Naziv = naziv;
	this.Materijali = materijali;
	this.Kamere = kamere;
	this.Objekti = objekti;
	this.Svetlo = svetlo;
	}
	
	
}

