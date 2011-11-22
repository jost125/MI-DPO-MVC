package view;

import control.GraphicController;
import control.ShapeController;
import java.awt.BorderLayout;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import model.ShapeModel;

/**
 * Represents graphic view layer from MVC pattern.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class GraphicView extends ShapeView {

	/**
	 * Panel where the shapes are painted.
	 */
	private ImagePanel imagePanel;

	/**
	 * Clear all button.
	 */
	private JButton clearButton;

	/**
	 * @param ShapeModel model
	 */
	public GraphicView (ShapeModel model) {
		this.initialize(model);

		this.setLayout(new BorderLayout());

		this.imagePanel = new ImagePanel(this.getModel());
		this.imagePanel.addMouseListener((GraphicController)this.getController());
		this.add(new JScrollPane(this.imagePanel), BorderLayout.NORTH);

		this.clearButton = new JButton("Clear all");
		this.clearButton.addActionListener((GraphicController)this.getController());
		this.add(this.clearButton, BorderLayout.SOUTH);
	}

	/**
	 * Creates controller.
	 *
	 * @param ShapeModel model
	 * @param ShapeView view
	 * @return ShapeController
	 */
	@Override
	ShapeController makeController(ShapeModel model, ShapeView view) {
		GraphicController controller = new GraphicController(model, view);
		return controller;
	}

	/**
	 * Causes redrawing of image panel if model has changed.
	 * 
	 * @param Observable o
	 * @param Object o1
	 */
	@Override
	public void update(Observable o, Object o1) {
		this.imagePanel.repaint();
	}
}
