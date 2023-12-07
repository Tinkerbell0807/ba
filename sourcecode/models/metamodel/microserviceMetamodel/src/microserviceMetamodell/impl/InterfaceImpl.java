/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;
import microserviceMetamodell.BoundedContextRelationship;
import microserviceMetamodell.Interface;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElementImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.InterfaceImpl#getInterfaceFor <em>Interface For</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InterfaceImpl#getBoundedContextRelationship <em>Bounded Context Relationship</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InterfaceImpl#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
	/**
	 * The cached value of the '{@link #getInterfaceFor() <em>Interface For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceFor()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElementImplementation> interfaceFor;

	/**
	 * The cached value of the '{@link #getBoundedContextRelationship() <em>Bounded Context Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedContextRelationship()
	 * @generated
	 * @ordered
	 */
	protected BoundedContextRelationship boundedContextRelationship;

	/**
	 * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String interfaceName = INTERFACE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElementImplementation> getInterfaceFor() {
		if (interfaceFor == null) {
			interfaceFor = new EObjectResolvingEList<ModelElementImplementation>(ModelElementImplementation.class, this, MicroserviceMetamodellPackage.INTERFACE__INTERFACE_FOR);
		}
		return interfaceFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContextRelationship getBoundedContextRelationship() {
		if (boundedContextRelationship != null && boundedContextRelationship.eIsProxy()) {
			InternalEObject oldBoundedContextRelationship = (InternalEObject)boundedContextRelationship;
			boundedContextRelationship = (BoundedContextRelationship)eResolveProxy(oldBoundedContextRelationship);
			if (boundedContextRelationship != oldBoundedContextRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP, oldBoundedContextRelationship, boundedContextRelationship));
			}
		}
		return boundedContextRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContextRelationship basicGetBoundedContextRelationship() {
		return boundedContextRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundedContextRelationship(BoundedContextRelationship newBoundedContextRelationship, NotificationChain msgs) {
		BoundedContextRelationship oldBoundedContextRelationship = boundedContextRelationship;
		boundedContextRelationship = newBoundedContextRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP, oldBoundedContextRelationship, newBoundedContextRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundedContextRelationship(BoundedContextRelationship newBoundedContextRelationship) {
		if (newBoundedContextRelationship != boundedContextRelationship) {
			NotificationChain msgs = null;
			if (boundedContextRelationship != null)
				msgs = ((InternalEObject)boundedContextRelationship).eInverseRemove(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE, BoundedContextRelationship.class, msgs);
			if (newBoundedContextRelationship != null)
				msgs = ((InternalEObject)newBoundedContextRelationship).eInverseAdd(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE, BoundedContextRelationship.class, msgs);
			msgs = basicSetBoundedContextRelationship(newBoundedContextRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP, newBoundedContextRelationship, newBoundedContextRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceName() {
		return interfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceName(String newInterfaceName) {
		String oldInterfaceName = interfaceName;
		interfaceName = newInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME, oldInterfaceName, interfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP:
				if (boundedContextRelationship != null)
					msgs = ((InternalEObject)boundedContextRelationship).eInverseRemove(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__INTERFACE, BoundedContextRelationship.class, msgs);
				return basicSetBoundedContextRelationship((BoundedContextRelationship)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP:
				return basicSetBoundedContextRelationship(null, msgs);
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
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_FOR:
				return getInterfaceFor();
			case MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP:
				if (resolve) return getBoundedContextRelationship();
				return basicGetBoundedContextRelationship();
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME:
				return getInterfaceName();
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
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_FOR:
				getInterfaceFor().clear();
				getInterfaceFor().addAll((Collection<? extends ModelElementImplementation>)newValue);
				return;
			case MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP:
				setBoundedContextRelationship((BoundedContextRelationship)newValue);
				return;
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME:
				setInterfaceName((String)newValue);
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
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_FOR:
				getInterfaceFor().clear();
				return;
			case MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP:
				setBoundedContextRelationship((BoundedContextRelationship)null);
				return;
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME:
				setInterfaceName(INTERFACE_NAME_EDEFAULT);
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
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_FOR:
				return interfaceFor != null && !interfaceFor.isEmpty();
			case MicroserviceMetamodellPackage.INTERFACE__BOUNDED_CONTEXT_RELATIONSHIP:
				return boundedContextRelationship != null;
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME:
				return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
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
		result.append(" (interfaceName: ");
		result.append(interfaceName);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
