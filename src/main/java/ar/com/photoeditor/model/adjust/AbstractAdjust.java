package ar.com.photoeditor.model.adjust;

import ar.com.photoeditor.model.pixel.Pixel;

public abstract class AbstractAdjust {
	public abstract Pixel[][] applyMethod(Pixel img[][],Double n);
	

}
