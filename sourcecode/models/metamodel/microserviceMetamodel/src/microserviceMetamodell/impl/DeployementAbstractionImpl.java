/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.DeployementAbstraction;
import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployement Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DeployementAbstractionImpl#getMicroservice <em>Microservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployementAbstractionImpl extends MinimalEObjectImpl.Container implements DeployementAbstraction {
	/**
	 * The cached value of the '{@link #getMicroservice() <em>Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservice()
	 * @generated
	 * @ordered
	 */
	protected Microservice microservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployementAbstractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DEPLOYEMENT_ABSTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice getMicroservice() {
		if (microservice != null && microservice.eIsProxy()) {
			InternalEObject oldMicroservice = (InternalEObject)microservice;
			microservice = (Microservice)eResolveProxy(oldMicroservice);
			if (microservice != oldMicroservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE, oldMicroservice, microservice));
			}
		}
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice basicGetMicroservice() {
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicroservice(Microservice newMicroservice, NotificationChain msgs) {
		Microservice oldMicroservice = microservice;
		microservice = newMicroservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE, oldMicroservice, newMicroservice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicroservice(Microservice newMicroservice) {
		if (newMicroservice != microservice) {
			NotificationChain msgs = null;
			if (microservice != null)
				msgs = ((InternalEObject)microservice).eInverseRemove(this, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION, Microservice.class, msgs);
			if (newMicroservice != null)
				msgs = ((InternalEObject)newMicroservice).eInverseAdd(this, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION, Microservice.class, msgs);
			msgs = basicSetMicroservice(newMicroservice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE, newMicroservice, newMicroservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE:
				if (microservice != null)
					msgs = ((InternalEObject)microservice).eInverseRemove(this, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION, Microservice.class, msgs);
				return basicSetMicroservice((Microservice)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE:
				return basicSetMicroservice(null, msgs);
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
			case MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE:
				if (resolve) return getMicroservice();
				return basicGetMicroservice();
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
			case MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE:
				setMicroservice((Microservice)newValue);
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
			case MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE:
				setMicroservice((Microservice)null);
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
			case MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE:
				return microservice != null;
		}
		return super.eIsSet(featureID);
	}

} //DeployementAbstractionImpl
