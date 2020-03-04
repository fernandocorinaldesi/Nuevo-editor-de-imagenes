package ar.com.phoeditor.swing.panels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import ar.com.photoeditor.controller.main.AdjustControllerOperations;
import ar.com.photoeditor.swing.main.MainView;
import ar.com.photoeditor.swing.values.Colors;
import ar.com.photoeditor.swing.values.Fonts;

public class AdjustPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	MainView main;
	JButton one;
	JButton two;
	JButton three;
	ImagePanel ipane;
	JSlider cslider;
	JSlider bslider;
	JSlider bred;
	JSlider bgreen;
	JSlider bblue;
	AdjustControllerOperations controller;

	public AdjustPanel(MainView main) {
		this.main = main;
		this.ipane = main.getIpane();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		Border line = BorderFactory.createLineBorder(Color.WHITE, 2);
		setBorder(BorderFactory.createTitledBorder(line, "AJUSTES", TitledBorder.CENTER, TitledBorder.TOP, Fonts.MONO,
				Color.WHITE));
		setBackground(Colors.BACK);
		initButtons();
		initListeners();
		sliderState(false);
	}

	public void initListeners() {
		cslider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				Double value = (double) cslider.getValue();
				ipane.setResultimg(controller.adjustCont(ipane.getImg(), value / 100));

			}
		});
		bslider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				Double value = (double) bslider.getValue();
				ipane.setResultimg(controller.adjustBrig(ipane.getImg(), value));

			}
		});
		bred.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				Double value = (double) bred.getValue();
				ipane.setResultimg(controller.balanceRed(ipane.getImg(), value));

			}
		});
		bblue.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				Double value = (double) bblue.getValue();
				ipane.setResultimg(controller.balanceBlue(ipane.getImg(), value));

			}
		});
		bgreen.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				Double value = (double) bgreen.getValue();
				ipane.setResultimg(controller.balanceGreen(ipane.getImg(), value));

			}
		});

	}

	public void initButtons() {
		cslider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		cslider.setInverted(false);
		cslider.setPaintTicks(true); // las rayitas que marcan los números
		cslider.setMajorTickSpacing(25);
		cslider.setBorder(BorderFactory.createTitledBorder(null, "Contraste", TitledBorder.CENTER, TitledBorder.TOP,
				Fonts.MONO, Color.WHITE));
		cslider.setPreferredSize(new Dimension(120, 55));
		add(cslider);
		bslider = new JSlider(JSlider.HORIZONTAL, -255, 255, 0);
		bslider.setInverted(false);
		bslider.setPaintTicks(true); // las rayitas que marcan los números
		bslider.setMajorTickSpacing(25);
		bslider.setBorder(BorderFactory.createTitledBorder(null, "Brillo", TitledBorder.CENTER, TitledBorder.TOP,
				Fonts.MONO, Color.WHITE));
		bslider.setPreferredSize(new Dimension(120, 55));
		add(bslider);
		add(balance());
	}

	public JPanel balance() {
		JPanel pane = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		bred = new JSlider(JSlider.HORIZONTAL, -25, 25, 0);
		bred.setInverted(false);
		bred.setPaintTicks(true); // las rayitas que marcan los números
		bred.setMajorTickSpacing(25);
		bred.setPreferredSize(new Dimension(130, 55));
		bred.setBorder(BorderFactory.createTitledBorder(null, "Rojo", TitledBorder.CENTER, TitledBorder.TOP, Fonts.MONO,
				Color.WHITE));
		pane.setBackground(Colors.BACK);
		pane.add(bred);
		bblue = new JSlider(JSlider.HORIZONTAL, -25, 25, 0);
		bblue.setInverted(false);
		bblue.setPaintTicks(true); // las rayitas que marcan los números
		bblue.setMajorTickSpacing(25);
		bblue.setPreferredSize(new Dimension(130, 55));
		bblue.setBorder(BorderFactory.createTitledBorder(null, "Azul", TitledBorder.CENTER, TitledBorder.TOP,
				Fonts.MONO, Color.WHITE));
		pane.add(bblue);
		bgreen = new JSlider(JSlider.HORIZONTAL, -25, 25, 0);
		bgreen.setInverted(false);
		bgreen.setPaintTicks(true); // las rayitas que marcan los números
		bgreen.setMajorTickSpacing(25);
		bgreen.setPreferredSize(new Dimension(130, 55));
		bgreen.setBorder(BorderFactory.createTitledBorder(null, "Verde", TitledBorder.CENTER, TitledBorder.TOP,
				Fonts.MONO, Color.WHITE));
		pane.add(bgreen);
		pane.setBorder(BorderFactory.createTitledBorder(null, "Balance", TitledBorder.CENTER, TitledBorder.TOP,
				Fonts.MONO, Color.WHITE));
		return pane;
	}

	public void setController(AdjustControllerOperations controller) {
		this.controller = controller;
	}

	public void sliderDefault() {
		bred.setValue(0);
		bgreen.setValue(0);
		bblue.setValue(0);
		cslider.setValue(100);
		bslider.setValue(0);
	}

	public void sliderState(Boolean b) {
		bred.setEnabled(b);
		bgreen.setEnabled(b);
		bblue.setEnabled(b);
		cslider.setEnabled(b);
		bslider.setEnabled(b);
	}

}
