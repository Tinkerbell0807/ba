/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.Interface;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.ModelElementImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ModelElementImpl#getReferencedInterfaces <em>Referenced Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
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
	 * The cached value of the '{@link #getReferencedInterfaces() <em>Referenced Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> referencedInterfaces;

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
	public EList<Interface> getReferencedInterfaces() {
		if (referencedInterfaces == null) {
			referencedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES, MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS);
		}
		return referencedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedInterfaces()).basicAdd(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES:
				return ((InternalEList<?>)getReferencedInterfaces()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME:
				return getElementName();
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES:
				return getReferencedInterfaces();
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES:
				getReferencedInterfaces().clear();
				getReferencedInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES:
				getReferencedInterfaces().clear();
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES:
				return referencedInterfaces != null && !referencedInterfaces.isEmpty();
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
