/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Context Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.BoundedContextRelationship#getInterface <em>Interface</em>}</li>
 *   <li>{@link microserviceMetamodell.BoundedContextRelationship#getRelatedContext <em>Related Context</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContextRelationship()
 * @model abstract="true"
 * @generated
 */
public interface BoundedContextRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.Interface#getBoundedContextRelationship <em>Bounded Context Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContextRelationship_Interface()
	 * @see microserviceMetamodell.Interface#getBoundedContextRelationship
	 * @model opposite="boundedContextRelationship"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.BoundedContextRelationship#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Context</em>' reference.
	 * @see #setRelatedContext(BoundedContext)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContextRelationship_RelatedContext()
	 * @model
	 * @generated
	 */
	BoundedContext getRelatedContext();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.BoundedContextRelationship#getRelatedContext <em>Related Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Context</em>' reference.
	 * @see #getRelatedContext()
	 * @generated
	 */
	void setRelatedContext(BoundedContext value);

} // BoundedContextRelationship
