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
	 * The meta object id for the '{@link microserviceMetamodell.impl.RestEndpointImpl <em>Rest Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.RestEndpointImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getRestEndpoint()
	 * @generated
	 */
	int REST_ENDPOINT = 32;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.ModelElementImplementationImpl <em>Model Element Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ModelElementImplementationImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getModelElementImplementation()
	 * @generated
	 */
	int MODEL_ELEMENT_IMPLEMENTATION = 33;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.SystemModelImpl <em>System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.SystemModelImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSystemModel()
	 * @generated
	 */
	int SYSTEM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Domain Model Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__DOMAIN_MODEL_LAYER = 1;

	/**
	 * The feature id for the '<em><b>Technical Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__TECHNICAL_LAYER = 2;

	/**
	 * The feature id for the '<em><b>Infrastructure Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__INFRASTRUCTURE_LAYER = 3;

	/**
	 * The number of structural features of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DomainModelImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Domain Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__DOMAIN_EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__MODULES = 1;

	/**
	 * The feature id for the '<em><b>Bounded Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__BOUNDED_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__MODEL_NAME = 3;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DomainModelLayerImpl <em>Domain Model Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DomainModelLayerImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainModelLayer()
	 * @generated
	 */
	int DOMAIN_MODEL_LAYER = 2;

	/**
	 * The feature id for the '<em><b>Bounded Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Domain Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_LAYER__DOMAIN_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Domain Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_LAYER__DOMAIN_EVENTS = 2;

	/**
	 * The number of structural features of the '<em>Domain Model Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_LAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Model Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.InfrastructureLayerImpl <em>Infrastructure Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.InfrastructureLayerImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getInfrastructureLayer()
	 * @generated
	 */
	int INFRASTRUCTURE_LAYER = 3;

	/**
	 * The number of structural features of the '<em>Infrastructure Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Infrastructure Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.TechnicalLayerImpl <em>Technical Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.TechnicalLayerImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getTechnicalLayer()
	 * @generated
	 */
	int TECHNICAL_LAYER = 4;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_LAYER__MICROSERVICES = 0;

	/**
	 * The number of structural features of the '<em>Technical Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_LAYER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Technical Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ModelElementImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Is Implemented Trough</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ELEMENT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.EntityImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Is Implemented Trough</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_IMPLEMENTED_TROUGH = MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VALUE_OBJECTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BEHAVIOURS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ValueObjectImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Is Implemented Trough</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__IS_IMPLEMENTED_TROUGH = MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Referenced Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__REFERENCED_ENTITIES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__VALUE_OBJECTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ServiceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Is Implemented Trough</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_IMPLEMENTED_TROUGH = MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BEHAVIOURS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REFERENCED_ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.Factorizeable <em>Factorizeable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.Factorizeable
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getFactorizeable()
	 * @generated
	 */
	int FACTORIZEABLE = 27;

	/**
	 * The number of structural features of the '<em>Factorizeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORIZEABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Factorizeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORIZEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.AggregateImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 8;

	/**
	 * The feature id for the '<em><b>Is Implemented Trough</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__IS_IMPLEMENTED_TROUGH = FACTORIZEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__ELEMENT_NAME = FACTORIZEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__AGGREGATE_ROOT = FACTORIZEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregate Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__AGGREGATE_NODE = FACTORIZEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = FACTORIZEABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_OPERATION_COUNT = FACTORIZEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.FactoryImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getFactory()
	 * @generated
	 */
	int FACTORY = 9;

	/**
	 * The feature id for the '<em><b>Is Implemented Trough</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__IS_IMPLEMENTED_TROUGH = MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__BEHAVIOURS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factory For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__FACTORY_FOR = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.RepositoryImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 10;

	/**
	 * The feature id for the '<em><b>Is Implemented Trough</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__IS_IMPLEMENTED_TROUGH = MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BEHAVIOURS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_FOR = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DomainEventImpl <em>Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DomainEventImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainEvent()
	 * @generated
	 */
	int DOMAIN_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__DOMAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__EVENT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ModuleImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 12;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODEL_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.BoundedContextImpl <em>Bounded Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.BoundedContextImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBoundedContext()
	 * @generated
	 */
	int BOUNDED_CONTEXT = 13;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__DOMAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__CONTEXT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Correspoding Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__CORRESPODING_MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Bounded Context Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__BOUNDED_CONTEXT_RELATIONSHIPS = 3;

	/**
	 * The number of structural features of the '<em>Bounded Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bounded Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.BehaviourImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 14;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__BEHAVIOUR_NAME = 0;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.BoundedContextRelationshipImpl <em>Bounded Context Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.BoundedContextRelationshipImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBoundedContextRelationship()
	 * @generated
	 */
	int BOUNDED_CONTEXT_RELATIONSHIP = 21;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Bounded Context Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bounded Context Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.SharedKernelImpl <em>Shared Kernel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.SharedKernelImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSharedKernel()
	 * @generated
	 */
	int SHARED_KERNEL = 15;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL__INTERFACE = BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE;

	/**
	 * The feature id for the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL__RELATED_CONTEXT = BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT;

	/**
	 * The number of structural features of the '<em>Shared Kernel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL_FEATURE_COUNT = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shared Kernel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL_OPERATION_COUNT = BOUNDED_CONTEXT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.UpstreamDownstreamRelationshipImpl <em>Upstream Downstream Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.UpstreamDownstreamRelationshipImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getUpstreamDownstreamRelationship()
	 * @generated
	 */
	int UPSTREAM_DOWNSTREAM_RELATIONSHIP = 25;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_DOWNSTREAM_RELATIONSHIP__INTERFACE = BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE;

	/**
	 * The feature id for the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_DOWNSTREAM_RELATIONSHIP__RELATED_CONTEXT = BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT;

	/**
	 * The feature id for the '<em><b>Downstream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upstream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Upstream Downstream Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_DOWNSTREAM_RELATIONSHIP_FEATURE_COUNT = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Upstream Downstream Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_DOWNSTREAM_RELATIONSHIP_OPERATION_COUNT = BOUNDED_CONTEXT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.CustomerSupplierImpl <em>Customer Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.CustomerSupplierImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getCustomerSupplier()
	 * @generated
	 */
	int CUSTOMER_SUPPLIER = 16;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER__INTERFACE = UPSTREAM_DOWNSTREAM_RELATIONSHIP__INTERFACE;

	/**
	 * The feature id for the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER__RELATED_CONTEXT = UPSTREAM_DOWNSTREAM_RELATIONSHIP__RELATED_CONTEXT;

	/**
	 * The feature id for the '<em><b>Downstream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER__DOWNSTREAM = UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM;

	/**
	 * The feature id for the '<em><b>Upstream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER__UPSTREAM = UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM;

	/**
	 * The number of structural features of the '<em>Customer Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER_FEATURE_COUNT = UPSTREAM_DOWNSTREAM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customer Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER_OPERATION_COUNT = UPSTREAM_DOWNSTREAM_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.RelationshipRoleImpl <em>Relationship Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.RelationshipRoleImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getRelationshipRole()
	 * @generated
	 */
	int RELATIONSHIP_ROLE = 24;

	/**
	 * The number of structural features of the '<em>Relationship Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relationship Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DownstreamRoleImpl <em>Downstream Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DownstreamRoleImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDownstreamRole()
	 * @generated
	 */
	int DOWNSTREAM_ROLE = 23;

	/**
	 * The number of structural features of the '<em>Downstream Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNSTREAM_ROLE_FEATURE_COUNT = RELATIONSHIP_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Downstream Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNSTREAM_ROLE_OPERATION_COUNT = RELATIONSHIP_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.ConformistImpl <em>Conformist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ConformistImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getConformist()
	 * @generated
	 */
	int CONFORMIST = 17;

	/**
	 * The number of structural features of the '<em>Conformist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMIST_FEATURE_COUNT = DOWNSTREAM_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conformist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMIST_OPERATION_COUNT = DOWNSTREAM_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.AnticorruptionLayerImpl <em>Anticorruption Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.AnticorruptionLayerImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAnticorruptionLayer()
	 * @generated
	 */
	int ANTICORRUPTION_LAYER = 18;

	/**
	 * The number of structural features of the '<em>Anticorruption Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTICORRUPTION_LAYER_FEATURE_COUNT = DOWNSTREAM_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anticorruption Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTICORRUPTION_LAYER_OPERATION_COUNT = DOWNSTREAM_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.UpstreamRoleImpl <em>Upstream Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.UpstreamRoleImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getUpstreamRole()
	 * @generated
	 */
	int UPSTREAM_ROLE = 22;

	/**
	 * The number of structural features of the '<em>Upstream Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_ROLE_FEATURE_COUNT = RELATIONSHIP_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upstream Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_ROLE_OPERATION_COUNT = RELATIONSHIP_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.OpenHostServiceImpl <em>Open Host Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.OpenHostServiceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getOpenHostService()
	 * @generated
	 */
	int OPEN_HOST_SERVICE = 19;

	/**
	 * The number of structural features of the '<em>Open Host Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_HOST_SERVICE_FEATURE_COUNT = UPSTREAM_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open Host Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_HOST_SERVICE_OPERATION_COUNT = UPSTREAM_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.PublishedLanguageImpl <em>Published Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.PublishedLanguageImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getPublishedLanguage()
	 * @generated
	 */
	int PUBLISHED_LANGUAGE = 20;

	/**
	 * The number of structural features of the '<em>Published Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHED_LANGUAGE_FEATURE_COUNT = UPSTREAM_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Published Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHED_LANGUAGE_OPERATION_COUNT = UPSTREAM_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.AggregateNode <em>Aggregate Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.AggregateNode
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAggregateNode()
	 * @generated
	 */
	int AGGREGATE_NODE = 36;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.ValueObjectNodeImpl <em>Value Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ValueObjectNodeImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getValueObjectNode()
	 * @generated
	 */
	int VALUE_OBJECT_NODE = 34;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.EntityNodeImpl <em>Entity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.EntityNodeImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getEntityNode()
	 * @generated
	 */
	int ENTITY_NODE = 35;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.Persistable <em>Persistable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.Persistable
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getPersistable()
	 * @generated
	 */
	int PERSISTABLE = 37;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.MicroserviceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 28;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Model Element Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__SERVICE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Workflow Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__WORKFLOW_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Correspoding Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CORRESPODING_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Implementation Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__IMPLEMENTATION_TECHNOLOGY = 5;

	/**
	 * The feature id for the '<em><b>Sends Request To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__SENDS_REQUEST_TO = 6;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.InterfaceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 29;

	/**
	 * The feature id for the '<em><b>Interface For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_FOR = 0;

	/**
	 * The feature id for the '<em><b>Bounded Context Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.SynchronousInterfaceImpl <em>Synchronous Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.SynchronousInterfaceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSynchronousInterface()
	 * @generated
	 */
	int SYNCHRONOUS_INTERFACE = 30;

	/**
	 * The feature id for the '<em><b>Interface For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE__INTERFACE_FOR = INTERFACE__INTERFACE_FOR;

	/**
	 * The feature id for the '<em><b>Bounded Context Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP = INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE__INTERFACE_NAME = INTERFACE__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Rest Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE__REST_ENDPOINTS = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE__VERSION = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronous Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Synchronous Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.AsynchronousInterfaceImpl <em>Asynchronous Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.AsynchronousInterfaceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAsynchronousInterface()
	 * @generated
	 */
	int ASYNCHRONOUS_INTERFACE = 31;

	/**
	 * The feature id for the '<em><b>Interface For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__INTERFACE_FOR = INTERFACE__INTERFACE_FOR;

	/**
	 * The feature id for the '<em><b>Bounded Context Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP = INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__INTERFACE_NAME = INTERFACE__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Interface Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topology Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__TOPOLOGY_TYPE = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__DOMAIN_EVENT = INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asynchronous Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asynchronous Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENDPOINT__PATH = 0;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENDPOINT__HTTP_METHOD = 1;

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
	 * The feature id for the '<em><b>Corresponding Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_IMPLEMENTATION__CLASS_NAME = 1;

	/**
	 * The number of structural features of the '<em>Model Element Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_IMPLEMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Element Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_NODE__ELEMENT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Aggregate Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Aggregate Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_NODE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_NODE__ELEMENT_NAME = AGGREGATE_NODE__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Value Object Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_NODE__VALUE_OBJECT_NODES = AGGREGATE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_NODE__REFERENCED_ENTITIES = AGGREGATE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_NODE_FEATURE_COUNT = AGGREGATE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_NODE_OPERATION_COUNT = AGGREGATE_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NODE__ELEMENT_NAME = AGGREGATE_NODE__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Value Object Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NODE__VALUE_OBJECT_NODES = AGGREGATE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NODE_FEATURE_COUNT = AGGREGATE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NODE_OPERATION_COUNT = AGGREGATE_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persistable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Persistable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.HttpMethod
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 38;


	/**
	 * The meta object id for the '{@link microserviceMetamodell.AsynchronousInterfaceRole <em>Asynchronous Interface Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.AsynchronousInterfaceRole
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAsynchronousInterfaceRole()
	 * @generated
	 */
	int ASYNCHRONOUS_INTERFACE_ROLE = 39;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.TopologyType <em>Topology Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.TopologyType
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getTopologyType()
	 * @generated
	 */
	int TOPOLOGY_TYPE = 40;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.WorkflowRole <em>Workflow Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.WorkflowRole
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getWorkflowRole()
	 * @generated
	 */
	int WORKFLOW_ROLE = 41;


	/**
	 * The meta object id for the '{@link microserviceMetamodell.ImplementationTechnology <em>Implementation Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.ImplementationTechnology
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getImplementationTechnology()
	 * @generated
	 */
	int IMPLEMENTATION_TECHNOLOGY = 42;


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
	 * Returns the meta object for class '{@link microserviceMetamodell.ModelElementImplementation <em>Model Element Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Implementation</em>'.
	 * @see microserviceMetamodell.ModelElementImplementation
	 * @generated
	 */
	EClass getModelElementImplementation();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.ModelElementImplementation#getCorrespondingModelElement <em>Corresponding Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresponding Model Element</em>'.
	 * @see microserviceMetamodell.ModelElementImplementation#getCorrespondingModelElement()
	 * @see #getModelElementImplementation()
	 * @generated
	 */
	EReference getModelElementImplementation_CorrespondingModelElement();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.ModelElementImplementation#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see microserviceMetamodell.ModelElementImplementation#getClassName()
	 * @see #getModelElementImplementation()
	 * @generated
	 */
	EAttribute getModelElementImplementation_ClassName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.ValueObjectNode <em>Value Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object Node</em>'.
	 * @see microserviceMetamodell.ValueObjectNode
	 * @generated
	 */
	EClass getValueObjectNode();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.ValueObjectNode#getValueObjectNodes <em>Value Object Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Object Nodes</em>'.
	 * @see microserviceMetamodell.ValueObjectNode#getValueObjectNodes()
	 * @see #getValueObjectNode()
	 * @generated
	 */
	EReference getValueObjectNode_ValueObjectNodes();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.ValueObjectNode#getReferencedEntities <em>Referenced Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Entities</em>'.
	 * @see microserviceMetamodell.ValueObjectNode#getReferencedEntities()
	 * @see #getValueObjectNode()
	 * @generated
	 */
	EReference getValueObjectNode_ReferencedEntities();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.EntityNode <em>Entity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Node</em>'.
	 * @see microserviceMetamodell.EntityNode
	 * @generated
	 */
	EClass getEntityNode();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.EntityNode#getValueObjectNodes <em>Value Object Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Object Nodes</em>'.
	 * @see microserviceMetamodell.EntityNode#getValueObjectNodes()
	 * @see #getEntityNode()
	 * @generated
	 */
	EReference getEntityNode_ValueObjectNodes();

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
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.SystemModel#getDomainModelLayer <em>Domain Model Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Model Layer</em>'.
	 * @see microserviceMetamodell.SystemModel#getDomainModelLayer()
	 * @see #getSystemModel()
	 * @generated
	 */
	EReference getSystemModel_DomainModelLayer();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.SystemModel#getTechnicalLayer <em>Technical Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technical Layer</em>'.
	 * @see microserviceMetamodell.SystemModel#getTechnicalLayer()
	 * @see #getSystemModel()
	 * @generated
	 */
	EReference getSystemModel_TechnicalLayer();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.SystemModel#getInfrastructureLayer <em>Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infrastructure Layer</em>'.
	 * @see microserviceMetamodell.SystemModel#getInfrastructureLayer()
	 * @see #getSystemModel()
	 * @generated
	 */
	EReference getSystemModel_InfrastructureLayer();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see microserviceMetamodell.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.DomainModel#getDomainEvents <em>Domain Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Events</em>'.
	 * @see microserviceMetamodell.DomainModel#getDomainEvents()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_DomainEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainModel#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see microserviceMetamodell.DomainModel#getModules()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Modules();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.DomainModel#getBoundedContext <em>Bounded Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounded Context</em>'.
	 * @see microserviceMetamodell.DomainModel#getBoundedContext()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_BoundedContext();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DomainModel#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see microserviceMetamodell.DomainModel#getModelName()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_ModelName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DomainModelLayer <em>Domain Model Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model Layer</em>'.
	 * @see microserviceMetamodell.DomainModelLayer
	 * @generated
	 */
	EClass getDomainModelLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainModelLayer#getBoundedContexts <em>Bounded Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounded Contexts</em>'.
	 * @see microserviceMetamodell.DomainModelLayer#getBoundedContexts()
	 * @see #getDomainModelLayer()
	 * @generated
	 */
	EReference getDomainModelLayer_BoundedContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainModelLayer#getDomainModels <em>Domain Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Models</em>'.
	 * @see microserviceMetamodell.DomainModelLayer#getDomainModels()
	 * @see #getDomainModelLayer()
	 * @generated
	 */
	EReference getDomainModelLayer_DomainModels();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainModelLayer#getDomainEvents <em>Domain Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Events</em>'.
	 * @see microserviceMetamodell.DomainModelLayer#getDomainEvents()
	 * @see #getDomainModelLayer()
	 * @generated
	 */
	EReference getDomainModelLayer_DomainEvents();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.InfrastructureLayer <em>Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Layer</em>'.
	 * @see microserviceMetamodell.InfrastructureLayer
	 * @generated
	 */
	EClass getInfrastructureLayer();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.TechnicalLayer <em>Technical Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technical Layer</em>'.
	 * @see microserviceMetamodell.TechnicalLayer
	 * @generated
	 */
	EClass getTechnicalLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.TechnicalLayer#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservices</em>'.
	 * @see microserviceMetamodell.TechnicalLayer#getMicroservices()
	 * @see #getTechnicalLayer()
	 * @generated
	 */
	EReference getTechnicalLayer_Microservices();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see microserviceMetamodell.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Entity#getValueObjects <em>Value Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Objects</em>'.
	 * @see microserviceMetamodell.Entity#getValueObjects()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ValueObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Entity#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see microserviceMetamodell.Entity#getBehaviours()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Behaviours();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see microserviceMetamodell.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.ValueObject#getReferencedEntities <em>Referenced Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Entities</em>'.
	 * @see microserviceMetamodell.ValueObject#getReferencedEntities()
	 * @see #getValueObject()
	 * @generated
	 */
	EReference getValueObject_ReferencedEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.ValueObject#getValueObjects <em>Value Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Objects</em>'.
	 * @see microserviceMetamodell.ValueObject#getValueObjects()
	 * @see #getValueObject()
	 * @generated
	 */
	EReference getValueObject_ValueObjects();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see microserviceMetamodell.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Service#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see microserviceMetamodell.Service#getBehaviours()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Behaviours();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.Service#getReferencedElements <em>Referenced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Elements</em>'.
	 * @see microserviceMetamodell.Service#getReferencedElements()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ReferencedElements();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see microserviceMetamodell.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.Aggregate#getAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregate Root</em>'.
	 * @see microserviceMetamodell.Aggregate#getAggregateRoot()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_AggregateRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Aggregate#getAggregateNode <em>Aggregate Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregate Node</em>'.
	 * @see microserviceMetamodell.Aggregate#getAggregateNode()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_AggregateNode();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see microserviceMetamodell.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Factory#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see microserviceMetamodell.Factory#getBehaviours()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Behaviours();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.Factory#getFactoryFor <em>Factory For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Factory For</em>'.
	 * @see microserviceMetamodell.Factory#getFactoryFor()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_FactoryFor();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see microserviceMetamodell.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Repository#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see microserviceMetamodell.Repository#getBehaviours()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Behaviours();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.Repository#getRepositoryFor <em>Repository For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository For</em>'.
	 * @see microserviceMetamodell.Repository#getRepositoryFor()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_RepositoryFor();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Event</em>'.
	 * @see microserviceMetamodell.DomainEvent
	 * @generated
	 */
	EClass getDomainEvent();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.DomainEvent#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Model</em>'.
	 * @see microserviceMetamodell.DomainEvent#getDomainModel()
	 * @see #getDomainEvent()
	 * @generated
	 */
	EReference getDomainEvent_DomainModel();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DomainEvent#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see microserviceMetamodell.DomainEvent#getEventName()
	 * @see #getDomainEvent()
	 * @generated
	 */
	EAttribute getDomainEvent_EventName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see microserviceMetamodell.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Module#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see microserviceMetamodell.Module#getModelElements()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModelElements();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Module#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see microserviceMetamodell.Module#getModuleName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_ModuleName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.BoundedContext <em>Bounded Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Context</em>'.
	 * @see microserviceMetamodell.BoundedContext
	 * @generated
	 */
	EClass getBoundedContext();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.BoundedContext#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Model</em>'.
	 * @see microserviceMetamodell.BoundedContext#getDomainModel()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EReference getBoundedContext_DomainModel();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.BoundedContext#getContextName <em>Context Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Name</em>'.
	 * @see microserviceMetamodell.BoundedContext#getContextName()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EAttribute getBoundedContext_ContextName();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.BoundedContext#getCorrespodingMicroservice <em>Correspoding Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correspoding Microservice</em>'.
	 * @see microserviceMetamodell.BoundedContext#getCorrespodingMicroservice()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EReference getBoundedContext_CorrespodingMicroservice();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.BoundedContext#getBoundedContextRelationships <em>Bounded Context Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounded Context Relationships</em>'.
	 * @see microserviceMetamodell.BoundedContext#getBoundedContextRelationships()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EReference getBoundedContext_BoundedContextRelationships();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see microserviceMetamodell.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Behaviour#getBehaviourName <em>Behaviour Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour Name</em>'.
	 * @see microserviceMetamodell.Behaviour#getBehaviourName()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_BehaviourName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.SharedKernel <em>Shared Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Kernel</em>'.
	 * @see microserviceMetamodell.SharedKernel
	 * @generated
	 */
	EClass getSharedKernel();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.CustomerSupplier <em>Customer Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Supplier</em>'.
	 * @see microserviceMetamodell.CustomerSupplier
	 * @generated
	 */
	EClass getCustomerSupplier();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Conformist <em>Conformist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conformist</em>'.
	 * @see microserviceMetamodell.Conformist
	 * @generated
	 */
	EClass getConformist();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.AnticorruptionLayer <em>Anticorruption Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anticorruption Layer</em>'.
	 * @see microserviceMetamodell.AnticorruptionLayer
	 * @generated
	 */
	EClass getAnticorruptionLayer();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.OpenHostService <em>Open Host Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Host Service</em>'.
	 * @see microserviceMetamodell.OpenHostService
	 * @generated
	 */
	EClass getOpenHostService();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.PublishedLanguage <em>Published Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Published Language</em>'.
	 * @see microserviceMetamodell.PublishedLanguage
	 * @generated
	 */
	EClass getPublishedLanguage();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.BoundedContextRelationship <em>Bounded Context Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Context Relationship</em>'.
	 * @see microserviceMetamodell.BoundedContextRelationship
	 * @generated
	 */
	EClass getBoundedContextRelationship();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.BoundedContextRelationship#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see microserviceMetamodell.BoundedContextRelationship#getInterface()
	 * @see #getBoundedContextRelationship()
	 * @generated
	 */
	EReference getBoundedContextRelationship_Interface();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.BoundedContextRelationship#getRelatedContext <em>Related Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Context</em>'.
	 * @see microserviceMetamodell.BoundedContextRelationship#getRelatedContext()
	 * @see #getBoundedContextRelationship()
	 * @generated
	 */
	EReference getBoundedContextRelationship_RelatedContext();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.UpstreamRole <em>Upstream Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upstream Role</em>'.
	 * @see microserviceMetamodell.UpstreamRole
	 * @generated
	 */
	EClass getUpstreamRole();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DownstreamRole <em>Downstream Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Downstream Role</em>'.
	 * @see microserviceMetamodell.DownstreamRole
	 * @generated
	 */
	EClass getDownstreamRole();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.RelationshipRole <em>Relationship Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Role</em>'.
	 * @see microserviceMetamodell.RelationshipRole
	 * @generated
	 */
	EClass getRelationshipRole();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.UpstreamDownstreamRelationship <em>Upstream Downstream Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upstream Downstream Relationship</em>'.
	 * @see microserviceMetamodell.UpstreamDownstreamRelationship
	 * @generated
	 */
	EClass getUpstreamDownstreamRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.UpstreamDownstreamRelationship#getDownstream <em>Downstream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Downstream</em>'.
	 * @see microserviceMetamodell.UpstreamDownstreamRelationship#getDownstream()
	 * @see #getUpstreamDownstreamRelationship()
	 * @generated
	 */
	EReference getUpstreamDownstreamRelationship_Downstream();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.UpstreamDownstreamRelationship#getUpstream <em>Upstream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upstream</em>'.
	 * @see microserviceMetamodell.UpstreamDownstreamRelationship#getUpstream()
	 * @see #getUpstreamDownstreamRelationship()
	 * @generated
	 */
	EReference getUpstreamDownstreamRelationship_Upstream();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see microserviceMetamodell.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.ModelElement#getIsImplementedTrough <em>Is Implemented Trough</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Implemented Trough</em>'.
	 * @see microserviceMetamodell.ModelElement#getIsImplementedTrough()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_IsImplementedTrough();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.ModelElement#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see microserviceMetamodell.ModelElement#getElementName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_ElementName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Factorizeable <em>Factorizeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factorizeable</em>'.
	 * @see microserviceMetamodell.Factorizeable
	 * @generated
	 */
	EClass getFactorizeable();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.AggregateNode <em>Aggregate Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Node</em>'.
	 * @see microserviceMetamodell.AggregateNode
	 * @generated
	 */
	EClass getAggregateNode();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.AggregateNode#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see microserviceMetamodell.AggregateNode#getElementName()
	 * @see #getAggregateNode()
	 * @generated
	 */
	EAttribute getAggregateNode_ElementName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Persistable <em>Persistable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistable</em>'.
	 * @see microserviceMetamodell.Persistable
	 * @generated
	 */
	EClass getPersistable();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see microserviceMetamodell.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Microservice#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see microserviceMetamodell.Microservice#getInterfaces()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Microservice#getModelElementImplementations <em>Model Element Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Element Implementations</em>'.
	 * @see microserviceMetamodell.Microservice#getModelElementImplementations()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_ModelElementImplementations();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Microservice#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see microserviceMetamodell.Microservice#getServiceName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Microservice#getWorkflowRole <em>Workflow Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workflow Role</em>'.
	 * @see microserviceMetamodell.Microservice#getWorkflowRole()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_WorkflowRole();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.Microservice#getCorrespodingContext <em>Correspoding Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correspoding Context</em>'.
	 * @see microserviceMetamodell.Microservice#getCorrespodingContext()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_CorrespodingContext();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Microservice#getImplementationTechnology <em>Implementation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Technology</em>'.
	 * @see microserviceMetamodell.Microservice#getImplementationTechnology()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_ImplementationTechnology();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.Microservice#getSendsRequestTo <em>Sends Request To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends Request To</em>'.
	 * @see microserviceMetamodell.Microservice#getSendsRequestTo()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_SendsRequestTo();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see microserviceMetamodell.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.Interface#getInterfaceFor <em>Interface For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface For</em>'.
	 * @see microserviceMetamodell.Interface#getInterfaceFor()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_InterfaceFor();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.Interface#getBoundedContextRelationship <em>Bounded Context Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounded Context Relationship</em>'.
	 * @see microserviceMetamodell.Interface#getBoundedContextRelationship()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_BoundedContextRelationship();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Interface#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see microserviceMetamodell.Interface#getInterfaceName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_InterfaceName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.SynchronousInterface <em>Synchronous Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Interface</em>'.
	 * @see microserviceMetamodell.SynchronousInterface
	 * @generated
	 */
	EClass getSynchronousInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.SynchronousInterface#getRestEndpoints <em>Rest Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest Endpoints</em>'.
	 * @see microserviceMetamodell.SynchronousInterface#getRestEndpoints()
	 * @see #getSynchronousInterface()
	 * @generated
	 */
	EReference getSynchronousInterface_RestEndpoints();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.SynchronousInterface#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see microserviceMetamodell.SynchronousInterface#getVersion()
	 * @see #getSynchronousInterface()
	 * @generated
	 */
	EAttribute getSynchronousInterface_Version();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.AsynchronousInterface <em>Asynchronous Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Interface</em>'.
	 * @see microserviceMetamodell.AsynchronousInterface
	 * @generated
	 */
	EClass getAsynchronousInterface();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.AsynchronousInterface#getInterfaceRole <em>Interface Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Role</em>'.
	 * @see microserviceMetamodell.AsynchronousInterface#getInterfaceRole()
	 * @see #getAsynchronousInterface()
	 * @generated
	 */
	EAttribute getAsynchronousInterface_InterfaceRole();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.AsynchronousInterface#getTopologyType <em>Topology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topology Type</em>'.
	 * @see microserviceMetamodell.AsynchronousInterface#getTopologyType()
	 * @see #getAsynchronousInterface()
	 * @generated
	 */
	EAttribute getAsynchronousInterface_TopologyType();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.AsynchronousInterface#getDomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Event</em>'.
	 * @see microserviceMetamodell.AsynchronousInterface#getDomainEvent()
	 * @see #getAsynchronousInterface()
	 * @generated
	 */
	EReference getAsynchronousInterface_DomainEvent();

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
	 * Returns the meta object for enum '{@link microserviceMetamodell.AsynchronousInterfaceRole <em>Asynchronous Interface Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asynchronous Interface Role</em>'.
	 * @see microserviceMetamodell.AsynchronousInterfaceRole
	 * @generated
	 */
	EEnum getAsynchronousInterfaceRole();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.TopologyType <em>Topology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Topology Type</em>'.
	 * @see microserviceMetamodell.TopologyType
	 * @generated
	 */
	EEnum getTopologyType();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.WorkflowRole <em>Workflow Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Workflow Role</em>'.
	 * @see microserviceMetamodell.WorkflowRole
	 * @generated
	 */
	EEnum getWorkflowRole();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.ImplementationTechnology <em>Implementation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Technology</em>'.
	 * @see microserviceMetamodell.ImplementationTechnology
	 * @generated
	 */
	EEnum getImplementationTechnology();

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
		 * The meta object literal for the '{@link microserviceMetamodell.impl.ModelElementImplementationImpl <em>Model Element Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.ModelElementImplementationImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getModelElementImplementation()
		 * @generated
		 */
		EClass MODEL_ELEMENT_IMPLEMENTATION = eINSTANCE.getModelElementImplementation();

		/**
		 * The meta object literal for the '<em><b>Corresponding Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT = eINSTANCE.getModelElementImplementation_CorrespondingModelElement();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_IMPLEMENTATION__CLASS_NAME = eINSTANCE.getModelElementImplementation_ClassName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.ValueObjectNodeImpl <em>Value Object Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.ValueObjectNodeImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getValueObjectNode()
		 * @generated
		 */
		EClass VALUE_OBJECT_NODE = eINSTANCE.getValueObjectNode();

		/**
		 * The meta object literal for the '<em><b>Value Object Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OBJECT_NODE__VALUE_OBJECT_NODES = eINSTANCE.getValueObjectNode_ValueObjectNodes();

		/**
		 * The meta object literal for the '<em><b>Referenced Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OBJECT_NODE__REFERENCED_ENTITIES = eINSTANCE.getValueObjectNode_ReferencedEntities();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.EntityNodeImpl <em>Entity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.EntityNodeImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getEntityNode()
		 * @generated
		 */
		EClass ENTITY_NODE = eINSTANCE.getEntityNode();

		/**
		 * The meta object literal for the '<em><b>Value Object Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_NODE__VALUE_OBJECT_NODES = eINSTANCE.getEntityNode_ValueObjectNodes();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_MODEL__DESCRIPTION = eINSTANCE.getSystemModel_Description();

		/**
		 * The meta object literal for the '<em><b>Domain Model Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODEL__DOMAIN_MODEL_LAYER = eINSTANCE.getSystemModel_DomainModelLayer();

		/**
		 * The meta object literal for the '<em><b>Technical Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODEL__TECHNICAL_LAYER = eINSTANCE.getSystemModel_TechnicalLayer();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODEL__INFRASTRUCTURE_LAYER = eINSTANCE.getSystemModel_InfrastructureLayer();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DomainModelImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Domain Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__DOMAIN_EVENTS = eINSTANCE.getDomainModel_DomainEvents();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__MODULES = eINSTANCE.getDomainModel_Modules();

		/**
		 * The meta object literal for the '<em><b>Bounded Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__BOUNDED_CONTEXT = eINSTANCE.getDomainModel_BoundedContext();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__MODEL_NAME = eINSTANCE.getDomainModel_ModelName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DomainModelLayerImpl <em>Domain Model Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DomainModelLayerImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainModelLayer()
		 * @generated
		 */
		EClass DOMAIN_MODEL_LAYER = eINSTANCE.getDomainModelLayer();

		/**
		 * The meta object literal for the '<em><b>Bounded Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS = eINSTANCE.getDomainModelLayer_BoundedContexts();

		/**
		 * The meta object literal for the '<em><b>Domain Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL_LAYER__DOMAIN_MODELS = eINSTANCE.getDomainModelLayer_DomainModels();

		/**
		 * The meta object literal for the '<em><b>Domain Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL_LAYER__DOMAIN_EVENTS = eINSTANCE.getDomainModelLayer_DomainEvents();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.InfrastructureLayerImpl <em>Infrastructure Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.InfrastructureLayerImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getInfrastructureLayer()
		 * @generated
		 */
		EClass INFRASTRUCTURE_LAYER = eINSTANCE.getInfrastructureLayer();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.TechnicalLayerImpl <em>Technical Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.TechnicalLayerImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getTechnicalLayer()
		 * @generated
		 */
		EClass TECHNICAL_LAYER = eINSTANCE.getTechnicalLayer();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNICAL_LAYER__MICROSERVICES = eINSTANCE.getTechnicalLayer_Microservices();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.EntityImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Value Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__VALUE_OBJECTS = eINSTANCE.getEntity_ValueObjects();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__BEHAVIOURS = eINSTANCE.getEntity_Behaviours();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.ValueObjectImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '<em><b>Referenced Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OBJECT__REFERENCED_ENTITIES = eINSTANCE.getValueObject_ReferencedEntities();

		/**
		 * The meta object literal for the '<em><b>Value Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OBJECT__VALUE_OBJECTS = eINSTANCE.getValueObject_ValueObjects();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.ServiceImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BEHAVIOURS = eINSTANCE.getService_Behaviours();

		/**
		 * The meta object literal for the '<em><b>Referenced Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REFERENCED_ELEMENTS = eINSTANCE.getService_ReferencedElements();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.AggregateImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Aggregate Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__AGGREGATE_ROOT = eINSTANCE.getAggregate_AggregateRoot();

		/**
		 * The meta object literal for the '<em><b>Aggregate Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__AGGREGATE_NODE = eINSTANCE.getAggregate_AggregateNode();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.FactoryImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getFactory()
		 * @generated
		 */
		EClass FACTORY = eINSTANCE.getFactory();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__BEHAVIOURS = eINSTANCE.getFactory_Behaviours();

		/**
		 * The meta object literal for the '<em><b>Factory For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__FACTORY_FOR = eINSTANCE.getFactory_FactoryFor();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.RepositoryImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__BEHAVIOURS = eINSTANCE.getRepository_Behaviours();

		/**
		 * The meta object literal for the '<em><b>Repository For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__REPOSITORY_FOR = eINSTANCE.getRepository_RepositoryFor();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DomainEventImpl <em>Domain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DomainEventImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDomainEvent()
		 * @generated
		 */
		EClass DOMAIN_EVENT = eINSTANCE.getDomainEvent();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_EVENT__DOMAIN_MODEL = eINSTANCE.getDomainEvent_DomainModel();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_EVENT__EVENT_NAME = eINSTANCE.getDomainEvent_EventName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.ModuleImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODEL_ELEMENTS = eINSTANCE.getModule_ModelElements();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MODULE_NAME = eINSTANCE.getModule_ModuleName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.BoundedContextImpl <em>Bounded Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.BoundedContextImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBoundedContext()
		 * @generated
		 */
		EClass BOUNDED_CONTEXT = eINSTANCE.getBoundedContext();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_CONTEXT__DOMAIN_MODEL = eINSTANCE.getBoundedContext_DomainModel();

		/**
		 * The meta object literal for the '<em><b>Context Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_CONTEXT__CONTEXT_NAME = eINSTANCE.getBoundedContext_ContextName();

		/**
		 * The meta object literal for the '<em><b>Correspoding Microservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_CONTEXT__CORRESPODING_MICROSERVICE = eINSTANCE.getBoundedContext_CorrespodingMicroservice();

		/**
		 * The meta object literal for the '<em><b>Bounded Context Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_CONTEXT__BOUNDED_CONTEXT_RELATIONSHIPS = eINSTANCE.getBoundedContext_BoundedContextRelationships();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.BehaviourImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Behaviour Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__BEHAVIOUR_NAME = eINSTANCE.getBehaviour_BehaviourName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.SharedKernelImpl <em>Shared Kernel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.SharedKernelImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSharedKernel()
		 * @generated
		 */
		EClass SHARED_KERNEL = eINSTANCE.getSharedKernel();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.CustomerSupplierImpl <em>Customer Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.CustomerSupplierImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getCustomerSupplier()
		 * @generated
		 */
		EClass CUSTOMER_SUPPLIER = eINSTANCE.getCustomerSupplier();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.ConformistImpl <em>Conformist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.ConformistImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getConformist()
		 * @generated
		 */
		EClass CONFORMIST = eINSTANCE.getConformist();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.AnticorruptionLayerImpl <em>Anticorruption Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.AnticorruptionLayerImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAnticorruptionLayer()
		 * @generated
		 */
		EClass ANTICORRUPTION_LAYER = eINSTANCE.getAnticorruptionLayer();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.OpenHostServiceImpl <em>Open Host Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.OpenHostServiceImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getOpenHostService()
		 * @generated
		 */
		EClass OPEN_HOST_SERVICE = eINSTANCE.getOpenHostService();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.PublishedLanguageImpl <em>Published Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.PublishedLanguageImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getPublishedLanguage()
		 * @generated
		 */
		EClass PUBLISHED_LANGUAGE = eINSTANCE.getPublishedLanguage();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.BoundedContextRelationshipImpl <em>Bounded Context Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.BoundedContextRelationshipImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBoundedContextRelationship()
		 * @generated
		 */
		EClass BOUNDED_CONTEXT_RELATIONSHIP = eINSTANCE.getBoundedContextRelationship();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE = eINSTANCE.getBoundedContextRelationship_Interface();

		/**
		 * The meta object literal for the '<em><b>Related Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT = eINSTANCE.getBoundedContextRelationship_RelatedContext();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.UpstreamRoleImpl <em>Upstream Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.UpstreamRoleImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getUpstreamRole()
		 * @generated
		 */
		EClass UPSTREAM_ROLE = eINSTANCE.getUpstreamRole();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DownstreamRoleImpl <em>Downstream Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DownstreamRoleImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDownstreamRole()
		 * @generated
		 */
		EClass DOWNSTREAM_ROLE = eINSTANCE.getDownstreamRole();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.RelationshipRoleImpl <em>Relationship Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.RelationshipRoleImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getRelationshipRole()
		 * @generated
		 */
		EClass RELATIONSHIP_ROLE = eINSTANCE.getRelationshipRole();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.UpstreamDownstreamRelationshipImpl <em>Upstream Downstream Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.UpstreamDownstreamRelationshipImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getUpstreamDownstreamRelationship()
		 * @generated
		 */
		EClass UPSTREAM_DOWNSTREAM_RELATIONSHIP = eINSTANCE.getUpstreamDownstreamRelationship();

		/**
		 * The meta object literal for the '<em><b>Downstream</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM = eINSTANCE.getUpstreamDownstreamRelationship_Downstream();

		/**
		 * The meta object literal for the '<em><b>Upstream</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM = eINSTANCE.getUpstreamDownstreamRelationship_Upstream();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.ModelElementImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Is Implemented Trough</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH = eINSTANCE.getModelElement_IsImplementedTrough();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ELEMENT_NAME = eINSTANCE.getModelElement_ElementName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.Factorizeable <em>Factorizeable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.Factorizeable
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getFactorizeable()
		 * @generated
		 */
		EClass FACTORIZEABLE = eINSTANCE.getFactorizeable();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.AggregateNode <em>Aggregate Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.AggregateNode
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAggregateNode()
		 * @generated
		 */
		EClass AGGREGATE_NODE = eINSTANCE.getAggregateNode();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_NODE__ELEMENT_NAME = eINSTANCE.getAggregateNode_ElementName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.Persistable <em>Persistable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.Persistable
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getPersistable()
		 * @generated
		 */
		EClass PERSISTABLE = eINSTANCE.getPersistable();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.MicroserviceImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__INTERFACES = eINSTANCE.getMicroservice_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Model Element Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS = eINSTANCE.getMicroservice_ModelElementImplementations();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__SERVICE_NAME = eINSTANCE.getMicroservice_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Workflow Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__WORKFLOW_ROLE = eINSTANCE.getMicroservice_WorkflowRole();

		/**
		 * The meta object literal for the '<em><b>Correspoding Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__CORRESPODING_CONTEXT = eINSTANCE.getMicroservice_CorrespodingContext();

		/**
		 * The meta object literal for the '<em><b>Implementation Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__IMPLEMENTATION_TECHNOLOGY = eINSTANCE.getMicroservice_ImplementationTechnology();

		/**
		 * The meta object literal for the '<em><b>Sends Request To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__SENDS_REQUEST_TO = eINSTANCE.getMicroservice_SendsRequestTo();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.InterfaceImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Interface For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__INTERFACE_FOR = eINSTANCE.getInterface_InterfaceFor();

		/**
		 * The meta object literal for the '<em><b>Bounded Context Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP = eINSTANCE.getInterface_BoundedContextRelationship();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__INTERFACE_NAME = eINSTANCE.getInterface_InterfaceName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.SynchronousInterfaceImpl <em>Synchronous Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.SynchronousInterfaceImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSynchronousInterface()
		 * @generated
		 */
		EClass SYNCHRONOUS_INTERFACE = eINSTANCE.getSynchronousInterface();

		/**
		 * The meta object literal for the '<em><b>Rest Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUS_INTERFACE__REST_ENDPOINTS = eINSTANCE.getSynchronousInterface_RestEndpoints();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_INTERFACE__VERSION = eINSTANCE.getSynchronousInterface_Version();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.AsynchronousInterfaceImpl <em>Asynchronous Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.AsynchronousInterfaceImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAsynchronousInterface()
		 * @generated
		 */
		EClass ASYNCHRONOUS_INTERFACE = eINSTANCE.getAsynchronousInterface();

		/**
		 * The meta object literal for the '<em><b>Interface Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE = eINSTANCE.getAsynchronousInterface_InterfaceRole();

		/**
		 * The meta object literal for the '<em><b>Topology Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCHRONOUS_INTERFACE__TOPOLOGY_TYPE = eINSTANCE.getAsynchronousInterface_TopologyType();

		/**
		 * The meta object literal for the '<em><b>Domain Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNCHRONOUS_INTERFACE__DOMAIN_EVENT = eINSTANCE.getAsynchronousInterface_DomainEvent();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.HttpMethod
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.AsynchronousInterfaceRole <em>Asynchronous Interface Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.AsynchronousInterfaceRole
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAsynchronousInterfaceRole()
		 * @generated
		 */
		EEnum ASYNCHRONOUS_INTERFACE_ROLE = eINSTANCE.getAsynchronousInterfaceRole();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.TopologyType <em>Topology Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.TopologyType
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getTopologyType()
		 * @generated
		 */
		EEnum TOPOLOGY_TYPE = eINSTANCE.getTopologyType();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.WorkflowRole <em>Workflow Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.WorkflowRole
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getWorkflowRole()
		 * @generated
		 */
		EEnum WORKFLOW_ROLE = eINSTANCE.getWorkflowRole();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.ImplementationTechnology <em>Implementation Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.ImplementationTechnology
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getImplementationTechnology()
		 * @generated
		 */
		EEnum IMPLEMENTATION_TECHNOLOGY = eINSTANCE.getImplementationTechnology();

	}

} //MicroserviceMetamodellPackage
