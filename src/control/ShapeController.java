package control;

import java.util.Observable;
import java.util.Observer;
import model.ShapeModel;
import view.ShapeView;

abstract public class ShapeController implements Observer {

	private ShapeModel model;
	private ShapeView view;

	public void initialize(ShapeModel model, ShapeView view) {
		this.view = view;
		this.model = model;
		this.model.addObserver(this);
	}

	public ShapeModel getModel() {
		return model;
	}

	public ShapeView getView() {
		return view;
	}
}
