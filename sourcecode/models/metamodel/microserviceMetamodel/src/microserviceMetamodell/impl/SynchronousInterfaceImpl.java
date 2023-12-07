/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.RestEndpoint;
import microserviceMetamodell.SynchronousInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.SynchronousInterfaceImpl#getRestEndpoints <em>Rest Endpoints</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.SynchronousInterfaceImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousInterfaceImpl extends InterfaceImpl implements SynchronousInterface {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronousInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.SYNCHRONOUS_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestEndpoint> getRestEndpoints() {
		if (restEndpoints == null) {
			restEndpoints = new EObjectContainmentEList<RestEndpoint>(RestEndpoint.class, this, MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__REST_ENDPOINTS);
		}
		return restEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__REST_ENDPOINTS:
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
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__REST_ENDPOINTS:
				return getRestEndpoints();
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__VERSION:
				return getVersion();
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
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__REST_ENDPOINTS:
				getRestEndpoints().clear();
				getRestEndpoints().addAll((Collection<? extends RestEndpoint>)newValue);
				return;
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__VERSION:
				setVersion((String)newValue);
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
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__REST_ENDPOINTS:
				getRestEndpoints().clear();
				return;
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__REST_ENDPOINTS:
				return restEndpoints != null && !restEndpoints.isEmpty();
			case MicroserviceMetamodellPackage.SYNCHRONOUS_INTERFACE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //SynchronousInterfaceImpl
