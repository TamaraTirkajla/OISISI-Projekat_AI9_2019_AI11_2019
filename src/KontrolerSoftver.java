
import java.util.List;

import javax.swing.JOptionPane;

//reference za kreiranje Model View Controller arhitekture
//https://www.javatpoint.com/mvc-architecture-in-java
//https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
//https://www.youtube.com/watch?v=dTVVa2gfht8
//https://www.edureka.co/blog/mvc-architecture-in-java/

public class KontrolerSoftver {

	private static KontrolerSoftver instance = null;
	
	private  BazaSoftver bazaSoftver = BazaSoftver.getInstance();

		public static KontrolerSoftver getInstance() {
			if (instance == null) {
				instance = new KontrolerSoftver();
			}
			return instance;
		}
		

		public void dodajSoftvere( String nazivSoft, List<Cetkica> cetkice, String fajlFormat, List<String> alati, Render render, String modifikator) {
			long id = bazaSoftver.dobaviSoftvere().size();
		    Softver softver = new Softver( id, nazivSoft,  cetkice,  fajlFormat,  alati,  render,  modifikator);
		    bazaSoftver.dodajSoftver(softver);
		}

		// reference za ConifrmDialog
		// https://mkyong.com/swing/java-swing-how-to-make-a-confirmation-dialog/
		public void izbrisiSoftver(int index) {			
			int input = JOptionPane.showConfirmDialog(null,
						    "Jeste sigurni da zelite obrisati softver?", "Potvrda", 
						    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (input == 0) {
				bazaSoftver.izbrisiSoftver(index);
			}
		}
		
		public void izmeniSoftver(long id, String naziv, List<Cetkica> cetkice, 
				String modifikator, String fajlFormat, List<String>  alati, Render render) {
			bazaSoftver.izmeniSoftver(id, naziv, cetkice, modifikator, fajlFormat, alati, render);
		}
		
		public List<Softver> dobaviSoftvere (){
			return bazaSoftver.dobaviSoftvere();
		}
}