package ar.com.photoeditor.controller.main;

import ar.com.photoeditor.model.adjust.AdjustAlgorithmContext;
import ar.com.photoeditor.model.pixel.Pixel;

public class AdjustController implements AdjustControllerOperations{
	
	AdjustAlgorithmContext adjustselect;
	

	public AdjustController(AdjustAlgorithmContext adjustselect) {
		// TODO Auto-generated constructor stub
		this.adjustselect=adjustselect;
	}

	@Override
	public Pixel[][] adjustBrig(Pixel[][] img, Double num) {
		// TODO Auto-generated method stub
		return adjustselect.getInstanceBrightness().applyMethod(img, num);
	}

	@Override
	public Pixel[][] adjustCont(Pixel[][] img, Double num) {
		// TODO Auto-generated method stub
		return adjustselect.getInstanceContrast().applyMethod(img, num);
		
	}

	@Override
	public Pixel[][] gamma(Pixel[][] img, Double num) {
		// TODO Auto-generated method stub
	  return null;
	}

	@Override
	public Pixel[][] balanceRed(Pixel[][] img, Double num) {
		// TODO Auto-generated method stub
		return adjustselect.getInstanceRed().applyMethod(img, num);
	}

	@Override
	public Pixel[][] balanceGreen(Pixel[][] img, Double num) {
		// TODO Auto-generated method stub
		return adjustselect.getInstanceGreen().applyMethod(img, num);
	}

	@Override
	public Pixel[][] balanceBlue(Pixel[][] img, Double num) {
		// TODO Auto-generated method stub
		return adjustselect.getInstanceBlue().applyMethod(img, num);
	}


}
