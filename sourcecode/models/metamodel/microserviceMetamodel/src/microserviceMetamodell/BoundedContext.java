/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.BoundedContext#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link microserviceMetamodell.BoundedContext#getContextName <em>Context Name</em>}</li>
 *   <li>{@link microserviceMetamodell.BoundedContext#getCorrespodingMicroservices <em>Correspoding Microservices</em>}</li>
 *   <li>{@link microserviceMetamodell.BoundedContext#getBoundedContextRelationships <em>Bounded Context Relationships</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContext()
 * @model
 * @generated
 */
public interface BoundedContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.DomainModel#getBoundedContext <em>Bounded Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' reference.
	 * @see #setDomainModel(DomainModel)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContext_DomainModel()
	 * @see microserviceMetamodell.DomainModel#getBoundedContext
	 * @model opposite="boundedContext" required="true"
	 * @generated
	 */
	DomainModel getDomainModel();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.BoundedContext#getDomainModel <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(DomainModel value);

	/**
	 * Returns the value of the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Name</em>' attribute.
	 * @see #setContextName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContext_ContextName()
	 * @model
	 * @generated
	 */
	String getContextName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.BoundedContext#getContextName <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Name</em>' attribute.
	 * @see #getContextName()
	 * @generated
	 */
	void setContextName(String value);

	/**
	 * Returns the value of the '<em><b>Correspoding Microservices</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.Microservice}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.Microservice#getCorrespodingContext <em>Correspoding Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspoding Microservices</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContext_CorrespodingMicroservices()
	 * @see microserviceMetamodell.Microservice#getCorrespodingContext
	 * @model opposite="correspodingContext"
	 * @generated
	 */
	EList<Microservice> getCorrespodingMicroservices();

	/**
	 * Returns the value of the '<em><b>Bounded Context Relationships</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.BoundedContextRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Context Relationships</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBoundedContext_BoundedContextRelationships()
	 * @model
	 * @generated
	 */
	EList<BoundedContextRelationship> getBoundedContextRelationships();

} // BoundedContext
