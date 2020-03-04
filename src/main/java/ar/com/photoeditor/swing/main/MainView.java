package ar.com.photoeditor.swing.main;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ar.com.phoeditor.swing.panels.AdjustPanel;
import ar.com.phoeditor.swing.panels.EditPanel;
import ar.com.phoeditor.swing.panels.FilterPanel;
import ar.com.phoeditor.swing.panels.ImagePanel;
import ar.com.phoeditor.swing.panels.IoPanel;
import ar.com.phoeditor.swing.panels.TransformPanel;
import ar.com.photoeditor.controller.main.AdjustControllerOperations;
import ar.com.photoeditor.controller.main.EditControllerOperations;
import ar.com.photoeditor.controller.main.FilterControllerOperations;
import ar.com.photoeditor.controller.main.IoControllerOperations;
import ar.com.photoeditor.controller.main.TransformControllerOperations;
import ar.com.photoeditor.swing.customs.MyTitleBar;
import ar.com.photoeditor.swing.values.Colors;

public class MainView extends JFrame implements MainViewOperations {
	private static final long serialVersionUID = 1L;
	private JPanel control;
	private TransformPanel tpane;
	private AdjustPanel apane;
	private FilterPanel fpane;
	private IoPanel iopane;
	private ImagePanel ipane;
	private EditPanel epane;

	public MainView() {
		setSize(1100, 650);
		setLayout(new BorderLayout());
		createPanels();
		setUndecorated(true);
		open();
	}

	public JPanel controlPanelWest() {
		control = new JPanel();
		control.setLayout(new BoxLayout(control, BoxLayout.Y_AXIS));
		control.add(iopane);
		control.add(tpane);
		control.add(apane);
		control.setBackground(Colors.BACK);
		return control;
	}
	public JPanel controlPanelEast() {
		control = new JPanel();
		control.setLayout(new BoxLayout(control, BoxLayout.Y_AXIS));
		control.add(fpane);
		control.add(epane);
		control.setBackground(Colors.BACK);
		return control;
	}
	public void createPanels() {
		MyTitleBar titleView = new MyTitleBar(this, "main");
		ipane = new ImagePanel(this);
		apane = new AdjustPanel(this);
		tpane = new TransformPanel(this);
		fpane = new FilterPanel(this);
		iopane = new IoPanel(this);
		epane = new EditPanel(this);
		getContentPane().add(titleView, BorderLayout.NORTH);
		getContentPane().add(ipane, BorderLayout.CENTER);
		getContentPane().add(controlPanelWest(), BorderLayout.WEST);
		getContentPane().add(controlPanelEast(), BorderLayout.EAST);
	}
	public ImagePanel getIpane() {
		return ipane;
	}
	public AdjustPanel getApane() {
       return apane;
	}
	@Override
	public void open() {
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	@Override
	public void setController(TransformControllerOperations controller) {
		// TODO Auto-generated method stub
		tpane.setController(controller);

	}

	@Override
	public void setController(AdjustControllerOperations controller) {
		// TODO Auto-generated method stub
		apane.setController(controller);
	}

	@Override
	public void setController(IoControllerOperations controller) {
		// TODO Auto-generated method stub
		iopane.setController(controller);
	}

	@Override
	public void setDefaults(boolean b) {
		apane.sliderState(b);
		tpane.buttonState(b);
		fpane.buttonState(b);
		iopane.backToOriginal.setEnabled(b);
		// TODO Auto-generated method stub
	}

	@Override
	public void setController(FilterControllerOperations controller) {
		// TODO Auto-generated method stub
		fpane.setController(controller);
		
	}

	@Override
	public void setController(EditControllerOperations controller) {
		// TODO Auto-generated method stub
		epane.setController(controller);
		
	}

}
