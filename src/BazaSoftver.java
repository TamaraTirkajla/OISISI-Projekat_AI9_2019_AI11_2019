
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class BazaSoftver {

	private static BazaSoftver instance = null;
	
	public static List<Softver > listaSoftvera  = new ArrayList<Softver>();
	
	
	public static BazaSoftver getInstance() {
		if (instance == null) {
			instance = new BazaSoftver();
			InicijalizujSoftvere();
		}
		return instance;
	}
	
	private static void InicijalizujSoftvere() {
		 Cetkica cetkicaA = new Cetkica( "Move", "Pomera geometriju", new Color(10, 10, 10, 0));
		 Cetkica cetkicaB = new Cetkica( "Curve", "Dodaje oblike", new Color(2, 5, 50, 0));
		 Cetkica cetkicaC = new Cetkica( "Polish", "Uglacava povrsinu", new Color(45, 80, 4, 0));
		 
		  Render render_a = new Render("Zlatnik", new ArrayList<String>(List.of("voda", "zemlja", "zlato")), 
					new ArrayList<String>(List.of("cam1", "cam 2")), "svetlo1", 
					new ArrayList<String>(List.of("blato, reka, zlatnik, bara")));
          Render render_b = new Render( "Igracke", new ArrayList<String>(List.of("plastika", "metal", "pesak")), 
					new ArrayList<String>(List.of("cam2", "cam5")), "svetlo2", 
					new ArrayList<String>(List.of("tobogan, ljuljaska, igracke, jama")));
          
          Softver softverA= new Softver(1, "3ds Max", new ArrayList<Cetkica>(List.of(cetkicaB, cetkicaA)),".max", new ArrayList<String>(List.of("bone tool, curve graph")), render_a, "Noise");
          Softver softverB= new Softver(2, "Zbrush", new ArrayList<Cetkica>(List.of(cetkicaB,cetkicaC)), ".obj", new ArrayList<String>(List.of("animationTool")), render_b, "Extrude");
          Softver softverC= new Softver(3, "Blender", new ArrayList<Cetkica>(List.of(cetkicaA)), ".fbx", new ArrayList<String>(List.of("animationTool")), render_a, "Bevel");
          
          listaSoftvera.add(softverA);
          listaSoftvera.add(softverB);
          listaSoftvera.add(softverC);   	
	}
	
	public void izbrisiSoftver(long id) {
		for (Softver softver : listaSoftvera) {
			if (softver.getId() == id) {
				listaSoftvera.remove(softver);
				break;
			}
		}
	}
	
	public void dodajSoftver (Softver softver) {
		listaSoftvera.add(softver);
	}
	
	public List<Softver> dobaviSoftvere() {
		return listaSoftvera;
	}
	
	
	public void izmeniSoftver(long id, String naziv, List<Cetkica> cetkice, 
			String modifikator, String fajlFormat, List<String>  alati, Render render) {
		for (Softver softver : listaSoftvera) {
			if (softver.getId() == id) {
				softver.setNazivSoft(naziv);
				softver.setCetkice(cetkice);
				softver.setModifikator(modifikator);
				softver.setFajlFormat(fajlFormat);
				softver.setAlati(alati);
				softver.setRender(render);
			}
		}
		}
	
	public Object getValueAt(int row, int column) {
		Softver softver;
		softver = listaSoftvera.get(row);
		switch (column) {
		case 0:
			return softver.getNazivSoft();
		case 1:
			return softver.dobaviNaziveCetkica();
		case 2:
			return softver.getModifikator();
		case 3:
			return softver.getFajlFormat();
		case 4:
			return softver.dobaviNaziveAlata();
		case 5:
			return softver.getRender().toString();
		default:
		return null;
	}
	}
	
	
}

