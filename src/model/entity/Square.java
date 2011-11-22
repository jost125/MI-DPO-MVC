package model.entity;

public class Square extends Shape {
	private int edge;

	public void setEdge(int edge) {
		if (edge < 0) {
			throw new RuntimeException("Edge has to be bigger than 0");
		}
		this.edge = edge;
	}

	public int getEdge() {
		return edge;
	}
}
