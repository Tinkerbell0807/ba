package microService.design;
import org.eclipse.emf.ecore.*;
import microserviceMetamodell.*;


public class MyService {
	
	public EObject printHello(EObject element) {
		System.out.println("Das ist ein Test");
		return element;
	}
	
	public DomainObjectController setControllerNameToDefault(DomainObjectController controller) {
		System.out.println("Log: Inside");
		controller.setObjectName("DefaultController");
		return controller;
	}	
}
