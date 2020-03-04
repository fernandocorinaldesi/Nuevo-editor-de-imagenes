package ar.com.photoeditor.model.filters;

import ar.com.photoeditor.model.pixel.Pixel;

public class Blur extends AbstractFilter {

	@Override
	public Pixel[][] applyMethod(Pixel[][] p) {
		// TODO Auto-generated method stub
		Pixel[][] f = new Pixel[p.length][p[1].length];
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[1].length; j++) {
				if (i > 0 && i < p.length - 1 && j > 0 && j < p[1].length - 1) {
					mascara(p, i, j);
					f[i][j] = new Pixel(mediaaux()[0], mediaaux()[1], mediaaux()[2]);
				} else {
					f[i][j] = new Pixel(p[i][j].getR(), p[i][j].getG(), p[i][j].getB());
				}
			}
		}
		return f;
	}

	static int[] mediaaux() {
		int r = 0, g = 0, b = 0;
		for (int i = 0; i < 9; i++) {
			r = r + rarray[i];
			g = g + garray[i];
			b = b + barray[i];
		}
		return new int[] { (int) r / 9, (int) g / 9, (int) b / 9 };
	}
}
