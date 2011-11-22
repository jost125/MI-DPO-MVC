/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import control.TableController;
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
		ShapeModel model = new ShapeModel();

		Circle circle = new Circle();
		circle.setX(5);
		circle.setY(10);
		circle.setRadius(8);

		Square square = new Square();
		square.setX(15);
		square.setY(20);
		square.setEdge(4);

		model.addCircle(circle);
		model.addSquare(square);

		TableView tableView = new TableView(model);
		GraphicView graphicView = new GraphicView(model);

		Window window = new Window(tableView, graphicView);
		window.setVisible(true);
	}
}
