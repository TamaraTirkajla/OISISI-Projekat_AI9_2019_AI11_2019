
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
	
	public Adresa(String br, String ul, String gr) {
	super();
	this.Br = br;
	this.Ul = ul;
	this.Gr = gr;
	}
	
	@Override
	public String toString() {
		return Ul + " " + Br + ", " + Gr;
	}
}