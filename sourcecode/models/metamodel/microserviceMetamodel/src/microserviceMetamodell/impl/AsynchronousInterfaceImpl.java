/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.AsynchronousInterface;
import microserviceMetamodell.AsynchronousInterfaceRole;
import microserviceMetamodell.DomainEvent;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.Topic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.AsynchronousInterfaceImpl#getInterfaceRole <em>Interface Role</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.AsynchronousInterfaceImpl#getDomainEvents <em>Domain Events</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.AsynchronousInterfaceImpl#getTopic <em>Topic</em>}</li>
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
	 * The cached value of the '{@link #getDomainEvents() <em>Domain Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainEvent> domainEvents;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Topic topic;

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
	public EList<DomainEvent> getDomainEvents() {
		if (domainEvents == null) {
			domainEvents = new EObjectResolvingEList<DomainEvent>(DomainEvent.class, this, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENTS);
		}
		return domainEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic() {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject)topic;
			topic = (Topic)eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC, oldTopic, topic));
			}
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(Topic newTopic, NotificationChain msgs) {
		Topic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC, oldTopic, newTopic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(Topic newTopic) {
		if (newTopic != topic) {
			NotificationChain msgs = null;
			if (topic != null)
				msgs = ((InternalEObject)topic).eInverseRemove(this, MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES, Topic.class, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject)newTopic).eInverseAdd(this, MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES, Topic.class, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC, newTopic, newTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC:
				if (topic != null)
					msgs = ((InternalEObject)topic).eInverseRemove(this, MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES, Topic.class, msgs);
				return basicSetTopic((Topic)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC:
				return basicSetTopic(null, msgs);
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
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE:
				return getInterfaceRole();
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENTS:
				return getDomainEvents();
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC:
				if (resolve) return getTopic();
				return basicGetTopic();
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
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__INTERFACE_ROLE:
				setInterfaceRole((AsynchronousInterfaceRole)newValue);
				return;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENTS:
				getDomainEvents().clear();
				getDomainEvents().addAll((Collection<? extends DomainEvent>)newValue);
				return;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC:
				setTopic((Topic)newValue);
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
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENTS:
				getDomainEvents().clear();
				return;
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC:
				setTopic((Topic)null);
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
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__DOMAIN_EVENTS:
				return domainEvents != null && !domainEvents.isEmpty();
			case MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC:
				return topic != null;
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
		result.append(')');
		return result.toString();
	}

} //AsynchronousInterfaceImpl
