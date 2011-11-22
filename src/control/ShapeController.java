package control;

import java.util.Observable;
import java.util.Observer;
import model.ShapeModel;
import view.ShapeView;

public class ShapeController implements Observer {

	private ShapeModel model;
	private ShapeView view;

	public ShapeController(ShapeModel model, ShapeView view) {
		initialize(model, view);
	}

	protected final void initialize(ShapeModel model, ShapeView view) {
		this.view = view;
		this.model = model;
		this.model.addObserver(this);
	}

	@Override
	public void update(Observable o, Object o1) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
