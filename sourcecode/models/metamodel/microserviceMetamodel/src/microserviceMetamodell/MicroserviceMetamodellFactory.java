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
	 * Returns a new object of class '<em>Rest Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Endpoint</em>'.
	 * @generated
	 */
	RestEndpoint createRestEndpoint();

	/**
	 * Returns a new object of class '<em>Model Element Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Implementation</em>'.
	 * @generated
	 */
	ModelElementImplementation createModelElementImplementation();

	/**
	 * Returns a new object of class '<em>Value Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Object Node</em>'.
	 * @generated
	 */
	ValueObjectNode createValueObjectNode();

	/**
	 * Returns a new object of class '<em>Entity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Node</em>'.
	 * @generated
	 */
	EntityNode createEntityNode();

	/**
	 * Returns a new object of class '<em>Deployement Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployement Abstraction</em>'.
	 * @generated
	 */
	DeployementAbstraction createDeployementAbstraction();

	/**
	 * Returns a new object of class '<em>Cloud Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Configuration</em>'.
	 * @generated
	 */
	CloudConfiguration createCloudConfiguration();

	/**
	 * Returns a new object of class '<em>External Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Dependency</em>'.
	 * @generated
	 */
	ExternalDependency createExternalDependency();

	/**
	 * Returns a new object of class '<em>Build Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Configuration</em>'.
	 * @generated
	 */
	BuildConfiguration createBuildConfiguration();

	/**
	 * Returns a new object of class '<em>Shared Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Module</em>'.
	 * @generated
	 */
	SharedModule createSharedModule();

	/**
	 * Returns a new object of class '<em>Kafka Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kafka Configuration</em>'.
	 * @generated
	 */
	KafkaConfiguration createKafkaConfiguration();

	/**
	 * Returns a new object of class '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns a new object of class '<em>Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broker</em>'.
	 * @generated
	 */
	Broker createBroker();

	/**
	 * Returns a new object of class '<em>System Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Model</em>'.
	 * @generated
	 */
	SystemModel createSystemModel();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Domain Model Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model Layer</em>'.
	 * @generated
	 */
	DomainModelLayer createDomainModelLayer();

	/**
	 * Returns a new object of class '<em>Infrastructure Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Layer</em>'.
	 * @generated
	 */
	InfrastructureLayer createInfrastructureLayer();

	/**
	 * Returns a new object of class '<em>Technical Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technical Layer</em>'.
	 * @generated
	 */
	TechnicalLayer createTechnicalLayer();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Object</em>'.
	 * @generated
	 */
	ValueObject createValueObject();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate</em>'.
	 * @generated
	 */
	Aggregate createAggregate();

	/**
	 * Returns a new object of class '<em>Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory</em>'.
	 * @generated
	 */
	Factory createFactory();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Domain Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Event</em>'.
	 * @generated
	 */
	DomainEvent createDomainEvent();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Bounded Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounded Context</em>'.
	 * @generated
	 */
	BoundedContext createBoundedContext();

	/**
	 * Returns a new object of class '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviour</em>'.
	 * @generated
	 */
	Behaviour createBehaviour();

	/**
	 * Returns a new object of class '<em>Shared Kernel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Kernel</em>'.
	 * @generated
	 */
	SharedKernel createSharedKernel();

	/**
	 * Returns a new object of class '<em>Customer Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Supplier</em>'.
	 * @generated
	 */
	CustomerSupplier createCustomerSupplier();

	/**
	 * Returns a new object of class '<em>Conformist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformist</em>'.
	 * @generated
	 */
	Conformist createConformist();

	/**
	 * Returns a new object of class '<em>Anticorruption Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anticorruption Layer</em>'.
	 * @generated
	 */
	AnticorruptionLayer createAnticorruptionLayer();

	/**
	 * Returns a new object of class '<em>Open Host Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Host Service</em>'.
	 * @generated
	 */
	OpenHostService createOpenHostService();

	/**
	 * Returns a new object of class '<em>Published Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Published Language</em>'.
	 * @generated
	 */
	PublishedLanguage createPublishedLanguage();

	/**
	 * Returns a new object of class '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice</em>'.
	 * @generated
	 */
	Microservice createMicroservice();

	/**
	 * Returns a new object of class '<em>Synchronous Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronous Interface</em>'.
	 * @generated
	 */
	SynchronousInterface createSynchronousInterface();

	/**
	 * Returns a new object of class '<em>Asynchronous Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asynchronous Interface</em>'.
	 * @generated
	 */
	AsynchronousInterface createAsynchronousInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MicroserviceMetamodellPackage getMicroserviceMetamodellPackage();

} //MicroserviceMetamodellFactory
