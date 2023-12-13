/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployement Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DeployementAbstraction#getMicroservice <em>Microservice</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDeployementAbstraction()
 * @model
 * @generated
 */
public interface DeployementAbstraction extends EObject {

	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.Microservice#getDeployementAbstraction <em>Deployement Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' reference.
	 * @see #setMicroservice(Microservice)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDeployementAbstraction_Microservice()
	 * @see microserviceMetamodell.Microservice#getDeployementAbstraction
	 * @model opposite="deployementAbstraction"
	 * @generated
	 */
	Microservice getMicroservice();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DeployementAbstraction#getMicroservice <em>Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice</em>' reference.
	 * @see #getMicroservice()
	 * @generated
	 */
	void setMicroservice(Microservice value);
} // DeployementAbstraction
