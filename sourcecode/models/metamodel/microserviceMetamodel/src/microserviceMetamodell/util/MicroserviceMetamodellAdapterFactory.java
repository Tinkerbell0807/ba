/**
 */
package microserviceMetamodell.util;

import microserviceMetamodell.Aggregate;
import microserviceMetamodell.AggregateNode;
import microserviceMetamodell.AsynchronousInterface;
import microserviceMetamodell.Behaviour;
import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.BoundedContextRelationship;
import microserviceMetamodell.BuildConfiguration;
import microserviceMetamodell.CloudConfiguration;
import microserviceMetamodell.CustomerSupplier;
import microserviceMetamodell.DeploymentConfiguration;
import microserviceMetamodell.DomainEvent;
import microserviceMetamodell.DomainModel;
import microserviceMetamodell.DomainModelLayer;
import microserviceMetamodell.DownstreamComponent;
import microserviceMetamodell.Entity;
import microserviceMetamodell.EntityNode;
import microserviceMetamodell.ExternalDependency;
import microserviceMetamodell.Factorizeable;
import microserviceMetamodell.Factory;
import microserviceMetamodell.GCloudConfiguration;
import microserviceMetamodell.InfrastructureLayer;
import microserviceMetamodell.Interface;
import microserviceMetamodell.KafkaConfiguration;
import microserviceMetamodell.KubernetesClusterConfiguration;
import microserviceMetamodell.Microservice;
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
import microserviceMetamodell.ValueObject;
import microserviceMetamodell.ValueObjectNode;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellPackage
 * @generated
 */
