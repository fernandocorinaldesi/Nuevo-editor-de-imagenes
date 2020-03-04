package ar.com.photoeditor.swing.customs;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ar.com.photoeditor.swing.values.Colors;

public class MyTitleBar extends JLabel {

  private static final long serialVersionUID = 1L;

  private Point p1;
  private Point p2;
  private JLabel mini;
  private JLabel close;
  private JFrame mainFrame;

  public MyTitleBar(JFrame mainFrame,String s) {
    this.mainFrame = mainFrame;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    if(s.contentEquals("main")) {
    	setHorizontalAlignment(JLabel.LEFT);
    	Image image = toolkit.getImage(getClass().getResource("/images/logomain2.png"));
    	setIcon(new ImageIcon(image));
    	setPreferredSize(new Dimension(900,62));
       	setBackground(Colors.BACK);
    }
    setOpaque(true);
    setLayout(new FlowLayout(FlowLayout.RIGHT));
    add(getLabelMini());
    add(getLabelClose());
   
    addMouseListener();
    addMouseMotionListener();
  }

  private void addMouseListener() {
    addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        p1 = new Point(e.getX(), e.getY());
      }
    });
  }

  private void addMouseMotionListener() {
    addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent e) {
        p2 = MouseInfo.getPointerInfo().getLocation();
        mainFrame.setLocation(p2.x - p1.x, p2.y - p1.y);
      }
    });
  }

  private JLabel getLabelClose() {
    if (close == null) {
      close = new JLabel();
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage(getClass().getResource("/images/close.png"));
      ImageIcon icon = new ImageIcon(image);
      close.setIcon(icon);
      close.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
          closeFrame();
          System.exit(0);
        }
      });
    }
    return close;
  }

  public void closeFrame() {
    mainFrame.setVisible(false);
    mainFrame.dispose();
  }

  private JLabel getLabelMini() {
    if (mini == null) {
      mini = new JLabel();
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage(getClass().getResource("/images/mini.png"));
      ImageIcon icon = new ImageIcon(image);
      mini.setIcon(icon);
      mini.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
          iconifiedFrame();
        }
      });
    }
    return mini;
  }

  public void iconifiedFrame() {
    mainFrame.setState(JFrame.ICONIFIED);
  }

}
