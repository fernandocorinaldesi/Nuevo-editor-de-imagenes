package ar.com.photoeditor.model.adjust;

import ar.com.photoeditor.model.pixel.Pixel;

public class Gamma extends AbstractAdjust{

	@Override
	public Pixel[][] applyMethod(Pixel[][] img, Double n) {
		// TODO Auto-generated method stub
		int r, g, b = 0;
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[1].length; j++) {
				r=(int) Math.pow(255*((float)img[i][j].getR()/255), n);
				g=(int) Math.pow(255*((float)img[i][j].getG()/255), n);
				b=(int) Math.pow(255*((float)img[i][j].getB()/255), n);
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
