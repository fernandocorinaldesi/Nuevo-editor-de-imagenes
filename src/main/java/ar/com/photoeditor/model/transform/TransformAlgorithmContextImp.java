package ar.com.photoeditor.model.transform;

public class TransformAlgorithmContextImp implements TransformAlgorithmContext{
	AbstractTransform transform90;
	AbstractTransform transform180;
	AbstractTransform transform270;
	AbstractTransform transformVertical;
	AbstractTransform transformHorizontal;
	
	public TransformAlgorithmContextImp() {
		transform90=new Rot90();
		transform180=new Rot180();
		transform270=new Rot270();
		transformVertical=new FlipVertical();
		transformHorizontal=new FlipHorizontal();
	}

	@Override
	public AbstractTransform getInstanceRot90() {
		// TODO Auto-generated method stub
		return transform90;
	}

	@Override
	public AbstractTransform getInstanceRot180() {
		// TODO Auto-generated method stub
		return transform180;
	}

	@Override
	public AbstractTransform getInstanceRot270() {
		// TODO Auto-generated method stub
		return transform270;
	}

	@Override
	public AbstractTransform getInstanceFlipVertical() {
		// TODO Auto-generated method stub
		return transformVertical;
	}

	@Override
	public AbstractTransform getInstanceFlipHorizontal() {
		// TODO Auto-generated method stub
		return transformHorizontal;
	}

	

}
