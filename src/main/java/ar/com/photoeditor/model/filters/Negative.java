package ar.com.photoeditor.model.filters;

import ar.com.photoeditor.model.pixel.Pixel;

public class Negative extends AbstractFilter{

	
	public Pixel[][] applyMethod(Pixel[][] img) {
		// TODO Auto-generated method stub
		for(int i=0;i<img.length;i++) {
			for(int j=0;j<img[1].length;j++) {
				img[i][j]=new Pixel(255-img[i][j].getR(),255-img[i][j].getG(),255-img[i][j].getB());
			}
			}
		return img;
	}

}
