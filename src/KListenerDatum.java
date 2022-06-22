
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class KListenerDatum implements KeyListener {

	//uradjeno po ugledu na vezbe - Termin 4 
	@Override
	public void keyPressed(KeyEvent arg0) {
		
		if (arg0.isActionKey() || arg0.getKeyCode() == KeyEvent.VK_ENTER
				|| arg0.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			return;
		}
		JTextField txt = (JTextField) arg0.getComponent();
		if (txt.getText().length() == 11) {
			JOptionPane.showMessageDialog(null, "Datum rodjenja je predugacak");
			txt.setText(txt.getText().substring(0, 11));
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
		if (arg0.isActionKey() || arg0.getKeyCode() == KeyEvent.VK_ENTER
				|| arg0.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			return;
		}
		char c = arg0.getKeyChar();
		if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8'
				&& c != '9' && c != '.') {
			JOptionPane.showMessageDialog(null, "Uneti su nevazeci karakteri");
			JTextField txt = (JTextField) arg0.getComponent();
			txt.setText(txt.getText().substring(0, txt.getText().length() - 1));
		}
		JTextField txt = (JTextField) arg0.getComponent();
		String str = txt.getText();
		System.out.println(str);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}
}