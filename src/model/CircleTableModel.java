package model;

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
	public Object getValueAt(int x, int y) {
		Circle circle = this.model.getCircle(x);
		switch (y) {
			case 0: return x;
			case 1: return circle.getX();
			case 2: return circle.getY();
			case 3: return circle.getRadius();
		}
		throw new IndexOutOfBoundsException();
	}

}
