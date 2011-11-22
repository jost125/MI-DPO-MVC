package model;

import java.util.ArrayList;
import java.util.Observable;
import model.entity.Circle;
import model.entity.Square;

public class ShapeModel extends Observable {

	private ArrayList<Square> squares = new ArrayList<Square>();
	private ArrayList<Circle> circle = new ArrayList<Circle>();

	public int getSquareCount() {
		return squares.size();
	}

	public Square getSquare(int index) {
		return this.squares.get(index);
	}

	public void addSquare(Square square) {
		this.squares.add(square);
	}

	public int getCircleCount() {
		return this.circle.size();
	}

	public Circle getCircle(int index) {
		return this.circle.get(index);
	}

	public void addCircle(Circle circle) {
		this.circle.add(circle);
	}
}
