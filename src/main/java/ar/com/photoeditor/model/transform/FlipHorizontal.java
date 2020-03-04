package ar.com.photoeditor.model.transform;

import ar.com.photoeditor.model.pixel.Pixel;

public class FlipHorizontal extends AbstractTransform{

	@Override
	public Pixel[][] applyMethod(Pixel[][] img) {
		// TODO Auto-generated method stub
		Pixel aux[][] = new Pixel[img.length][img[1].length];
		for(int i=0;i<img.length;i++)
		{    
			int t=0;
			for(int j=img[1].length-1;j>=0;j--)
			{
				aux[i][t]=img[i][j];
				t++;
			}
		}
		return aux;
	}



}
