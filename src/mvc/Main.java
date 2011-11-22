/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import control.ShapeController;
import view.Window;
import model.ShapeModel;
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

		TableView tableView = new TableView(model);
		GraphicView graphicView = new GraphicView(model);

		ShapeController tableController = new ShapeController(model, tableView);
		ShapeController graphicController = new ShapeController(model, graphicView);

		Window window = new Window(tableView, graphicView);
		window.setVisible(true);
	}
}
