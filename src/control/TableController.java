package control;

import java.util.Observable;
import model.ShapeModel;
import model.table.CircleTableModel;
import model.table.SquareTableModel;
import view.ShapeView;

public class TableController extends ShapeController {

	private SquareTableModel squareTableModel = null;
	private CircleTableModel circleTableModel = null;

	public TableController(ShapeModel model, ShapeView view) {
		this.initialize(model, view);
	}

	public SquareTableModel getSquareTableModel() {
		if (this.squareTableModel == null) {
			String[] columns = {"id", "x", "y", "a"};
			Class[] classes = {Integer.class, Integer.class, Integer.class, Integer.class};

			this.squareTableModel = new SquareTableModel(this.getModel(), columns, classes);
		}
		
		return this.squareTableModel;
	}

	public CircleTableModel getCircleTableModel() {
		if (this.circleTableModel == null) {
			String[] columns = {"id", "x", "y", "r"};
			Class[] classes = {Integer.class, Integer.class, Integer.class, Integer.class};

			this.circleTableModel = new CircleTableModel(this.getModel(), columns, classes);
		}

		return this.circleTableModel;
	}

	@Override
	public void update(Observable o, Object o1) {
		this.circleTableModel.fireTableDataChanged();
		this.squareTableModel.fireTableDataChanged();
	}
}
