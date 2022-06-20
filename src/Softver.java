
public class Softver {
	private String NazivSoft;
	private Cetkica Cetkica;
	private String FajlFormat;
	private String Alati;
	private Render Render;
	private String Modifikator;
	
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
	public void setModifikator(String modifikator) {
	this.Modifikator = modifikator;
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
	public String getModifikator() {
	return Modifikator;
	}
	
	// Softver
	
	public Softver(String nazivSoft, Cetkica cetkica, String fajlFormat, String alati, Render render, String modifikator) {
	this.NazivSoft = nazivSoft;
	this.Cetkica = cetkica;
	this.FajlFormat = fajlFormat;
	this.Alati = alati;
	this.Render = render;
	this.Modifikator = modifikator;
	}
	
	@Override
    public String toString() {
        return "\nNaziv softvera:"+this.NazivSoft+"\nCetkica:"+this.Cetkica+"\nFajl format: "+this.FajlFormat+"\nAlati: "+
        this.Alati+"\nRender:"+this.Render+"\nModifikator: "+this.Modifikator;
    }
}