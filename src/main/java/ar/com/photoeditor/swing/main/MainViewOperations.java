package ar.com.photoeditor.swing.main;

import ar.com.photoeditor.controller.main.AdjustControllerOperations;
import ar.com.photoeditor.controller.main.EditControllerOperations;
import ar.com.photoeditor.controller.main.FilterControllerOperations;
import ar.com.photoeditor.controller.main.IoControllerOperations;
import ar.com.photoeditor.controller.main.TransformControllerOperations;

public interface MainViewOperations {
	public void setDefaults(boolean b);
	public void open();
	public void setController(TransformControllerOperations controller);
	public void setController(AdjustControllerOperations controller);
	public void setController(IoControllerOperations controller);
	public void setController(FilterControllerOperations controller);
	public void setController(EditControllerOperations controller);

}
