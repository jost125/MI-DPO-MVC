package view;

import control.ShapeController;
import control.TableController;
import java.awt.BorderLayout;
import java.util.Observable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.ShapeModel;

public class TableView extends ShapeView {

	public TableView (ShapeModel model) {
		this.initialize(model);

		this.setLayout(new BorderLayout());

		TableController controller = (TableController)this.getController();
		JTable squareTable = new JTable(controller.getSquareTableModel());
		JTable circleTable = new JTable(controller.getCircleTableModel());

		JPanel north = new JPanel(new BorderLayout());
		north.add(new JLabel("Squares"), BorderLayout.NORTH);
		north.add(new JScrollPane(squareTable), BorderLayout.SOUTH);

		JPanel south = new JPanel(new BorderLayout());
		south.add(new JLabel("Circles"), BorderLayout.NORTH);
		south.add(new JScrollPane(circleTable), BorderLayout.SOUTH);

		this.add(north, BorderLayout.WEST);
		this.add(south, BorderLayout.EAST);
	}

	@Override
	ShapeController makeController(ShapeModel model, ShapeView view) {
		return new TableController(model, view);
	}

	@Override
	public void update(Observable o, Object o1) {
		// nothing here
	}
}
