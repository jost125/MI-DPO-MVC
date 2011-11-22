package control;

import model.ShapeModel;

public class ShapeController {

	private ShapeModel model;
	private ShapeController controller;

	public ShapeController(ShapeModel model, ShapeController controller) {
		this.controller = controller;
		this.model = model;
	}
}
