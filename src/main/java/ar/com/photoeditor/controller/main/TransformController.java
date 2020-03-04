package ar.com.photoeditor.controller.main;

import ar.com.photoeditor.model.pixel.Pixel;
import ar.com.photoeditor.model.transform.TransformAlgorithmContext;

public class TransformController implements TransformControllerOperations {
	TransformAlgorithmContext selector;
	

	public TransformController(TransformAlgorithmContext selector) {
		this.selector = selector;
	}

	@Override
	public Pixel[][] rot180(Pixel[][] img) {
		// TODO Auto-generated method stub
		return selector.getInstanceRot180().applyMethod(img);
	}

	@Override
	public Pixel[][] rot90(Pixel[][] img) {
		// TODO Auto-generated method stub
		return selector.getInstanceRot90().applyMethod(img);
	}

	@Override
	public Pixel[][] rot270(Pixel[][] img) {
		// TODO Auto-generated method stub
		return selector.getInstanceRot270().applyMethod(img);
	}

	@Override
	public Pixel[][] flipVer(Pixel[][] img) {
		// TODO Auto-generated method stub
		return selector.getInstanceFlipVertical().applyMethod(img);
	}

	@Override
	public Pixel[][] flipHor(Pixel[][] img) {
		// TODO Auto-generated method stub
		return selector.getInstanceFlipHorizontal().applyMethod(img);
	}

}
