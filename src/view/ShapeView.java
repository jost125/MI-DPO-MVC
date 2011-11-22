package view;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import model.ShapeModel;

abstract public class ShapeView extends JPanel implements Observer {

	private ShapeModel model;

	protected void initModel(ShapeModel model) {
		this.model = model;
		this.model.addObserver(this);
	}

	@Override
	public void update(Observable o, Object o1) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	protected ShapeModel getModel() {
		return model;
	}
}
