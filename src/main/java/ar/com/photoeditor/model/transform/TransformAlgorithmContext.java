package ar.com.photoeditor.model.transform;

public interface TransformAlgorithmContext {
	public AbstractTransform getInstanceRot90();
	public AbstractTransform getInstanceRot180();
	public AbstractTransform getInstanceRot270();
	public AbstractTransform getInstanceFlipVertical();
	public AbstractTransform getInstanceFlipHorizontal();
}
