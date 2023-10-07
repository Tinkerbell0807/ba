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
	 * The feature id for the '<em><b>Shared Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__SHARED_MODULES = 4;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Bounded Context Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS = 3;

	/**
	 * The number of structural features of the '<em>Domain Model Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_LAYER_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Cloud Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Deployment Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS = 1;

	/**
	 * The feature id for the '<em><b>Build Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS = 2;

	/**
	 * The feature id for the '<em><b>External Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Kafka Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION = 4;

	/**
	 * The number of structural features of the '<em>Infrastructure Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER_FEATURE_COUNT = 5;

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
	int MODEL_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ELEMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__REFERENCED_INTERFACES = 1;

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
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCED_INTERFACES = MODEL_ELEMENT__REFERENCED_INTERFACES;

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
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__REFERENCED_INTERFACES = MODEL_ELEMENT__REFERENCED_INTERFACES;

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
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REFERENCED_INTERFACES = MODEL_ELEMENT__REFERENCED_INTERFACES;

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
	 * The feature id for the '<em><b>Sends Request To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SENDS_REQUEST_TO = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

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
	int FACTORIZEABLE = 21;

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
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__ELEMENT_NAME = FACTORIZEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__REFERENCED_INTERFACES = FACTORIZEABLE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__REFERENCED_INTERFACES = MODEL_ELEMENT__REFERENCED_INTERFACES;

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
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ELEMENT_NAME = MODEL_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REFERENCED_INTERFACES = MODEL_ELEMENT__REFERENCED_INTERFACES;

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
	 * The feature id for the '<em><b>Submodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SUBMODULES = 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Correspoding Microservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES = 2;

	/**
	 * The feature id for the '<em><b>Bounded Context Relationships</b></em>' reference list.
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
	int BOUNDED_CONTEXT_RELATIONSHIP = 17;

	/**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME = 0;

	/**
	 * The number of structural features of the '<em>Bounded Context Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL__RELATIONSHIP_NAME = BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME;

	/**
	 * The feature id for the '<em><b>Related Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL__RELATED_CONTEXTS = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementing Lib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL__IMPLEMENTING_LIB = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shared Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL__SHARED_MODULES = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shared Kernel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL_FEATURE_COUNT = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shared Kernel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_KERNEL_OPERATION_COUNT = BOUNDED_CONTEXT_RELATIONSHIP_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER__RELATIONSHIP_NAME = BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME;

	/**
	 * The feature id for the '<em><b>Downstream Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upstream Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Affected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER__AFFECTED_INTERFACES = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Customer Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER_FEATURE_COUNT = BOUNDED_CONTEXT_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Customer Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SUPPLIER_OPERATION_COUNT = BOUNDED_CONTEXT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.UpstreamComponentImpl <em>Upstream Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.UpstreamComponentImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getUpstreamComponent()
	 * @generated
	 */
	int UPSTREAM_COMPONENT = 18;

	/**
	 * The feature id for the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_COMPONENT__RELATED_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Upstream Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_COMPONENT__UPSTREAM_ROLE = 1;

	/**
	 * The number of structural features of the '<em>Upstream Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Upstream Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.DownstreamComponentImpl <em>Downstream Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DownstreamComponentImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDownstreamComponent()
	 * @generated
	 */
	int DOWNSTREAM_COMPONENT = 19;

	/**
	 * The feature id for the '<em><b>Related Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNSTREAM_COMPONENT__RELATED_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Downstream Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNSTREAM_COMPONENT__DOWNSTREAM_ROLE = 1;

	/**
	 * The number of structural features of the '<em>Downstream Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNSTREAM_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Downstream Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNSTREAM_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.MicroserviceImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 22;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__SERVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Correspoding Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CORRESPODING_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Implementation Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__IMPLEMENTATION_TECHNOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Deployment Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DEPLOYMENT_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Build Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__BUILD_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Called Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CALLED_ENDPOINTS = 6;

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
	int INTERFACE = 23;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REFERENCED_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Referenced Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REFERENCED_RELATIONSHIPS = 2;

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
	int SYNCHRONOUS_INTERFACE = 24;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE__INTERFACE_NAME = INTERFACE__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE__REFERENCED_ELEMENTS = INTERFACE__REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Referenced Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_INTERFACE__REFERENCED_RELATIONSHIPS = INTERFACE__REFERENCED_RELATIONSHIPS;

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
	int ASYNCHRONOUS_INTERFACE = 25;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__INTERFACE_NAME = INTERFACE__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__REFERENCED_ELEMENTS = INTERFACE__REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Referenced Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__REFERENCED_RELATIONSHIPS = INTERFACE__REFERENCED_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Interface Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__DOMAIN_EVENTS = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_INTERFACE__TOPIC = INTERFACE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link microserviceMetamodell.impl.RestEndpointImpl <em>Rest Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.RestEndpointImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getRestEndpoint()
	 * @generated
	 */
	int REST_ENDPOINT = 26;

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
	 * The meta object id for the '{@link microserviceMetamodell.AggregateNode <em>Aggregate Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.AggregateNode
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAggregateNode()
	 * @generated
	 */
	int AGGREGATE_NODE = 29;

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
	 * The meta object id for the '{@link microserviceMetamodell.impl.ValueObjectNodeImpl <em>Value Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ValueObjectNodeImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getValueObjectNode()
	 * @generated
	 */
	int VALUE_OBJECT_NODE = 27;

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
	 * The meta object id for the '{@link microserviceMetamodell.impl.EntityNodeImpl <em>Entity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.EntityNodeImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getEntityNode()
	 * @generated
	 */
	int ENTITY_NODE = 28;

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
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NODE__BEHAVIOURS = AGGREGATE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NODE_FEATURE_COUNT = AGGREGATE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_NODE_OPERATION_COUNT = AGGREGATE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.Persistable <em>Persistable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.Persistable
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getPersistable()
	 * @generated
	 */
	int PERSISTABLE = 30;

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
	 * The meta object id for the '{@link microserviceMetamodell.impl.DeploymentConfigurationImpl <em>Deployment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.DeploymentConfigurationImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDeploymentConfiguration()
	 * @generated
	 */
	int DEPLOYMENT_CONFIGURATION = 31;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION__MICROSERVICE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION__PORT = 1;

	/**
	 * The feature id for the '<em><b>Node Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION__NODE_PORT = 2;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION__REPLICAS = 3;

	/**
	 * The number of structural features of the '<em>Deployment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Deployment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.CloudConfigurationImpl <em>Cloud Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.CloudConfigurationImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getCloudConfiguration()
	 * @generated
	 */
	int CLOUD_CONFIGURATION = 39;

	/**
	 * The number of structural features of the '<em>Cloud Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cloud Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.GCloudConfigurationImpl <em>GCloud Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.GCloudConfigurationImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getGCloudConfiguration()
	 * @generated
	 */
	int GCLOUD_CONFIGURATION = 32;

	/**
	 * The feature id for the '<em><b>Artifact Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME = CLOUD_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Repository Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE = CLOUD_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLOUD_CONFIGURATION__PROJECT_ID = CLOUD_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cluster Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLOUD_CONFIGURATION__CLUSTER_ZONE = CLOUD_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kubernetes Cluster Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION = CLOUD_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GCloud Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLOUD_CONFIGURATION_FEATURE_COUNT = CLOUD_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>GCloud Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCLOUD_CONFIGURATION_OPERATION_COUNT = CLOUD_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.ExternalDependencyImpl <em>External Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.ExternalDependencyImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getExternalDependency()
	 * @generated
	 */
	int EXTERNAL_DEPENDENCY = 33;

	/**
	 * The feature id for the '<em><b>Shared Kernel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__SHARED_KERNEL = 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__GROUP_ID = 1;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__ARTIFACT_ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__VERSION = 3;

	/**
	 * The number of structural features of the '<em>External Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>External Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.BuildConfigurationImpl <em>Build Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.BuildConfigurationImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBuildConfiguration()
	 * @generated
	 */
	int BUILD_CONFIGURATION = 34;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__MICROSERVICE = 0;

	/**
	 * The feature id for the '<em><b>External Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__EXTERNAL_DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Build Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__BUILD_TOOL = 2;

	/**
	 * The number of structural features of the '<em>Build Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Build Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.SharedModuleImpl <em>Shared Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.SharedModuleImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSharedModule()
	 * @generated
	 */
	int SHARED_MODULE = 35;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MODULE__MODEL_ELEMENTS = MODULE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MODULE__MODULE_NAME = MODULE__MODULE_NAME;

	/**
	 * The feature id for the '<em><b>Submodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MODULE__SUBMODULES = MODULE__SUBMODULES;

	/**
	 * The number of structural features of the '<em>Shared Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shared Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.KafkaConfigurationImpl <em>Kafka Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.KafkaConfigurationImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getKafkaConfiguration()
	 * @generated
	 */
	int KAFKA_CONFIGURATION = 36;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONFIGURATION__TOPICS = 0;

	/**
	 * The feature id for the '<em><b>Bootstrap Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONFIGURATION__BOOTSTRAP_SERVER_PORT = 1;

	/**
	 * The feature id for the '<em><b>Kafka Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONFIGURATION__KAFKA_SERVICE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Kafka Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kafka Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.TopicImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 37;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TOPIC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Asynchronous Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__ASYNCHRONOUS_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PARTITIONS = 2;

	/**
	 * The feature id for the '<em><b>Replication Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__REPLICATION_FACTOR = 3;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.impl.KubernetesClusterConfigurationImpl <em>Kubernetes Cluster Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.impl.KubernetesClusterConfigurationImpl
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getKubernetesClusterConfiguration()
	 * @generated
	 */
	int KUBERNETES_CLUSTER_CONFIGURATION = 38;

	/**
	 * The feature id for the '<em><b>Cluster Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER_CONFIGURATION__CLUSTER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER_CONFIGURATION__NODES = 1;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER_CONFIGURATION__MACHINE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER_CONFIGURATION__DEPLOYMENTS = 3;

	/**
	 * The number of structural features of the '<em>Kubernetes Cluster Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Kubernetes Cluster Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.HttpMethod
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 40;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.AsynchronousInterfaceRole <em>Asynchronous Interface Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.AsynchronousInterfaceRole
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getAsynchronousInterfaceRole()
	 * @generated
	 */
	int ASYNCHRONOUS_INTERFACE_ROLE = 41;

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
	 * The meta object id for the '{@link microserviceMetamodell.BuildTool <em>Build Tool</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.BuildTool
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBuildTool()
	 * @generated
	 */
	int BUILD_TOOL = 43;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.UpstreamRole <em>Upstream Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.UpstreamRole
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getUpstreamRole()
	 * @generated
	 */
	int UPSTREAM_ROLE = 44;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.DownstreamRole <em>Downstream Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.DownstreamRole
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDownstreamRole()
	 * @generated
	 */
	int DOWNSTREAM_ROLE = 45;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.GCloudZone <em>GCloud Zone</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.GCloudZone
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getGCloudZone()
	 * @generated
	 */
	int GCLOUD_ZONE = 46;

	/**
	 * The meta object id for the '{@link microserviceMetamodell.GCloudMachineType <em>GCloud Machine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodell.GCloudMachineType
	 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getGCloudMachineType()
	 * @generated
	 */
	int GCLOUD_MACHINE_TYPE = 47;


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
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.DomainModel#getSharedModules <em>Shared Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared Modules</em>'.
	 * @see microserviceMetamodell.DomainModel#getSharedModules()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_SharedModules();

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
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.DomainModelLayer#getBoundedContextRelationships <em>Bounded Context Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounded Context Relationships</em>'.
	 * @see microserviceMetamodell.DomainModelLayer#getBoundedContextRelationships()
	 * @see #getDomainModelLayer()
	 * @generated
	 */
	EReference getDomainModelLayer_BoundedContextRelationships();

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
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.InfrastructureLayer#getCloudConfiguration <em>Cloud Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloud Configuration</em>'.
	 * @see microserviceMetamodell.InfrastructureLayer#getCloudConfiguration()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_CloudConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.InfrastructureLayer#getDeploymentConfigurations <em>Deployment Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Configurations</em>'.
	 * @see microserviceMetamodell.InfrastructureLayer#getDeploymentConfigurations()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_DeploymentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.InfrastructureLayer#getBuildConfigurations <em>Build Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Configurations</em>'.
	 * @see microserviceMetamodell.InfrastructureLayer#getBuildConfigurations()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_BuildConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.InfrastructureLayer#getExternalDependencies <em>External Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Dependencies</em>'.
	 * @see microserviceMetamodell.InfrastructureLayer#getExternalDependencies()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_ExternalDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.InfrastructureLayer#getKafkaConfiguration <em>Kafka Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kafka Configuration</em>'.
	 * @see microserviceMetamodell.InfrastructureLayer#getKafkaConfiguration()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_KafkaConfiguration();

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
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.Service#getSendsRequestTo <em>Sends Request To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Request To</em>'.
	 * @see microserviceMetamodell.Service#getSendsRequestTo()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_SendsRequestTo();

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
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.Module#getSubmodules <em>Submodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodules</em>'.
	 * @see microserviceMetamodell.Module#getSubmodules()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Submodules();

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
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.BoundedContext#getCorrespodingMicroservices <em>Correspoding Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correspoding Microservices</em>'.
	 * @see microserviceMetamodell.BoundedContext#getCorrespodingMicroservices()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EReference getBoundedContext_CorrespodingMicroservices();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.BoundedContext#getBoundedContextRelationships <em>Bounded Context Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bounded Context Relationships</em>'.
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
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.SharedKernel#getRelatedContexts <em>Related Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Contexts</em>'.
	 * @see microserviceMetamodell.SharedKernel#getRelatedContexts()
	 * @see #getSharedKernel()
	 * @generated
	 */
	EReference getSharedKernel_RelatedContexts();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.SharedKernel#getImplementingLib <em>Implementing Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementing Lib</em>'.
	 * @see microserviceMetamodell.SharedKernel#getImplementingLib()
	 * @see #getSharedKernel()
	 * @generated
	 */
	EReference getSharedKernel_ImplementingLib();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.SharedKernel#getSharedModules <em>Shared Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Modules</em>'.
	 * @see microserviceMetamodell.SharedKernel#getSharedModules()
	 * @see #getSharedKernel()
	 * @generated
	 */
	EReference getSharedKernel_SharedModules();

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
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.CustomerSupplier#getDownstreamComponent <em>Downstream Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Downstream Component</em>'.
	 * @see microserviceMetamodell.CustomerSupplier#getDownstreamComponent()
	 * @see #getCustomerSupplier()
	 * @generated
	 */
	EReference getCustomerSupplier_DownstreamComponent();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.CustomerSupplier#getUpstreamComponent <em>Upstream Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upstream Component</em>'.
	 * @see microserviceMetamodell.CustomerSupplier#getUpstreamComponent()
	 * @see #getCustomerSupplier()
	 * @generated
	 */
	EReference getCustomerSupplier_UpstreamComponent();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.CustomerSupplier#getAffectedInterfaces <em>Affected Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Interfaces</em>'.
	 * @see microserviceMetamodell.CustomerSupplier#getAffectedInterfaces()
	 * @see #getCustomerSupplier()
	 * @generated
	 */
	EReference getCustomerSupplier_AffectedInterfaces();

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
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.BoundedContextRelationship#getRelationshipName <em>Relationship Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Name</em>'.
	 * @see microserviceMetamodell.BoundedContextRelationship#getRelationshipName()
	 * @see #getBoundedContextRelationship()
	 * @generated
	 */
	EAttribute getBoundedContextRelationship_RelationshipName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.UpstreamComponent <em>Upstream Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upstream Component</em>'.
	 * @see microserviceMetamodell.UpstreamComponent
	 * @generated
	 */
	EClass getUpstreamComponent();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.UpstreamComponent#getRelatedContext <em>Related Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Context</em>'.
	 * @see microserviceMetamodell.UpstreamComponent#getRelatedContext()
	 * @see #getUpstreamComponent()
	 * @generated
	 */
	EReference getUpstreamComponent_RelatedContext();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.UpstreamComponent#getUpstreamRole <em>Upstream Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upstream Role</em>'.
	 * @see microserviceMetamodell.UpstreamComponent#getUpstreamRole()
	 * @see #getUpstreamComponent()
	 * @generated
	 */
	EAttribute getUpstreamComponent_UpstreamRole();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.DownstreamComponent <em>Downstream Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Downstream Component</em>'.
	 * @see microserviceMetamodell.DownstreamComponent
	 * @generated
	 */
	EClass getDownstreamComponent();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.DownstreamComponent#getRelatedContext <em>Related Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Context</em>'.
	 * @see microserviceMetamodell.DownstreamComponent#getRelatedContext()
	 * @see #getDownstreamComponent()
	 * @generated
	 */
	EReference getDownstreamComponent_RelatedContext();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DownstreamComponent#getDownstreamRole <em>Downstream Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Downstream Role</em>'.
	 * @see microserviceMetamodell.DownstreamComponent#getDownstreamRole()
	 * @see #getDownstreamComponent()
	 * @generated
	 */
	EAttribute getDownstreamComponent_DownstreamRole();

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
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.ModelElement#getReferencedInterfaces <em>Referenced Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Interfaces</em>'.
	 * @see microserviceMetamodell.ModelElement#getReferencedInterfaces()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_ReferencedInterfaces();

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
	 * Returns the meta object for the reference '{@link microserviceMetamodell.Microservice#getDeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment Configuration</em>'.
	 * @see microserviceMetamodell.Microservice#getDeploymentConfiguration()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_DeploymentConfiguration();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.Microservice#getBuildConfiguration <em>Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Build Configuration</em>'.
	 * @see microserviceMetamodell.Microservice#getBuildConfiguration()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_BuildConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.Microservice#getCalledEndpoints <em>Called Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Called Endpoints</em>'.
	 * @see microserviceMetamodell.Microservice#getCalledEndpoints()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_CalledEndpoints();

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
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.Interface#getReferencedElements <em>Referenced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Elements</em>'.
	 * @see microserviceMetamodell.Interface#getReferencedElements()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ReferencedElements();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.Interface#getReferencedRelationships <em>Referenced Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Relationships</em>'.
	 * @see microserviceMetamodell.Interface#getReferencedRelationships()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ReferencedRelationships();

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
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.AsynchronousInterface#getDomainEvents <em>Domain Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Events</em>'.
	 * @see microserviceMetamodell.AsynchronousInterface#getDomainEvents()
	 * @see #getAsynchronousInterface()
	 * @generated
	 */
	EReference getAsynchronousInterface_DomainEvents();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.AsynchronousInterface#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see microserviceMetamodell.AsynchronousInterface#getTopic()
	 * @see #getAsynchronousInterface()
	 * @generated
	 */
	EReference getAsynchronousInterface_Topic();

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
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.EntityNode#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see microserviceMetamodell.EntityNode#getBehaviours()
	 * @see #getEntityNode()
	 * @generated
	 */
	EReference getEntityNode_Behaviours();

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
	 * Returns the meta object for class '{@link microserviceMetamodell.DeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Configuration</em>'.
	 * @see microserviceMetamodell.DeploymentConfiguration
	 * @generated
	 */
	EClass getDeploymentConfiguration();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.DeploymentConfiguration#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microservice</em>'.
	 * @see microserviceMetamodell.DeploymentConfiguration#getMicroservice()
	 * @see #getDeploymentConfiguration()
	 * @generated
	 */
	EReference getDeploymentConfiguration_Microservice();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DeploymentConfiguration#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see microserviceMetamodell.DeploymentConfiguration#getPort()
	 * @see #getDeploymentConfiguration()
	 * @generated
	 */
	EAttribute getDeploymentConfiguration_Port();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DeploymentConfiguration#getNodePort <em>Node Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Port</em>'.
	 * @see microserviceMetamodell.DeploymentConfiguration#getNodePort()
	 * @see #getDeploymentConfiguration()
	 * @generated
	 */
	EAttribute getDeploymentConfiguration_NodePort();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.DeploymentConfiguration#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see microserviceMetamodell.DeploymentConfiguration#getReplicas()
	 * @see #getDeploymentConfiguration()
	 * @generated
	 */
	EAttribute getDeploymentConfiguration_Replicas();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.GCloudConfiguration <em>GCloud Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GCloud Configuration</em>'.
	 * @see microserviceMetamodell.GCloudConfiguration
	 * @generated
	 */
	EClass getGCloudConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.GCloudConfiguration#getArtifactRepositoryName <em>Artifact Repository Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Repository Name</em>'.
	 * @see microserviceMetamodell.GCloudConfiguration#getArtifactRepositoryName()
	 * @see #getGCloudConfiguration()
	 * @generated
	 */
	EAttribute getGCloudConfiguration_ArtifactRepositoryName();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.GCloudConfiguration#getArtifactRepositoryZone <em>Artifact Repository Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Repository Zone</em>'.
	 * @see microserviceMetamodell.GCloudConfiguration#getArtifactRepositoryZone()
	 * @see #getGCloudConfiguration()
	 * @generated
	 */
	EAttribute getGCloudConfiguration_ArtifactRepositoryZone();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.GCloudConfiguration#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see microserviceMetamodell.GCloudConfiguration#getProjectId()
	 * @see #getGCloudConfiguration()
	 * @generated
	 */
	EAttribute getGCloudConfiguration_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.GCloudConfiguration#getClusterZone <em>Cluster Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster Zone</em>'.
	 * @see microserviceMetamodell.GCloudConfiguration#getClusterZone()
	 * @see #getGCloudConfiguration()
	 * @generated
	 */
	EAttribute getGCloudConfiguration_ClusterZone();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodell.GCloudConfiguration#getKubernetesClusterConfiguration <em>Kubernetes Cluster Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kubernetes Cluster Configuration</em>'.
	 * @see microserviceMetamodell.GCloudConfiguration#getKubernetesClusterConfiguration()
	 * @see #getGCloudConfiguration()
	 * @generated
	 */
	EReference getGCloudConfiguration_KubernetesClusterConfiguration();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.ExternalDependency <em>External Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Dependency</em>'.
	 * @see microserviceMetamodell.ExternalDependency
	 * @generated
	 */
	EClass getExternalDependency();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.ExternalDependency#getSharedKernel <em>Shared Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Kernel</em>'.
	 * @see microserviceMetamodell.ExternalDependency#getSharedKernel()
	 * @see #getExternalDependency()
	 * @generated
	 */
	EReference getExternalDependency_SharedKernel();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.ExternalDependency#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see microserviceMetamodell.ExternalDependency#getGroupId()
	 * @see #getExternalDependency()
	 * @generated
	 */
	EAttribute getExternalDependency_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.ExternalDependency#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see microserviceMetamodell.ExternalDependency#getArtifactId()
	 * @see #getExternalDependency()
	 * @generated
	 */
	EAttribute getExternalDependency_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.ExternalDependency#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see microserviceMetamodell.ExternalDependency#getVersion()
	 * @see #getExternalDependency()
	 * @generated
	 */
	EAttribute getExternalDependency_Version();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.BuildConfiguration <em>Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Configuration</em>'.
	 * @see microserviceMetamodell.BuildConfiguration
	 * @generated
	 */
	EClass getBuildConfiguration();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodell.BuildConfiguration#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microservice</em>'.
	 * @see microserviceMetamodell.BuildConfiguration#getMicroservice()
	 * @see #getBuildConfiguration()
	 * @generated
	 */
	EReference getBuildConfiguration_Microservice();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.BuildConfiguration#getExternalDependencies <em>External Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Dependencies</em>'.
	 * @see microserviceMetamodell.BuildConfiguration#getExternalDependencies()
	 * @see #getBuildConfiguration()
	 * @generated
	 */
	EReference getBuildConfiguration_ExternalDependencies();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.BuildConfiguration#getBuildTool <em>Build Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Tool</em>'.
	 * @see microserviceMetamodell.BuildConfiguration#getBuildTool()
	 * @see #getBuildConfiguration()
	 * @generated
	 */
	EAttribute getBuildConfiguration_BuildTool();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.SharedModule <em>Shared Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Module</em>'.
	 * @see microserviceMetamodell.SharedModule
	 * @generated
	 */
	EClass getSharedModule();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.KafkaConfiguration <em>Kafka Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Configuration</em>'.
	 * @see microserviceMetamodell.KafkaConfiguration
	 * @generated
	 */
	EClass getKafkaConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodell.KafkaConfiguration#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see microserviceMetamodell.KafkaConfiguration#getTopics()
	 * @see #getKafkaConfiguration()
	 * @generated
	 */
	EReference getKafkaConfiguration_Topics();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.KafkaConfiguration#getBootstrapServerPort <em>Bootstrap Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bootstrap Server Port</em>'.
	 * @see microserviceMetamodell.KafkaConfiguration#getBootstrapServerPort()
	 * @see #getKafkaConfiguration()
	 * @generated
	 */
	EAttribute getKafkaConfiguration_BootstrapServerPort();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.KafkaConfiguration#getKafkaServiceName <em>Kafka Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kafka Service Name</em>'.
	 * @see microserviceMetamodell.KafkaConfiguration#getKafkaServiceName()
	 * @see #getKafkaConfiguration()
	 * @generated
	 */
	EAttribute getKafkaConfiguration_KafkaServiceName();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see microserviceMetamodell.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Topic#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see microserviceMetamodell.Topic#getTopicName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_TopicName();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.Topic#getAsynchronousInterfaces <em>Asynchronous Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asynchronous Interfaces</em>'.
	 * @see microserviceMetamodell.Topic#getAsynchronousInterfaces()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_AsynchronousInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Topic#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partitions</em>'.
	 * @see microserviceMetamodell.Topic#getPartitions()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Partitions();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.Topic#getReplicationFactor <em>Replication Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication Factor</em>'.
	 * @see microserviceMetamodell.Topic#getReplicationFactor()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_ReplicationFactor();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.KubernetesClusterConfiguration <em>Kubernetes Cluster Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kubernetes Cluster Configuration</em>'.
	 * @see microserviceMetamodell.KubernetesClusterConfiguration
	 * @generated
	 */
	EClass getKubernetesClusterConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.KubernetesClusterConfiguration#getClusterName <em>Cluster Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster Name</em>'.
	 * @see microserviceMetamodell.KubernetesClusterConfiguration#getClusterName()
	 * @see #getKubernetesClusterConfiguration()
	 * @generated
	 */
	EAttribute getKubernetesClusterConfiguration_ClusterName();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.KubernetesClusterConfiguration#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodes</em>'.
	 * @see microserviceMetamodell.KubernetesClusterConfiguration#getNodes()
	 * @see #getKubernetesClusterConfiguration()
	 * @generated
	 */
	EAttribute getKubernetesClusterConfiguration_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodell.KubernetesClusterConfiguration#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Type</em>'.
	 * @see microserviceMetamodell.KubernetesClusterConfiguration#getMachineType()
	 * @see #getKubernetesClusterConfiguration()
	 * @generated
	 */
	EAttribute getKubernetesClusterConfiguration_MachineType();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodell.KubernetesClusterConfiguration#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployments</em>'.
	 * @see microserviceMetamodell.KubernetesClusterConfiguration#getDeployments()
	 * @see #getKubernetesClusterConfiguration()
	 * @generated
	 */
	EReference getKubernetesClusterConfiguration_Deployments();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodell.CloudConfiguration <em>Cloud Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Configuration</em>'.
	 * @see microserviceMetamodell.CloudConfiguration
	 * @generated
	 */
	EClass getCloudConfiguration();

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
	 * Returns the meta object for enum '{@link microserviceMetamodell.ImplementationTechnology <em>Implementation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Technology</em>'.
	 * @see microserviceMetamodell.ImplementationTechnology
	 * @generated
	 */
	EEnum getImplementationTechnology();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.BuildTool <em>Build Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Build Tool</em>'.
	 * @see microserviceMetamodell.BuildTool
	 * @generated
	 */
	EEnum getBuildTool();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.UpstreamRole <em>Upstream Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Upstream Role</em>'.
	 * @see microserviceMetamodell.UpstreamRole
	 * @generated
	 */
	EEnum getUpstreamRole();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.DownstreamRole <em>Downstream Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Downstream Role</em>'.
	 * @see microserviceMetamodell.DownstreamRole
	 * @generated
	 */
	EEnum getDownstreamRole();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.GCloudZone <em>GCloud Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GCloud Zone</em>'.
	 * @see microserviceMetamodell.GCloudZone
	 * @generated
	 */
	EEnum getGCloudZone();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodell.GCloudMachineType <em>GCloud Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GCloud Machine Type</em>'.
	 * @see microserviceMetamodell.GCloudMachineType
	 * @generated
	 */
	EEnum getGCloudMachineType();

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
		 * The meta object literal for the '<em><b>Shared Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__SHARED_MODULES = eINSTANCE.getDomainModel_SharedModules();

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
		 * The meta object literal for the '<em><b>Bounded Context Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS = eINSTANCE.getDomainModelLayer_BoundedContextRelationships();

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
		 * The meta object literal for the '<em><b>Cloud Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION = eINSTANCE.getInfrastructureLayer_CloudConfiguration();

		/**
		 * The meta object literal for the '<em><b>Deployment Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS = eINSTANCE.getInfrastructureLayer_DeploymentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Build Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS = eINSTANCE.getInfrastructureLayer_BuildConfigurations();

		/**
		 * The meta object literal for the '<em><b>External Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES = eINSTANCE.getInfrastructureLayer_ExternalDependencies();

		/**
		 * The meta object literal for the '<em><b>Kafka Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION = eINSTANCE.getInfrastructureLayer_KafkaConfiguration();

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
		 * The meta object literal for the '<em><b>Sends Request To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SENDS_REQUEST_TO = eINSTANCE.getService_SendsRequestTo();

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
		 * The meta object literal for the '<em><b>Submodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SUBMODULES = eINSTANCE.getModule_Submodules();

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
		 * The meta object literal for the '<em><b>Correspoding Microservices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES = eINSTANCE.getBoundedContext_CorrespodingMicroservices();

		/**
		 * The meta object literal for the '<em><b>Bounded Context Relationships</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Related Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_KERNEL__RELATED_CONTEXTS = eINSTANCE.getSharedKernel_RelatedContexts();

		/**
		 * The meta object literal for the '<em><b>Implementing Lib</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_KERNEL__IMPLEMENTING_LIB = eINSTANCE.getSharedKernel_ImplementingLib();

		/**
		 * The meta object literal for the '<em><b>Shared Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_KERNEL__SHARED_MODULES = eINSTANCE.getSharedKernel_SharedModules();

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
		 * The meta object literal for the '<em><b>Downstream Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT = eINSTANCE.getCustomerSupplier_DownstreamComponent();

		/**
		 * The meta object literal for the '<em><b>Upstream Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT = eINSTANCE.getCustomerSupplier_UpstreamComponent();

		/**
		 * The meta object literal for the '<em><b>Affected Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_SUPPLIER__AFFECTED_INTERFACES = eINSTANCE.getCustomerSupplier_AffectedInterfaces();

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
		 * The meta object literal for the '<em><b>Relationship Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME = eINSTANCE.getBoundedContextRelationship_RelationshipName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.UpstreamComponentImpl <em>Upstream Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.UpstreamComponentImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getUpstreamComponent()
		 * @generated
		 */
		EClass UPSTREAM_COMPONENT = eINSTANCE.getUpstreamComponent();

		/**
		 * The meta object literal for the '<em><b>Related Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPSTREAM_COMPONENT__RELATED_CONTEXT = eINSTANCE.getUpstreamComponent_RelatedContext();

		/**
		 * The meta object literal for the '<em><b>Upstream Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM_COMPONENT__UPSTREAM_ROLE = eINSTANCE.getUpstreamComponent_UpstreamRole();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DownstreamComponentImpl <em>Downstream Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DownstreamComponentImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDownstreamComponent()
		 * @generated
		 */
		EClass DOWNSTREAM_COMPONENT = eINSTANCE.getDownstreamComponent();

		/**
		 * The meta object literal for the '<em><b>Related Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOWNSTREAM_COMPONENT__RELATED_CONTEXT = eINSTANCE.getDownstreamComponent_RelatedContext();

		/**
		 * The meta object literal for the '<em><b>Downstream Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOWNSTREAM_COMPONENT__DOWNSTREAM_ROLE = eINSTANCE.getDownstreamComponent_DownstreamRole();

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
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ELEMENT_NAME = eINSTANCE.getModelElement_ElementName();

		/**
		 * The meta object literal for the '<em><b>Referenced Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__REFERENCED_INTERFACES = eINSTANCE.getModelElement_ReferencedInterfaces();

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
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__SERVICE_NAME = eINSTANCE.getMicroservice_ServiceName();

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
		 * The meta object literal for the '<em><b>Deployment Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DEPLOYMENT_CONFIGURATION = eINSTANCE.getMicroservice_DeploymentConfiguration();

		/**
		 * The meta object literal for the '<em><b>Build Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__BUILD_CONFIGURATION = eINSTANCE.getMicroservice_BuildConfiguration();

		/**
		 * The meta object literal for the '<em><b>Called Endpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__CALLED_ENDPOINTS = eINSTANCE.getMicroservice_CalledEndpoints();

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
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__INTERFACE_NAME = eINSTANCE.getInterface_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Referenced Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REFERENCED_ELEMENTS = eINSTANCE.getInterface_ReferencedElements();

		/**
		 * The meta object literal for the '<em><b>Referenced Relationships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REFERENCED_RELATIONSHIPS = eINSTANCE.getInterface_ReferencedRelationships();

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
		 * The meta object literal for the '<em><b>Domain Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNCHRONOUS_INTERFACE__DOMAIN_EVENTS = eINSTANCE.getAsynchronousInterface_DomainEvents();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNCHRONOUS_INTERFACE__TOPIC = eINSTANCE.getAsynchronousInterface_Topic();

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
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_ENDPOINT__PATH = eINSTANCE.getRestEndpoint_Path();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_ENDPOINT__HTTP_METHOD = eINSTANCE.getRestEndpoint_HttpMethod();

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
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_NODE__BEHAVIOURS = eINSTANCE.getEntityNode_Behaviours();

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
		 * The meta object literal for the '{@link microserviceMetamodell.impl.DeploymentConfigurationImpl <em>Deployment Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.DeploymentConfigurationImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDeploymentConfiguration()
		 * @generated
		 */
		EClass DEPLOYMENT_CONFIGURATION = eINSTANCE.getDeploymentConfiguration();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_CONFIGURATION__MICROSERVICE = eINSTANCE.getDeploymentConfiguration_Microservice();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONFIGURATION__PORT = eINSTANCE.getDeploymentConfiguration_Port();

		/**
		 * The meta object literal for the '<em><b>Node Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONFIGURATION__NODE_PORT = eINSTANCE.getDeploymentConfiguration_NodePort();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONFIGURATION__REPLICAS = eINSTANCE.getDeploymentConfiguration_Replicas();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.GCloudConfigurationImpl <em>GCloud Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.GCloudConfigurationImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getGCloudConfiguration()
		 * @generated
		 */
		EClass GCLOUD_CONFIGURATION = eINSTANCE.getGCloudConfiguration();

		/**
		 * The meta object literal for the '<em><b>Artifact Repository Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME = eINSTANCE.getGCloudConfiguration_ArtifactRepositoryName();

		/**
		 * The meta object literal for the '<em><b>Artifact Repository Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE = eINSTANCE.getGCloudConfiguration_ArtifactRepositoryZone();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLOUD_CONFIGURATION__PROJECT_ID = eINSTANCE.getGCloudConfiguration_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Cluster Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCLOUD_CONFIGURATION__CLUSTER_ZONE = eINSTANCE.getGCloudConfiguration_ClusterZone();

		/**
		 * The meta object literal for the '<em><b>Kubernetes Cluster Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION = eINSTANCE.getGCloudConfiguration_KubernetesClusterConfiguration();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.ExternalDependencyImpl <em>External Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.ExternalDependencyImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getExternalDependency()
		 * @generated
		 */
		EClass EXTERNAL_DEPENDENCY = eINSTANCE.getExternalDependency();

		/**
		 * The meta object literal for the '<em><b>Shared Kernel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DEPENDENCY__SHARED_KERNEL = eINSTANCE.getExternalDependency_SharedKernel();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DEPENDENCY__GROUP_ID = eINSTANCE.getExternalDependency_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DEPENDENCY__ARTIFACT_ID = eINSTANCE.getExternalDependency_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DEPENDENCY__VERSION = eINSTANCE.getExternalDependency_Version();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.BuildConfigurationImpl <em>Build Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.BuildConfigurationImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBuildConfiguration()
		 * @generated
		 */
		EClass BUILD_CONFIGURATION = eINSTANCE.getBuildConfiguration();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_CONFIGURATION__MICROSERVICE = eINSTANCE.getBuildConfiguration_Microservice();

		/**
		 * The meta object literal for the '<em><b>External Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_CONFIGURATION__EXTERNAL_DEPENDENCIES = eINSTANCE.getBuildConfiguration_ExternalDependencies();

		/**
		 * The meta object literal for the '<em><b>Build Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_CONFIGURATION__BUILD_TOOL = eINSTANCE.getBuildConfiguration_BuildTool();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.SharedModuleImpl <em>Shared Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.SharedModuleImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getSharedModule()
		 * @generated
		 */
		EClass SHARED_MODULE = eINSTANCE.getSharedModule();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.KafkaConfigurationImpl <em>Kafka Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.KafkaConfigurationImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getKafkaConfiguration()
		 * @generated
		 */
		EClass KAFKA_CONFIGURATION = eINSTANCE.getKafkaConfiguration();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_CONFIGURATION__TOPICS = eINSTANCE.getKafkaConfiguration_Topics();

		/**
		 * The meta object literal for the '<em><b>Bootstrap Server Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_CONFIGURATION__BOOTSTRAP_SERVER_PORT = eINSTANCE.getKafkaConfiguration_BootstrapServerPort();

		/**
		 * The meta object literal for the '<em><b>Kafka Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_CONFIGURATION__KAFKA_SERVICE_NAME = eINSTANCE.getKafkaConfiguration_KafkaServiceName();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.TopicImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__TOPIC_NAME = eINSTANCE.getTopic_TopicName();

		/**
		 * The meta object literal for the '<em><b>Asynchronous Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__ASYNCHRONOUS_INTERFACES = eINSTANCE.getTopic_AsynchronousInterfaces();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__PARTITIONS = eINSTANCE.getTopic_Partitions();

		/**
		 * The meta object literal for the '<em><b>Replication Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__REPLICATION_FACTOR = eINSTANCE.getTopic_ReplicationFactor();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.KubernetesClusterConfigurationImpl <em>Kubernetes Cluster Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.KubernetesClusterConfigurationImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getKubernetesClusterConfiguration()
		 * @generated
		 */
		EClass KUBERNETES_CLUSTER_CONFIGURATION = eINSTANCE.getKubernetesClusterConfiguration();

		/**
		 * The meta object literal for the '<em><b>Cluster Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_CLUSTER_CONFIGURATION__CLUSTER_NAME = eINSTANCE.getKubernetesClusterConfiguration_ClusterName();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_CLUSTER_CONFIGURATION__NODES = eINSTANCE.getKubernetesClusterConfiguration_Nodes();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_CLUSTER_CONFIGURATION__MACHINE_TYPE = eINSTANCE.getKubernetesClusterConfiguration_MachineType();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KUBERNETES_CLUSTER_CONFIGURATION__DEPLOYMENTS = eINSTANCE.getKubernetesClusterConfiguration_Deployments();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.impl.CloudConfigurationImpl <em>Cloud Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.impl.CloudConfigurationImpl
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getCloudConfiguration()
		 * @generated
		 */
		EClass CLOUD_CONFIGURATION = eINSTANCE.getCloudConfiguration();

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
		 * The meta object literal for the '{@link microserviceMetamodell.ImplementationTechnology <em>Implementation Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.ImplementationTechnology
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getImplementationTechnology()
		 * @generated
		 */
		EEnum IMPLEMENTATION_TECHNOLOGY = eINSTANCE.getImplementationTechnology();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.BuildTool <em>Build Tool</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.BuildTool
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getBuildTool()
		 * @generated
		 */
		EEnum BUILD_TOOL = eINSTANCE.getBuildTool();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.UpstreamRole <em>Upstream Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.UpstreamRole
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getUpstreamRole()
		 * @generated
		 */
		EEnum UPSTREAM_ROLE = eINSTANCE.getUpstreamRole();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.DownstreamRole <em>Downstream Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.DownstreamRole
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getDownstreamRole()
		 * @generated
		 */
		EEnum DOWNSTREAM_ROLE = eINSTANCE.getDownstreamRole();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.GCloudZone <em>GCloud Zone</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.GCloudZone
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getGCloudZone()
		 * @generated
		 */
		EEnum GCLOUD_ZONE = eINSTANCE.getGCloudZone();

		/**
		 * The meta object literal for the '{@link microserviceMetamodell.GCloudMachineType <em>GCloud Machine Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodell.GCloudMachineType
		 * @see microserviceMetamodell.impl.MicroserviceMetamodellPackageImpl#getGCloudMachineType()
		 * @generated
		 */
		EEnum GCLOUD_MACHINE_TYPE = eINSTANCE.getGCloudMachineType();

	}

} //MicroserviceMetamodellPackage
