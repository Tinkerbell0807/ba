/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.DomainObject;
import microserviceMetamodell.DomainObjectController;
import microserviceMetamodell.DomainObjectRepository;
import microserviceMetamodell.DomainObjectService;
import microserviceMetamodell.DomainWebservice;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Webservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DomainWebserviceImpl#getDomainObjectControllers <em>Domain Object Controllers</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainWebserviceImpl#getDomainObjectServices <em>Domain Object Services</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainWebserviceImpl#getDomainObjectRepositories <em>Domain Object Repositories</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainWebserviceImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainWebserviceImpl#getDomainObjects <em>Domain Objects</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainWebserviceImpl#getHostUrl <em>Host Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainWebserviceImpl extends MinimalEObjectImpl.Container implements DomainWebservice {
	/**
	 * The cached value of the '{@link #getDomainObjectControllers() <em>Domain Object Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectController> domainObjectControllers;

	/**
	 * The cached value of the '{@link #getDomainObjectServices() <em>Domain Object Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectService> domainObjectServices;

	/**
	 * The cached value of the '{@link #getDomainObjectRepositories() <em>Domain Object Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectRepository> domainObjectRepositories;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainObjects() <em>Domain Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> domainObjects;

	/**
	 * The default value of the '{@link #getHostUrl() <em>Host Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostUrl() <em>Host Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostUrl()
	 * @generated
	 * @ordered
	 */
	protected String hostUrl = HOST_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainWebserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOMAIN_WEBSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectController> getDomainObjectControllers() {
		if (domainObjectControllers == null) {
			domainObjectControllers = new EObjectContainmentEList<DomainObjectController>(DomainObjectController.class, this, MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS);
		}
		return domainObjectControllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectService> getDomainObjectServices() {
		if (domainObjectServices == null) {
			domainObjectServices = new EObjectContainmentEList<DomainObjectService>(DomainObjectService.class, this, MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES);
		}
		return domainObjectServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectRepository> getDomainObjectRepositories() {
		if (domainObjectRepositories == null) {
			domainObjectRepositories = new EObjectContainmentEList<DomainObjectRepository>(DomainObjectRepository.class, this, MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES);
		}
		return domainObjectRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObject> getDomainObjects() {
		if (domainObjects == null) {
			domainObjects = new EObjectContainmentEList<DomainObject>(DomainObject.class, this, MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECTS);
		}
		return domainObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostUrl() {
		return hostUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostUrl(String newHostUrl) {
		String oldHostUrl = hostUrl;
		hostUrl = newHostUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__HOST_URL, oldHostUrl, hostUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS:
				return ((InternalEList<?>)getDomainObjectControllers()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES:
				return ((InternalEList<?>)getDomainObjectServices()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES:
				return ((InternalEList<?>)getDomainObjectRepositories()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECTS:
				return ((InternalEList<?>)getDomainObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS:
				return getDomainObjectControllers();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES:
				return getDomainObjectServices();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES:
				return getDomainObjectRepositories();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_NAME:
				return getDomainName();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECTS:
				return getDomainObjects();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__HOST_URL:
				return getHostUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS:
				getDomainObjectControllers().clear();
				getDomainObjectControllers().addAll((Collection<? extends DomainObjectController>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES:
				getDomainObjectServices().clear();
				getDomainObjectServices().addAll((Collection<? extends DomainObjectService>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES:
				getDomainObjectRepositories().clear();
				getDomainObjectRepositories().addAll((Collection<? extends DomainObjectRepository>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				getDomainObjects().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__HOST_URL:
				setHostUrl((String)newValue);
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
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS:
				getDomainObjectControllers().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES:
				getDomainObjectServices().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES:
				getDomainObjectRepositories().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__HOST_URL:
				setHostUrl(HOST_URL_EDEFAULT);
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
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_CONTROLLERS:
				return domainObjectControllers != null && !domainObjectControllers.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_SERVICES:
				return domainObjectServices != null && !domainObjectServices.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECT_REPOSITORIES:
				return domainObjectRepositories != null && !domainObjectRepositories.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__DOMAIN_OBJECTS:
				return domainObjects != null && !domainObjects.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_WEBSERVICE__HOST_URL:
				return HOST_URL_EDEFAULT == null ? hostUrl != null : !HOST_URL_EDEFAULT.equals(hostUrl);
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
		result.append(" (domainName: ");
		result.append(domainName);
		result.append(", hostUrl: ");
		result.append(hostUrl);
		result.append(')');
		return result.toString();
	}

} //DomainWebserviceImpl
