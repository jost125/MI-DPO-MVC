package control;

import java.util.Observable;
import model.ShapeModel;
import model.table.CircleTableModel;
import model.table.SquareTableModel;
import view.ShapeView;

/**
 * Concrete controller, provides access to model and triggers tables redraw.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class TableController extends ShapeController {

	/**
	 * Square table model representing table rows.
	 */
	private SquareTableModel squareTableModel = null;

	/**
	 * Circle table model representing table rows.
	 */
	private CircleTableModel circleTableModel = null;

	/**
	 * Takes reference of model layer and view layer.
	 *
	 * @param ShapeModel model
	 * @param ShapeView view
	 */
	public TableController(ShapeModel model, ShapeView view) {
		this.initialize(model, view);
	}

	/**
	 * Lazy initiate square table model.
	 *
	 * @return SquareTableModel
	 */
	public SquareTableModel getSquareTableModel() {
		if (this.squareTableModel == null) {
			String[] columns = {"id", "x", "y", "a"};
			Class[] classes = {Integer.class, Integer.class, Integer.class, Integer.class};

			this.squareTableModel = new SquareTableModel(this.getModel(), columns, classes);
		}
		
		return this.squareTableModel;
	}

	/**
	 * Lazy initiate circle table model
	 *
	 * @return CircleTableModel
	 */
	public CircleTableModel getCircleTableModel() {
		if (this.circleTableModel == null) {
			String[] columns = {"id", "x", "y", "r"};
			Class[] classes = {Integer.class, Integer.class, Integer.class, Integer.class};

			this.circleTableModel = new CircleTableModel(this.getModel(), columns, classes);
		}

		return this.circleTableModel;
	}

	/**
	 * Causes redrawing of tables.
	 *
	 * @param Observable o
	 * @param Object o1
	 */
	@Override
	public void update(Observable o, Object o1) {
		this.circleTableModel.fireTableDataChanged();
		this.squareTableModel.fireTableDataChanged();
	}
}
