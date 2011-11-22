package view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.CircleTableModel;
import model.ShapeModel;
import model.SquareTableModel;

public class TableView extends ShapeView {

	public TableView (ShapeModel model) {
		this.initModel(model);
		this.add(new JScrollPane(this.createSquareTable()));
		this.add(new JScrollPane(this.createCircleTable()));
	}

	private JTable createSquareTable() {
		String[] columns = {"id", "x", "y", "a"};
		Class[] classes = {Integer.class, Integer.class, Integer.class, Integer.class};

		SquareTableModel tableModel = new SquareTableModel(this.getModel(), columns, classes);
		JTable table = new JTable(tableModel);
		return table;
	}

	private JTable createCircleTable() {
		String[] columns = {"id", "x", "y", "r"};
		Class[] classes = {Integer.class, Integer.class, Integer.class, Integer.class};

		CircleTableModel tableModel = new CircleTableModel(this.getModel(), columns, classes);
		JTable table = new JTable(tableModel);
		return table;
	}
}
