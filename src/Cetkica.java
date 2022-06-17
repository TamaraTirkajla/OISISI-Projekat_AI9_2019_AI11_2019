import java.awt.Color;

public class Cetkica {
	private String NazivCet;
	private String Namena;
	private Color Boja;
	
	// Seteri
	
	public void setNazivCet(String NazivCet) {
	this.NazivCet = NazivCet;
	}
	public void setNamena(String Namena) {
	this.Namena = Namena;
	}
	public void setBoja(Color Boja) {
	this.Boja = Boja;
	}
	
	// Geteri
	
	public String getNazivCet() {
	return NazivCet;
	}
	public String getNamena() {
	return Namena;
	}
	public Color getBoja() {
	return Boja;
	}
	
	// Cetkica
	
	public Cetkica(String NazivCet, String Namena, Color Boja) {
	this.NazivCet = NazivCet;
	this.Namena = Namena;
	this.Boja = Boja;
	}
	
	@Override
	public String toString() {
	return NazivCet + "," + Namena + "," + Boja ;
	}
}
