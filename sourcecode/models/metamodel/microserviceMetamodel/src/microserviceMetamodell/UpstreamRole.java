/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upstream Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.UpstreamRole#getRelatedContext <em>Related Context</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamRole()
 * @model abstract="true"
 * @generated
 */
public interface UpstreamRole extends EObject {

	/**
	 * Returns the value of the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Context</em>' reference.
	 * @see #setRelatedContext(BoundedContext)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamRole_RelatedContext()
	 * @model required="true"
	 * @generated
	 */
	BoundedContext getRelatedContext();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.UpstreamRole#getRelatedContext <em>Related Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Context</em>' reference.
	 * @see #getRelatedContext()
	 * @generated
	 */
	void setRelatedContext(BoundedContext value);
} // UpstreamRole
