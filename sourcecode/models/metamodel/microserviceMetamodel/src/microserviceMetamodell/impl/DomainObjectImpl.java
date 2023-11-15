/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.DomainObject;
import microserviceMetamodell.DomainObjectController;
import microserviceMetamodell.DomainObjectRepository;
import microserviceMetamodell.DomainObjectService;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectImpl#getDomainObjectRepository <em>Domain Object Repository</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectImpl#getDomainObjectService <em>Domain Object Service</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectImpl#getDomainObjectController <em>Domain Object Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainObjectImpl extends MinimalEObjectImpl.Container implements DomainObject {
	/**
	 * The default value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected String objectName = OBJECT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainObjectRepository() <em>Domain Object Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectRepository()
	 * @generated
	 * @ordered
	 */
	protected DomainObjectRepository domainObjectRepository;

	/**
	 * The cached value of the '{@link #getDomainObjectService() <em>Domain Object Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectService()
	 * @generated
	 * @ordered
	 */
	protected DomainObjectService domainObjectService;

	/**
	 * The cached value of the '{@link #getDomainObjectController() <em>Domain Object Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectController()
	 * @generated
	 * @ordered
	 */
	protected DomainObjectController domainObjectController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOMAIN_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectName(String newObjectName) {
		String oldObjectName = objectName;
		objectName = newObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_OBJECT__OBJECT_NAME, oldObjectName, objectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectRepository getDomainObjectRepository() {
		if (domainObjectRepository != null && domainObjectRepository.eIsProxy()) {
			InternalEObject oldDomainObjectRepository = (InternalEObject)domainObjectRepository;
			domainObjectRepository = (DomainObjectRepository)eResolveProxy(oldDomainObjectRepository);
			if (domainObjectRepository != oldDomainObjectRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY, oldDomainObjectRepository, domainObjectRepository));
			}
		}
		return domainObjectRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectRepository basicGetDomainObjectRepository() {
		return domainObjectRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainObjectRepository(DomainObjectRepository newDomainObjectRepository) {
		DomainObjectRepository oldDomainObjectRepository = domainObjectRepository;
		domainObjectRepository = newDomainObjectRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY, oldDomainObjectRepository, domainObjectRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectService getDomainObjectService() {
		if (domainObjectService != null && domainObjectService.eIsProxy()) {
			InternalEObject oldDomainObjectService = (InternalEObject)domainObjectService;
			domainObjectService = (DomainObjectService)eResolveProxy(oldDomainObjectService);
			if (domainObjectService != oldDomainObjectService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE, oldDomainObjectService, domainObjectService));
			}
		}
		return domainObjectService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectService basicGetDomainObjectService() {
		return domainObjectService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainObjectService(DomainObjectService newDomainObjectService) {
		DomainObjectService oldDomainObjectService = domainObjectService;
		domainObjectService = newDomainObjectService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE, oldDomainObjectService, domainObjectService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectController getDomainObjectController() {
		if (domainObjectController != null && domainObjectController.eIsProxy()) {
			InternalEObject oldDomainObjectController = (InternalEObject)domainObjectController;
			domainObjectController = (DomainObjectController)eResolveProxy(oldDomainObjectController);
			if (domainObjectController != oldDomainObjectController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER, oldDomainObjectController, domainObjectController));
			}
		}
		return domainObjectController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectController basicGetDomainObjectController() {
		return domainObjectController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainObjectController(DomainObjectController newDomainObjectController) {
		DomainObjectController oldDomainObjectController = domainObjectController;
		domainObjectController = newDomainObjectController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER, oldDomainObjectController, domainObjectController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__OBJECT_NAME:
				return getObjectName();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY:
				if (resolve) return getDomainObjectRepository();
				return basicGetDomainObjectRepository();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE:
				if (resolve) return getDomainObjectService();
				return basicGetDomainObjectService();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER:
				if (resolve) return getDomainObjectController();
				return basicGetDomainObjectController();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__OBJECT_NAME:
				setObjectName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY:
				setDomainObjectRepository((DomainObjectRepository)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE:
				setDomainObjectService((DomainObjectService)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER:
				setDomainObjectController((DomainObjectController)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__OBJECT_NAME:
				setObjectName(OBJECT_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY:
				setDomainObjectRepository((DomainObjectRepository)null);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE:
				setDomainObjectService((DomainObjectService)null);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER:
				setDomainObjectController((DomainObjectController)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__OBJECT_NAME:
				return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_REPOSITORY:
				return domainObjectRepository != null;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_SERVICE:
				return domainObjectService != null;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT__DOMAIN_OBJECT_CONTROLLER:
				return domainObjectController != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (objectName: ");
		result.append(objectName);
		result.append(')');
		return result.toString();
	}

} //DomainObjectImpl
