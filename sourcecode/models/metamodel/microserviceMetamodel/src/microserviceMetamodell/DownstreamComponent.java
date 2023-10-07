/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Downstream Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DownstreamComponent#getRelatedContext <em>Related Context</em>}</li>
 *   <li>{@link microserviceMetamodell.DownstreamComponent#getDownstreamRole <em>Downstream Role</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDownstreamComponent()
 * @model
 * @generated
 */
public interface DownstreamComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Context</em>' reference.
	 * @see #setRelatedContext(BoundedContext)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDownstreamComponent_RelatedContext()
	 * @model required="true"
	 * @generated
	 */
	BoundedContext getRelatedContext();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DownstreamComponent#getRelatedContext <em>Related Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Context</em>' reference.
	 * @see #getRelatedContext()
	 * @generated
	 */
	void setRelatedContext(BoundedContext value);

	/**
	 * Returns the value of the '<em><b>Downstream Role</b></em>' attribute.
	 * The literals are from the enumeration {@link microserviceMetamodell.DownstreamRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Role</em>' attribute.
	 * @see microserviceMetamodell.DownstreamRole
	 * @see #setDownstreamRole(DownstreamRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDownstreamComponent_DownstreamRole()
	 * @model
	 * @generated
	 */
	DownstreamRole getDownstreamRole();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DownstreamComponent#getDownstreamRole <em>Downstream Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downstream Role</em>' attribute.
	 * @see microserviceMetamodell.DownstreamRole
	 * @see #getDownstreamRole()
	 * @generated
	 */
	void setDownstreamRole(DownstreamRole value);

} // DownstreamComponent
