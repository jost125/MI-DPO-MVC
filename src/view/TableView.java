package view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import model.ShapeModel;
import model.entity.Square;

public class TableView extends ShapeView {

	public TableView (ShapeModel model) {
		this.initModel(model);
		this.add(new JScrollPane(this.createSquareTable()));
	}

	private JTable createSquareTable() {
		SquareTableModel tableModel = new SquareTableModel(this.getModel());
		JTable table = new JTable(tableModel);
		return table;
	}

	private class SquareTableModel extends AbstractTableModel {

		private ShapeModel model;
		private String[] columnNames = {"id", "x", "y", "a"};
		private Class[] columnTypes = {Integer.class, Integer.class, Integer.class, Integer.class};

		public SquareTableModel(ShapeModel model) {
			this.model = model;
		}

		@Override
		public String getColumnName(int i) {
			return this.columnNames[i];
		}

		@Override
		public Class<?> getColumnClass(int i) {
			return this.columnTypes[i];
		}

		@Override
		public int getRowCount() {
			return this.model.getSquareCount();
		}

		@Override
		public int getColumnCount() {
			return columnNames.length;
		}

		@Override
		public Object getValueAt(int x, int y) {
			Square square = this.model.getSquare(x);
			switch (y) {
				case 0: return x;
				case 1: return square.getX();
				case 2: return square.getY();
				case 3: return square.getEdge();
			}
			throw new IndexOutOfBoundsException();
		}

	}
}
