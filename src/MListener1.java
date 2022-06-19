
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class MListener1 implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {

		if (arg0.getClickCount() == 2) {
			JOptionPane.showMessageDialog(null, "Dupli klik i to sa : "
					+ (arg0.getButton() == 1 ? "Levi taster" : arg0.getButton() == 2 ? "Tockic" : "Desni taster"));
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}