
public class Adresa {
	private String Br;
	private String Ul;
	private String Gr;
	
	// Seteri
	
	public void setBr(String br) {
	this.Br = br;
	}
	public void setUl(String ul) {
	this.Ul = ul;
	}
	public void setGr(String gr) {
	this.Gr = gr;
	}
	
	// Geteri
	
	public String getBr() {
	return Br;
	}
	public String getUl() {
	return Ul;
	}
	public String getGr() {
	return Gr;
	}
	
	// Adresa
	// Reference za super() - Call the superclass method
	// https://www.w3schools.com/java/ref_keyword_super.asp
	public Adresa(String br, String ul, String gr) {
	super();
	this.Br = br;
	this.Ul = ul;
	this.Gr = gr;
	}
	
	// Reference za @Override - Call the superclass method
	// https://beginnersbook.com/2014/07/override-annotation-in-java/
	@Override
	public String toString() {
		return Ul + " " + Br + ", " + Gr;
	}
}