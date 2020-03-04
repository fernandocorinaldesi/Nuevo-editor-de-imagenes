package ar.com.phoeditor.swing.panels;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import ar.com.photoeditor.controller.main.IoControllerOperations;
import ar.com.photoeditor.swing.customs.SideButton;
import ar.com.photoeditor.swing.main.MainView;
import ar.com.photoeditor.swing.main.MainViewOperations;
import ar.com.photoeditor.swing.values.Colors;
import ar.com.photoeditor.swing.values.Fonts;

public class IoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton open;
	private JButton save;
	public JButton backToOriginal;
	private ImagePanel ipane;
	private AdjustPanel apane;
	private MainViewOperations main;
	private IoControllerOperations controller;

	public IoPanel(MainView main) {
		this.main = main;
		this.ipane = main.getIpane();
		this.apane = main.getApane();
		setLayout(new GridLayout(3, 1, 0, 0));
		initButtons();
		setBackground(Colors.BACK);
		Border line = BorderFactory.createLineBorder(Color.WHITE, 2);
		setBorder(BorderFactory.createTitledBorder(line, "ARCHIVO", TitledBorder.CENTER, TitledBorder.TOP, Fonts.MONO,
				Color.WHITE));
	}

	private File getOpenFile() {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(new FileNameExtensionFilter("imagen BMP", "bmp"));
		if (chooser.showOpenDialog(this) == 0) {
			return chooser.getSelectedFile();
		}
		return null;
	}

	private File getSaveFile() {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(new FileNameExtensionFilter("imagen BMP", "bmp"));
		if (chooser.showSaveDialog(this) == 0) {
			return chooser.getSelectedFile();
		}
		return null;
	}

	private void initButtons() {
		open = new SideButton("", "/images/Abrir.png");
		save = new SideButton("", "/images/Guardar.png");
		backToOriginal = new SideButton("", "/images/original.png");
		add(open);
		add(save);
		add(backToOriginal);
		open.addActionListener((event) -> {
			ipane.setOpenImage(controller.open(getOpenFile()));
			main.setDefaults(true);
		});
		save.addActionListener((event) -> {
			controller.save(getSaveFile(), ipane.getBufferedImage());
		});
		backToOriginal.addActionListener((event) -> {
			ipane.setOriginal();
			apane.sliderDefault();
		});
	}

	public void setController(IoControllerOperations controller) {
		this.controller = controller;
	}
}
