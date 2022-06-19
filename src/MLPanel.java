import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MLPanel extends JPanel {

	private static final long serialVersionUID = 5456157747808054580L;

	public MLPanel() {

		super(new GridLayout(2, 1, 10, 10));

		setBorder(new TitledBorder(new EtchedBorder(), "Mouse Listener"));
		setBackground(new Color(183, 254, 183));

		JPanel panClicked = new JPanel(new BorderLayout());
		panClicked.add(new JLabel("Klikni me 2 puta"));
		panClicked.addMouseListener(new MListener1());

		JPanel panEnterExit = new JPanel(new BorderLayout());
		panEnterExit.add(new JLabel("Predji preko mene"));
		panEnterExit.addMouseListener(new MListener2());

		add(panClicked);
		add(panEnterExit);

	}

}
