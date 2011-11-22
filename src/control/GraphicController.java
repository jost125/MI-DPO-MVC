package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import model.ShapeModel;
import model.entity.Circle;
import model.entity.Square;
import view.ShapeView;

/**
 * Concrete controller, handles request from GraphicView.
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class GraphicController extends ShapeController implements MouseListener, ActionListener {
	/**
	 * Takes reference of model layer and view layer.
	 *
	 * @param ShapeModel model
	 * @param ShapeView view
	 */
	public GraphicController(ShapeModel model, ShapeView view) {
		this.initialize(model, view);
	}

	/**
	 * Handles clicks on JPanel with shapes.
	 *
	 * @param MouseEvent me
	 */
	@Override
	public void mouseClicked(MouseEvent me) {

		switch (me.getButton()) {
			
			case MouseEvent.BUTTON1:
				Circle circle = new Circle();
				circle.setX(me.getX());
				circle.setY(me.getY());
				circle.setRadius(10);

				this.getModel().addCircle(circle);
				break;
				
			case MouseEvent.BUTTON3:
				Square square = new Square();
				square.setX(me.getX());
				square.setY(me.getY());
				square.setEdge(10);

				this.getModel().addSquare(square);
				break;
				
			default:
				return;
		}
	}

	/**
	 * Unneeded
	 *
	 * @param MouseEvent me
	 */
	@Override
	public void mousePressed(MouseEvent me) {
		// nothing here
	}

	/**
	 * Unneeded
	 *
	 * @param MouseEvent me
	 */
	@Override
	public void mouseReleased(MouseEvent me) {
		// nothing here
	}

	/**
	 * Unneeded
	 *
	 * @param MouseEvent me
	 */
	@Override
	public void mouseEntered(MouseEvent me) {
		// nothing here
	}

	/**
	 * Unneeded
	 *
	 * @param MouseEvent me
	 */
	@Override
	public void mouseExited(MouseEvent me) {
		// nothing here
	}

	/**
	 *
	 * Unneeded (there is nothing to be updated)
	 *
	 * @param Observable o
	 * @param Object o1
	 */
	@Override
	public void update(Observable o, Object o1) {
		// nothing here
	}

	/**
	 * Handles clicks on clear all button.
	 *
	 * @param ActionEvent ae
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		this.getModel().clearAll();
	}
}
