/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DomainModel#getDomainEvents <em>Domain Events</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainModel#getModules <em>Modules</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainModel#getBoundedContext <em>Bounded Context</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainModel#getModelName <em>Model Name</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainModel#getSharedModules <em>Shared Modules</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Events</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainEvent}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.DomainEvent#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Events</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModel_DomainEvents()
	 * @see microserviceMetamodell.DomainEvent#getDomainModel
	 * @model opposite="domainModel"
	 * @generated
	 */
	EList<DomainEvent> getDomainEvents();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModel_Modules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<microserviceMetamodell.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Bounded Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.BoundedContext#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Context</em>' reference.
	 * @see #setBoundedContext(BoundedContext)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModel_BoundedContext()
	 * @see microserviceMetamodell.BoundedContext#getDomainModel
	 * @model opposite="domainModel" required="true"
	 * @generated
	 */
	BoundedContext getBoundedContext();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainModel#getBoundedContext <em>Bounded Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounded Context</em>' reference.
	 * @see #getBoundedContext()
	 * @generated
	 */
	void setBoundedContext(BoundedContext value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModel_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainModel#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Shared Modules</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.SharedModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Modules</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModel_SharedModules()
	 * @model
	 * @generated
	 */
	EList<SharedModule> getSharedModules();

} // DomainModel
