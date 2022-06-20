
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

	// kod nastao po ugledu na primere sa sajta:
	// https://www.tutorialspoint.com/java/lang/stringbuilder_append_string.htm
	@Override
	public String toString() {
		StringBuilder Cetkica = new StringBuilder();
		for (int a = 0; a<NazivCet.size(); a++) {
		String k = NazivCet.get(a);
		Cetkica.append(k);
		if(!(a == NazivCet.size()-1)) {
		Cetkica.append(", ");
		}
		}
		Cetkica.append(this.Namena);
		Cetkica.append(", ");
		Cetkica.append(this.Boja);
		return Cetkica.toString();
		}
}
