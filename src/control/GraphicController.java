package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import model.ShapeModel;
import model.entity.Circle;
import model.entity.Square;
import view.ShapeView;

public class GraphicController extends ShapeController implements MouseListener {
	
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
		return;
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		return;
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		return;
	}

	@Override
	public void mouseExited(MouseEvent me) {
		return;
	}

	@Override
	public void update(Observable o, Object o1) {
		System.out.println(this.getClass());
	}
}
