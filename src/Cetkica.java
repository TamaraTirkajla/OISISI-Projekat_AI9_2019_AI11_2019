
import java.awt.Color;
import java.util.List;

public class Cetkica {
	private List<String> NazivCet;
	private String Namena;
	private Color Boja;
	
	// Seteri
	
	public void setNazivCet(List<String> nazivCet) {
	this.NazivCet = nazivCet;
	}
	public void setNamena(String namena) {
	this.Namena = namena;
	}
	public void setBoja(Color boja) {
	this.Boja = boja;
	}
	
	// Geteri
	
	public List<String> getNazivCet() {
	return NazivCet;
	}
	public String getNamena() {
	return Namena;
	}
	public Color getBoja() {
	return Boja;
	}
	
	// Cetkica
	
	public Cetkica(List<String> nazivCet, String namena, Color boja) {
	this.NazivCet = nazivCet;
	this.Namena = namena;
	this.Boja = boja;
	}
	
	/*
	@Override
	public String toString() {
	return "\nNaziv cetkice:"+this.NazivCet+"\nNamena:"+this.Namena+"\nBoja: "+this.Boja;
	}
	*/
}
