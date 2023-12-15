/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Downstream Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DownstreamRole#getRelatedContext <em>Related Context</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDownstreamRole()
 * @model abstract="true"
 * @generated
 */
public interface DownstreamRole extends EObject {

	/**
	 * Returns the value of the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Context</em>' reference.
	 * @see #setRelatedContext(BoundedContext)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDownstreamRole_RelatedContext()
	 * @model required="true"
	 * @generated
	 */
	BoundedContext getRelatedContext();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DownstreamRole#getRelatedContext <em>Related Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Context</em>' reference.
	 * @see #getRelatedContext()
	 * @generated
	 */
	void setRelatedContext(BoundedContext value);
} // DownstreamRole
