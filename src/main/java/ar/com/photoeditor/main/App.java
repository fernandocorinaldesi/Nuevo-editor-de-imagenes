package ar.com.photoeditor.main;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import ar.com.photoeditor.controller.context.ControllerContext;
import ar.com.photoeditor.controller.context.ControllerContextImp;
import ar.com.photoeditor.controller.main.MainController;
import ar.com.photoeditor.controller.main.MainControllerOperations;
import ar.com.photoeditor.swing.main.MainView;
import ar.com.photoeditor.swing.main.MainViewOperations;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			
		}
		EventQueue.invokeLater(() -> {
			ControllerContext context=new ControllerContextImp();
			    	
	    	MainViewOperations main=new MainView();
	    	MainControllerOperations mediatorController=new MainController(main,context);
	    	mediatorController.open();
			
			;
		});
    	
    	    	
    	
    	
    	
    	
    }
}
