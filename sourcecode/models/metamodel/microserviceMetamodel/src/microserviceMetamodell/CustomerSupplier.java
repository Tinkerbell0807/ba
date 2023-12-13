/**
 */
package microserviceMetamodell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.CustomerSupplier#getDownstream <em>Downstream</em>}</li>
 *   <li>{@link microserviceMetamodell.CustomerSupplier#getUpstream <em>Upstream</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier()
 * @model
 * @generated
 */
public interface CustomerSupplier extends BoundedContextRelationship {

	/**
	 * Returns the value of the '<em><b>Downstream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream</em>' containment reference.
	 * @see #setDownstream(DownstreamRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier_Downstream()
	 * @model containment="true"
	 * @generated
	 */
	DownstreamRole getDownstream();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.CustomerSupplier#getDownstream <em>Downstream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downstream</em>' containment reference.
	 * @see #getDownstream()
	 * @generated
	 */
	void setDownstream(DownstreamRole value);

	/**
	 * Returns the value of the '<em><b>Upstream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream</em>' containment reference.
	 * @see #setUpstream(UpstreamRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier_Upstream()
	 * @model containment="true"
	 * @generated
	 */
	UpstreamRole getUpstream();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.CustomerSupplier#getUpstream <em>Upstream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upstream</em>' containment reference.
	 * @see #getUpstream()
	 * @generated
	 */
	void setUpstream(UpstreamRole value);
} // CustomerSupplier
