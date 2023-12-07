/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.AsynchronousInterface;
import microserviceMetamodell.AsynchronousInterfaceRole;
import microserviceMetamodell.DomainEvent;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.TopologyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.AsynchronousInterfaceImpl#getInterfaceRole <em>Interface Role</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.AsynchronousInterfaceImpl#getTopologyType <em>Topology Type</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.AsynchronousInterfaceImpl#getDomainEvent <em>Domain Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousInterfaceImpl extends InterfaceImpl implements AsynchronousInterface {
	/**
	 * The default value of the '{@link #getInterfaceRole() <em>Interface Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRole()
	 * @generated
	 * @ordered
	 */
	protected static final AsynchronousInterfaceRole INTERFACE_ROLE_EDEFAULT = AsynchronousInterfaceRole.PRODUCER;

	/**
	 * The cached value of the '{@link #getInterfaceRole() <em>Interface Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRole()
	 * @generated
	 * @ordered
	 */
	protected AsynchronousInterfaceRole interfaceRole = INTERFACE_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopologyType() <em>Topology Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyType()
	 * @generated
	 * @ordered
	 */
	protected static final TopologyType TOPOLOGY_TYPE_EDEFAULT = TopologyType.BROKER;

	/**
	 * The cached value of the '{@link #getTopologyType() <em>Topology Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyType()
	 * @generated
	 * @ordered
	 */
	protected TopologyType topologyType = TOPOLOGY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainEvent() <em>Domain Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainEvent()
	 * @generated
	 * @ordered
	 */
	protected DomainEvent domainEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsynchronousInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.ASYNCHRONOUS_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousInterfaceRole getInterfaceRole() {
		return interfaceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceRole(AsynchronousInterfaceRole newInterfaceRole) {
		AsynchronousInterfaceRole oldInterfaceRole = interfaceRole;
		interfaceRole = newInterfaceRole == null ? INTERFACE_ROLE_EDEFAULT : newInterfaceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE, oldInterfaceRole, interfaceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyType getTopologyType() {
		return topologyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyType(TopologyType newTopologyType) {
		TopologyType oldTopologyType = topologyType;
		topologyType = newTopologyType == null ? TOPOLOGY_TYPE_EDEFAULT : newTopologyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPOLOGY_TYPE, oldTopologyType, topologyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainEvent getDomainEvent() {
		if (domainEvent != null && domainEvent.eIsProxy()) {
			InternalEObject oldDomainEvent = (InternalEObject)domainEvent;
			domainEvent = (DomainEvent)eResolveProxy(oldDomainEvent);
			if (domainEvent != oldDomainEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENT, oldDomainEvent, domainEvent));
			}
		}
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainEvent basicGetDomainEvent() {
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainEvent(DomainEvent newDomainEvent) {
		DomainEvent oldDomainEvent = domainEvent;
		domainEvent = newDomainEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENT, oldDomainEvent, domainEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE:
				return getInterfaceRole();
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPOLOGY_TYPE:
				return getTopologyType();
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENT:
				if (resolve) return getDomainEvent();
				return basicGetDomainEvent();
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
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE:
				setInterfaceRole((AsynchronousInterfaceRole)newValue);
				return;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPOLOGY_TYPE:
				setTopologyType((TopologyType)newValue);
				return;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENT:
				setDomainEvent((DomainEvent)newValue);
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
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE:
				setInterfaceRole(INTERFACE_ROLE_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPOLOGY_TYPE:
				setTopologyType(TOPOLOGY_TYPE_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENT:
				setDomainEvent((DomainEvent)null);
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
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE:
				return interfaceRole != INTERFACE_ROLE_EDEFAULT;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPOLOGY_TYPE:
				return topologyType != TOPOLOGY_TYPE_EDEFAULT;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENT:
				return domainEvent != null;
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
		result.append(" (interfaceRole: ");
		result.append(interfaceRole);
		result.append(", topologyType: ");
		result.append(topologyType);
		result.append(')');
		return result.toString();
	}

} //AsynchronousInterfaceImpl
