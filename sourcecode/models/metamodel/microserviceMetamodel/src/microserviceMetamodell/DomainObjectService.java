/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DomainObjectService#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainObjectService#getDomainObjectRepositories <em>Domain Object Repositories</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainObjectService#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObjectService()
 * @model
 * @generated
 */
public interface DomainObjectService extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObjectService_ObjectName()
	 * @model
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainObjectService#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Object Repositories</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainObjectRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Repositories</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObjectService_DomainObjectRepositories()
	 * @model
	 * @generated
	 */
	EList<DomainObjectRepository> getDomainObjectRepositories();

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.RestEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObjectService_Calls()
	 * @model
	 * @generated
	 */
	EList<RestEndpoint> getCalls();

} // DomainObjectService
