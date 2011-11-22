package model;

import java.util.ArrayList;
import java.util.Observable;
import model.entity.Circle;
import model.entity.Square;

/**
 * Represents model data layer in MVC
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class ShapeModel extends Observable {

	/**
	 * Represents in memory storage of squares.
	 */
	private ArrayList<Square> squares = new ArrayList<Square>();

	/**
	 * Represents in memory storage of circles.
	 */
	private ArrayList<Circle> circles = new ArrayList<Circle>();

	/**
	 * Counts number of squares in storage.
	 *
	 * @return int
	 */
	public int getSquareCount() {
		return squares.size();
	}

	/**
	 * Returns square from storage by its index.
	 *
	 * @param int index
	 * @return Square
	 */
	public Square getSquare(int index) {
		return this.squares.get(index);
	}

	/**
	 * Adds square to end of storage.
	 *
	 * @param Square square
	 */
	public void addSquare(Square square) {
		this.squares.add(square);
		this.refresh();
	}

	/**
	 * Returns all squares in storage.
	 *
	 * @return ArrayList<Square>
	 */
	public ArrayList<Square> getAllSquares() {
		return squares;
	}

	/**
	 * Counts number of circles in storage.
	 *
	 * @return int
	 */
	public int getCircleCount() {
		return this.circles.size();
	}

	/**
	 * Returns circle from storage by its index.
	 *
	 * @param int index
	 * @return Circle
	 */
	public Circle getCircle(int index) {
		return this.circles.get(index);
	}

	/**
	 * Adds circle to end of storage.
	 *
	 * @param Circle square
	 */
	public void addCircle(Circle circle) {
		this.circles.add(circle);
		this.refresh();
	}

	/**
	 * Returns all circles in storage.
	 *
	 * @return ArrayList<Circle>
	 */
	public ArrayList<Circle> getAllCircles() {
		return circles;
	}

	/**
	 * Helper method for both setChanged and notifyObservers. Should be called
	 * each time when inner state of model is changed and view/control should
	 * be informed.
	 */
	public void refresh() {
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * Method which clears both storages.
	 */
	public void clearAll() {
		this.squares.clear();
		this.circles.clear();
		this.refresh();
	}
}
