package control;

import java.util.Observer;
import model.ShapeModel;
import view.ShapeView;

/**
 * Abstract controller with common functionality.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
abstract public class ShapeController implements Observer {

	/**
	 * Reference to model.
	 */
	private ShapeModel model;

	/**
	 * Reference to view.
	 */
	private ShapeView view;

	/**
	 * Initialization of model and view (called in children)
	 *
	 * @param ShapeModel model
	 * @param ShapeView view
	 */
	final protected void initialize(ShapeModel model, ShapeView view) {
		this.view = view;
		this.model = model;
		this.model.addObserver(this);
	}

	/**
	 * Make model visible for children
	 *
	 * @return ShapeModel
	 */
	protected ShapeModel getModel() {
		return model;
	}
	
	/**
	 * Make view visible for children
	 *
	 * @return ShapeView
	 */
	protected ShapeView getView() {
		return view;
	}
}
