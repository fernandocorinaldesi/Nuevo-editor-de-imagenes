package ar.com.phoeditor.swing.panels;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import ar.com.photoeditor.controller.main.TransformControllerOperations;
import ar.com.photoeditor.swing.customs.SideButton;
import ar.com.photoeditor.swing.main.MainView;
import ar.com.photoeditor.swing.values.Colors;
import ar.com.photoeditor.swing.values.Fonts;

public class TransformPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	MainView main;
	SideButton b180;
	SideButton b270;
	SideButton b90;
	SideButton fver;
	SideButton fhor;
	TransformControllerOperations controller;
	ImagePanel ipane;
	
	public TransformPanel(MainView main){
		this.main=main;
		this.ipane=main.getIpane();
		setLayout(new GridLayout(5,1));
		setBackground(Colors.BACK);
		Border line = BorderFactory.createLineBorder(Color.WHITE, 2);
		setBorder(BorderFactory.createTitledBorder(line, "TRANSFORMACIONES", TitledBorder.CENTER, 
				TitledBorder.TOP,Fonts.MONO, Color.WHITE));
		initButtons();
		initListeners();
	}
	public void initListeners() {
		b180.addActionListener((event) -> {
			ipane.setResultimg(controller.rot180(ipane.getImg()));
		});
		b90.addActionListener((event) -> {
			ipane.setResultimg(controller.rot90(ipane.getImg()));
		});
		b270.addActionListener((event) -> {
			ipane.setResultimg(controller.rot270(ipane.getImg()));
		});
		fver.addActionListener((event) -> {
			ipane.setResultimg(controller.flipVer(ipane.getImg()));
		});
		fhor.addActionListener((event) -> {
			ipane.setResultimg(controller.flipHor(ipane.getImg()));
		});
	}
	public void initButtons() {
		b180=new SideButton("", "/images/180.png");
		add(b180);
		b270=new SideButton("","/images/270.png");
		add(b270);
		b90=new SideButton("","/images/90.png");
		add(b90);
		fver=new SideButton("","/images/Vertical.png");
		add(fver);
		fhor=new SideButton("","/images/Horizontal.png");
		add(fhor);
	}
	public void setController(TransformControllerOperations controller) {
		this.controller=controller;
	}
	public void buttonState(Boolean b) {
		b180.setEnabled(b);
		b270.setEnabled(b);
		b90.setEnabled(b);
		fver.setEnabled(b);
		fhor.setEnabled(b);
	}

}
