import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class ToolBar extends JToolBar{

	public ToolBar() {
		//deo koda preuzet sa vezbi - Termin 3
		super(SwingConstants.HORIZONTAL);
		JButton btnNew = new JButton();
		btnNew.setToolTipText("New");
		btnNew.setIcon(new ImageIcon("ikonice/toolbar_new25.png"));
		add(btnNew);

		addSeparator();

		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Edit");
		btnOpen.setIcon(new ImageIcon("ikonice/toolbar_edit25.png"));
		add(btnOpen);

		addSeparator();

		JToggleButton tglBtnBold = new JToggleButton();
		tglBtnBold.setToolTipText("Delete");
		tglBtnBold.setIcon(new ImageIcon("ikonice/toolbar_delete25.png"));
		add(tglBtnBold);

		setFloatable(true);
		setBackground(new Color(255, 255, 200));
	}
}