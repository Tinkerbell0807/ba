/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Behaviour#getBehaviourName <em>Behaviour Name</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Name</em>' attribute.
	 * @see #setBehaviourName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBehaviour_BehaviourName()
	 * @model
	 * @generated
	 */
	String getBehaviourName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Behaviour#getBehaviourName <em>Behaviour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Name</em>' attribute.
	 * @see #getBehaviourName()
	 * @generated
	 */
	void setBehaviourName(String value);

} // Behaviour
