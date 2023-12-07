/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.BoundedContextRelationship;
import microserviceMetamodell.Interface;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounded Context Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.BoundedContextRelationshipImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.BoundedContextRelationshipImpl#getRelatedContext <em>Related Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BoundedContextRelationshipImpl extends MinimalEObjectImpl.Container implements BoundedContextRelationship {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

	/**
	 * The cached value of the '{@link #getRelatedContext() <em>Related Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedContext()
	 * @generated
	 * @ordered
	 */
	protected BoundedContext relatedContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedContextRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.BOUNDED_CONTEXT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (Interface)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP, Interface.class, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP, Interface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext getRelatedContext() {
		if (relatedContext != null && relatedContext.eIsProxy()) {
			InternalEObject oldRelatedContext = (InternalEObject)relatedContext;
			relatedContext = (BoundedContext)eResolveProxy(oldRelatedContext);
			if (relatedContext != oldRelatedContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT, oldRelatedContext, relatedContext));
			}
		}
		return relatedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext basicGetRelatedContext() {
		return relatedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedContext(BoundedContext newRelatedContext) {
		BoundedContext oldRelatedContext = relatedContext;
		relatedContext = newRelatedContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT, oldRelatedContext, relatedContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE:
				if (interface_ != null)
					msgs = ((InternalEObject)interface_).eInverseRemove(this, MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP, Interface.class, msgs);
				return basicSetInterface((Interface)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE:
				return basicSetInterface(null, msgs);
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT:
				if (resolve) return getRelatedContext();
				return basicGetRelatedContext();
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT:
				setRelatedContext((BoundedContext)newValue);
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE:
				setInterface((Interface)null);
				return;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT:
				setRelatedContext((BoundedContext)null);
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE:
				return interface_ != null;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATED_CONTEXT:
				return relatedContext != null;
		}
		return super.eIsSet(featureID);
	}

} //BoundedContextRelationshipImpl
