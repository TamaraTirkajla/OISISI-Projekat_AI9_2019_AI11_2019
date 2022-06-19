import java.awt.Frame;

import javax.swing.JDialog;

public class SDialog extends JDialog {

	private static final long serialVersionUID = 3591599721565020284L;

	public SDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);

		setSize(250, 250);
		setLocationRelativeTo(parent);

	}

}
