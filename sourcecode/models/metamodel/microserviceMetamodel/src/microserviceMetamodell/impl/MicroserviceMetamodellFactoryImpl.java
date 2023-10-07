/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.Aggregate;
import microserviceMetamodell.AsynchronousInterface;
import microserviceMetamodell.AsynchronousInterfaceRole;
import microserviceMetamodell.Behaviour;
import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.BuildConfiguration;
import microserviceMetamodell.BuildTool;
import microserviceMetamodell.CustomerSupplier;
import microserviceMetamodell.DeploymentConfiguration;
import microserviceMetamodell.DomainEvent;
import microserviceMetamodell.DomainModel;
import microserviceMetamodell.DomainModelLayer;
import microserviceMetamodell.DownstreamComponent;
import microserviceMetamodell.DownstreamRole;
import microserviceMetamodell.Entity;
import microserviceMetamodell.EntityNode;
import microserviceMetamodell.ExternalDependency;
import microserviceMetamodell.Factory;
import microserviceMetamodell.GCloudConfiguration;
import microserviceMetamodell.GCloudMachineType;
import microserviceMetamodell.GCloudZone;
import microserviceMetamodell.HttpMethod;
import microserviceMetamodell.ImplementationTechnology;
import microserviceMetamodell.InfrastructureLayer;
import microserviceMetamodell.KafkaConfiguration;
import microserviceMetamodell.KubernetesClusterConfiguration;
import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.Repository;
import microserviceMetamodell.RestEndpoint;
import microserviceMetamodell.Service;
import microserviceMetamodell.SharedKernel;
import microserviceMetamodell.SharedModule;
import microserviceMetamodell.SynchronousInterface;
import microserviceMetamodell.SystemModel;
import microserviceMetamodell.TechnicalLayer;
import microserviceMetamodell.Topic;
import microserviceMetamodell.UpstreamComponent;
import microserviceMetamodell.UpstreamRole;
import microserviceMetamodell.ValueObject;
import microserviceMetamodell.ValueObjectNode;

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
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT: return createUpstreamComponent();
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT: return createDownstreamComponent();
			case MicroserviceMetamodellPackage.MICROSERVICE: return createMicroservice();
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE: return createSynchronousInterface();
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE: return createAsynchronousInterface();
			case MicroserviceMetamodellPackage.REST_ENDPOINT: return createRestEndpoint();
			case MicroserviceMetamodellPackage.VALUE_OBJECT_NODE: return createValueObjectNode();
			case MicroserviceMetamodellPackage.ENTITY_NODE: return createEntityNode();
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION: return createDeploymentConfiguration();
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION: return createGCloudConfiguration();
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY: return createExternalDependency();
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION: return createBuildConfiguration();
			case MicroserviceMetamodellPackage.SHARED_MODULE: return createSharedModule();
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION: return createKafkaConfiguration();
			case MicroserviceMetamodellPackage.TOPIC: return createTopic();
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION: return createKubernetesClusterConfiguration();
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
			case MicroserviceMetamodellPackage.IMPLEMENTATION_TECHNOLOGY:
				return createImplementationTechnologyFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.BUILD_TOOL:
				return createBuildToolFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.UPSTREAM_ROLE:
				return createUpstreamRoleFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.DOWNSTREAM_ROLE:
				return createDownstreamRoleFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.GCLOUD_ZONE:
				return createGCloudZoneFromString(eDataType, initialValue);
			case MicroserviceMetamodellPackage.GCLOUD_MACHINE_TYPE:
				return createGCloudMachineTypeFromString(eDataType, initialValue);
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
			case MicroserviceMetamodellPackage.IMPLEMENTATION_TECHNOLOGY:
				return convertImplementationTechnologyToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.BUILD_TOOL:
				return convertBuildToolToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.UPSTREAM_ROLE:
				return convertUpstreamRoleToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.DOWNSTREAM_ROLE:
				return convertDownstreamRoleToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.GCLOUD_ZONE:
				return convertGCloudZoneToString(eDataType, instanceValue);
			case MicroserviceMetamodellPackage.GCLOUD_MACHINE_TYPE:
				return convertGCloudMachineTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public UpstreamComponent createUpstreamComponent() {
		UpstreamComponentImpl upstreamComponent = new UpstreamComponentImpl();
		return upstreamComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DownstreamComponent createDownstreamComponent() {
		DownstreamComponentImpl downstreamComponent = new DownstreamComponentImpl();
		return downstreamComponent;
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
	public RestEndpoint createRestEndpoint() {
		RestEndpointImpl restEndpoint = new RestEndpointImpl();
		return restEndpoint;
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
	public DeploymentConfiguration createDeploymentConfiguration() {
		DeploymentConfigurationImpl deploymentConfiguration = new DeploymentConfigurationImpl();
		return deploymentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCloudConfiguration createGCloudConfiguration() {
		GCloudConfigurationImpl gCloudConfiguration = new GCloudConfigurationImpl();
		return gCloudConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDependency createExternalDependency() {
		ExternalDependencyImpl externalDependency = new ExternalDependencyImpl();
		return externalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildConfiguration createBuildConfiguration() {
		BuildConfigurationImpl buildConfiguration = new BuildConfigurationImpl();
		return buildConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedModule createSharedModule() {
		SharedModuleImpl sharedModule = new SharedModuleImpl();
		return sharedModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaConfiguration createKafkaConfiguration() {
		KafkaConfigurationImpl kafkaConfiguration = new KafkaConfigurationImpl();
		return kafkaConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KubernetesClusterConfiguration createKubernetesClusterConfiguration() {
		KubernetesClusterConfigurationImpl kubernetesClusterConfiguration = new KubernetesClusterConfigurationImpl();
		return kubernetesClusterConfiguration;
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
	public BuildTool createBuildToolFromString(EDataType eDataType, String initialValue) {
		BuildTool result = BuildTool.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildToolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpstreamRole createUpstreamRoleFromString(EDataType eDataType, String initialValue) {
		UpstreamRole result = UpstreamRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpstreamRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DownstreamRole createDownstreamRoleFromString(EDataType eDataType, String initialValue) {
		DownstreamRole result = DownstreamRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDownstreamRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCloudZone createGCloudZoneFromString(EDataType eDataType, String initialValue) {
		GCloudZone result = GCloudZone.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGCloudZoneToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCloudMachineType createGCloudMachineTypeFromString(EDataType eDataType, String initialValue) {
		GCloudMachineType result = GCloudMachineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGCloudMachineTypeToString(EDataType eDataType, Object instanceValue) {
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
