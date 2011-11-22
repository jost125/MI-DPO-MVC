package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.ShapeModel;
import model.entity.Circle;
import model.entity.Square;

/**
 * Represents panel where to be painted.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
class ImagePanel extends JPanel {

	/**
	 * Reference to model layer.
	 */
	protected ShapeModel model;

	/**
	 * @param ShapeModel model
	 */
	public ImagePanel(ShapeModel model) {
		this.model = model;
		this.setPreferredSize(new Dimension(300, 500));
	}

	/**
	 * Painting of all shapes on panel.
	 * 
	 * @param Graphics grphcs
	 */
	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		ArrayList<Circle> circles = this.model.getAllCircles();
		ArrayList<Square> squares = this.model.getAllSquares();

		for (Square square : squares) {
			graphics.setColor(Color.BLACK);
			graphics.drawRect(square.getX(), square.getY(), square.getEdge(), square.getEdge());
		}

		for (Circle circle : circles) {
			graphics.setColor(Color.BLACK);
			graphics.drawOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
		}
	}

}