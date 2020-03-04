package ar.com.photoeditor.model.transform;

import ar.com.photoeditor.model.pixel.Pixel;

public class Rot180 extends AbstractTransform {

	@Override
	public Pixel[][] applyMethod(Pixel[][] img) {
		// TODO Auto-generated method stub
		Pixel aux[][] = new Pixel[img.length][img[1].length];
		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux[1].length; j++) {
				aux[aux.length - i - 1][aux[1].length - j - 1] = img[i][j];
			}
		}
		return aux;
	}

}
