package model.table;

import javax.swing.table.AbstractTableModel;
import model.ShapeModel;

/**
 * Abstract table model.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
abstract public class TableModel extends AbstractTableModel {
	protected ShapeModel model;
	protected String[] columnNames;
	protected Class[] columnTypes;

	/**
	 * @param ShapeModel model
	 * @param String[] columnNames
	 * @param Class[] columnTypes
	 */
	public TableModel(ShapeModel model, String[] columnNames, Class[] columnTypes) {
		this.model = model;
		this.columnNames = columnNames;
		this.columnTypes = columnTypes;
	}

	/**
	 * Disables editing of first row (because it is index).
	 *
	 * @param int row
	 * @param int column
	 * @return boolean
	 */
	@Override
	public boolean isCellEditable(int row, int column) {
		return column > 0;
	}

	/**
	 * Gets column name for header.
	 *
	 * @param int i
	 * @return String
	 */
	@Override
	public String getColumnName(int i) {
		return this.columnNames[i];
	}

	/**
	 * Gets column type. Used for validation of input type.
	 *
	 * @param int i
	 * @return Class<?>
	 */
	@Override
	public Class<?> getColumnClass(int i) {
		return this.columnTypes[i];
	}

	/**
	 * Gets column count (table width)
	 *
	 * @return int
	 */
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
}
