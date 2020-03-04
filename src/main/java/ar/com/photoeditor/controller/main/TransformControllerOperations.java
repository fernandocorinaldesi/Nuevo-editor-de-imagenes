package ar.com.photoeditor.controller.main;

import ar.com.photoeditor.model.pixel.Pixel;

public interface TransformControllerOperations {
	public Pixel [][] rot180(Pixel [][]  img);
	public Pixel [][]  rot90(Pixel [][]  img);
	public Pixel [][]  rot270(Pixel [][]  img);
	public Pixel [][]  flipVer(Pixel [][]  img);
	public Pixel [][]  flipHor(Pixel [][]  img);
	
}
