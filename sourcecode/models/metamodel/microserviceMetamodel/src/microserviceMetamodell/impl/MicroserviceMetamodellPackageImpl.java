/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.Aggregate;
import microserviceMetamodell.AggregateNode;
import microserviceMetamodell.AsynchronousInterface;
import microserviceMetamodell.AsynchronousInterfaceRole;
import microserviceMetamodell.Behaviour;
import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.BoundedContextRelationship;
import microserviceMetamodell.BuildConfiguration;
import microserviceMetamodell.BuildTool;
import microserviceMetamodell.CloudConfiguration;
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
import microserviceMetamodell.Factorizeable;
import microserviceMetamodell.Factory;
import microserviceMetamodell.GCloudConfiguration;
import microserviceMetamodell.GCloudMachineType;
import microserviceMetamodell.GCloudZone;
import microserviceMetamodell.HttpMethod;
import microserviceMetamodell.ImplementationTechnology;
import microserviceMetamodell.InfrastructureLayer;
import microserviceMetamodell.Interface;
import microserviceMetamodell.KafkaConfiguration;
import microserviceMetamodell.KubernetesClusterConfiguration;
import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElement;
import microserviceMetamodell.Persistable;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroserviceMetamodellPackageImpl extends EPackageImpl implements MicroserviceMetamodellPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedKernelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerSupplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedContextRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upstreamComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downstreamComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factorizeableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchronousInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueObjectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gCloudConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kubernetesClusterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum asynchronousInterfaceRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implementationTechnologyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buildToolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum upstreamRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum downstreamRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gCloudZoneEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gCloudMachineTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MicroserviceMetamodellPackageImpl() {
		super(eNS_URI, MicroserviceMetamodellFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MicroserviceMetamodellPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MicroserviceMetamodellPackage init() {
		if (isInited) return (MicroserviceMetamodellPackage)EPackage.Registry.INSTANCE.getEPackage(MicroserviceMetamodellPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMicroserviceMetamodellPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MicroserviceMetamodellPackageImpl theMicroserviceMetamodellPackage = registeredMicroserviceMetamodellPackage instanceof MicroserviceMetamodellPackageImpl ? (MicroserviceMetamodellPackageImpl)registeredMicroserviceMetamodellPackage : new MicroserviceMetamodellPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMicroserviceMetamodellPackage.createPackageContents();

		// Initialize created meta-data
		theMicroserviceMetamodellPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMicroserviceMetamodellPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MicroserviceMetamodellPackage.eNS_URI, theMicroserviceMetamodellPackage);
		return theMicroserviceMetamodellPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemModel() {
		return systemModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemModel_Description() {
		return (EAttribute)systemModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemModel_DomainModelLayer() {
		return (EReference)systemModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemModel_TechnicalLayer() {
		return (EReference)systemModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemModel_InfrastructureLayer() {
		return (EReference)systemModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_DomainEvents() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Modules() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_BoundedContext() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModel_ModelName() {
		return (EAttribute)domainModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_SharedModules() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModelLayer() {
		return domainModelLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModelLayer_BoundedContexts() {
		return (EReference)domainModelLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModelLayer_DomainModels() {
		return (EReference)domainModelLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModelLayer_DomainEvents() {
		return (EReference)domainModelLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModelLayer_BoundedContextRelationships() {
		return (EReference)domainModelLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureLayer() {
		return infrastructureLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureLayer_CloudConfiguration() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureLayer_DeploymentConfigurations() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureLayer_BuildConfigurations() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureLayer_ExternalDependencies() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureLayer_KafkaConfiguration() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnicalLayer() {
		return technicalLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnicalLayer_Microservices() {
		return (EReference)technicalLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_ValueObjects() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Behaviours() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueObject() {
		return valueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueObject_ReferencedEntities() {
		return (EReference)valueObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueObject_ValueObjects() {
		return (EReference)valueObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Behaviours() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ReferencedElements() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_SendsRequestTo() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregate() {
		return aggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregate_AggregateRoot() {
		return (EReference)aggregateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregate_AggregateNode() {
		return (EReference)aggregateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactory() {
		return factoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactory_Behaviours() {
		return (EReference)factoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactory_FactoryFor() {
		return (EReference)factoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Behaviours() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_RepositoryFor() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainEvent() {
		return domainEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainEvent_DomainModel() {
		return (EReference)domainEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainEvent_EventName() {
		return (EAttribute)domainEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModelElements() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_ModuleName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Submodules() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedContext() {
		return boundedContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedContext_DomainModel() {
		return (EReference)boundedContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedContext_ContextName() {
		return (EAttribute)boundedContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedContext_CorrespodingMicroservices() {
		return (EReference)boundedContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedContext_BoundedContextRelationships() {
		return (EReference)boundedContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviour() {
		return behaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviour_BehaviourName() {
		return (EAttribute)behaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedKernel() {
		return sharedKernelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedKernel_RelatedContexts() {
		return (EReference)sharedKernelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedKernel_ImplementingLib() {
		return (EReference)sharedKernelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedKernel_SharedModules() {
		return (EReference)sharedKernelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerSupplier() {
		return customerSupplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerSupplier_DownstreamComponent() {
		return (EReference)customerSupplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerSupplier_UpstreamComponent() {
		return (EReference)customerSupplierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerSupplier_AffectedInterfaces() {
		return (EReference)customerSupplierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedContextRelationship() {
		return boundedContextRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedContextRelationship_RelationshipName() {
		return (EAttribute)boundedContextRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpstreamComponent() {
		return upstreamComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpstreamComponent_RelatedContext() {
		return (EReference)upstreamComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpstreamComponent_UpstreamRole() {
		return (EAttribute)upstreamComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDownstreamComponent() {
		return downstreamComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDownstreamComponent_RelatedContext() {
		return (EReference)downstreamComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDownstreamComponent_DownstreamRole() {
		return (EAttribute)downstreamComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_ElementName() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_ReferencedInterfaces() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactorizeable() {
		return factorizeableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroservice() {
		return microserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Interfaces() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_ServiceName() {
		return (EAttribute)microserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_CorrespodingContext() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_ImplementationTechnology() {
		return (EAttribute)microserviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_DeploymentConfiguration() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_BuildConfiguration() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_CalledEndpoints() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_InterfaceName() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ReferencedElements() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ReferencedRelationships() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousInterface() {
		return synchronousInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronousInterface_RestEndpoints() {
		return (EReference)synchronousInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousInterface_Version() {
		return (EAttribute)synchronousInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynchronousInterface() {
		return asynchronousInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsynchronousInterface_InterfaceRole() {
		return (EAttribute)asynchronousInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsynchronousInterface_DomainEvents() {
		return (EReference)asynchronousInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsynchronousInterface_Topic() {
		return (EReference)asynchronousInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestEndpoint() {
		return restEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestEndpoint_Path() {
		return (EAttribute)restEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestEndpoint_HttpMethod() {
		return (EAttribute)restEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueObjectNode() {
		return valueObjectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueObjectNode_ValueObjectNodes() {
		return (EReference)valueObjectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueObjectNode_ReferencedEntities() {
		return (EReference)valueObjectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityNode() {
		return entityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityNode_ValueObjectNodes() {
		return (EReference)entityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityNode_Behaviours() {
		return (EReference)entityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateNode() {
		return aggregateNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateNode_ElementName() {
		return (EAttribute)aggregateNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistable() {
		return persistableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentConfiguration() {
		return deploymentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentConfiguration_Microservice() {
		return (EReference)deploymentConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentConfiguration_Port() {
		return (EAttribute)deploymentConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentConfiguration_NodePort() {
		return (EAttribute)deploymentConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentConfiguration_Replicas() {
		return (EAttribute)deploymentConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGCloudConfiguration() {
		return gCloudConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGCloudConfiguration_ArtifactRepositoryName() {
		return (EAttribute)gCloudConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGCloudConfiguration_ArtifactRepositoryZone() {
		return (EAttribute)gCloudConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGCloudConfiguration_ProjectId() {
		return (EAttribute)gCloudConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGCloudConfiguration_ClusterZone() {
		return (EAttribute)gCloudConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCloudConfiguration_KubernetesClusterConfiguration() {
		return (EReference)gCloudConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDependency() {
		return externalDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalDependency_SharedKernel() {
		return (EReference)externalDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDependency_GroupId() {
		return (EAttribute)externalDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDependency_ArtifactId() {
		return (EAttribute)externalDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDependency_Version() {
		return (EAttribute)externalDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildConfiguration() {
		return buildConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildConfiguration_Microservice() {
		return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildConfiguration_ExternalDependencies() {
		return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildConfiguration_BuildTool() {
		return (EAttribute)buildConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedModule() {
		return sharedModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKafkaConfiguration() {
		return kafkaConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKafkaConfiguration_Topics() {
		return (EReference)kafkaConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKafkaConfiguration_BootstrapServerPort() {
		return (EAttribute)kafkaConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKafkaConfiguration_KafkaServiceName() {
		return (EAttribute)kafkaConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_TopicName() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopic_AsynchronousInterfaces() {
		return (EReference)topicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_Partitions() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_ReplicationFactor() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKubernetesClusterConfiguration() {
		return kubernetesClusterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKubernetesClusterConfiguration_ClusterName() {
		return (EAttribute)kubernetesClusterConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKubernetesClusterConfiguration_Nodes() {
		return (EAttribute)kubernetesClusterConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKubernetesClusterConfiguration_MachineType() {
		return (EAttribute)kubernetesClusterConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKubernetesClusterConfiguration_Deployments() {
		return (EReference)kubernetesClusterConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudConfiguration() {
		return cloudConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAsynchronousInterfaceRole() {
		return asynchronousInterfaceRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImplementationTechnology() {
		return implementationTechnologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuildTool() {
		return buildToolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpstreamRole() {
		return upstreamRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDownstreamRole() {
		return downstreamRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGCloudZone() {
		return gCloudZoneEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGCloudMachineType() {
		return gCloudMachineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceMetamodellFactory getMicroserviceMetamodellFactory() {
		return (MicroserviceMetamodellFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemModelEClass = createEClass(SYSTEM_MODEL);
		createEAttribute(systemModelEClass, SYSTEM_MODEL__DESCRIPTION);
		createEReference(systemModelEClass, SYSTEM_MODEL__DOMAIN_MODEL_LAYER);
		createEReference(systemModelEClass, SYSTEM_MODEL__TECHNICAL_LAYER);
		createEReference(systemModelEClass, SYSTEM_MODEL__INFRASTRUCTURE_LAYER);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__DOMAIN_EVENTS);
		createEReference(domainModelEClass, DOMAIN_MODEL__MODULES);
		createEReference(domainModelEClass, DOMAIN_MODEL__BOUNDED_CONTEXT);
		createEAttribute(domainModelEClass, DOMAIN_MODEL__MODEL_NAME);
		createEReference(domainModelEClass, DOMAIN_MODEL__SHARED_MODULES);

		domainModelLayerEClass = createEClass(DOMAIN_MODEL_LAYER);
		createEReference(domainModelLayerEClass, DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS);
		createEReference(domainModelLayerEClass, DOMAIN_MODEL_LAYER__DOMAIN_MODELS);
		createEReference(domainModelLayerEClass, DOMAIN_MODEL_LAYER__DOMAIN_EVENTS);
		createEReference(domainModelLayerEClass, DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS);

		infrastructureLayerEClass = createEClass(INFRASTRUCTURE_LAYER);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION);

		technicalLayerEClass = createEClass(TECHNICAL_LAYER);
		createEReference(technicalLayerEClass, TECHNICAL_LAYER__MICROSERVICES);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__VALUE_OBJECTS);
		createEReference(entityEClass, ENTITY__BEHAVIOURS);

		valueObjectEClass = createEClass(VALUE_OBJECT);
		createEReference(valueObjectEClass, VALUE_OBJECT__REFERENCED_ENTITIES);
		createEReference(valueObjectEClass, VALUE_OBJECT__VALUE_OBJECTS);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__BEHAVIOURS);
		createEReference(serviceEClass, SERVICE__REFERENCED_ELEMENTS);
		createEReference(serviceEClass, SERVICE__SENDS_REQUEST_TO);

		aggregateEClass = createEClass(AGGREGATE);
		createEReference(aggregateEClass, AGGREGATE__AGGREGATE_ROOT);
		createEReference(aggregateEClass, AGGREGATE__AGGREGATE_NODE);

		factoryEClass = createEClass(FACTORY);
		createEReference(factoryEClass, FACTORY__BEHAVIOURS);
		createEReference(factoryEClass, FACTORY__FACTORY_FOR);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__BEHAVIOURS);
		createEReference(repositoryEClass, REPOSITORY__REPOSITORY_FOR);

		domainEventEClass = createEClass(DOMAIN_EVENT);
		createEReference(domainEventEClass, DOMAIN_EVENT__DOMAIN_MODEL);
		createEAttribute(domainEventEClass, DOMAIN_EVENT__EVENT_NAME);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODEL_ELEMENTS);
		createEAttribute(moduleEClass, MODULE__MODULE_NAME);
		createEReference(moduleEClass, MODULE__SUBMODULES);

		boundedContextEClass = createEClass(BOUNDED_CONTEXT);
		createEReference(boundedContextEClass, BOUNDED_CONTEXT__DOMAIN_MODEL);
		createEAttribute(boundedContextEClass, BOUNDED_CONTEXT__CONTEXT_NAME);
		createEReference(boundedContextEClass, BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES);
		createEReference(boundedContextEClass, BOUNDED_CONTEXT__BOUNDED_CONTEXT_RELATIONSHIPS);

		behaviourEClass = createEClass(BEHAVIOUR);
		createEAttribute(behaviourEClass, BEHAVIOUR__BEHAVIOUR_NAME);

		sharedKernelEClass = createEClass(SHARED_KERNEL);
		createEReference(sharedKernelEClass, SHARED_KERNEL__RELATED_CONTEXTS);
		createEReference(sharedKernelEClass, SHARED_KERNEL__IMPLEMENTING_LIB);
		createEReference(sharedKernelEClass, SHARED_KERNEL__SHARED_MODULES);

		customerSupplierEClass = createEClass(CUSTOMER_SUPPLIER);
		createEReference(customerSupplierEClass, CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT);
		createEReference(customerSupplierEClass, CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT);
		createEReference(customerSupplierEClass, CUSTOMER_SUPPLIER__AFFECTED_INTERFACES);

		boundedContextRelationshipEClass = createEClass(BOUNDED_CONTEXT_RELATIONSHIP);
		createEAttribute(boundedContextRelationshipEClass, BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME);

		upstreamComponentEClass = createEClass(UPSTREAM_COMPONENT);
		createEReference(upstreamComponentEClass, UPSTREAM_COMPONENT__RELATED_CONTEXT);
		createEAttribute(upstreamComponentEClass, UPSTREAM_COMPONENT__UPSTREAM_ROLE);

		downstreamComponentEClass = createEClass(DOWNSTREAM_COMPONENT);
		createEReference(downstreamComponentEClass, DOWNSTREAM_COMPONENT__RELATED_CONTEXT);
		createEAttribute(downstreamComponentEClass, DOWNSTREAM_COMPONENT__DOWNSTREAM_ROLE);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ELEMENT_NAME);
		createEReference(modelElementEClass, MODEL_ELEMENT__REFERENCED_INTERFACES);

		factorizeableEClass = createEClass(FACTORIZEABLE);

		microserviceEClass = createEClass(MICROSERVICE);
		createEReference(microserviceEClass, MICROSERVICE__INTERFACES);
		createEAttribute(microserviceEClass, MICROSERVICE__SERVICE_NAME);
		createEReference(microserviceEClass, MICROSERVICE__CORRESPODING_CONTEXT);
		createEAttribute(microserviceEClass, MICROSERVICE__IMPLEMENTATION_TECHNOLOGY);
		createEReference(microserviceEClass, MICROSERVICE__DEPLOYMENT_CONFIGURATION);
		createEReference(microserviceEClass, MICROSERVICE__BUILD_CONFIGURATION);
		createEReference(microserviceEClass, MICROSERVICE__CALLED_ENDPOINTS);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__INTERFACE_NAME);
		createEReference(interfaceEClass, INTERFACE__REFERENCED_ELEMENTS);
		createEReference(interfaceEClass, INTERFACE__REFERENCED_RELATIONSHIPS);

		synchronousInterfaceEClass = createEClass(SYNCHRONOUS_INTERFACE);
		createEReference(synchronousInterfaceEClass, SYNCHRONOUS_INTERFACE__REST_ENDPOINTS);
		createEAttribute(synchronousInterfaceEClass, SYNCHRONOUS_INTERFACE__VERSION);

		asynchronousInterfaceEClass = createEClass(ASYNCHRONOUS_INTERFACE);
		createEAttribute(asynchronousInterfaceEClass, ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE);
		createEReference(asynchronousInterfaceEClass, ASYNCHRONOUS_INTERFACE__DOMAIN_EVENTS);
		createEReference(asynchronousInterfaceEClass, ASYNCHRONOUS_INTERFACE__TOPIC);

		restEndpointEClass = createEClass(REST_ENDPOINT);
		createEAttribute(restEndpointEClass, REST_ENDPOINT__PATH);
		createEAttribute(restEndpointEClass, REST_ENDPOINT__HTTP_METHOD);

		valueObjectNodeEClass = createEClass(VALUE_OBJECT_NODE);
		createEReference(valueObjectNodeEClass, VALUE_OBJECT_NODE__VALUE_OBJECT_NODES);
		createEReference(valueObjectNodeEClass, VALUE_OBJECT_NODE__REFERENCED_ENTITIES);

		entityNodeEClass = createEClass(ENTITY_NODE);
		createEReference(entityNodeEClass, ENTITY_NODE__VALUE_OBJECT_NODES);
		createEReference(entityNodeEClass, ENTITY_NODE__BEHAVIOURS);

		aggregateNodeEClass = createEClass(AGGREGATE_NODE);
		createEAttribute(aggregateNodeEClass, AGGREGATE_NODE__ELEMENT_NAME);

		persistableEClass = createEClass(PERSISTABLE);

		deploymentConfigurationEClass = createEClass(DEPLOYMENT_CONFIGURATION);
		createEReference(deploymentConfigurationEClass, DEPLOYMENT_CONFIGURATION__MICROSERVICE);
		createEAttribute(deploymentConfigurationEClass, DEPLOYMENT_CONFIGURATION__PORT);
		createEAttribute(deploymentConfigurationEClass, DEPLOYMENT_CONFIGURATION__NODE_PORT);
		createEAttribute(deploymentConfigurationEClass, DEPLOYMENT_CONFIGURATION__REPLICAS);

		gCloudConfigurationEClass = createEClass(GCLOUD_CONFIGURATION);
		createEAttribute(gCloudConfigurationEClass, GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME);
		createEAttribute(gCloudConfigurationEClass, GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE);
		createEAttribute(gCloudConfigurationEClass, GCLOUD_CONFIGURATION__PROJECT_ID);
		createEAttribute(gCloudConfigurationEClass, GCLOUD_CONFIGURATION__CLUSTER_ZONE);
		createEReference(gCloudConfigurationEClass, GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION);

		externalDependencyEClass = createEClass(EXTERNAL_DEPENDENCY);
		createEReference(externalDependencyEClass, EXTERNAL_DEPENDENCY__SHARED_KERNEL);
		createEAttribute(externalDependencyEClass, EXTERNAL_DEPENDENCY__GROUP_ID);
		createEAttribute(externalDependencyEClass, EXTERNAL_DEPENDENCY__ARTIFACT_ID);
		createEAttribute(externalDependencyEClass, EXTERNAL_DEPENDENCY__VERSION);

		buildConfigurationEClass = createEClass(BUILD_CONFIGURATION);
		createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__MICROSERVICE);
		createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__EXTERNAL_DEPENDENCIES);
		createEAttribute(buildConfigurationEClass, BUILD_CONFIGURATION__BUILD_TOOL);

		sharedModuleEClass = createEClass(SHARED_MODULE);

		kafkaConfigurationEClass = createEClass(KAFKA_CONFIGURATION);
		createEReference(kafkaConfigurationEClass, KAFKA_CONFIGURATION__TOPICS);
		createEAttribute(kafkaConfigurationEClass, KAFKA_CONFIGURATION__BOOTSTRAP_SERVER_PORT);
		createEAttribute(kafkaConfigurationEClass, KAFKA_CONFIGURATION__KAFKA_SERVICE_NAME);

		topicEClass = createEClass(TOPIC);
		createEAttribute(topicEClass, TOPIC__TOPIC_NAME);
		createEReference(topicEClass, TOPIC__ASYNCHRONOUS_INTERFACES);
		createEAttribute(topicEClass, TOPIC__PARTITIONS);
		createEAttribute(topicEClass, TOPIC__REPLICATION_FACTOR);

		kubernetesClusterConfigurationEClass = createEClass(KUBERNETES_CLUSTER_CONFIGURATION);
		createEAttribute(kubernetesClusterConfigurationEClass, KUBERNETES_CLUSTER_CONFIGURATION__CLUSTER_NAME);
		createEAttribute(kubernetesClusterConfigurationEClass, KUBERNETES_CLUSTER_CONFIGURATION__NODES);
		createEAttribute(kubernetesClusterConfigurationEClass, KUBERNETES_CLUSTER_CONFIGURATION__MACHINE_TYPE);
		createEReference(kubernetesClusterConfigurationEClass, KUBERNETES_CLUSTER_CONFIGURATION__DEPLOYMENTS);

		cloudConfigurationEClass = createEClass(CLOUD_CONFIGURATION);

		// Create enums
		httpMethodEEnum = createEEnum(HTTP_METHOD);
		asynchronousInterfaceRoleEEnum = createEEnum(ASYNCHRONOUS_INTERFACE_ROLE);
		implementationTechnologyEEnum = createEEnum(IMPLEMENTATION_TECHNOLOGY);
		buildToolEEnum = createEEnum(BUILD_TOOL);
		upstreamRoleEEnum = createEEnum(UPSTREAM_ROLE);
		downstreamRoleEEnum = createEEnum(DOWNSTREAM_ROLE);
		gCloudZoneEEnum = createEEnum(GCLOUD_ZONE);
		gCloudMachineTypeEEnum = createEEnum(GCLOUD_MACHINE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getModelElement());
		entityEClass.getESuperTypes().add(this.getFactorizeable());
		entityEClass.getESuperTypes().add(this.getPersistable());
		valueObjectEClass.getESuperTypes().add(this.getModelElement());
		valueObjectEClass.getESuperTypes().add(this.getFactorizeable());
		serviceEClass.getESuperTypes().add(this.getModelElement());
		aggregateEClass.getESuperTypes().add(this.getFactorizeable());
		aggregateEClass.getESuperTypes().add(this.getModelElement());
		aggregateEClass.getESuperTypes().add(this.getPersistable());
		factoryEClass.getESuperTypes().add(this.getModelElement());
		repositoryEClass.getESuperTypes().add(this.getModelElement());
		sharedKernelEClass.getESuperTypes().add(this.getBoundedContextRelationship());
		customerSupplierEClass.getESuperTypes().add(this.getBoundedContextRelationship());
		synchronousInterfaceEClass.getESuperTypes().add(this.getInterface());
		asynchronousInterfaceEClass.getESuperTypes().add(this.getInterface());
		valueObjectNodeEClass.getESuperTypes().add(this.getAggregateNode());
		entityNodeEClass.getESuperTypes().add(this.getAggregateNode());
		gCloudConfigurationEClass.getESuperTypes().add(this.getCloudConfiguration());
		sharedModuleEClass.getESuperTypes().add(this.getModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemModelEClass, SystemModel.class, "SystemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemModel_DomainModelLayer(), this.getDomainModelLayer(), null, "domainModelLayer", null, 0, 1, SystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemModel_TechnicalLayer(), this.getTechnicalLayer(), null, "technicalLayer", null, 0, 1, SystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemModel_InfrastructureLayer(), this.getInfrastructureLayer(), null, "infrastructureLayer", null, 0, 1, SystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModel_DomainEvents(), this.getDomainEvent(), this.getDomainEvent_DomainModel(), "domainEvents", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_Modules(), this.getModule(), null, "modules", null, 1, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_BoundedContext(), this.getBoundedContext(), this.getBoundedContext_DomainModel(), "boundedContext", null, 1, 1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainModel_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_SharedModules(), this.getSharedModule(), null, "sharedModules", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelLayerEClass, DomainModelLayer.class, "DomainModelLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModelLayer_BoundedContexts(), this.getBoundedContext(), null, "boundedContexts", null, 0, -1, DomainModelLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModelLayer_DomainModels(), this.getDomainModel(), null, "domainModels", null, 0, -1, DomainModelLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModelLayer_DomainEvents(), this.getDomainEvent(), null, "domainEvents", null, 0, -1, DomainModelLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModelLayer_BoundedContextRelationships(), this.getBoundedContextRelationship(), null, "boundedContextRelationships", null, 0, -1, DomainModelLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureLayerEClass, InfrastructureLayer.class, "InfrastructureLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureLayer_CloudConfiguration(), this.getCloudConfiguration(), null, "cloudConfiguration", null, 0, 1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_DeploymentConfigurations(), this.getDeploymentConfiguration(), null, "deploymentConfigurations", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_BuildConfigurations(), this.getBuildConfiguration(), null, "buildConfigurations", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_ExternalDependencies(), this.getExternalDependency(), null, "externalDependencies", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_KafkaConfiguration(), this.getKafkaConfiguration(), null, "kafkaConfiguration", null, 0, 1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technicalLayerEClass, TechnicalLayer.class, "TechnicalLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnicalLayer_Microservices(), this.getMicroservice(), null, "microservices", null, 0, -1, TechnicalLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_ValueObjects(), this.getValueObject(), null, "valueObjects", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Behaviours(), this.getBehaviour(), null, "behaviours", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueObjectEClass, ValueObject.class, "ValueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueObject_ReferencedEntities(), this.getEntity(), null, "referencedEntities", null, 0, -1, ValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueObject_ValueObjects(), this.getValueObject(), null, "valueObjects", null, 0, -1, ValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Behaviours(), this.getBehaviour(), null, "behaviours", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ReferencedElements(), this.getModelElement(), null, "referencedElements", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_SendsRequestTo(), this.getRestEndpoint(), null, "sendsRequestTo", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateEClass, Aggregate.class, "Aggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregate_AggregateRoot(), this.getEntityNode(), null, "aggregateRoot", null, 1, 1, Aggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregate_AggregateNode(), this.getAggregateNode(), null, "aggregateNode", null, 1, -1, Aggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryEClass, Factory.class, "Factory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactory_Behaviours(), this.getBehaviour(), null, "behaviours", null, 0, -1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactory_FactoryFor(), this.getFactorizeable(), null, "factoryFor", null, 1, 1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Behaviours(), this.getBehaviour(), null, "behaviours", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_RepositoryFor(), this.getPersistable(), null, "repositoryFor", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEventEClass, DomainEvent.class, "DomainEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainEvent_DomainModel(), this.getDomainModel(), this.getDomainModel_DomainEvents(), "domainModel", null, 1, 1, DomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainEvent_EventName(), ecorePackage.getEString(), "eventName", null, 0, 1, DomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, microserviceMetamodell.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ModelElements(), this.getModelElement(), null, "modelElements", null, 0, -1, microserviceMetamodell.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_ModuleName(), ecorePackage.getEString(), "moduleName", null, 0, 1, microserviceMetamodell.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Submodules(), this.getModule(), null, "submodules", null, 0, -1, microserviceMetamodell.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedContextEClass, BoundedContext.class, "BoundedContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedContext_DomainModel(), this.getDomainModel(), this.getDomainModel_BoundedContext(), "domainModel", null, 1, 1, BoundedContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedContext_ContextName(), ecorePackage.getEString(), "contextName", null, 0, 1, BoundedContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundedContext_CorrespodingMicroservices(), this.getMicroservice(), this.getMicroservice_CorrespodingContext(), "correspodingMicroservices", null, 0, -1, BoundedContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundedContext_BoundedContextRelationships(), this.getBoundedContextRelationship(), null, "boundedContextRelationships", null, 0, -1, BoundedContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourEClass, Behaviour.class, "Behaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviour_BehaviourName(), ecorePackage.getEString(), "behaviourName", null, 0, 1, Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedKernelEClass, SharedKernel.class, "SharedKernel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedKernel_RelatedContexts(), this.getBoundedContext(), null, "relatedContexts", null, 2, -1, SharedKernel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedKernel_ImplementingLib(), this.getExternalDependency(), this.getExternalDependency_SharedKernel(), "implementingLib", null, 0, 1, SharedKernel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedKernel_SharedModules(), this.getSharedModule(), null, "sharedModules", null, 0, -1, SharedKernel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerSupplierEClass, CustomerSupplier.class, "CustomerSupplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerSupplier_DownstreamComponent(), this.getDownstreamComponent(), null, "downstreamComponent", null, 1, 1, CustomerSupplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerSupplier_UpstreamComponent(), this.getUpstreamComponent(), null, "upstreamComponent", null, 1, 1, CustomerSupplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerSupplier_AffectedInterfaces(), this.getInterface(), this.getInterface_ReferencedRelationships(), "affectedInterfaces", null, 0, -1, CustomerSupplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedContextRelationshipEClass, BoundedContextRelationship.class, "BoundedContextRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedContextRelationship_RelationshipName(), ecorePackage.getEString(), "relationshipName", null, 0, 1, BoundedContextRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upstreamComponentEClass, UpstreamComponent.class, "UpstreamComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpstreamComponent_RelatedContext(), this.getBoundedContext(), null, "relatedContext", null, 1, 1, UpstreamComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpstreamComponent_UpstreamRole(), this.getUpstreamRole(), "upstreamRole", null, 0, 1, UpstreamComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(downstreamComponentEClass, DownstreamComponent.class, "DownstreamComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDownstreamComponent_RelatedContext(), this.getBoundedContext(), null, "relatedContext", null, 1, 1, DownstreamComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDownstreamComponent_DownstreamRole(), this.getDownstreamRole(), "downstreamRole", null, 0, 1, DownstreamComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_ElementName(), ecorePackage.getEString(), "elementName", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_ReferencedInterfaces(), this.getInterface(), this.getInterface_ReferencedElements(), "referencedInterfaces", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factorizeableEClass, Factorizeable.class, "Factorizeable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microserviceEClass, Microservice.class, "Microservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroservice_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_CorrespodingContext(), this.getBoundedContext(), this.getBoundedContext_CorrespodingMicroservices(), "correspodingContext", null, 0, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_ImplementationTechnology(), this.getImplementationTechnology(), "implementationTechnology", null, 0, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_DeploymentConfiguration(), this.getDeploymentConfiguration(), this.getDeploymentConfiguration_Microservice(), "deploymentConfiguration", null, 0, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_BuildConfiguration(), this.getBuildConfiguration(), this.getBuildConfiguration_Microservice(), "buildConfiguration", null, 0, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_CalledEndpoints(), this.getRestEndpoint(), null, "calledEndpoints", null, 0, -1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ReferencedElements(), this.getModelElement(), this.getModelElement_ReferencedInterfaces(), "referencedElements", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ReferencedRelationships(), this.getCustomerSupplier(), this.getCustomerSupplier_AffectedInterfaces(), "referencedRelationships", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronousInterfaceEClass, SynchronousInterface.class, "SynchronousInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronousInterface_RestEndpoints(), this.getRestEndpoint(), null, "restEndpoints", null, 0, -1, SynchronousInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousInterface_Version(), ecorePackage.getEString(), "version", null, 0, 1, SynchronousInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchronousInterfaceEClass, AsynchronousInterface.class, "AsynchronousInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsynchronousInterface_InterfaceRole(), this.getAsynchronousInterfaceRole(), "interfaceRole", null, 0, 1, AsynchronousInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsynchronousInterface_DomainEvents(), this.getDomainEvent(), null, "domainEvents", null, 0, -1, AsynchronousInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsynchronousInterface_Topic(), this.getTopic(), this.getTopic_AsynchronousInterfaces(), "topic", null, 1, 1, AsynchronousInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restEndpointEClass, RestEndpoint.class, "RestEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestEndpoint_Path(), ecorePackage.getEString(), "path", null, 0, 1, RestEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestEndpoint_HttpMethod(), this.getHttpMethod(), "httpMethod", null, 0, 1, RestEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueObjectNodeEClass, ValueObjectNode.class, "ValueObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueObjectNode_ValueObjectNodes(), this.getValueObjectNode(), null, "valueObjectNodes", null, 0, -1, ValueObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueObjectNode_ReferencedEntities(), this.getEntityNode(), null, "referencedEntities", null, 0, -1, ValueObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityNodeEClass, EntityNode.class, "EntityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityNode_ValueObjectNodes(), this.getValueObjectNode(), null, "valueObjectNodes", null, 0, -1, EntityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityNode_Behaviours(), this.getBehaviour(), null, "behaviours", null, 0, -1, EntityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateNodeEClass, AggregateNode.class, "AggregateNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregateNode_ElementName(), ecorePackage.getEString(), "elementName", null, 0, 1, AggregateNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistableEClass, Persistable.class, "Persistable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentConfigurationEClass, DeploymentConfiguration.class, "DeploymentConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentConfiguration_Microservice(), this.getMicroservice(), this.getMicroservice_DeploymentConfiguration(), "microservice", null, 0, 1, DeploymentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentConfiguration_Port(), ecorePackage.getEString(), "port", null, 0, 1, DeploymentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentConfiguration_NodePort(), ecorePackage.getEString(), "nodePort", null, 0, 1, DeploymentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentConfiguration_Replicas(), ecorePackage.getEInt(), "replicas", null, 0, 1, DeploymentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gCloudConfigurationEClass, GCloudConfiguration.class, "GCloudConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGCloudConfiguration_ArtifactRepositoryName(), ecorePackage.getEString(), "artifactRepositoryName", null, 0, 1, GCloudConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGCloudConfiguration_ArtifactRepositoryZone(), this.getGCloudZone(), "artifactRepositoryZone", "europe-west1", 0, 1, GCloudConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGCloudConfiguration_ProjectId(), ecorePackage.getEString(), "projectId", null, 0, 1, GCloudConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGCloudConfiguration_ClusterZone(), this.getGCloudZone(), "clusterZone", "europe-west1-b", 0, 1, GCloudConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGCloudConfiguration_KubernetesClusterConfiguration(), this.getKubernetesClusterConfiguration(), null, "kubernetesClusterConfiguration", null, 0, 1, GCloudConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalDependencyEClass, ExternalDependency.class, "ExternalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalDependency_SharedKernel(), this.getSharedKernel(), this.getSharedKernel_ImplementingLib(), "sharedKernel", null, 0, 1, ExternalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDependency_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, ExternalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDependency_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, ExternalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDependency_Version(), ecorePackage.getEString(), "version", null, 0, 1, ExternalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildConfigurationEClass, BuildConfiguration.class, "BuildConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildConfiguration_Microservice(), this.getMicroservice(), this.getMicroservice_BuildConfiguration(), "microservice", null, 0, 1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildConfiguration_ExternalDependencies(), this.getExternalDependency(), null, "externalDependencies", null, 0, -1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildConfiguration_BuildTool(), this.getBuildTool(), "buildTool", null, 0, 1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedModuleEClass, SharedModule.class, "SharedModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kafkaConfigurationEClass, KafkaConfiguration.class, "KafkaConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKafkaConfiguration_Topics(), this.getTopic(), null, "topics", null, 0, -1, KafkaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaConfiguration_BootstrapServerPort(), ecorePackage.getEString(), "bootstrapServerPort", null, 0, 1, KafkaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaConfiguration_KafkaServiceName(), ecorePackage.getEString(), "kafkaServiceName", "kafka", 0, 1, KafkaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopic_TopicName(), ecorePackage.getEString(), "topicName", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopic_AsynchronousInterfaces(), this.getAsynchronousInterface(), this.getAsynchronousInterface_Topic(), "asynchronousInterfaces", null, 0, -1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopic_Partitions(), ecorePackage.getEInt(), "partitions", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopic_ReplicationFactor(), ecorePackage.getEInt(), "replicationFactor", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kubernetesClusterConfigurationEClass, KubernetesClusterConfiguration.class, "KubernetesClusterConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKubernetesClusterConfiguration_ClusterName(), ecorePackage.getEString(), "clusterName", null, 0, 1, KubernetesClusterConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKubernetesClusterConfiguration_Nodes(), ecorePackage.getEInt(), "nodes", null, 0, 1, KubernetesClusterConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKubernetesClusterConfiguration_MachineType(), this.getGCloudMachineType(), "machineType", "e2-small", 0, 1, KubernetesClusterConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKubernetesClusterConfiguration_Deployments(), this.getDeploymentConfiguration(), null, "deployments", null, 0, -1, KubernetesClusterConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudConfigurationEClass, CloudConfiguration.class, "CloudConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
		addEEnumLiteral(httpMethodEEnum, HttpMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.POST);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.DELETE);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.PUT);

		initEEnum(asynchronousInterfaceRoleEEnum, AsynchronousInterfaceRole.class, "AsynchronousInterfaceRole");
		addEEnumLiteral(asynchronousInterfaceRoleEEnum, AsynchronousInterfaceRole.PRODUCER);
		addEEnumLiteral(asynchronousInterfaceRoleEEnum, AsynchronousInterfaceRole.CONSUMER);

		initEEnum(implementationTechnologyEEnum, ImplementationTechnology.class, "ImplementationTechnology");
		addEEnumLiteral(implementationTechnologyEEnum, ImplementationTechnology.JAVA_SPRING);

		initEEnum(buildToolEEnum, BuildTool.class, "BuildTool");
		addEEnumLiteral(buildToolEEnum, BuildTool.GRADLE);

		initEEnum(upstreamRoleEEnum, UpstreamRole.class, "UpstreamRole");
		addEEnumLiteral(upstreamRoleEEnum, UpstreamRole.OPENHOST);
		addEEnumLiteral(upstreamRoleEEnum, UpstreamRole.PUBLISHEDLANGUAGE);
		addEEnumLiteral(upstreamRoleEEnum, UpstreamRole.NONE);

		initEEnum(downstreamRoleEEnum, DownstreamRole.class, "DownstreamRole");
		addEEnumLiteral(downstreamRoleEEnum, DownstreamRole.ACL);
		addEEnumLiteral(downstreamRoleEEnum, DownstreamRole.CONFORMIST);
		addEEnumLiteral(downstreamRoleEEnum, DownstreamRole.NONE);

		initEEnum(gCloudZoneEEnum, GCloudZone.class, "GCloudZone");
		addEEnumLiteral(gCloudZoneEEnum, GCloudZone.EUROPE_WEST1);
		addEEnumLiteral(gCloudZoneEEnum, GCloudZone.EUROPE_WEST1_B);

		initEEnum(gCloudMachineTypeEEnum, GCloudMachineType.class, "GCloudMachineType");
		addEEnumLiteral(gCloudMachineTypeEEnum, GCloudMachineType.E2_SMALL);
		addEEnumLiteral(gCloudMachineTypeEEnum, GCloudMachineType.E2_MEDIUM);
		addEEnumLiteral(gCloudMachineTypeEEnum, GCloudMachineType.E2_STANDARD_2);
		addEEnumLiteral(gCloudMachineTypeEEnum, GCloudMachineType.E2_STANDARD_4);

		// Create resource
		createResource(eNS_URI);
	}

} //MicroserviceMetamodellPackageImpl
