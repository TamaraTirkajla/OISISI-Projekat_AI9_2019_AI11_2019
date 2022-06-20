import java.util.List;

public class Render {
	private long id;
	private String Materijali;
	private List<String> Kamera;
	private String Objekti;
	private List<String> Svetlo;
		
	// Seteri
	
	public void setId(long id) {
	this.id = id;
	}
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
	
	public long getId() {
	return id;
	}
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
	
	public Render(long id, String materijali, List<String> kamera, String objekti, List<String> svetlo) {
	super();
	this.id = id;
	this.Materijali = materijali;
	this.Kamera = kamera;
	this.Objekti = objekti;
	this.Svetlo = svetlo;
	}
	
	// kod nastao po ugledu na primere sa sajta:
	// https://www.tutorialspoint.com/java/lang/stringbuilder_append_string.htm
	@Override
	public String toString() {
		StringBuilder Render = new StringBuilder();
		Render.append(this.Materijali);
		Render.append(", ");
		for (int a = 0; a<Kamera.size(); a++) {
		String k = Kamera.get(a);
		Render.append(k);
		if(!(a == Kamera.size()-1)) {
		Render.append(", ");
		}
		}
		Render.append(this.Objekti);
		Render.append(", ");
		for (int a = 0; a<Svetlo.size(); a++) {
		String s = Svetlo.get(a);
		Render.append(s);
		if(!(a == Svetlo.size()-1)) {
		Render.append(", ");
		}
	}
	return Render.toString();
	}
}
