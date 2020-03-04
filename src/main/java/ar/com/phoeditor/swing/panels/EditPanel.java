package ar.com.phoeditor.swing.panels;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import ar.com.photoeditor.controller.main.EditControllerOperations;
import ar.com.photoeditor.swing.customs.SideButton;
import ar.com.photoeditor.swing.main.MainView;
import ar.com.photoeditor.swing.values.Colors;
import ar.com.photoeditor.swing.values.Fonts;

public class EditPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton scale;
	JButton crop;
	EditControllerOperations controller;
	ImagePanel ipane;
	MainView main;
	
	public EditPanel(MainView main){
		this.main=main;
		this.ipane=main.getIpane();
		//setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setLayout(new GridLayout(5,1));
		//setLayout(new FlowLayout());
		setBackground(Colors.BACK);
		Border line = BorderFactory.createLineBorder(Color.WHITE, 2);
		setBorder(BorderFactory.createTitledBorder(line, "EDICION", TitledBorder.CENTER, 
				TitledBorder.TOP,Fonts.MONO, Color.WHITE));
		initButtons();
		initListeners();
	}
	public void initListeners() {
		/*crop.addActionListener((event) -> {
			ipane.setResultimg(controller.filterNeg(ipane.getImg()));
		});
		scale.addActionListener((event) -> {
			ipane.setResultimg(controller.filterGray(ipane.getImg()));
		});*/
			
	
	}
	public void initButtons() {
		scale=new SideButton("ESCALA",null);
		add(scale);
		crop=new SideButton("RECORTE",null);
		add(crop);
		
	}
	public void buttonState(Boolean b) {
		scale.setEnabled(b);
		crop.setEnabled(b);
	
	}

	public void setController(EditControllerOperations controller) {
		// TODO Auto-generated method stub
		this.controller=controller;
	}

}
