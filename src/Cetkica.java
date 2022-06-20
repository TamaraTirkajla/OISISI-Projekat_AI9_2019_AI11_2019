
import java.awt.Color;

public class Cetkica {
	private String NazivCet;
	private String Namena;
	private Color Boja;
	
	// Seteri
	
	public void setNazivCet(String nazivCet) {
	this.NazivCet = nazivCet;
	}
	public void setNamena(String namena) {
	this.Namena = namena;
	}
	public void setBoja(Color boja) {
	this.Boja = boja;
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
	
	public Cetkica(String nazivCet, String namena, Color boja) {
	this.NazivCet = nazivCet;
	this.Namena = namena;
	this.Boja = boja;
	}
	
	@Override
	public String toString() {
	return "\nNaziv cetkice:"+this.NazivCet+"\nNamena:"+this.Namena+"\nBoja: "+this.Boja;
	}
}
