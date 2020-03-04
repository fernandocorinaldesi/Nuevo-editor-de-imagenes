package ar.com.photoeditor.model.adjust;

public class AdjustAlgorithmContextImp implements AdjustAlgorithmContext{
	
	private AbstractAdjust adjustGreen;
	private AbstractAdjust adjustBlue;
	private AbstractAdjust adjustRed;
	private AbstractAdjust adjustContrast;
	private AbstractAdjust adjustBrightness;
        
    public AdjustAlgorithmContextImp() {
    	   adjustGreen=new Green();
    	   adjustBlue= new Blue();
    	   adjustRed= new Red();
    	   adjustContrast= new Contrast();
    	   adjustBrightness= new Brightness();
    	
    }
	@Override
	public AbstractAdjust getInstanceBlue() {
		// TODO Auto-generated method stub
		return adjustBlue;
	}
	@Override
	public AbstractAdjust getInstanceBrightness() {
		// TODO Auto-generated method stub
		return adjustBrightness;
	}
	@Override
	public AbstractAdjust getInstanceContrast() {
		// TODO Auto-generated method stub
		return adjustContrast;
	}
	@Override
	public AbstractAdjust getInstanceGreen() {
		// TODO Auto-generated method stub
		return adjustGreen;
	}
	@Override
	public AbstractAdjust getInstanceRed() {
		// TODO Auto-generated method stub
		return adjustRed;
	}


	
}
