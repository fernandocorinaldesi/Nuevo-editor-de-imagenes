package ar.com.photoeditor.model.filters;

import ar.com.photoeditor.model.pixel.Pixel;

public class Max extends AbstractFilter {

	@Override
	public Pixel[][] applyMethod(Pixel[][] p) {
		// TODO Auto-generated method stub
		Pixel[][] f = new Pixel[p.length][p[1].length];
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[1].length; j++) {
				if (i > 0 && i < p.length - 1 && j > 0 && j < p[1].length - 1) {
					mascara(p, i, j);
					f[i][j] = new Pixel(maxaux()[0], maxaux()[1], maxaux()[2]);
				} else {
					f[i][j] = new Pixel(p[i][j].getR(), p[i][j].getG(), p[i][j].getB());
				}
			}
		}
		return f;
	}

	static int[] maxaux() {
		int r = maximo(rarray);
		int g = maximo(garray);
		int b = maximo(barray);
		return new int[] { r, g, b };
	}

	static int maximo(int enteros[]) {
		int maximo = enteros[0];
		for (int i = 0; i < enteros.length; i++) {
			if (maximo < enteros[i]) {
				maximo = enteros[i];
			}
		}
		return maximo;
	}

}
