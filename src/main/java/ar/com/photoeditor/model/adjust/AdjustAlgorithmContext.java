package ar.com.photoeditor.model.adjust;

public interface AdjustAlgorithmContext {
	
	public AbstractAdjust  getInstanceBlue();
	public AbstractAdjust  getInstanceBrightness();
	public AbstractAdjust  getInstanceContrast();
	public AbstractAdjust  getInstanceGreen();
	public AbstractAdjust  getInstanceRed();
	

}
