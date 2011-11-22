package model.table;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.ShapeModel;
import model.entity.Circle;

/**
 * Represents data in table. Table model is not nicely separated from MVC point
 * of view, but it's SWING way.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class CircleTableModel extends TableModel {

	/**
	 * @param ShapeModel model
	 * @param String[] columnNames
	 * @param Class[] columnTypes
	 */
	public CircleTableModel(ShapeModel model, String[] columnNames, Class[] columnTypes) {
		super(model, columnNames, columnTypes);
	}

	/**
	 * Asks model layer for count of circles, and returns it.
	 *
	 * @return int
	 */
	@Override
	public int getRowCount() {
		return this.model.getCircleCount();
	}

	/**
	 * Sets value on coordinates. Row corresponds with circle index in model,
	 * column targets concrete property.
	 *
	 * @param Object o    This will be always Integer (because of columnTypes)
	 * @param int row     Index of circle
	 * @param int column  Circle property
	 */
	@Override
	public void setValueAt(Object o, int row, int column) {
		try {
			Circle circle = this.model.getCircle(row);
			Integer value = (Integer)o;

			switch (column) {
				case 1: circle.setX(value); break;
				case 2: circle.setY(value); break;
				case 3: circle.setRadius(value); break;
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
		Circle circle = this.model.getCircle(row);
		switch (column) {
			case 0: return row;
			case 1: return circle.getX();
			case 2: return circle.getY();
			case 3: return circle.getRadius();
		}
		throw new IndexOutOfBoundsException();
	}

}
