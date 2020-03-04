package ar.com.photoeditor.model.transform;

import ar.com.photoeditor.model.pixel.Pixel;

public abstract class AbstractTransform {

	public abstract Pixel[][] applyMethod(Pixel img[][]);

}
