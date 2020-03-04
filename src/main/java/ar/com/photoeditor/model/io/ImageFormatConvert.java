package ar.com.photoeditor.model.io;

import java.awt.Color;
import java.awt.image.BufferedImage;

import ar.com.photoeditor.model.pixel.Pixel;

public class ImageFormatConvert {
	Pixel[][] pixels;
	BufferedImage image;

	public Pixel[][] bufferToPixel(BufferedImage image) {
		this.image = image;
		int width = image.getWidth();
		int height = image.getHeight();
		Pixel[][] result = new Pixel[height][width];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[1].length; j++) {
				int pixel = image.getRGB(j, i);
				Color color = new Color(pixel);
				int r = color.getRed();
				int g = color.getGreen();
				int b = color.getBlue();
				result[i][j] = new Pixel(r, g, b);
			}

		}
		return result;
	}

	public BufferedImage pixelToBuffer(Pixel[][] pixels) {
		this.pixels = pixels;
		BufferedImage image = new BufferedImage(pixels[1].length, pixels.length, 2);
		System.out.println("pase por aqui");
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[1].length; j++) {
				Color c = new Color(pixels[i][j].getR(), pixels[i][j].getG(), pixels[i][j].getB());
				image.setRGB(j, i, c.getRGB());
			}
		}
		return image;
	}

}
