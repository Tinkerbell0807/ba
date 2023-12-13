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
 *   <li>{@link microserviceMetamodell.BoundedContextRelationship#getRelationshipName <em>Relationship Name</em>}</li>
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
	 * Returns the value of the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Name</em>' attribute.
	 * @see #setRelationshipName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContextRelationship_RelationshipName()
	 * @model
	 * @generated
	 */
	String getRelationshipName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.BoundedContextRelationship#getRelationshipName <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Name</em>' attribute.
	 * @see #getRelationshipName()
	 * @generated
	 */
	void setRelationshipName(String value);

} // BoundedContextRelationship
