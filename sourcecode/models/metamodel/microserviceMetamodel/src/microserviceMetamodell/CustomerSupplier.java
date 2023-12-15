/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.CustomerSupplier#getDownstreamRole <em>Downstream Role</em>}</li>
 *   <li>{@link microserviceMetamodell.CustomerSupplier#getUpstreamRole <em>Upstream Role</em>}</li>
 *   <li>{@link microserviceMetamodell.CustomerSupplier#getReferencedInterfaces <em>Referenced Interfaces</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier()
 * @model
 * @generated
 */
public interface CustomerSupplier extends BoundedContextRelationship {

	/**
	 * Returns the value of the '<em><b>Downstream Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Role</em>' containment reference.
	 * @see #setDownstreamRole(DownstreamRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier_DownstreamRole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DownstreamRole getDownstreamRole();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.CustomerSupplier#getDownstreamRole <em>Downstream Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downstream Role</em>' containment reference.
	 * @see #getDownstreamRole()
	 * @generated
	 */
	void setDownstreamRole(DownstreamRole value);

	/**
	 * Returns the value of the '<em><b>Upstream Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Role</em>' containment reference.
	 * @see #setUpstreamRole(UpstreamRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier_UpstreamRole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UpstreamRole getUpstreamRole();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.CustomerSupplier#getUpstreamRole <em>Upstream Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upstream Role</em>' containment reference.
	 * @see #getUpstreamRole()
	 * @generated
	 */
	void setUpstreamRole(UpstreamRole value);

	/**
	 * Returns the value of the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Interfaces</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier_ReferencedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getReferencedInterfaces();
} // CustomerSupplier
