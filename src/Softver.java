
public class Softver {
	private String NazivSoft;
	private Cetkica Cetkica;
	private String FajlFormat;
	private String Alati;
	private Render Render;
	
	// Seteri
	
	public void setNazivSoft(String nazivSoft) {
	this.NazivSoft = nazivSoft;
	}
	public void setCetkica(Cetkica cetkica) {
	this.Cetkica = cetkica;
	}
	public void setFajlFormat(String fajlFormat) {
	this.FajlFormat = fajlFormat;
	}
	public void setAlati(String alati) {
	this.Alati = alati;
	}
	public void setRender(Render render) {
	this.Render = render;
	}
		
	// Geteri
		
	public String getNazivSoft() {
	return NazivSoft;
	}
	public Cetkica getCetkica() {
	return Cetkica;
	}
	public String getFajlFormat() {
	return FajlFormat;
	}
	public String getAlati() {
	return Alati;
	}
	public Render getRender() {
	return Render;
	}
	
	// Softver
	
	public Softver(String NazivSoft, Cetkica Cetkica, String FajlFormat, String Alati, Render Render) {
	this.NazivSoft = NazivSoft;
	this.Cetkica = Cetkica;
	this.FajlFormat = FajlFormat;
	this.Alati = Alati;
	this.Render = Render;
	}
}