/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.Broker;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.BrokerImpl#getBrokerAddress <em>Broker Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrokerImpl extends MinimalEObjectImpl.Container implements Broker {
	/**
	 * The default value of the '{@link #getBrokerAddress() <em>Broker Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BROKER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrokerAddress() <em>Broker Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerAddress()
	 * @generated
	 * @ordered
	 */
	protected String brokerAddress = BROKER_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrokerAddress() {
		return brokerAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerAddress(String newBrokerAddress) {
		String oldBrokerAddress = brokerAddress;
		brokerAddress = newBrokerAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BROKER__BROKER_ADDRESS, oldBrokerAddress, brokerAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.BROKER__BROKER_ADDRESS:
				return getBrokerAddress();
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
			case MicroserviceMetamodellPackage.BROKER__BROKER_ADDRESS:
				setBrokerAddress((String)newValue);
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
			case MicroserviceMetamodellPackage.BROKER__BROKER_ADDRESS:
				setBrokerAddress(BROKER_ADDRESS_EDEFAULT);
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
			case MicroserviceMetamodellPackage.BROKER__BROKER_ADDRESS:
				return BROKER_ADDRESS_EDEFAULT == null ? brokerAddress != null : !BROKER_ADDRESS_EDEFAULT.equals(brokerAddress);
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
		result.append(" (brokerAddress: ");
		result.append(brokerAddress);
		result.append(')');
		return result.toString();
	}

} //BrokerImpl
