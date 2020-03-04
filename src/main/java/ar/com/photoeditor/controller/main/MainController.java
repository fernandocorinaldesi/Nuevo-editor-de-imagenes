package ar.com.photoeditor.controller.main;

import ar.com.photoeditor.controller.context.ControllerContext;
import ar.com.photoeditor.swing.main.MainViewOperations;

public class MainController implements MainControllerOperations{

	MainViewOperations main;
	ControllerContext context;
	public MainController(MainViewOperations main,ControllerContext context) {
		this.main=main;
		this.context=context;
	    this.main.setController(this.context.getAjustController());
		this.main.setController(this.context.getTransformController());
		this.main.setController(this.context.getIoController());
		this.main.setController(this.context.getfController());
		this.main.setDefaults(false);
		}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		main.open();
	}

	
}
