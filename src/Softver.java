import java.util.List;

public class Softver {
	private long Id;
	private String NazivSoft;
	private List<Cetkica> Cetkice;
	private String FajlFormat;
	private List<String> Alati;
	private Render Render;
	private String Modifikator;
	
	// Seteri
	
	public void setId(long id) {
	this.Id = id;
	}
	public void setNazivSoft(String nazivSoft) {
	this.NazivSoft = nazivSoft;
	}
	public void setCetkice(List<Cetkica> cetkice) {
	this.Cetkice = cetkice;
	}
	public void setFajlFormat(String fajlFormat) {
	this.FajlFormat = fajlFormat;
	}
	public void setAlati(List<String> alati) {
	this.Alati = alati;
	}
	public void setRender(Render render) {
	this.Render = render;
	}
	public void setModifikator(String modifikator) {
	this.Modifikator = modifikator;
	}
		
	// Geteri
	
	public long getId() {
	return Id;
	}
	public String getNazivSoft() {
	return NazivSoft;
	}
	public List<Cetkica> getCetkice() {
	return Cetkice;
	}
	public String getFajlFormat() {
	return FajlFormat;
	}
	public List<String> getAlati() {
	return Alati;
	}
	public Render getRender() {
	return Render;
	}
	public String getModifikator() {
	return Modifikator;
	}
	
	// Reference za StringBuilder
	// https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
	// https://www.javatpoint.com/StringBuilder-class
	public String dobaviNaziveCetkica() {
		StringBuilder sb = new StringBuilder();
		for (Cetkica cetkica : Cetkice) {
			sb.append(cetkica.getNazivCet() + ";");
		}
		return sb.toString();
	}
	
	public String dobaviNaziveAlata() {
		StringBuilder sb = new StringBuilder();
		for (String alat : Alati) {
			sb.append(alat + ";");
		}
		return sb.toString();
	}
	
	// Softver
	// Reference za super() - Call the superclass method
	// https://www.w3schools.com/java/ref_keyword_super.asp
	public Softver(long id, String nazivSoft, List<Cetkica> cetkice, String fajlFormat, List<String> alati, Render render, String modifikator) {
	super();
	this.Id = id;
	this.NazivSoft = nazivSoft;
	this.Cetkice = cetkice;
	this.FajlFormat = fajlFormat;
	this.Alati = alati;
	this.Render = render;
	this.Modifikator = modifikator;
	}
}