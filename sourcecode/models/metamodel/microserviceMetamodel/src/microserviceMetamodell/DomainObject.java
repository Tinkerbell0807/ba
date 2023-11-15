/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DomainObject#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainObject#getDomainObjectRepository <em>Domain Object Repository</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainObject#getDomainObjectService <em>Domain Object Service</em>}</li>
 *   <li>{@link microserviceMetamodell.DomainObject#getDomainObjectController <em>Domain Object Controller</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObject()
 * @model
 * @generated
 */
public interface DomainObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObject_ObjectName()
	 * @model
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainObject#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Object Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Repository</em>' reference.
	 * @see #setDomainObjectRepository(DomainObjectRepository)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObject_DomainObjectRepository()
	 * @model
	 * @generated
	 */
	DomainObjectRepository getDomainObjectRepository();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainObject#getDomainObjectRepository <em>Domain Object Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object Repository</em>' reference.
	 * @see #getDomainObjectRepository()
	 * @generated
	 */
	void setDomainObjectRepository(DomainObjectRepository value);

	/**
	 * Returns the value of the '<em><b>Domain Object Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Service</em>' reference.
	 * @see #setDomainObjectService(DomainObjectService)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObject_DomainObjectService()
	 * @model
	 * @generated
	 */
	DomainObjectService getDomainObjectService();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainObject#getDomainObjectService <em>Domain Object Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object Service</em>' reference.
	 * @see #getDomainObjectService()
	 * @generated
	 */
	void setDomainObjectService(DomainObjectService value);

	/**
	 * Returns the value of the '<em><b>Domain Object Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Controller</em>' reference.
	 * @see #setDomainObjectController(DomainObjectController)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDomainObject_DomainObjectController()
	 * @model
	 * @generated
	 */
	DomainObjectController getDomainObjectController();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DomainObject#getDomainObjectController <em>Domain Object Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object Controller</em>' reference.
	 * @see #getDomainObjectController()
	 * @generated
	 */
	void setDomainObjectController(DomainObjectController value);

} // DomainObject
