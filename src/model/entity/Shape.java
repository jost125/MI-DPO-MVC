package model.entity;

/**
 * Abstract shape entity having its coordinates.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
abstract public class Shape {
	private int x;
	private int y;

	/**
	 * The input might be even negative.
	 *
	 * @param int x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return int
	 */
	public int getX() {
		return x;
	}

	/**
	 * The input might be even negative.
	 *
	 * @param int y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return int
	 */
	public int getY() {
		return y;
	}
}
