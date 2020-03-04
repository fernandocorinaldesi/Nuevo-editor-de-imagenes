package ar.com.photoeditor.controller.main;

import ar.com.photoeditor.model.pixel.Pixel;

public interface AdjustControllerOperations {
	
	
	public Pixel[][] adjustBrig(Pixel img[][],Double num);
	public Pixel[][] adjustCont(Pixel img[][],Double num);
	public Pixel[][] gamma(Pixel img[][],Double num);
	public Pixel[][] balanceRed(Pixel img[][],Double num);
	public Pixel[][] balanceGreen(Pixel img[][],Double num);
	public Pixel[][] balanceBlue(Pixel img[][],Double num);
	

}
