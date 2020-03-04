package ar.com.photoeditor.controller.main;

import ar.com.photoeditor.model.pixel.Pixel;

public interface FilterControllerOperations {
	public Pixel [][] filterNeg(Pixel [][]  img);
	public Pixel [][]  filterGray(Pixel [][]  img);
	public Pixel [][]  filterMin(Pixel [][]  img);
	public Pixel [][]  filterMax(Pixel [][]  img);
	public Pixel [][]  filterMed(Pixel [][]  img);
	public Pixel [][]  filterBlur(Pixel [][]  img);

}
