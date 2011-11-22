package view;

import control.GraphicController;
import control.ShapeController;
import java.util.Observable;
import javax.swing.JScrollPane;
import model.ShapeModel;

public class GraphicView extends ShapeView {

	private ImagePanel imagePanel;

	public GraphicView (ShapeModel model) {
		this.initialize(model);
		this.imagePanel = this.createImagePanel();
		this.imagePanel.addMouseListener((GraphicController)this.getController());
		this.add(new JScrollPane(imagePanel));
	}
	
	@Override
	ShapeController makeController(ShapeModel model, ShapeView view) {
		GraphicController controller = new GraphicController(model, view);
		return controller;
	}

	private ImagePanel createImagePanel() {
		return new ImagePanel(this.getModel());
	}

	@Override
	public void update(Observable o, Object o1) {
		this.imagePanel.repaint();
	}
}
