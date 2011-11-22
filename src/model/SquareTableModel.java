package model;

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
