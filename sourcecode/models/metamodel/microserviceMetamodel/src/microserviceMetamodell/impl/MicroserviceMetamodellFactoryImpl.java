/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.*;

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
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT: return createDomainObject();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER: return createDomainObjectController();
			case MicroserviceMetamodellPackage.REST_ENDPOINT: return createRestEndpoint();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE: return createDomainObjectService();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_REPOSITORY: return createDomainObjectRepository();
			case MicroserviceMetamodellPackage.SYSTEM_MODEL: return createSystemModel();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE: return createDomainWebservice();
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
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject createDomainObject() {
		DomainObjectImpl domainObject = new DomainObjectImpl();
		return domainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectController createDomainObjectController() {
		DomainObjectControllerImpl domainObjectController = new DomainObjectControllerImpl();
		return domainObjectController;
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
	public DomainObjectService createDomainObjectService() {
		DomainObjectServiceImpl domainObjectService = new DomainObjectServiceImpl();
		return domainObjectService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectRepository createDomainObjectRepository() {
		DomainObjectRepositoryImpl domainObjectRepository = new DomainObjectRepositoryImpl();
		return domainObjectRepository;
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
	public DomainWebservice createDomainWebservice() {
		DomainWebserviceImpl domainWebservice = new DomainWebserviceImpl();
		return domainWebservice;
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
