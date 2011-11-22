/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import view.Window;
import model.ShapeModel;
import model.entity.Circle;
import model.entity.Square;
import view.GraphicView;
import view.TableView;

/**
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// Creation of model.
		ShapeModel model = new ShapeModel();

		// Example circle.
		Circle circle = new Circle();
		circle.setX(5);
		circle.setY(10);
		circle.setRadius(8);

		// Example square.
		Square square = new Square();
		square.setX(15);
		square.setY(20);
		square.setEdge(4);

		// Adding of example shapes.
		model.addCircle(circle);
		model.addSquare(square);

		// Creation of both views.
		TableView tableView = new TableView(model);
		GraphicView graphicView = new GraphicView(model);

		// Creation of window and its rendering.
		Window window = new Window(tableView, graphicView);
		window.setVisible(true);
	}
}
