package model;

import java.util.ArrayList;
import java.util.Observable;
import model.entity.Square;

public class ShapeModel extends Observable {

	private ArrayList<Square> squares = new ArrayList<Square>();

	public int getSquareCount() {
		return squares.size();
	}

	public Square getSquare(int index) {
		return this.squares.get(index);
	}

	public void addSquare(Square square) {
		this.squares.add(square);
	}
}
