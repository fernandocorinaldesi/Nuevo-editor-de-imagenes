package ar.com.photoeditor.model.filters;

import ar.com.photoeditor.model.pixel.Pixel;

public class Gray extends AbstractFilter{

	@Override
	public Pixel[][] applyMethod(Pixel[][] img) {
		// TODO Auto-generated method stub
		int r,g,b=0;
		for(int i=0;i<img.length;i++) {
			for(int j=0;j<img[1].length;j++) {
				 r=img[i][j].getR();
				 g=img[i][j].getG();
				 b=img[i][j].getB();
				 int rgb= (int) (0.299*r+ 0.587*g + 0.114*b);
				img[i][j]=new Pixel(rgb,rgb,rgb);
			}
			}
		return img;
	}

}
