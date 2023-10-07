/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.DomainEvent;
import microserviceMetamodell.DomainModel;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DomainEventImpl#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainEventImpl#getEventName <em>Event Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainEventImpl extends MinimalEObjectImpl.Container implements DomainEvent {
	/**
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domainModel;

	/**
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected String eventName = EVENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOMAIN_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getDomainModel() {
		if (domainModel != null && domainModel.eIsProxy()) {
			InternalEObject oldDomainModel = (InternalEObject)domainModel;
			domainModel = (DomainModel)eResolveProxy(oldDomainModel);
			if (domainModel != oldDomainModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL, oldDomainModel, domainModel));
			}
		}
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel basicGetDomainModel() {
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainModel(DomainModel newDomainModel, NotificationChain msgs) {
		DomainModel oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL, oldDomainModel, newDomainModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModel(DomainModel newDomainModel) {
		if (newDomainModel != domainModel) {
			NotificationChain msgs = null;
			if (domainModel != null)
				msgs = ((InternalEObject)domainModel).eInverseRemove(this, MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS, DomainModel.class, msgs);
			if (newDomainModel != null)
				msgs = ((InternalEObject)newDomainModel).eInverseAdd(this, MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS, DomainModel.class, msgs);
			msgs = basicSetDomainModel(newDomainModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL, newDomainModel, newDomainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(String newEventName) {
		String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_EVENT__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL:
				if (domainModel != null)
					msgs = ((InternalEObject)domainModel).eInverseRemove(this, MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS, DomainModel.class, msgs);
				return basicSetDomainModel((DomainModel)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL:
				return basicSetDomainModel(null, msgs);
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
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL:
				if (resolve) return getDomainModel();
				return basicGetDomainModel();
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__EVENT_NAME:
				return getEventName();
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
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL:
				setDomainModel((DomainModel)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__EVENT_NAME:
				setEventName((String)newValue);
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
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL:
				setDomainModel((DomainModel)null);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
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
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL:
				return domainModel != null;
			case MicroserviceMetamodellPackage.DOMAIN_EVENT__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
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
		result.append(" (eventName: ");
		result.append(eventName);
		result.append(')');
		return result.toString();
	}

} //DomainEventImpl
