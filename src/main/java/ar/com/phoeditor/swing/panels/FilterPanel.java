package ar.com.phoeditor.swing.panels;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import ar.com.photoeditor.controller.main.FilterControllerOperations;
import ar.com.photoeditor.swing.customs.SideButton;
import ar.com.photoeditor.swing.main.MainView;
import ar.com.photoeditor.swing.values.Colors;
import ar.com.photoeditor.swing.values.Fonts;

public class FilterPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	JButton med;
	JButton min;
	JButton max;
	JButton neg;
	JButton gray;
	JButton suav;
	FilterControllerOperations controller;
	ImagePanel ipane;
	MainView main;
	
	public FilterPanel(MainView main){
		this.main=main;
		this.ipane=main.getIpane();
		//setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setLayout(new GridLayout(6,1));
		setBackground(Colors.BACK);
		Border line = BorderFactory.createLineBorder(Color.WHITE, 2);
		setBorder(BorderFactory.createTitledBorder(line, "FILTROS", TitledBorder.CENTER, 
				TitledBorder.TOP,Fonts.MONO, Color.WHITE));
		initButtons();
		initListeners();
	}
	public void initListeners() {
		neg.addActionListener((event) -> {
			ipane.setResultimg(controller.filterNeg(ipane.getImg()));
		});
		gray.addActionListener((event) -> {
			ipane.setResultimg(controller.filterGray(ipane.getImg()));
		});
		suav.addActionListener((event) -> {
			ipane.setResultimg(controller.filterBlur(ipane.getImg()));
		});
		min.addActionListener((event) -> {
			ipane.setResultimg(controller.filterMin(ipane.getImg()));
		});
		max.addActionListener((event) -> {
			ipane.setResultimg(controller.filterMax(ipane.getImg()));
		});
		med.addActionListener((event) -> {
			ipane.setResultimg(controller.filterMed(ipane.getImg()));
		});
		
	
	}
	public void initButtons() {
		neg=new SideButton("","/images/negativo.png");
		add(neg);
		gray=new SideButton("","/images/grises.png");
		add(gray);
		suav=new SideButton("","/images/media.png");
		add(suav);
		med=new SideButton("","/images/mediana.png");
		add(med);
		min=new SideButton("","/images/minimo.png");
		
		add(min);
		max=new SideButton("","/images/maximo.png");
		add(max);
	}
	public void buttonState(Boolean b) {
		neg.setEnabled(b);
		gray.setEnabled(b);
		suav.setEnabled(b);
		min.setEnabled(b);
		max.setEnabled(b);
		med.setEnabled(b);
	}

	public void setController(FilterControllerOperations controller) {
		// TODO Auto-generated method stub
		this.controller=controller;
	}
}
