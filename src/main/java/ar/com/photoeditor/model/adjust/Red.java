package ar.com.photoeditor.model.adjust;

import ar.com.photoeditor.model.pixel.Pixel;

public class Red extends AbstractAdjust{

	@Override
	public Pixel[][] applyMethod(Pixel[][] img, Double n) {
		// TODO Auto-generated method stub
		int r, g, b = 0;
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[1].length; j++) {
				r = (int) (img[i][j].getR() + n);
				g = (int) (img[i][j].getG() - n);
				b = (int) (img[i][j].getB() - n);
				if (r < 0)
					r = 0;
				if (r > 255)
					r = 255;
				if (g < 0)
					g = 0;
				if (g > 255)
					g = 255;
				if (b < 0)
					b = 0;
				if (b > 255)
					b = 255;
				img[i][j] = new Pixel(r, g, b);
			}
		}

		return img;
	}

}
