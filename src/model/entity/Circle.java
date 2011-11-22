package model.entity;

/**
 * Plain dummy entity which represents circle.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class Circle extends Shape {
	private int radius;

	/**
	 * Sets radius of circle.
	 *
	 * @throws RuntimeException  if radius is negative. Validation might be
	 *                           elsewhere, here it was used for it's easiness.
	 * @param int radius
	 */
	public void setRadius(int radius) {
		if (radius < 0) {
			throw new RuntimeException("Radius has to be bigger than 0");
		}
		this.radius = radius;
	}

	/**
	 * Gets it's radius.
	 *
	 * @return int
	 */
	public int getRadius() {
		return radius;
	}
}
