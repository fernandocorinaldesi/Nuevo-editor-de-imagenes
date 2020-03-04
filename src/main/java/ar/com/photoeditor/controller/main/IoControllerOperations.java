package ar.com.photoeditor.controller.main;

import java.awt.image.BufferedImage;
import java.io.File;

public interface IoControllerOperations {
	
	public BufferedImage open(File file);
	public void save(File file,BufferedImage image);

}
