package view;

import control.ShapeController;
import java.util.Observer;
import javax.swing.JPanel;
import model.ShapeModel;

abstract public class ShapeView extends JPanel implements Observer {

	private ShapeModel model;
	private ShapeController controller;

	public void initialize(ShapeModel model) {
		this.model = model;
		this.model.addObserver(this);
		this.controller = this.makeController(model, this);
	}

	abstract ShapeController makeController(ShapeModel model, ShapeView view);

	protected ShapeModel getModel() {
		return model;
	}

	public ShapeController getController() {
		return controller;
	}
}
