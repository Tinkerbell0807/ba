/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Webservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DomainWebservice#getDomainObjectControllers <em>Domain Object Controllers</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainWebservice#getDomainObjectServices <em>Domain Object Services</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainWebservice#getDomainObjectRepositories <em>Domain Object Repositories</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainWebservice#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainWebservice#getDomainObjects <em>Domain Objects</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainWebservice#getHostUrl <em>Host Url</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainWebservice()
 * @model
 * @generated
 */
public interface DomainWebservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Object Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainObjectController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Controllers</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainWebservice_DomainObjectControllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObjectController> getDomainObjectControllers();

	/**
	 * Returns the value of the '<em><b>Domain Object Services</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainObjectService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Services</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainWebservice_DomainObjectServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObjectService> getDomainObjectServices();

	/**
	 * Returns the value of the '<em><b>Domain Object Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainObjectRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Repositories</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainWebservice_DomainObjectRepositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObjectRepository> getDomainObjectRepositories();

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainWebservice_DomainName()
	 * @model
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainWebservice#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Objects</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Objects</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainWebservice_DomainObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObject> getDomainObjects();

	/**
	 * Returns the value of the '<em><b>Host Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Url</em>' attribute.
	 * @see #setHostUrl(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainWebservice_HostUrl()
	 * @model
	 * @generated
	 */
	String getHostUrl();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainWebservice#getHostUrl <em>Host Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Url</em>' attribute.
	 * @see #getHostUrl()
	 * @generated
	 */
	void setHostUrl(String value);

} // DomainWebservice
