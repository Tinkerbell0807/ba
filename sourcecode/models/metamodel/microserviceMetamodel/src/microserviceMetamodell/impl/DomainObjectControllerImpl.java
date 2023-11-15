/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.DomainObjectController;
import microserviceMetamodell.DomainObjectService;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.RestEndpoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectControllerImpl#getRestEndpoints <em>Rest Endpoints</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectControllerImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainObjectControllerImpl#getDomainObjectServices <em>Domain Object Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainObjectControllerImpl extends MinimalEObjectImpl.Container implements DomainObjectController {
	/**
	 * The cached value of the '{@link #getRestEndpoints() <em>Rest Endpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<RestEndpoint> restEndpoints;

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
	 * The cached value of the '{@link #getDomainObjectServices() <em>Domain Object Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectService> domainObjectServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOMAIN_OBJECT_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestEndpoint> getRestEndpoints() {
		if (restEndpoints == null) {
			restEndpoints = new EObjectContainmentEList<RestEndpoint>(RestEndpoint.class, this, MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS);
		}
		return restEndpoints;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__OBJECT_NAME, oldObjectName, objectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectService> getDomainObjectServices() {
		if (domainObjectServices == null) {
			domainObjectServices = new EObjectResolvingEList<DomainObjectService>(DomainObjectService.class, this, MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__DOMAIN_OBJECT_SERVICES);
		}
		return domainObjectServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS:
				return ((InternalEList<?>)getRestEndpoints()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS:
				return getRestEndpoints();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__OBJECT_NAME:
				return getObjectName();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__DOMAIN_OBJECT_SERVICES:
				return getDomainObjectServices();
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
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS:
				getRestEndpoints().clear();
				getRestEndpoints().addAll((Collection<? extends RestEndpoint>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__OBJECT_NAME:
				setObjectName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__DOMAIN_OBJECT_SERVICES:
				getDomainObjectServices().clear();
				getDomainObjectServices().addAll((Collection<? extends DomainObjectService>)newValue);
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
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS:
				getRestEndpoints().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__OBJECT_NAME:
				setObjectName(OBJECT_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__DOMAIN_OBJECT_SERVICES:
				getDomainObjectServices().clear();
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
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__REST_ENDPOINTS:
				return restEndpoints != null && !restEndpoints.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__OBJECT_NAME:
				return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
			case MicroserviceMetamodellPackage.DOMAIN_OBJECT_CONTROLLER__DOMAIN_OBJECT_SERVICES:
				return domainObjectServices != null && !domainObjectServices.isEmpty();
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

} //DomainObjectControllerImpl
