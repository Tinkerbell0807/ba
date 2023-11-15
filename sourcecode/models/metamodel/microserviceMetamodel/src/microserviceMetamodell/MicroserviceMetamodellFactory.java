/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellPackage
 * @generated
 */
public interface MicroserviceMetamodellFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicroserviceMetamodellFactory eINSTANCE = microserviceMetamodell.impl.MicroserviceMetamodellFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Object</em>'.
	 * @generated
	 */
	DomainObject createDomainObject();

	/**
	 * Returns a new object of class '<em>Domain Object Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Object Controller</em>'.
	 * @generated
	 */
	DomainObjectController createDomainObjectController();

	/**
	 * Returns a new object of class '<em>Rest Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Endpoint</em>'.
	 * @generated
	 */
	RestEndpoint createRestEndpoint();

	/**
	 * Returns a new object of class '<em>Domain Object Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Object Service</em>'.
	 * @generated
	 */
	DomainObjectService createDomainObjectService();

	/**
	 * Returns a new object of class '<em>Domain Object Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Object Repository</em>'.
	 * @generated
	 */
	DomainObjectRepository createDomainObjectRepository();

	/**
	 * Returns a new object of class '<em>System Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Model</em>'.
	 * @generated
	 */
	SystemModel createSystemModel();

	/**
	 * Returns a new object of class '<em>Domain Webservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Webservice</em>'.
	 * @generated
	 */
	DomainWebservice createDomainWebservice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MicroserviceMetamodellPackage getMicroserviceMetamodellPackage();

} //MicroserviceMetamodellFactory
