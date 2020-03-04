package ar.com.photoeditor.model.filters;

import ar.com.photoeditor.model.pixel.Pixel;

public class Mediana extends AbstractFilter{

	@Override
	public Pixel[][] applyMethod(Pixel[][] p) {
		// TODO Auto-generated method stub
		Pixel[][] f = new Pixel[p.length][p[1].length];
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[1].length; j++) {
				if (i > 0 && i < p.length - 1 && j > 0 && j < p[1].length - 1) {
					mascara(p, i, j);
					f[i][j] = new Pixel(medianaaux()[0],medianaaux()[1],medianaaux()[2]);
				} else {
					f[i][j] = new Pixel(p[i][j].getR(),p[i][j].getG(),p[i][j].getB());
				}
			}
		}
		return f;
	}
	static int [] medianaaux() {
		burbujamenormayor(rarray);
		burbujamenormayor(garray);
		burbujamenormayor(barray);
		return new int[]{rarray[4],garray[4],barray[4]};
	}
	static void burbujamenormayor(int[] enteros) {
		int aux;
		int b = 1;
		for (int i = 0; i < enteros.length - 1 && b == 1; i++) {
			b = 0;
			for (int j = 0; j < enteros.length - 1 - i; j++) {
				if (enteros[j] > enteros[j + 1]) {
					aux = enteros[j];
					enteros[j] = enteros[j + 1];
					enteros[j + 1] = aux;
					b = 1;
				}
			}
		}

	}

}
