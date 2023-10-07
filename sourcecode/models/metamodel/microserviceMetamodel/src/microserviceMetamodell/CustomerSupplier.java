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
 *   <li>{@link microserviceMetamodell.CustomerSupplier#getDownstreamComponent <em>Downstream Component</em>}</li>
 *   <li>{@link microserviceMetamodell.CustomerSupplier#getUpstreamComponent <em>Upstream Component</em>}</li>
 *   <li>{@link microserviceMetamodell.CustomerSupplier#getAffectedInterfaces <em>Affected Interfaces</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier()
 * @model
 * @generated
 */
public interface CustomerSupplier extends BoundedContextRelationship {
	/**
	 * Returns the value of the '<em><b>Downstream Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Component</em>' containment reference.
	 * @see #setDownstreamComponent(DownstreamComponent)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier_DownstreamComponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DownstreamComponent getDownstreamComponent();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.CustomerSupplier#getDownstreamComponent <em>Downstream Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downstream Component</em>' containment reference.
	 * @see #getDownstreamComponent()
	 * @generated
	 */
	void setDownstreamComponent(DownstreamComponent value);

	/**
	 * Returns the value of the '<em><b>Upstream Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Component</em>' containment reference.
	 * @see #setUpstreamComponent(UpstreamComponent)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier_UpstreamComponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UpstreamComponent getUpstreamComponent();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.CustomerSupplier#getUpstreamComponent <em>Upstream Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upstream Component</em>' containment reference.
	 * @see #getUpstreamComponent()
	 * @generated
	 */
	void setUpstreamComponent(UpstreamComponent value);

	/**
	 * Returns the value of the '<em><b>Affected Interfaces</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.Interface}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.Interface#getReferencedRelationships <em>Referenced Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Interfaces</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getCustomerSupplier_AffectedInterfaces()
	 * @see microserviceMetamodell.Interface#getReferencedRelationships
	 * @model opposite="referencedRelationships"
	 * @generated
	 */
	EList<Interface> getAffectedInterfaces();

} // CustomerSupplier
