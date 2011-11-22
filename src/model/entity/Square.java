package model.entity;

/**
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class Square extends Shape {
	private int edge;

	/**
	 * Sets edge of square.
	 *
	 * @throws RuntimeException  if edge is negative. Validation might be
	 *	                          elsewhere, here it was used for it's easiness.
	 * @param int radius
	 */
	public void setEdge(int edge) {
		if (edge < 0) {
			throw new RuntimeException("Edge has to be bigger than 0");
		}
		this.edge = edge;
	}

	/**
	 * Gets it's edge.
	 *
	 * @return int
	 */
	public int getEdge() {
		return edge;
	}
}
