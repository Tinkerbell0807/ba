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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellPackage
 * @generated
 */
public class MicroserviceMetamodellSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicroserviceMetamodellPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceMetamodellSwitch() {
		if (modelPackage == null) {
			modelPackage = MicroserviceMetamodellPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MicroserviceMetamodellPackage.SYSTEM_MODEL: {
				SystemModel systemModel = (SystemModel)theEObject;
				T result = caseSystemModel(systemModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER: {
				DomainModelLayer domainModelLayer = (DomainModelLayer)theEObject;
				T result = caseDomainModelLayer(domainModelLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER: {
				InfrastructureLayer infrastructureLayer = (InfrastructureLayer)theEObject;
				T result = caseInfrastructureLayer(infrastructureLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.TECHNICAL_LAYER: {
				TechnicalLayer technicalLayer = (TechnicalLayer)theEObject;
				T result = caseTechnicalLayer(technicalLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseModelElement(entity);
				if (result == null) result = caseFactorizeable(entity);
				if (result == null) result = casePersistable(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.VALUE_OBJECT: {
				ValueObject valueObject = (ValueObject)theEObject;
				T result = caseValueObject(valueObject);
				if (result == null) result = caseModelElement(valueObject);
				if (result == null) result = caseFactorizeable(valueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseModelElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.AGGREGATE: {
				Aggregate aggregate = (Aggregate)theEObject;
				T result = caseAggregate(aggregate);
				if (result == null) result = caseFactorizeable(aggregate);
				if (result == null) result = caseModelElement(aggregate);
				if (result == null) result = casePersistable(aggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.FACTORY: {
				Factory factory = (Factory)theEObject;
				T result = caseFactory(factory);
				if (result == null) result = caseModelElement(factory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = caseModelElement(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.DOMAIN_EVENT: {
				DomainEvent domainEvent = (DomainEvent)theEObject;
				T result = caseDomainEvent(domainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.MODULE: {
				microserviceMetamodell.Module module = (microserviceMetamodell.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT: {
				BoundedContext boundedContext = (BoundedContext)theEObject;
				T result = caseBoundedContext(boundedContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.BEHAVIOUR: {
				Behaviour behaviour = (Behaviour)theEObject;
				T result = caseBehaviour(behaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.SHARED_KERNEL: {
				SharedKernel sharedKernel = (SharedKernel)theEObject;
				T result = caseSharedKernel(sharedKernel);
				if (result == null) result = caseBoundedContextRelationship(sharedKernel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER: {
				CustomerSupplier customerSupplier = (CustomerSupplier)theEObject;
				T result = caseCustomerSupplier(customerSupplier);
				if (result == null) result = caseBoundedContextRelationship(customerSupplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP: {
				BoundedContextRelationship boundedContextRelationship = (BoundedContextRelationship)theEObject;
				T result = caseBoundedContextRelationship(boundedContextRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT: {
				UpstreamComponent upstreamComponent = (UpstreamComponent)theEObject;
				T result = caseUpstreamComponent(upstreamComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT: {
				DownstreamComponent downstreamComponent = (DownstreamComponent)theEObject;
				T result = caseDownstreamComponent(downstreamComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.FACTORIZEABLE: {
				Factorizeable factorizeable = (Factorizeable)theEObject;
				T result = caseFactorizeable(factorizeable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.MICROSERVICE: {
				Microservice microservice = (Microservice)theEObject;
				T result = caseMicroservice(microservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE: {
				SynchronousInterface synchronousInterface = (SynchronousInterface)theEObject;
				T result = caseSynchronousInterface(synchronousInterface);
				if (result == null) result = caseInterface(synchronousInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE: {
				AsynchronousInterface asynchronousInterface = (AsynchronousInterface)theEObject;
				T result = caseAsynchronousInterface(asynchronousInterface);
				if (result == null) result = caseInterface(asynchronousInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.REST_ENDPOINT: {
				RestEndpoint restEndpoint = (RestEndpoint)theEObject;
				T result = caseRestEndpoint(restEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.VALUE_OBJECT_NODE: {
				ValueObjectNode valueObjectNode = (ValueObjectNode)theEObject;
				T result = caseValueObjectNode(valueObjectNode);
				if (result == null) result = caseAggregateNode(valueObjectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.ENTITY_NODE: {
				EntityNode entityNode = (EntityNode)theEObject;
				T result = caseEntityNode(entityNode);
				if (result == null) result = caseAggregateNode(entityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.AGGREGATE_NODE: {
				AggregateNode aggregateNode = (AggregateNode)theEObject;
				T result = caseAggregateNode(aggregateNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.PERSISTABLE: {
				Persistable persistable = (Persistable)theEObject;
				T result = casePersistable(persistable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION: {
				DeploymentConfiguration deploymentConfiguration = (DeploymentConfiguration)theEObject;
				T result = caseDeploymentConfiguration(deploymentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION: {
				GCloudConfiguration gCloudConfiguration = (GCloudConfiguration)theEObject;
				T result = caseGCloudConfiguration(gCloudConfiguration);
				if (result == null) result = caseCloudConfiguration(gCloudConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY: {
				ExternalDependency externalDependency = (ExternalDependency)theEObject;
				T result = caseExternalDependency(externalDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION: {
				BuildConfiguration buildConfiguration = (BuildConfiguration)theEObject;
				T result = caseBuildConfiguration(buildConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.SHARED_MODULE: {
				SharedModule sharedModule = (SharedModule)theEObject;
				T result = caseSharedModule(sharedModule);
				if (result == null) result = caseModule(sharedModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION: {
				KafkaConfiguration kafkaConfiguration = (KafkaConfiguration)theEObject;
				T result = caseKafkaConfiguration(kafkaConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.TOPIC: {
				Topic topic = (Topic)theEObject;
				T result = caseTopic(topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION: {
				KubernetesClusterConfiguration kubernetesClusterConfiguration = (KubernetesClusterConfiguration)theEObject;
				T result = caseKubernetesClusterConfiguration(kubernetesClusterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicroserviceMetamodellPackage.CLOUD_CONFIGURATION: {
				CloudConfiguration cloudConfiguration = (CloudConfiguration)theEObject;
				T result = caseCloudConfiguration(cloudConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemModel(SystemModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModelLayer(DomainModelLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureLayer(InfrastructureLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalLayer(TechnicalLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueObject(ValueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregate(Aggregate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactory(Factory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainEvent(DomainEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(microserviceMetamodell.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedContext(BoundedContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviour(Behaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Kernel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Kernel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedKernel(SharedKernel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerSupplier(CustomerSupplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Context Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Context Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedContextRelationship(BoundedContextRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upstream Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upstream Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpstreamComponent(UpstreamComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Downstream Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Downstream Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDownstreamComponent(DownstreamComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factorizeable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factorizeable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactorizeable(Factorizeable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroservice(Microservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousInterface(SynchronousInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynchronous Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynchronous Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchronousInterface(AsynchronousInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestEndpoint(RestEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueObjectNode(ValueObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityNode(EntityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateNode(AggregateNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistable(Persistable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentConfiguration(DeploymentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCloud Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCloud Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCloudConfiguration(GCloudConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDependency(ExternalDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildConfiguration(BuildConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedModule(SharedModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaConfiguration(KafkaConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kubernetes Cluster Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kubernetes Cluster Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKubernetesClusterConfiguration(KubernetesClusterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudConfiguration(CloudConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MicroserviceMetamodellSwitch
