package model.table;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.ShapeModel;
import model.entity.Square;

public class SquareTableModel extends TableModel {

	public SquareTableModel(ShapeModel model, String[] columnNames, Class[] columnTypes) {
		super(model, columnNames, columnTypes);
	}

	@Override
	public int getRowCount() {
		return this.model.getSquareCount();
	}

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

			this.model.refresh();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(new JDialog(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

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
