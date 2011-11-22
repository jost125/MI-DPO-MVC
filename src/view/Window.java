package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * Window which combines two views together.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class Window extends JFrame {

	/**
	 * @param TableView tableView
	 * @param GraphicView graphicView
	 */
	public Window(TableView tableView, GraphicView graphicView) {
		this.setTitle("Mvc");
		this.setLayout(new BorderLayout());
		this.getContentPane().add(tableView, BorderLayout.EAST);
		this.getContentPane().add(graphicView, BorderLayout.WEST);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}
}
