/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DomainEvent#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainEvent#getEventName <em>Event Name</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainEvent()
 * @model
 * @generated
 */
public interface DomainEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.DomainModel#getDomainEvents <em>Domain Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' reference.
	 * @see #setDomainModel(DomainModel)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainEvent_DomainModel()
	 * @see microserviceMetamodell.DomainModel#getDomainEvents
	 * @model opposite="domainEvents" required="true"
	 * @generated
	 */
	DomainModel getDomainModel();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainEvent#getDomainModel <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(DomainModel value);

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see #setEventName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainEvent_EventName()
	 * @model
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainEvent#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

} // DomainEvent
