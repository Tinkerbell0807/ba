/**
 */
package microserviceMetamodell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynchronous Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.AsynchronousInterface#getInterfaceRole <em>Interface Role</em>}</li>
 *   <li>{@link microserviceMetamodell.AsynchronousInterface#getTopologyType <em>Topology Type</em>}</li>
 *   <li>{@link microserviceMetamodell.AsynchronousInterface#getDomainEvent <em>Domain Event</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAsynchronousInterface()
 * @model
 * @generated
 */
public interface AsynchronousInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Interface Role</b></em>' attribute.
	 * The literals are from the enumeration {@link microserviceMetamodell.AsynchronousInterfaceRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Role</em>' attribute.
	 * @see microserviceMetamodell.AsynchronousInterfaceRole
	 * @see #setInterfaceRole(AsynchronousInterfaceRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAsynchronousInterface_InterfaceRole()
	 * @model
	 * @generated
	 */
	AsynchronousInterfaceRole getInterfaceRole();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.AsynchronousInterface#getInterfaceRole <em>Interface Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Role</em>' attribute.
	 * @see microserviceMetamodell.AsynchronousInterfaceRole
	 * @see #getInterfaceRole()
	 * @generated
	 */
	void setInterfaceRole(AsynchronousInterfaceRole value);

	/**
	 * Returns the value of the '<em><b>Topology Type</b></em>' attribute.
	 * The literals are from the enumeration {@link microserviceMetamodell.TopologyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Type</em>' attribute.
	 * @see microserviceMetamodell.TopologyType
	 * @see #setTopologyType(TopologyType)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAsynchronousInterface_TopologyType()
	 * @model
	 * @generated
	 */
	TopologyType getTopologyType();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.AsynchronousInterface#getTopologyType <em>Topology Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Type</em>' attribute.
	 * @see microserviceMetamodell.TopologyType
	 * @see #getTopologyType()
	 * @generated
	 */
	void setTopologyType(TopologyType value);

	/**
	 * Returns the value of the '<em><b>Domain Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Event</em>' reference.
	 * @see #setDomainEvent(DomainEvent)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAsynchronousInterface_DomainEvent()
	 * @model
	 * @generated
	 */
	DomainEvent getDomainEvent();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.AsynchronousInterface#getDomainEvent <em>Domain Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Event</em>' reference.
	 * @see #getDomainEvent()
	 * @generated
	 */
	void setDomainEvent(DomainEvent value);

} // AsynchronousInterface
