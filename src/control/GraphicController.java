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

public class GraphicController extends ShapeController implements MouseListener, ActionListener {
	
	public GraphicController(ShapeModel model, ShapeView view) {
		this.initialize(model, view);
	}

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

	@Override
	public void mousePressed(MouseEvent me) {
		// nothing here
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// nothing here
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		// nothing here
	}

	@Override
	public void mouseExited(MouseEvent me) {
		// nothing here
	}

	@Override
	public void update(Observable o, Object o1) {
		// nothing here
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		this.getModel().clearAll();
	}
}
