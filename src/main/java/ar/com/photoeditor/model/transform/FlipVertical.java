package ar.com.photoeditor.model.transform;

import ar.com.photoeditor.model.pixel.Pixel;

public class FlipVertical extends AbstractTransform {

	@Override
	public Pixel[][] applyMethod(Pixel[][] img) {
		// TODO Auto-generated method stub
		Pixel aux[][] = new Pixel[img.length][img[1].length];
		int t = 0;
		for (int i = img.length - 1; i >= 0; i--) {
			for (int j = 0; j < img[1].length; j++) {
				aux[t][j] = img[i][j];
			}
			t++;
		}
		return aux;
	}

}
