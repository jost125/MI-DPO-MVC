package control;

import java.util.Observable;
import model.ShapeModel;
import view.ShapeView;

public class TableController extends ShapeController {

	public TableController(ShapeModel model, ShapeView view) {
		this.initialize(model, view);
	}

	@Override
	public void update(Observable o, Object o1) {
		System.out.println(this.getClass());
	}
}
