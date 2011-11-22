package view;

import control.ShapeController;
import control.TableController;
import java.util.Observable;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.CircleTableModel;
import model.ShapeModel;
import model.SquareTableModel;

public class TableView extends ShapeView {

	JTable squareTable;
	JTable circleTable;

	public TableView (ShapeModel model) {
		this.initialize(model);

		this.squareTable = new JTable(this.getSquareTableModel());
		this.circleTable = new JTable(this.getCircleTableModel());

		this.add(new JScrollPane(this.squareTable));
		this.add(new JScrollPane(this.circleTable));
	}

	private SquareTableModel getSquareTableModel() {
		String[] columns = {"id", "x", "y", "a"};
		Class[] classes = {Integer.class, Integer.class, Integer.class, Integer.class};

		return new SquareTableModel(this.getModel(), columns, classes);
	}

	private CircleTableModel getCircleTableModel() {
		String[] columns = {"id", "x", "y", "r"};
		Class[] classes = {Integer.class, Integer.class, Integer.class, Integer.class};

		return new CircleTableModel(this.getModel(), columns, classes);
	}

	@Override
	ShapeController makeController(ShapeModel model, ShapeView view) {
		return new TableController(model, view);
	}

	@Override
	public void update(Observable o, Object o1) {
		this.circleTable.setModel(this.getCircleTableModel());
		this.squareTable.setModel(this.getSquareTableModel());
	}
}