public class MicroserviceMetamodellAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicroserviceMetamodellPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceMetamodellAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MicroserviceMetamodellPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceMetamodellSwitch<Adapter> modelSwitch =
		new MicroserviceMetamodellSwitch<Adapter>() {
			@Override
			public Adapter caseSystemModel(SystemModel object) {
				return createSystemModelAdapter();
			}
			@Override
			public Adapter caseDomainModel(DomainModel object) {
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseDomainModelLayer(DomainModelLayer object) {
				return createDomainModelLayerAdapter();
			}
			@Override
			public Adapter caseInfrastructureLayer(InfrastructureLayer object) {
				return createInfrastructureLayerAdapter();
			}
			@Override
			public Adapter caseTechnicalLayer(TechnicalLayer object) {
				return createTechnicalLayerAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseValueObject(ValueObject object) {
				return createValueObjectAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseAggregate(Aggregate object) {
				return createAggregateAdapter();
			}
			@Override
			public Adapter caseFactory(Factory object) {
				return createFactoryAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseDomainEvent(DomainEvent object) {
				return createDomainEventAdapter();
			}
			@Override
			public Adapter caseModule(microserviceMetamodell.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseBoundedContext(BoundedContext object) {
				return createBoundedContextAdapter();
			}
			@Override
			public Adapter caseBehaviour(Behaviour object) {
				return createBehaviourAdapter();
			}
			@Override
			public Adapter caseSharedKernel(SharedKernel object) {
				return createSharedKernelAdapter();
			}
			@Override
			public Adapter caseCustomerSupplier(CustomerSupplier object) {
				return createCustomerSupplierAdapter();
			}
			@Override
			public Adapter caseBoundedContextRelationship(BoundedContextRelationship object) {
				return createBoundedContextRelationshipAdapter();
			}
			@Override
			public Adapter caseUpstreamComponent(UpstreamComponent object) {
				return createUpstreamComponentAdapter();
			}
			@Override
			public Adapter caseDownstreamComponent(DownstreamComponent object) {
				return createDownstreamComponentAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseFactorizeable(Factorizeable object) {
				return createFactorizeableAdapter();
			}
			@Override
			public Adapter caseMicroservice(Microservice object) {
				return createMicroserviceAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseSynchronousInterface(SynchronousInterface object) {
				return createSynchronousInterfaceAdapter();
			}
			@Override
			public Adapter caseAsynchronousInterface(AsynchronousInterface object) {
				return createAsynchronousInterfaceAdapter();
			}
			@Override
			public Adapter caseRestEndpoint(RestEndpoint object) {
				return createRestEndpointAdapter();
			}
			@Override
			public Adapter caseValueObjectNode(ValueObjectNode object) {
				return createValueObjectNodeAdapter();
			}
			@Override
			public Adapter caseEntityNode(EntityNode object) {
				return createEntityNodeAdapter();
			}
			@Override
			public Adapter caseAggregateNode(AggregateNode object) {
				return createAggregateNodeAdapter();
			}
			@Override
			public Adapter casePersistable(Persistable object) {
				return createPersistableAdapter();
			}
			@Override
			public Adapter caseDeploymentConfiguration(DeploymentConfiguration object) {
				return createDeploymentConfigurationAdapter();
			}
			@Override
			public Adapter caseGCloudConfiguration(GCloudConfiguration object) {
				return createGCloudConfigurationAdapter();
			}
			@Override
			public Adapter caseExternalDependency(ExternalDependency object) {
				return createExternalDependencyAdapter();
			}
			@Override
			public Adapter caseBuildConfiguration(BuildConfiguration object) {
				return createBuildConfigurationAdapter();
			}
			@Override
			public Adapter caseSharedModule(SharedModule object) {
				return createSharedModuleAdapter();
			}
			@Override
			public Adapter caseKafkaConfiguration(KafkaConfiguration object) {
				return createKafkaConfigurationAdapter();
			}
			@Override
			public Adapter caseTopic(Topic object) {
				return createTopicAdapter();
			}
			@Override
			public Adapter caseKubernetesClusterConfiguration(KubernetesClusterConfiguration object) {
				return createKubernetesClusterConfigurationAdapter();
			}
			@Override
			public Adapter caseCloudConfiguration(CloudConfiguration object) {
				return createCloudConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.SystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.SystemModel
	 * @generated
	 */
	public Adapter createSystemModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DomainModelLayer <em>Domain Model Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DomainModelLayer
	 * @generated
	 */
	public Adapter createDomainModelLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.InfrastructureLayer <em>Infrastructure Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.InfrastructureLayer
	 * @generated
	 */
	public Adapter createInfrastructureLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.TechnicalLayer <em>Technical Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.TechnicalLayer
	 * @generated
	 */
	public Adapter createTechnicalLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.ValueObject
	 * @generated
	 */
	public Adapter createValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Aggregate
	 * @generated
	 */
	public Adapter createAggregateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Factory
	 * @generated
	 */
	public Adapter createFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DomainEvent
	 * @generated
	 */
	public Adapter createDomainEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.BoundedContext <em>Bounded Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.BoundedContext
	 * @generated
	 */
	public Adapter createBoundedContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Behaviour
	 * @generated
	 */
	public Adapter createBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.SharedKernel <em>Shared Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.SharedKernel
	 * @generated
	 */
	public Adapter createSharedKernelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.CustomerSupplier <em>Customer Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.CustomerSupplier
	 * @generated
	 */
	public Adapter createCustomerSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.BoundedContextRelationship <em>Bounded Context Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.BoundedContextRelationship
	 * @generated
	 */
	public Adapter createBoundedContextRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.UpstreamComponent <em>Upstream Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.UpstreamComponent
	 * @generated
	 */
	public Adapter createUpstreamComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DownstreamComponent <em>Downstream Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DownstreamComponent
	 * @generated
	 */
	public Adapter createDownstreamComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Factorizeable <em>Factorizeable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Factorizeable
	 * @generated
	 */
	public Adapter createFactorizeableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.SynchronousInterface <em>Synchronous Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.SynchronousInterface
	 * @generated
	 */
	public Adapter createSynchronousInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.AsynchronousInterface <em>Asynchronous Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.AsynchronousInterface
	 * @generated
	 */
	public Adapter createAsynchronousInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.RestEndpoint <em>Rest Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.RestEndpoint
	 * @generated
	 */
	public Adapter createRestEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.ValueObjectNode <em>Value Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.ValueObjectNode
	 * @generated
	 */
	public Adapter createValueObjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.EntityNode <em>Entity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.EntityNode
	 * @generated
	 */
	public Adapter createEntityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.AggregateNode <em>Aggregate Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.AggregateNode
	 * @generated
	 */
	public Adapter createAggregateNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Persistable <em>Persistable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Persistable
	 * @generated
	 */
	public Adapter createPersistableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DeploymentConfiguration
	 * @generated
	 */
	public Adapter createDeploymentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.GCloudConfiguration <em>GCloud Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.GCloudConfiguration
	 * @generated
	 */
	public Adapter createGCloudConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.ExternalDependency <em>External Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.ExternalDependency
	 * @generated
	 */
	public Adapter createExternalDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.BuildConfiguration <em>Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.BuildConfiguration
	 * @generated
	 */
	public Adapter createBuildConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.SharedModule <em>Shared Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.SharedModule
	 * @generated
	 */
	public Adapter createSharedModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.KafkaConfiguration <em>Kafka Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.KafkaConfiguration
	 * @generated
	 */
	public Adapter createKafkaConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.Topic
	 * @generated
	 */
	public Adapter createTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.KubernetesClusterConfiguration <em>Kubernetes Cluster Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.KubernetesClusterConfiguration
	 * @generated
	 */
	public Adapter createKubernetesClusterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.CloudConfiguration <em>Cloud Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.CloudConfiguration
	 * @generated
	 */
	public Adapter createCloudConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MicroserviceMetamodellAdapterFactory
