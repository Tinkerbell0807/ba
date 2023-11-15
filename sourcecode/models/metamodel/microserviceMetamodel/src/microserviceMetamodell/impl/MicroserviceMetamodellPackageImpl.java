/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.DomainObject;
import microserviceMetamodell.DomainObjectController;
import microserviceMetamodell.DomainObjectRepository;
import microserviceMetamodell.DomainObjectService;
import microserviceMetamodell.DomainWebservice;
import microserviceMetamodell.HttpMethod;
import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.RestEndpoint;
import microserviceMetamodell.SystemModel;

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
	private EClass domainObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainObjectControllerEClass = null;

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
	private EClass domainObjectServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainObjectRepositoryEClass = null;

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
	private EClass domainWebserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

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
	public EClass getDomainObject() {
		return domainObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObject_ObjectName() {
		return (EAttribute)domainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObject_DomainObjectRepository() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObject_DomainObjectService() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObject_DomainObjectController() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainObjectController() {
		return domainObjectControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectController_RestEndpoints() {
		return (EReference)domainObjectControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObjectController_ObjectName() {
		return (EAttribute)domainObjectControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectController_DomainObjectServices() {
		return (EReference)domainObjectControllerEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getRestEndpoint_HttpMethod() {
		return (EAttribute)restEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestEndpoint_Path() {
		return (EAttribute)restEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainObjectService() {
		return domainObjectServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObjectService_ObjectName() {
		return (EAttribute)domainObjectServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectService_DomainObjectRepositories() {
		return (EReference)domainObjectServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectService_Calls() {
		return (EReference)domainObjectServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainObjectRepository() {
		return domainObjectRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObjectRepository_ObjectName() {
		return (EAttribute)domainObjectRepositoryEClass.getEStructuralFeatures().get(0);
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
	public EReference getSystemModel_Webservices() {
		return (EReference)systemModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemModel_Description() {
		return (EAttribute)systemModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainWebservice() {
		return domainWebserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainWebservice_DomainObjectControllers() {
		return (EReference)domainWebserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainWebservice_DomainObjectServices() {
		return (EReference)domainWebserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainWebservice_DomainObjectRepositories() {
		return (EReference)domainWebserviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainWebservice_DomainName() {
		return (EAttribute)domainWebserviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainWebservice_DomainObjects() {
		return (EReference)domainWebserviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainWebservice_HostUrl() {
		return (EAttribute)domainWebserviceEClass.getEStructuralFeatures().get(5);
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
		domainObjectEClass = createEClass(DOMAIN_OBJECT);
		createEAttribute(domainObjectEClass, DOMAIN_OBJECT__OBJECT_NAME);
		createEReference(domainObjectEClass, DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY);
		createEReference(domainObjectEClass, DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE);
		createEReference(domainObjectEClass, DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER);

		domainObjectControllerEClass = createEClass(DOMAIN_OBJECT_CONTROLLER);
		createEReference(domainObjectControllerEClass, DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS);
		createEAttribute(domainObjectControllerEClass, DOMAIN_OBJECT_CONTROLLER__OBJECT_NAME);
		createEReference(domainObjectControllerEClass, DOMAIN_OBJECT_CONTROLLER__DOMAIN_OBJECT_SERVICES);

		restEndpointEClass = createEClass(REST_ENDPOINT);
		createEAttribute(restEndpointEClass, REST_ENDPOINT__HTTP_METHOD);
		createEAttribute(restEndpointEClass, REST_ENDPOINT__PATH);

		domainObjectServiceEClass = createEClass(DOMAIN_OBJECT_SERVICE);
		createEAttribute(domainObjectServiceEClass, DOMAIN_OBJECT_SERVICE__OBJECT_NAME);
		createEReference(domainObjectServiceEClass, DOMAIN_OBJECT_SERVICE__DOMAIN_OBJECT_REPOSITORIES);
		createEReference(domainObjectServiceEClass, DOMAIN_OBJECT_SERVICE__CALLS);

		domainObjectRepositoryEClass = createEClass(DOMAIN_OBJECT_REPOSITORY);
		createEAttribute(domainObjectRepositoryEClass, DOMAIN_OBJECT_REPOSITORY__OBJECT_NAME);

		systemModelEClass = createEClass(SYSTEM_MODEL);
		createEReference(systemModelEClass, SYSTEM_MODEL__WEBSERVICES);
		createEAttribute(systemModelEClass, SYSTEM_MODEL__DESCRIPTION);

		domainWebserviceEClass = createEClass(DOMAIN_WEBSERVICE);
		createEReference(domainWebserviceEClass, DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS);
		createEReference(domainWebserviceEClass, DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES);
		createEReference(domainWebserviceEClass, DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES);
		createEAttribute(domainWebserviceEClass, DOMAIN_WEBSERVICE__DOMAIN_NAME);
		createEReference(domainWebserviceEClass, DOMAIN_WEBSERVICE__DOMAIN_OBJECTS);
		createEAttribute(domainWebserviceEClass, DOMAIN_WEBSERVICE__HOST_URL);

		// Create enums
		httpMethodEEnum = createEEnum(HTTP_METHOD);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(domainObjectEClass, DomainObject.class, "DomainObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainObject_ObjectName(), ecorePackage.getEString(), "objectName", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObject_DomainObjectRepository(), this.getDomainObjectRepository(), null, "domainObjectRepository", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObject_DomainObjectService(), this.getDomainObjectService(), null, "domainObjectService", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObject_DomainObjectController(), this.getDomainObjectController(), null, "domainObjectController", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainObjectControllerEClass, DomainObjectController.class, "DomainObjectController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainObjectController_RestEndpoints(), this.getRestEndpoint(), null, "restEndpoints", null, 0, -1, DomainObjectController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainObjectController_ObjectName(), ecorePackage.getEString(), "objectName", null, 0, 1, DomainObjectController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObjectController_DomainObjectServices(), this.getDomainObjectService(), null, "domainObjectServices", null, 0, -1, DomainObjectController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restEndpointEClass, RestEndpoint.class, "RestEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestEndpoint_HttpMethod(), this.getHttpMethod(), "httpMethod", null, 0, 1, RestEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestEndpoint_Path(), ecorePackage.getEString(), "path", null, 0, 1, RestEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainObjectServiceEClass, DomainObjectService.class, "DomainObjectService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainObjectService_ObjectName(), ecorePackage.getEString(), "objectName", null, 0, 1, DomainObjectService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObjectService_DomainObjectRepositories(), this.getDomainObjectRepository(), null, "domainObjectRepositories", null, 0, -1, DomainObjectService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObjectService_Calls(), this.getRestEndpoint(), null, "calls", null, 0, -1, DomainObjectService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainObjectRepositoryEClass, DomainObjectRepository.class, "DomainObjectRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainObjectRepository_ObjectName(), ecorePackage.getEString(), "objectName", null, 0, 1, DomainObjectRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemModelEClass, SystemModel.class, "SystemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemModel_Webservices(), this.getDomainWebservice(), null, "webservices", null, 0, -1, SystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainWebserviceEClass, DomainWebservice.class, "DomainWebservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainWebservice_DomainObjectControllers(), this.getDomainObjectController(), null, "domainObjectControllers", null, 0, -1, DomainWebservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainWebservice_DomainObjectServices(), this.getDomainObjectService(), null, "domainObjectServices", null, 0, -1, DomainWebservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainWebservice_DomainObjectRepositories(), this.getDomainObjectRepository(), null, "domainObjectRepositories", null, 0, -1, DomainWebservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainWebservice_DomainName(), ecorePackage.getEString(), "domainName", null, 0, 1, DomainWebservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainWebservice_DomainObjects(), this.getDomainObject(), null, "domainObjects", null, 0, -1, DomainWebservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainWebservice_HostUrl(), ecorePackage.getEString(), "hostUrl", null, 0, 1, DomainWebservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
		addEEnumLiteral(httpMethodEEnum, HttpMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.POST);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //MicroserviceMetamodellPackageImpl
