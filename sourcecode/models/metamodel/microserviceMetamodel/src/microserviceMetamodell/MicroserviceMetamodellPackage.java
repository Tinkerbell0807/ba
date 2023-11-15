/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellFactory
 * @model kind="package"
 * @generated
 */
public interface MicroserviceMetamodellPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "microserviceMetamodell";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://microservice.com/microserviceMetamodell";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "microserviceMetamodell";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicroserviceMetamodellPackage eINSTANCE = microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl.init();

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DomainObjectImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__OBJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Object Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Domain Object Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Domain Object Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER = 3;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DomainObjectControllerImpl <em>Domain Object Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DomainObjectControllerImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainObjectController()
	 * @generated
	 */
	int DOMAIN_OBJECT_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Rest Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_CONTROLLER__OBJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Domain Object Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_CONTROLLER__DOMAIN_OBJECT_SERVICES = 2;

	/**
	 * The number of structural features of the '<em>Domain Object Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Object Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.RestEndpointImpl <em>Rest Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.RestEndpointImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getRestEndpoint()
	 * @generated
	 */
	int REST_ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENDPOINT__HTTP_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENDPOINT__PATH = 1;

	/**
	 * The number of structural features of the '<em>Rest Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENDPOINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rest Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DomainObjectServiceImpl <em>Domain Object Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DomainObjectServiceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainObjectService()
	 * @generated
	 */
	int DOMAIN_OBJECT_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_SERVICE__OBJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Object Repositories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_SERVICE__DOMAIN_OBJECT_REPOSITORIES = 1;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_SERVICE__CALLS = 2;

	/**
	 * The number of structural features of the '<em>Domain Object Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Object Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DomainObjectRepositoryImpl <em>Domain Object Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DomainObjectRepositoryImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainObjectRepository()
	 * @generated
	 */
	int DOMAIN_OBJECT_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_REPOSITORY__OBJECT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Domain Object Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain Object Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.SystemModelImpl <em>System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.SystemModelImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSystemModel()
	 * @generated
	 */
	int SYSTEM_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Webservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__WEBSERVICES = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DomainWebserviceImpl <em>Domain Webservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DomainWebserviceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainWebservice()
	 * @generated
	 */
	int DOMAIN_WEBSERVICE = 6;

	/**
	 * The feature id for the '<em><b>Domain Object Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS = 0;

	/**
	 * The feature id for the '<em><b>Domain Object Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Domain Object Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES = 2;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_WEBSERVICE__DOMAIN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Domain Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_WEBSERVICE__DOMAIN_OBJECTS = 4;

	/**
	 * The feature id for the '<em><b>Host Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_WEBSERVICE__HOST_URL = 5;

	/**
	 * The number of structural features of the '<em>Domain Webservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_WEBSERVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Domain Webservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_WEBSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.HttpMethod
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 7;


	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see microserviceMetamodell.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DomainObject#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see microserviceMetamodell.DomainObject#getObjectName()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_ObjectName();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.DomainObject#getDomainObjectRepository <em>Domain Object Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Object Repository</em>'.
	 * @see microserviceMetamodell.DomainObject#getDomainObjectRepository()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_DomainObjectRepository();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.DomainObject#getDomainObjectService <em>Domain Object Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Object Service</em>'.
	 * @see microserviceMetamodell.DomainObject#getDomainObjectService()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_DomainObjectService();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.DomainObject#getDomainObjectController <em>Domain Object Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Object Controller</em>'.
	 * @see microserviceMetamodell.DomainObject#getDomainObjectController()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_DomainObjectController();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DomainObjectController <em>Domain Object Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Controller</em>'.
	 * @see microserviceMetamodell.DomainObjectController
	 * @generated
	 */
	EClass getDomainObjectController();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainObjectController#getRestEndpoints <em>Rest Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest Endpoints</em>'.
	 * @see microserviceMetamodell.DomainObjectController#getRestEndpoints()
	 * @see #getDomainObjectController()
	 * @generated
	 */
	EReference getDomainObjectController_RestEndpoints();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DomainObjectController#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see microserviceMetamodell.DomainObjectController#getObjectName()
	 * @see #getDomainObjectController()
	 * @generated
	 */
	EAttribute getDomainObjectController_ObjectName();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.DomainObjectController#getDomainObjectServices <em>Domain Object Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Object Services</em>'.
	 * @see microserviceMetamodell.DomainObjectController#getDomainObjectServices()
	 * @see #getDomainObjectController()
	 * @generated
	 */
	EReference getDomainObjectController_DomainObjectServices();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.RestEndpoint <em>Rest Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Endpoint</em>'.
	 * @see microserviceMetamodell.RestEndpoint
	 * @generated
	 */
	EClass getRestEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.RestEndpoint#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see microserviceMetamodell.RestEndpoint#getHttpMethod()
	 * @see #getRestEndpoint()
	 * @generated
	 */
	EAttribute getRestEndpoint_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.RestEndpoint#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see microserviceMetamodell.RestEndpoint#getPath()
	 * @see #getRestEndpoint()
	 * @generated
	 */
	EAttribute getRestEndpoint_Path();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DomainObjectService <em>Domain Object Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Service</em>'.
	 * @see microserviceMetamodell.DomainObjectService
	 * @generated
	 */
	EClass getDomainObjectService();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DomainObjectService#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see microserviceMetamodell.DomainObjectService#getObjectName()
	 * @see #getDomainObjectService()
	 * @generated
	 */
	EAttribute getDomainObjectService_ObjectName();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.DomainObjectService#getDomainObjectRepositories <em>Domain Object Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Object Repositories</em>'.
	 * @see microserviceMetamodell.DomainObjectService#getDomainObjectRepositories()
	 * @see #getDomainObjectService()
	 * @generated
	 */
	EReference getDomainObjectService_DomainObjectRepositories();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.DomainObjectService#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls</em>'.
	 * @see microserviceMetamodell.DomainObjectService#getCalls()
	 * @see #getDomainObjectService()
	 * @generated
	 */
	EReference getDomainObjectService_Calls();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DomainObjectRepository <em>Domain Object Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Repository</em>'.
	 * @see microserviceMetamodell.DomainObjectRepository
	 * @generated
	 */
	EClass getDomainObjectRepository();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DomainObjectRepository#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see microserviceMetamodell.DomainObjectRepository#getObjectName()
	 * @see #getDomainObjectRepository()
	 * @generated
	 */
	EAttribute getDomainObjectRepository_ObjectName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.SystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Model</em>'.
	 * @see microserviceMetamodell.SystemModel
	 * @generated
	 */
	EClass getSystemModel();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.SystemModel#getWebservices <em>Webservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Webservices</em>'.
	 * @see microserviceMetamodell.SystemModel#getWebservices()
	 * @see #getSystemModel()
	 * @generated
	 */
	EReference getSystemModel_Webservices();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.SystemModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see microserviceMetamodell.SystemModel#getDescription()
	 * @see #getSystemModel()
	 * @generated
	 */
	EAttribute getSystemModel_Description();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DomainWebservice <em>Domain Webservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Webservice</em>'.
	 * @see microserviceMetamodell.DomainWebservice
	 * @generated
	 */
	EClass getDomainWebservice();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainWebservice#getDomainObjectControllers <em>Domain Object Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Object Controllers</em>'.
	 * @see microserviceMetamodell.DomainWebservice#getDomainObjectControllers()
	 * @see #getDomainWebservice()
	 * @generated
	 */
	EReference getDomainWebservice_DomainObjectControllers();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainWebservice#getDomainObjectServices <em>Domain Object Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Object Services</em>'.
	 * @see microserviceMetamodell.DomainWebservice#getDomainObjectServices()
	 * @see #getDomainWebservice()
	 * @generated
	 */
	EReference getDomainWebservice_DomainObjectServices();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainWebservice#getDomainObjectRepositories <em>Domain Object Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Object Repositories</em>'.
	 * @see microserviceMetamodell.DomainWebservice#getDomainObjectRepositories()
	 * @see #getDomainWebservice()
	 * @generated
	 */
	EReference getDomainWebservice_DomainObjectRepositories();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DomainWebservice#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see microserviceMetamodell.DomainWebservice#getDomainName()
	 * @see #getDomainWebservice()
	 * @generated
	 */
	EAttribute getDomainWebservice_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainWebservice#getDomainObjects <em>Domain Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Objects</em>'.
	 * @see microserviceMetamodell.DomainWebservice#getDomainObjects()
	 * @see #getDomainWebservice()
	 * @generated
	 */
	EReference getDomainWebservice_DomainObjects();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DomainWebservice#getHostUrl <em>Host Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Url</em>'.
	 * @see microserviceMetamodell.DomainWebservice#getHostUrl()
	 * @see #getDomainWebservice()
	 * @generated
	 */
	EAttribute getDomainWebservice_HostUrl();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see microserviceMetamodell.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MicroserviceMetamodellFactory getMicroserviceMetamodellFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DomainObjectImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainObject()
		 * @generated
		 */
		EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__OBJECT_NAME = eINSTANCE.getDomainObject_ObjectName();

		/**
		 * The meta object literal for the '<em><b>Domain Object Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY = eINSTANCE.getDomainObject_DomainObjectRepository();

		/**
		 * The meta object literal for the '<em><b>Domain Object Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE = eINSTANCE.getDomainObject_DomainObjectService();

		/**
		 * The meta object literal for the '<em><b>Domain Object Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER = eINSTANCE.getDomainObject_DomainObjectController();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DomainObjectControllerImpl <em>Domain Object Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DomainObjectControllerImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainObjectController()
		 * @generated
		 */
		EClass DOMAIN_OBJECT_CONTROLLER = eINSTANCE.getDomainObjectController();

		/**
		 * The meta object literal for the '<em><b>Rest Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS = eINSTANCE.getDomainObjectController_RestEndpoints();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT_CONTROLLER__OBJECT_NAME = eINSTANCE.getDomainObjectController_ObjectName();

		/**
		 * The meta object literal for the '<em><b>Domain Object Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_CONTROLLER__DOMAIN_OBJECT_SERVICES = eINSTANCE.getDomainObjectController_DomainObjectServices();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.RestEndpointImpl <em>Rest Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.RestEndpointImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getRestEndpoint()
		 * @generated
		 */
		EClass REST_ENDPOINT = eINSTANCE.getRestEndpoint();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_ENDPOINT__HTTP_METHOD = eINSTANCE.getRestEndpoint_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_ENDPOINT__PATH = eINSTANCE.getRestEndpoint_Path();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DomainObjectServiceImpl <em>Domain Object Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DomainObjectServiceImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainObjectService()
		 * @generated
		 */
		EClass DOMAIN_OBJECT_SERVICE = eINSTANCE.getDomainObjectService();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT_SERVICE__OBJECT_NAME = eINSTANCE.getDomainObjectService_ObjectName();

		/**
		 * The meta object literal for the '<em><b>Domain Object Repositories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_SERVICE__DOMAIN_OBJECT_REPOSITORIES = eINSTANCE.getDomainObjectService_DomainObjectRepositories();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_SERVICE__CALLS = eINSTANCE.getDomainObjectService_Calls();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DomainObjectRepositoryImpl <em>Domain Object Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DomainObjectRepositoryImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainObjectRepository()
		 * @generated
		 */
		EClass DOMAIN_OBJECT_REPOSITORY = eINSTANCE.getDomainObjectRepository();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT_REPOSITORY__OBJECT_NAME = eINSTANCE.getDomainObjectRepository_ObjectName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.SystemModelImpl <em>System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.SystemModelImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSystemModel()
		 * @generated
		 */
		EClass SYSTEM_MODEL = eINSTANCE.getSystemModel();

		/**
		 * The meta object literal for the '<em><b>Webservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODEL__WEBSERVICES = eINSTANCE.getSystemModel_Webservices();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_MODEL__DESCRIPTION = eINSTANCE.getSystemModel_Description();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DomainWebserviceImpl <em>Domain Webservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DomainWebserviceImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainWebservice()
		 * @generated
		 */
		EClass DOMAIN_WEBSERVICE = eINSTANCE.getDomainWebservice();

		/**
		 * The meta object literal for the '<em><b>Domain Object Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS = eINSTANCE.getDomainWebservice_DomainObjectControllers();

		/**
		 * The meta object literal for the '<em><b>Domain Object Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES = eINSTANCE.getDomainWebservice_DomainObjectServices();

		/**
		 * The meta object literal for the '<em><b>Domain Object Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES = eINSTANCE.getDomainWebservice_DomainObjectRepositories();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_WEBSERVICE__DOMAIN_NAME = eINSTANCE.getDomainWebservice_DomainName();

		/**
		 * The meta object literal for the '<em><b>Domain Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_WEBSERVICE__DOMAIN_OBJECTS = eINSTANCE.getDomainWebservice_DomainObjects();

		/**
		 * The meta object literal for the '<em><b>Host Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_WEBSERVICE__HOST_URL = eINSTANCE.getDomainWebservice_HostUrl();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.HttpMethod
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

	}

} //MicroserviceMetamodellPackage
