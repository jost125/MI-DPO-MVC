package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.ShapeModel;
import model.entity.Circle;
import model.entity.Square;

class ImagePanel extends JPanel {

	protected ShapeModel model;

	public ImagePanel(ShapeModel model) {
		this.model = model;
		this.setPreferredSize(new Dimension(200, 200));
	}

	@Override
	public void paintComponent(Graphics grphcs) {
		super.paintComponent(grphcs);
		ArrayList<Circle> circles = this.model.getAllCircles();
		ArrayList<Square> squares = this.model.getAllSquares();

		for (Square square : squares) {
			grphcs.setColor(Color.BLACK);
			grphcs.drawRect(square.getX(), square.getY(), square.getEdge(), square.getEdge());
		}

		for (Circle circle : circles) {
			grphcs.setColor(Color.BLACK);
			grphcs.drawOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
		}
	}

}