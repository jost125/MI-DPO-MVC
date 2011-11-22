package model.table;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.ShapeModel;
import model.entity.Square;

/**
 * Represents data in table. Table model is not nicely separated from MVC point
 * of view, but it's SWING way.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class SquareTableModel extends TableModel {

	/**
	 * @param ShapeModel model
	 * @param String[] columnNames
	 * @param Class[] columnTypes
	 */
	public SquareTableModel(ShapeModel model, String[] columnNames, Class[] columnTypes) {
		super(model, columnNames, columnTypes);
	}

	/**
	 * Asks model layer for count of squares, and returns it.
	 *
	 * @return int
	 */
	@Override
	public int getRowCount() {
		return this.model.getSquareCount();
	}

	/**
	 * Sets value on coordinates. Row corresponds with square index in model,
	 * column targets concrete property.
	 *
	 * @param Object o    This will be always Integer (because of columnTypes)
	 * @param int row     Index of square
	 * @param int column  Square property
	 */
	@Override
	public void setValueAt(Object o, int row, int column) {
		try {
			Square square = this.model.getSquare(row);
			Integer value = (Integer)o;

			switch (column) {
				case 1: square.setX(value); break;
				case 2: square.setY(value); break;
				case 3: square.setEdge(value); break;
			}

			// Model has changed, update it.
			this.model.refresh();
			
		} catch (Exception ex) {
			// Show dialog if validation failed
			JOptionPane.showMessageDialog(new JDialog(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Gets value on coordinates.
	 *
	 * @param int row
	 * @param int column
	 * @return Object
	 */
	@Override
	public Object getValueAt(int row, int column) {
		Square square = this.model.getSquare(row);
		switch (column) {
			case 0: return row;
			case 1: return square.getX();
			case 2: return square.getY();
			case 3: return square.getEdge();
		}
		throw new IndexOutOfBoundsException();
	}

}
