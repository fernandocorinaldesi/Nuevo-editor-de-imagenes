package ar.com.photoeditor.controller.main;

import ar.com.photoeditor.model.filters.FilterAlgorithmContext;
import ar.com.photoeditor.model.pixel.Pixel;

public class FilterController implements FilterControllerOperations{
	FilterAlgorithmContext selector;
	
	
	public FilterController(FilterAlgorithmContext selector) {
		this.selector=selector;
	}
	@Override
	public Pixel[][] filterNeg(Pixel[][] img) {
		// TODO Auto-generated method stub
		return selector.getInstanceNegative().applyMethod(img);
	}

	@Override
	public Pixel[][] filterGray(Pixel[][] img) {
		// TODO Auto-generated method stub
		return  selector.getInstanceGray().applyMethod(img);
	}

	@Override
	public Pixel[][] filterMin(Pixel[][] img) {
		// TODO Auto-generated method stub
		return  selector.getInstanceMin().applyMethod(img);
	}

	@Override
	public Pixel[][] filterMax(Pixel[][] img) {
		// TODO Auto-generated method stub
		return  selector.getInstanceMax().applyMethod(img);
	}

	@Override
	public Pixel[][] filterMed(Pixel[][] img) {
		// TODO Auto-generated method stub
		return  selector.getInstanceMed().applyMethod(img);
	}

	@Override
	public Pixel[][] filterBlur(Pixel[][] img) {
		// TODO Auto-generated method stub
		return selector.getInstanceBlur().applyMethod(img);
	}

}
