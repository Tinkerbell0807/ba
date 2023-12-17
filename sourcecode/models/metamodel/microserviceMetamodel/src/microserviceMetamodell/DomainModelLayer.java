/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DomainModelLayer#getBoundedContexts <em>Bounded Contexts</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainModelLayer#getDomainModels <em>Domain Models</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainModelLayer#getDomainEvents <em>Domain Events</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainModelLayer#getBoundedContextRelationships <em>Bounded Context Relationships</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModelLayer()
 * @model
 * @generated
 */
public interface DomainModelLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Bounded Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.BoundedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Contexts</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModelLayer_BoundedContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoundedContext> getBoundedContexts();

	/**
	 * Returns the value of the '<em><b>Domain Models</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Models</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModelLayer_DomainModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainModel> getDomainModels();

	/**
	 * Returns the value of the '<em><b>Domain Events</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Events</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModelLayer_DomainEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainEvent> getDomainEvents();

	/**
	 * Returns the value of the '<em><b>Bounded Context Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.BoundedContextRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Context Relationships</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainModelLayer_BoundedContextRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoundedContextRelationship> getBoundedContextRelationships();

} // DomainModelLayer
