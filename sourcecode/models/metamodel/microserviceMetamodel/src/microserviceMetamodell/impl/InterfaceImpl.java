/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.CustomerSupplier;
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
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.InterfaceImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InterfaceImpl#getReferencedElements <em>Referenced Elements</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InterfaceImpl#getReferencedRelationships <em>Referenced Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
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
	 * The cached value of the '{@link #getReferencedElements() <em>Referenced Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> referencedElements;

	/**
	 * The cached value of the '{@link #getReferencedRelationships() <em>Referenced Relationships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerSupplier> referencedRelationships;

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
	public EList<ModelElement> getReferencedElements() {
		if (referencedElements == null) {
			referencedElements = new EObjectWithInverseResolvingEList.ManyInverse<ModelElement>(ModelElement.class, this, MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS, MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES);
		}
		return referencedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerSupplier> getReferencedRelationships() {
		if (referencedRelationships == null) {
			referencedRelationships = new EObjectWithInverseResolvingEList.ManyInverse<CustomerSupplier>(CustomerSupplier.class, this, MicroserviceMetamodellPackage.INTERFACE__REFERENCED_RELATIONSHIPS, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__AFFECTED_INTERFACES);
		}
		return referencedRelationships;
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
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedElements()).basicAdd(otherEnd, msgs);
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedRelationships()).basicAdd(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS:
				return ((InternalEList<?>)getReferencedElements()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_RELATIONSHIPS:
				return ((InternalEList<?>)getReferencedRelationships()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME:
				return getInterfaceName();
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS:
				return getReferencedElements();
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_RELATIONSHIPS:
				return getReferencedRelationships();
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
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME:
				setInterfaceName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS:
				getReferencedElements().clear();
				getReferencedElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_RELATIONSHIPS:
				getReferencedRelationships().clear();
				getReferencedRelationships().addAll((Collection<? extends CustomerSupplier>)newValue);
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
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME:
				setInterfaceName(INTERFACE_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS:
				getReferencedElements().clear();
				return;
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_RELATIONSHIPS:
				getReferencedRelationships().clear();
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
			case MicroserviceMetamodellPackage.INTERFACE__INTERFACE_NAME:
				return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS:
				return referencedElements != null && !referencedElements.isEmpty();
			case MicroserviceMetamodellPackage.INTERFACE__REFERENCED_RELATIONSHIPS:
				return referencedRelationships != null && !referencedRelationships.isEmpty();
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
