package model;

import javax.swing.table.AbstractTableModel;

abstract public class TableModel extends AbstractTableModel {
	protected ShapeModel model;
	protected String[] columnNames;
	protected Class[] columnTypes;

	public TableModel(ShapeModel model, String[] columnNames, Class[] columnTypes) {
		this.model = model;
		this.columnNames = columnNames;
		this.columnTypes = columnTypes;
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
	public int getColumnCount() {
		return columnNames.length;
	}
}
