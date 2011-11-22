package model.entity;

public class Circle extends Shape {
	private int radius;

	public void setRadius(int radius) {
		if (radius < 0) {
			throw new RuntimeException("Radius has to be bigger than 0");
		}
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}
