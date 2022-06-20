import java.util.List;

public class Softver {
	private long Id;
	private List<String> NazivSoft;
	private Cetkica Cetkica;
	private List<String> FajlFormat;
	private List<String> Alati;
	private Render Render;
	private List<String> Modifikator;
	
	// Seteri
	
	public void setId(long id) {
	this.Id = id;
	}
	public void setNazivSoft(List<String> nazivSoft) {
	this.NazivSoft = nazivSoft;
	}
	public void setCetkica(Cetkica cetkica) {
	this.Cetkica = cetkica;
	}
	public void setFajlFormat(List<String> fajlFormat) {
	this.FajlFormat = fajlFormat;
	}
	public void setAlati(List<String> alati) {
	this.Alati = alati;
	}
	public void setRender(Render render) {
	this.Render = render;
	}
	public void setModifikator(List<String> modifikator) {
	this.Modifikator = modifikator;
	}
		
	// Geteri
	
	public long getId() {
	return Id;
	}
	public List<String> getNazivSoft() {
	return NazivSoft;
	}
	public Cetkica getCetkica() {
	return Cetkica;
	}
	public List<String> getFajlFormat() {
	return FajlFormat;
	}
	public List<String> getAlati() {
	return Alati;
	}
	public Render getRender() {
	return Render;
	}
	public List<String> getModifikator() {
	return Modifikator;
	}
	
	// Softver
	
	public Softver(long id,List<String> nazivSoft, Cetkica cetkica, List<String> fajlFormat, List<String> alati, Render render, List<String> modifikator) {
	super();
	this.Id = id;
	this.NazivSoft = nazivSoft;
	this.Cetkica = cetkica;
	this.FajlFormat = fajlFormat;
	this.Alati = alati;
	this.Render = render;
	this.Modifikator = modifikator;
	}
}