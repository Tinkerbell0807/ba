/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upstream Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.UpstreamComponent#getRelatedContext <em>Related Context</em>}</li>
 *   <li>{@link microserviceMetamodell.UpstreamComponent#getUpstreamRole <em>Upstream Role</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamComponent()
 * @model
 * @generated
 */
public interface UpstreamComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Context</em>' reference.
	 * @see #setRelatedContext(BoundedContext)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamComponent_RelatedContext()
	 * @model required="true"
	 * @generated
	 */
	BoundedContext getRelatedContext();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.UpstreamComponent#getRelatedContext <em>Related Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Context</em>' reference.
	 * @see #getRelatedContext()
	 * @generated
	 */
	void setRelatedContext(BoundedContext value);

	/**
	 * Returns the value of the '<em><b>Upstream Role</b></em>' attribute.
	 * The literals are from the enumeration {@link microserviceMetamodell.UpstreamRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Role</em>' attribute.
	 * @see microserviceMetamodell.UpstreamRole
	 * @see #setUpstreamRole(UpstreamRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamComponent_UpstreamRole()
	 * @model
	 * @generated
	 */
	UpstreamRole getUpstreamRole();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.UpstreamComponent#getUpstreamRole <em>Upstream Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upstream Role</em>' attribute.
	 * @see microserviceMetamodell.UpstreamRole
	 * @see #getUpstreamRole()
	 * @generated
	 */
	void setUpstreamRole(UpstreamRole value);

} // UpstreamComponent
