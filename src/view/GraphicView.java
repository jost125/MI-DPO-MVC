package view;

import control.GraphicController;
import control.ShapeController;
import java.awt.BorderLayout;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import model.ShapeModel;

public class GraphicView extends ShapeView {

	private ImagePanel imagePanel;
	private JButton clearButton;

	public GraphicView (ShapeModel model) {
		this.initialize(model);

		this.setLayout(new BorderLayout());

		this.imagePanel = this.createImagePanel();
		this.imagePanel.addMouseListener((GraphicController)this.getController());
		this.add(new JScrollPane(this.imagePanel), BorderLayout.NORTH);

		this.clearButton = new JButton("Clear all");
		this.clearButton.addActionListener((GraphicController)this.getController());
		this.add(this.clearButton, BorderLayout.SOUTH);
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
