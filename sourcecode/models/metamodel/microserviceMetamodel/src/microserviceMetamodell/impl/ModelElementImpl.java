/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElement;
import microserviceMetamodell.ModelElementImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.ModelElementImpl#getIsImplementedTrough <em>Is Implemented Trough</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ModelElementImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	/**
	 * The cached value of the '{@link #getIsImplementedTrough() <em>Is Implemented Trough</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImplementedTrough()
	 * @generated
	 * @ordered
	 */
	protected ModelElementImplementation isImplementedTrough;

	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementImplementation getIsImplementedTrough() {
		if (isImplementedTrough != null && isImplementedTrough.eIsProxy()) {
			InternalEObject oldIsImplementedTrough = (InternalEObject)isImplementedTrough;
			isImplementedTrough = (ModelElementImplementation)eResolveProxy(oldIsImplementedTrough);
			if (isImplementedTrough != oldIsImplementedTrough) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH, oldIsImplementedTrough, isImplementedTrough));
			}
		}
		return isImplementedTrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementImplementation basicGetIsImplementedTrough() {
		return isImplementedTrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsImplementedTrough(ModelElementImplementation newIsImplementedTrough, NotificationChain msgs) {
		ModelElementImplementation oldIsImplementedTrough = isImplementedTrough;
		isImplementedTrough = newIsImplementedTrough;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH, oldIsImplementedTrough, newIsImplementedTrough);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImplementedTrough(ModelElementImplementation newIsImplementedTrough) {
		if (newIsImplementedTrough != isImplementedTrough) {
			NotificationChain msgs = null;
			if (isImplementedTrough != null)
				msgs = ((InternalEObject)isImplementedTrough).eInverseRemove(this, MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT, ModelElementImplementation.class, msgs);
			if (newIsImplementedTrough != null)
				msgs = ((InternalEObject)newIsImplementedTrough).eInverseAdd(this, MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT, ModelElementImplementation.class, msgs);
			msgs = basicSetIsImplementedTrough(newIsImplementedTrough, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH, newIsImplementedTrough, newIsImplementedTrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH:
				if (isImplementedTrough != null)
					msgs = ((InternalEObject)isImplementedTrough).eInverseRemove(this, MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT, ModelElementImplementation.class, msgs);
				return basicSetIsImplementedTrough((ModelElementImplementation)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH:
				return basicSetIsImplementedTrough(null, msgs);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH:
				if (resolve) return getIsImplementedTrough();
				return basicGetIsImplementedTrough();
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME:
				return getElementName();
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH:
				setIsImplementedTrough((ModelElementImplementation)newValue);
				return;
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME:
				setElementName((String)newValue);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH:
				setIsImplementedTrough((ModelElementImplementation)null);
				return;
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH:
				return isImplementedTrough != null;
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
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
		result.append(" (elementName: ");
		result.append(elementName);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl
