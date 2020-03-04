package ar.com.photoeditor.model.filters;

public interface FilterAlgorithmContext {
	public AbstractFilter  getInstanceNegative();
	public AbstractFilter  getInstanceGray();
	public AbstractFilter  getInstanceBlur();
	public AbstractFilter  getInstanceMin();
	public AbstractFilter  getInstanceMax();
	public AbstractFilter  getInstanceMed();

}
