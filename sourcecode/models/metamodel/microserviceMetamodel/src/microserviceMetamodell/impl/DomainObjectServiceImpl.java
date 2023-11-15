/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.DomainObjectRepository;
import microserviceMetamodell.DomainObjectService;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.RestEndpoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectServiceImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectServiceImpl#getDomainObjectRepositories <em>Domain Object Repositories</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectServiceImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainObjectServiceImpl extends MinimalEObjectImpl.Container implements DomainObjectService {
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
	 * The cached value of the '{@link #getDomainObjectRepositories() <em>Domain Object Repositories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectRepository> domainObjectRepositories;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<RestEndpoint> calls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOMAIN_OBJECT_SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__OBJECT_NAME, oldObjectName, objectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectRepository> getDomainObjectRepositories() {
		if (domainObjectRepositories == null) {
			domainObjectRepositories = new EObjectResolvingEList<DomainObjectRepository>(DomainObjectRepository.class, this, MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__DOMAIN_OBJECT_REPOSITORIES);
		}
		return domainObjectRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestEndpoint> getCalls() {
		if (calls == null) {
			calls = new EObjectResolvingEList<RestEndpoint>(RestEndpoint.class, this, MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__CALLS);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__OBJECT_NAME:
				return getObjectName();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__DOMAIN_OBJECT_REPOSITORIES:
				return getDomainObjectRepositories();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__CALLS:
				return getCalls();
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
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__OBJECT_NAME:
				setObjectName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__DOMAIN_OBJECT_REPOSITORIES:
				getDomainObjectRepositories().clear();
				getDomainObjectRepositories().addAll((Collection<? extends DomainObjectRepository>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends RestEndpoint>)newValue);
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
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__OBJECT_NAME:
				setObjectName(OBJECT_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__DOMAIN_OBJECT_REPOSITORIES:
				getDomainObjectRepositories().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__CALLS:
				getCalls().clear();
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
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__OBJECT_NAME:
				return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__DOMAIN_OBJECT_REPOSITORIES:
				return domainObjectRepositories != null && !domainObjectRepositories.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_SERVICE__CALLS:
				return calls != null && !calls.isEmpty();
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

} //DomainObjectServiceImpl
