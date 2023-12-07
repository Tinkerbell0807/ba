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
 * An implementation of the model object '<em><b>Model Element Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.ModelElementImplementationImpl#getCorrespondingModelElement <em>Corresponding Model Element</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ModelElementImplementationImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelElementImplementationImpl extends MinimalEObjectImpl.Container implements ModelElementImplementation {
	/**
	 * The cached value of the '{@link #getCorrespondingModelElement() <em>Corresponding Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingModelElement()
	 * @generated
	 * @ordered
	 */
	protected ModelElement correspondingModelElement;
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.MODEL_ELEMENT_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getCorrespondingModelElement() {
		if (correspondingModelElement != null && correspondingModelElement.eIsProxy()) {
			InternalEObject oldCorrespondingModelElement = (InternalEObject)correspondingModelElement;
			correspondingModelElement = (ModelElement)eResolveProxy(oldCorrespondingModelElement);
			if (correspondingModelElement != oldCorrespondingModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT, oldCorrespondingModelElement, correspondingModelElement));
			}
		}
		return correspondingModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetCorrespondingModelElement() {
		return correspondingModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondingModelElement(ModelElement newCorrespondingModelElement, NotificationChain msgs) {
		ModelElement oldCorrespondingModelElement = correspondingModelElement;
		correspondingModelElement = newCorrespondingModelElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT, oldCorrespondingModelElement, newCorrespondingModelElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingModelElement(ModelElement newCorrespondingModelElement) {
		if (newCorrespondingModelElement != correspondingModelElement) {
			NotificationChain msgs = null;
			if (correspondingModelElement != null)
				msgs = ((InternalEObject)correspondingModelElement).eInverseRemove(this, MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH, ModelElement.class, msgs);
			if (newCorrespondingModelElement != null)
				msgs = ((InternalEObject)newCorrespondingModelElement).eInverseAdd(this, MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH, ModelElement.class, msgs);
			msgs = basicSetCorrespondingModelElement(newCorrespondingModelElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT, newCorrespondingModelElement, newCorrespondingModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT:
				if (correspondingModelElement != null)
					msgs = ((InternalEObject)correspondingModelElement).eInverseRemove(this, MicroserviceMetamodellPackage.MODEL_ELEMENT__IS_IMPLEMENTED_TROUGH, ModelElement.class, msgs);
				return basicSetCorrespondingModelElement((ModelElement)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT:
				return basicSetCorrespondingModelElement(null, msgs);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT:
				if (resolve) return getCorrespondingModelElement();
				return basicGetCorrespondingModelElement();
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CLASS_NAME:
				return getClassName();
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT:
				setCorrespondingModelElement((ModelElement)newValue);
				return;
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CLASS_NAME:
				setClassName((String)newValue);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT:
				setCorrespondingModelElement((ModelElement)null);
				return;
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
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
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CORRESPONDING_MODEL_ELEMENT:
				return correspondingModelElement != null;
			case MicroserviceMetamodellPackage.MODEL_ELEMENT_IMPLEMENTATION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
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
		result.append(" (className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //ModelElementImplementationImpl
