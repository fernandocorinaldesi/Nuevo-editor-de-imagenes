package ar.com.photoeditor.controller.context;

import ar.com.photoeditor.controller.main.AdjustControllerOperations;
import ar.com.photoeditor.controller.main.FilterControllerOperations;
import ar.com.photoeditor.controller.main.IoControllerOperations;
import ar.com.photoeditor.controller.main.TransformControllerOperations;

public interface ControllerContext {
	
	public AdjustControllerOperations getAjustController();
	public TransformControllerOperations getTransformController();
	public IoControllerOperations getIoController();
	public FilterControllerOperations getfController();

}
