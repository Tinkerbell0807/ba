/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.Aggregate;
import microserviceMetamodell.AnticorruptionLayer;
import microserviceMetamodell.AsynchronousInterface;
import microserviceMetamodell.AsynchronousInterfaceRole;
import microserviceMetamodell.Behaviour;
import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.Conformist;
import microserviceMetamodell.CustomerSupplier;
import microserviceMetamodell.DomainEvent;
import microserviceMetamodell.DomainModel;
import microserviceMetamodell.DomainModelLayer;
import microserviceMetamodell.Entity;
import microserviceMetamodell.EntityNode;
import microserviceMetamodell.Factory;
import microserviceMetamodell.HttpMethod;
import microserviceMetamodell.ImplementationTechnology;
import microserviceMetamodell.InfrastructureLayer;
import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElementImplementation;
import microserviceMetamodell.OpenHostService;
import microserviceMetamodell.PublishedLanguage;
import microserviceMetamodell.Repository;
import microserviceMetamodell.RestEndpoint;
import microserviceMetamodell.Service;
import microserviceMetamodell.SharedKernel;
import microserviceMetamodell.SynchronousInterface;
import microserviceMetamodell.SystemModel;
import microserviceMetamodell.TechnicalLayer;
import microserviceMetamodell.TopologyType;
import microserviceMetamodell.ValueObject;
import microserviceMetamodell.ValueObjectNode;
import microserviceMetamodell.WorkflowRole;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroserviceMetamodellFactoryImpl extends EFactoryImpl implements MicroserviceMetamodellFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MicroserviceMetamodellFactory init() {
		try {
			MicroserviceMetamodellFactory theMicroserviceMetamodellFactory = (MicroserviceMetamodellFactory)EPackage.Registry.INSTANCE.getEFactory(MicroserviceMetamodellPackage.eNS_URI);
			if (theMicroserviceMetamodellFactory != null) {
				return theMicroserviceMetamodellFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MicroserviceMetamodellFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceMetamodellFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MicroserviceMetamodellPackage.SYSTEM_MODEL: return createSystemModel();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL: return createDomainModel();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER: return createDomainModelLayer();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER: return createInfrastructureLayer();
			case MicroserviceMetamodellPackage.TECHNICAL_LAYER: return createTechnicalLayer();
			case MicroserviceMetamodellPackage.ENTITY: return createEntity();
			case MicroserviceMetamodellPackage.VALUE_OBJECT: return createValueObject();
			case MicroserviceMetamodellPackage.SERVICE: return createService();
			case MicroserviceMetamodellPackage.AGGREGATE: return createAggregate();
			case MicroserviceMetamodellPackage.FACTORY: return createFactory();
			case MicroserviceMetamodellPackage.REPOSITORY: return createRepository();
			case MicroserviceMetamodellPackage.DOMAIN_EVENT: return createDomainEvent();
			case MicroserviceMetamodellPackage.MODULE: return createModule();
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT: return createBoundedContext();
			case MicroserviceMetamodellPackage.BEHAVIOUR: return createBehaviour();
			case MicroserviceMetamodellPackage.SHARED_KERNEL: return createSharedKernel();
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER: return createCustomerSupplier();
			case MicroserviceMetamodellPackage.CONFORMIST: return createConformist();
			case MicroserviceMetamodellPackage.ANTICORRUPTION_LAYER: return createAnticorruptionLayer();
			case MicroserviceMetamodellPackage.OPEN_HOST_SERVICE: return createOpenHostService();
			case MicroserviceMetamodellPackage.PUBLISHED_LANGUAGE: return createPublishedLanguage();
			case MicroserviceMetamodellPackage.MICROSERVICE: return createMicroservice();
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE: return createSynchronousInterface();
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE: return createAsynchronousInterface();
			case MicroserviceMetamodellPackage.REST_ENDPOINT: return createRestEndpoint();
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION: return createModelElementImplementation();
			case MicroserviceMetamodellPackage.VALUE_OBJECT_NODE: return createValueObjectNode();
			case MicroserviceMetamodellPackage.ENTITY_NODE: return createEntityNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MicroserviceMetamodellPackage.HTTP_METHOD:
				return createHttpMethodFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE_ROLE:
				return createAsynchronousInterfaceRoleFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.TOPOLOGY_TYPE:
				return createTopologyTypeFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.WORKFLOW_ROLE:
				return createWorkflowRoleFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.IMPLEMENTATION_TECHNOLOGY:
				return createImplementationTechnologyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MicroserviceMetamodellPackage.HTTP_METHOD:
				return convertHttpMethodToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE_ROLE:
				return convertAsynchronousInterfaceRoleToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.TOPOLOGY_TYPE:
				return convertTopologyTypeToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.WORKFLOW_ROLE:
				return convertWorkflowRoleToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.IMPLEMENTATION_TECHNOLOGY:
				return convertImplementationTechnologyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestEndpoint createRestEndpoint() {
		RestEndpointImpl restEndpoint = new RestEndpointImpl();
		return restEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementImplementation createModelElementImplementation() {
		ModelElementImplementationImpl modelElementImplementation = new ModelElementImplementationImpl();
		return modelElementImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObjectNode createValueObjectNode() {
		ValueObjectNodeImpl valueObjectNode = new ValueObjectNodeImpl();
		return valueObjectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNode createEntityNode() {
		EntityNodeImpl entityNode = new EntityNodeImpl();
		return entityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModel createSystemModel() {
		SystemModelImpl systemModel = new SystemModelImpl();
		return systemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModelLayer createDomainModelLayer() {
		DomainModelLayerImpl domainModelLayer = new DomainModelLayerImpl();
		return domainModelLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureLayer createInfrastructureLayer() {
		InfrastructureLayerImpl infrastructureLayer = new InfrastructureLayerImpl();
		return infrastructureLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalLayer createTechnicalLayer() {
		TechnicalLayerImpl technicalLayer = new TechnicalLayerImpl();
		return technicalLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factory createFactory() {
		FactoryImpl factory = new FactoryImpl();
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainEvent createDomainEvent() {
		DomainEventImpl domainEvent = new DomainEventImpl();
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public microserviceMetamodell.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext createBoundedContext() {
		BoundedContextImpl boundedContext = new BoundedContextImpl();
		return boundedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour createBehaviour() {
		BehaviourImpl behaviour = new BehaviourImpl();
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedKernel createSharedKernel() {
		SharedKernelImpl sharedKernel = new SharedKernelImpl();
		return sharedKernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerSupplier createCustomerSupplier() {
		CustomerSupplierImpl customerSupplier = new CustomerSupplierImpl();
		return customerSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conformist createConformist() {
		ConformistImpl conformist = new ConformistImpl();
		return conformist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnticorruptionLayer createAnticorruptionLayer() {
		AnticorruptionLayerImpl anticorruptionLayer = new AnticorruptionLayerImpl();
		return anticorruptionLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenHostService createOpenHostService() {
		OpenHostServiceImpl openHostService = new OpenHostServiceImpl();
		return openHostService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishedLanguage createPublishedLanguage() {
		PublishedLanguageImpl publishedLanguage = new PublishedLanguageImpl();
		return publishedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice createMicroservice() {
		MicroserviceImpl microservice = new MicroserviceImpl();
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousInterface createSynchronousInterface() {
		SynchronousInterfaceImpl synchronousInterface = new SynchronousInterfaceImpl();
		return synchronousInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousInterface createAsynchronousInterface() {
		AsynchronousInterfaceImpl asynchronousInterface = new AsynchronousInterfaceImpl();
		return asynchronousInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousInterfaceRole createAsynchronousInterfaceRoleFromString(EDataType eDataType, String initialValue) {
		AsynchronousInterfaceRole result = AsynchronousInterfaceRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAsynchronousInterfaceRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyType createTopologyTypeFromString(EDataType eDataType, String initialValue) {
		TopologyType result = TopologyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTopologyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRole createWorkflowRoleFromString(EDataType eDataType, String initialValue) {
		WorkflowRole result = WorkflowRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkflowRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTechnology createImplementationTechnologyFromString(EDataType eDataType, String initialValue) {
		ImplementationTechnology result = ImplementationTechnology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImplementationTechnologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceMetamodellPackage getMicroserviceMetamodellPackage() {
		return (MicroserviceMetamodellPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MicroserviceMetamodellPackage getPackage() {
		return MicroserviceMetamodellPackage.eINSTANCE;
	}

} //MicroserviceMetamodellFactoryImpl
