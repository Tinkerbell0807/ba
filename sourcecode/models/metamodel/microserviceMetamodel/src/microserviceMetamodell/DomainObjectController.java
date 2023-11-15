/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DomainObjectController#getRestEndpoints <em>Rest Endpoints</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainObjectController#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainObjectController#getDomainObjectServices <em>Domain Object Services</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObjectController()
 * @model
 * @generated
 */
public interface DomainObjectController extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest Endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.RestEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Endpoints</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObjectController_RestEndpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestEndpoint> getRestEndpoints();

	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObjectController_ObjectName()
	 * @model
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainObjectController#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Object Services</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainObjectService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Services</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObjectController_DomainObjectServices()
	 * @model
	 * @generated
	 */
	EList<DomainObjectService> getDomainObjectServices();

} // DomainObjectController
