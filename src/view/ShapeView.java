package view;

import control.ShapeController;
import java.util.Observer;
import javax.swing.JPanel;
import model.ShapeModel;

/**
 * Abstract view.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
abstract public class ShapeView extends JPanel implements Observer {

	/**
	 * Reference to model from MVC pattern.
	 */
	private ShapeModel model;

	/**
	 * Reference to controller from MVC pattern.
	 */
	private ShapeController controller;

	/**
	 * View initialization, attaching observer.
	 *
	 * @param ShapeModel model
	 */
	public void initialize(ShapeModel model) {
		this.model = model;
		this.model.addObserver(this);
		this.controller = this.makeController(model, this);
	}

	/**
	 * Creation of concrete controllers is implemented in children.
	 *
	 * @param ShapeModel model
	 * @param ShapeView view
	 * @return ShapeController
	 */
	abstract ShapeController makeController(ShapeModel model, ShapeView view);

	/**
	 * Makes model visible in children.
	 *
	 * @return ShapeModel
	 */
	protected ShapeModel getModel() {
		return model;
	}

	/**
	 * Makes controller visible in children.
	 *
	 * @return ShapeController
	 */
	public ShapeController getController() {
		return controller;
	}
}
