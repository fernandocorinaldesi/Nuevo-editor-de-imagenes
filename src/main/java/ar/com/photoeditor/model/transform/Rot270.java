package ar.com.photoeditor.model.transform;

import ar.com.photoeditor.model.pixel.Pixel;

public class Rot270 extends AbstractTransform {

	@Override
	public Pixel[][] applyMethod(Pixel[][] img) {
		// TODO Auto-generated method stub
		Pixel aux[][] = new Pixel[img[1].length][img.length];
		for (int j = 0; j < img[1].length; j++) {
			int t = 0;
			for (int i = img.length - 1; i >= 0; i--) {
				aux[j][t] = img[i][j];
				t++;
			}
		}
		return aux;
	}

}
