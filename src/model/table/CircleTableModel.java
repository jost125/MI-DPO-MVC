package model.table;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.ShapeModel;
import model.entity.Circle;

public class CircleTableModel extends TableModel {

	public CircleTableModel(ShapeModel model, String[] columnNames, Class[] columnTypes) {
		super(model, columnNames, columnTypes);
	}

	@Override
	public int getRowCount() {
		return this.model.getCircleCount();
	}

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

			this.model.refresh();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(new JDialog(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

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
