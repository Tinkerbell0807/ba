/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link microserviceMetamodell.AsynchronousInterface#getDomainEvents <em>Domain Events</em>}</li>
 *   <li>{@link microserviceMetamodell.AsynchronousInterface#getTopic <em>Topic</em>}</li>
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
	 * Returns the value of the '<em><b>Domain Events</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Events</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAsynchronousInterface_DomainEvents()
	 * @model
	 * @generated
	 */
	EList<DomainEvent> getDomainEvents();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.Topic#getAsynchronousInterfaces <em>Asynchronous Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(Topic)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAsynchronousInterface_Topic()
	 * @see microserviceMetamodell.Topic#getAsynchronousInterfaces
	 * @model opposite="asynchronousInterfaces" required="true"
	 * @generated
	 */
	Topic getTopic();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.AsynchronousInterface#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Topic value);

} // AsynchronousInterface
