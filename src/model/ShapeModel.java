package model;

import java.util.ArrayList;
import java.util.Observable;
import model.entity.Circle;
import model.entity.Square;

public class ShapeModel extends Observable {

	private ArrayList<Square> squares = new ArrayList<Square>();
	private ArrayList<Circle> circles = new ArrayList<Circle>();

	public int getSquareCount() {
		return squares.size();
	}

	public Square getSquare(int index) {
		return this.squares.get(index);
	}

	public void addSquare(Square square) {
		this.squares.add(square);
	}

	public ArrayList<Square> getAllSquares() {
		return squares;
	}

	public int getCircleCount() {
		return this.circles.size();
	}

	public Circle getCircle(int index) {
		return this.circles.get(index);
	}

	public void addCircle(Circle circle) {
		this.circles.add(circle);
	}

	public ArrayList<Circle> getAllCircles() {
		return circles;
	}
}
