package ar.com.photoeditor.controller.context;

import ar.com.photoeditor.controller.main.AdjustController;
import ar.com.photoeditor.controller.main.AdjustControllerOperations;
import ar.com.photoeditor.controller.main.FilterController;
import ar.com.photoeditor.controller.main.FilterControllerOperations;
import ar.com.photoeditor.controller.main.IoController;
import ar.com.photoeditor.controller.main.IoControllerOperations;
import ar.com.photoeditor.controller.main.TransformController;
import ar.com.photoeditor.controller.main.TransformControllerOperations;
import ar.com.photoeditor.model.adjust.AdjustAlgorithmContextImp;
import ar.com.photoeditor.model.filters.FilterAlgorithmContext;
import ar.com.photoeditor.model.filters.FilterAlgorithmContextImp;
import ar.com.photoeditor.model.adjust.AdjustAlgorithmContext;
import ar.com.photoeditor.model.transform.TransformAlgorithmContext;
import ar.com.photoeditor.model.transform.TransformAlgorithmContextImp;

public class ControllerContextImp implements ControllerContext{
	private AdjustAlgorithmContext adjustselect;
	private AdjustControllerOperations aController;
	private TransformControllerOperations tController;
	private TransformAlgorithmContext transformselect;
	private IoControllerOperations iocontroller;
	private FilterAlgorithmContext filterSelect;
	private FilterControllerOperations fController;
	


	public ControllerContextImp() {
		adjustselect = new AdjustAlgorithmContextImp();
		aController = new AdjustController(adjustselect);
		
		transformselect = new TransformAlgorithmContextImp();
		tController = new TransformController(transformselect);
		
		iocontroller = new IoController();
		
		filterSelect=new FilterAlgorithmContextImp();
		fController=new FilterController(filterSelect);
	}

	@Override
	public AdjustControllerOperations getAjustController() {
		// TODO Auto-generated method stub
		return aController;
	}

	@Override
	public TransformControllerOperations getTransformController() {
		// TODO Auto-generated method stub
		return tController;
	}

	@Override
	public IoControllerOperations getIoController() {
		// TODO Auto-generated method stub
		return iocontroller;
	}

	@Override
	public FilterControllerOperations getfController() {
		// TODO Auto-generated method stub
		return fController;
	}

}
