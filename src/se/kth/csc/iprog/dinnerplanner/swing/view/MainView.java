package se.kth.csc.iprog.dinnerplanner.swing.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;


public class MainView extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JLabel label = new JLabel();
	JButton plusButton = new JButton();
	JButton minusButton = new JButton();
	DinnerModel model;
	
	public MainView(DinnerModel model){

		this.model = model;
		label.setText("Number of dishes in the model:" + model.getDishes().size());
		this.add(label);
		
		
		//here you set other layout elements
	}
	
}
