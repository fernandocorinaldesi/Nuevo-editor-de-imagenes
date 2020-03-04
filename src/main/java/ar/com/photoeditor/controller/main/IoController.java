package ar.com.photoeditor.controller.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

public class IoController implements IoControllerOperations{
	@Override
	public BufferedImage open(File file) {
		BufferedImage img=null;
		if (file != null) {
			try {
				img = ImageIO.read(file);
			
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		return img;
		
	}
	@Override
	public void save(File file,BufferedImage image) {
	   try {
			ImageOutputStream imageOutput=ImageIO.createImageOutputStream(file);
		    ImageIO.write(image,"bmp",imageOutput);
		    imageOutput.close();
		} catch (IOException e) {
		  
			e.printStackTrace();
		}
		
	}

}
