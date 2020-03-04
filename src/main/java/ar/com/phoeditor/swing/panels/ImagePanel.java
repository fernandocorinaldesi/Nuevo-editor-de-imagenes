package ar.com.phoeditor.swing.panels;

import static javax.swing.BorderFactory.createTitledBorder;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import ar.com.photoeditor.model.io.ImageFormatConvert;
import ar.com.photoeditor.model.pixel.Pixel;
import ar.com.photoeditor.swing.main.MainView;
import ar.com.photoeditor.swing.values.Colors;

public class ImagePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel result_image;
	private BufferedImage img;
	private BufferedImage original;
	private ImageFormatConvert image;
	private MainView main;

	public ImagePanel(MainView main) {
		this.image = new ImageFormatConvert();
		this.main = main;
		setLayout(new BorderLayout());
		add(imagePane(), BorderLayout.CENTER);
		setBackground(Colors.BACKIMAGE);
		setBorder(createTitledBorder(null, "imagen", TitledBorder.CENTER, TitledBorder.BOTTOM));
	}

	public JLabel getLabelImg() {
		result_image = new JLabel();
		result_image.setIcon(new ImageIcon());
		return result_image;
	}
	 public JScrollPane imagePane() {
		    JScrollPane pane = new JScrollPane(getLabelImg());
		    pane.setBorder(null);
		    /*pane.getVerticalScrollBar().setPreferredSize(new Dimension(5, 0));
		    pane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 5));*/
		    return pane;
		  }

	public void setOpenImage(BufferedImage img) {
		this.img=img;
		this.original=img;
		this.result_image.setIcon(new ImageIcon(img));
	}

	public void setResultimg(Pixel[][] p) {
		this.img=image.pixelToBuffer(p);
		this.result_image.setIcon(new ImageIcon(img));
	}

	public Pixel[][] getImg() {
		return image.bufferToPixel(img);
	}
	public BufferedImage getBufferedImage() {
		return img;
	}
	public void setOriginal() {
		this.img=original;
		this.result_image.setIcon(new ImageIcon(img));
	}
	public BufferedImage getOriginal() {
		return original;
	}

}
