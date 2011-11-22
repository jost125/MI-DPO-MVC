package view;

import control.ShapeController;
import control.TableController;
import java.awt.BorderLayout;
import java.util.Observable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.ShapeModel;

/**
 * Represents table view layer from MVC pattern.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class TableView extends ShapeView {

	/**
	 * @param ShapeModel model
	 */
	public TableView (ShapeModel model) {
		this.initialize(model);

		this.setLayout(new BorderLayout());

		TableController controller = (TableController)this.getController();
		JTable squareTable = new JTable(controller.getSquareTableModel());
		JTable circleTable = new JTable(controller.getCircleTableModel());

		JPanel north = new JPanel(new BorderLayout());
		north.add(new JLabel("Squares"), BorderLayout.NORTH);
		north.add(new JScrollPane(squareTable), BorderLayout.SOUTH);

		JPanel south = new JPanel(new BorderLayout());
		south.add(new JLabel("Circles"), BorderLayout.NORTH);
		south.add(new JScrollPane(circleTable), BorderLayout.SOUTH);

		this.add(north, BorderLayout.WEST);
		this.add(south, BorderLayout.EAST);
	}

	/**
	 * Creates controller.
	 *
	 * @param ShapeModel model
	 * @param ShapeView view
	 * @return ShapeController
	 */
	@Override
	ShapeController makeController(ShapeModel model, ShapeView view) {
		return new TableController(model, view);
	}

	/**
	 * Nothing to be update here.
	 *
	 * @param Observable o
	 * @param Object o1
	 */
	@Override
	public void update(Observable o, Object o1) {
		// nothing here
	}
}
