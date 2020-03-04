package ar.com.photoeditor.model.filters;

public class FilterAlgorithmContextImp implements FilterAlgorithmContext{
	
	private AbstractFilter filterNegative;
	private AbstractFilter filterGray;
	private AbstractFilter filterMin;
	private AbstractFilter filterMed;
	private AbstractFilter filterMax;
	private AbstractFilter filterBlur;
	
	public FilterAlgorithmContextImp() {
		filterNegative=new Negative();
		filterGray= new Gray();
		filterBlur= new Blur();
		filterMin= new Min();
		filterMax= new Max();
		filterMed= new Mediana();
	}

	@Override
	public AbstractFilter getInstanceNegative() {
		// TODO Auto-generated method stub
		return filterNegative;
	}

	@Override
	public AbstractFilter getInstanceGray() {
		// TODO Auto-generated method stub
		return filterGray;
	}

	@Override
	public AbstractFilter getInstanceBlur() {
		// TODO Auto-generated method stub
		return filterBlur;
	}

	@Override
	public AbstractFilter getInstanceMin() {
		// TODO Auto-generated method stub
		return filterMin;
	}

	@Override
	public AbstractFilter getInstanceMax() {
		// TODO Auto-generated method stub
		return filterMax;
	}

	@Override
	public AbstractFilter getInstanceMed() {
		// TODO Auto-generated method stub
		return filterMed;
	}

}
