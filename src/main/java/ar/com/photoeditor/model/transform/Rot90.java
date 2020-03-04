package ar.com.photoeditor.model.transform;

import ar.com.photoeditor.model.pixel.Pixel;

public class Rot90 extends AbstractTransform{

	@Override
	public Pixel[][] applyMethod(Pixel[][] img) {
		// TODO Auto-generated method stub
		Pixel aux[][] = new Pixel[img[1].length][img.length];
		int t=0;
			for(int j=img[1].length-1;j>=0;j--)
			{
				for(int i=0;i<img.length;i++)
				{
					aux[t][i]=img[i][j];
				}
				t++;
			}
			
			return aux;
		    }
	}




