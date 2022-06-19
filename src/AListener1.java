import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AListener1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Desio se dogadjaj ActionEvent");
		System.out.println("Dogadjaj inicirala komponenta:"+arg0.getSource()+" , "+arg0.getActionCommand());
		System.out.println("Tekst komponente: "+arg0.getActionCommand());
		System.out.println("Dogadjaj se desio u :"+new Date(arg0.getWhen()));
		System.out.println("Dogadjaj se desio u :"+new Date(arg0.getWhen()));
	}
}