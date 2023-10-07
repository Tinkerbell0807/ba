/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.ModuleImpl#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ModuleImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ModuleImpl#getSubmodules <em>Submodules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements microserviceMetamodell.Module {
	/**
	 * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelElements;

	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubmodules() <em>Submodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodules()
	 * @generated
	 * @ordered
	 */
	protected EList<microserviceMetamodell.Module> submodules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getModelElements() {
		if (modelElements == null) {
			modelElements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, MicroserviceMetamodellPackage.MODULE__MODEL_ELEMENTS);
		}
		return modelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MODULE__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<microserviceMetamodell.Module> getSubmodules() {
		if (submodules == null) {
			submodules = new EObjectContainmentEList<microserviceMetamodell.Module>(microserviceMetamodell.Module.class, this, MicroserviceMetamodellPackage.MODULE__SUBMODULES);
		}
		return submodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.MODULE__MODEL_ELEMENTS:
				return ((InternalEList<?>)getModelElements()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.MODULE__SUBMODULES:
				return ((InternalEList<?>)getSubmodules()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.MODULE__MODEL_ELEMENTS:
				return getModelElements();
			case MicroserviceMetamodellPackage.MODULE__MODULE_NAME:
				return getModuleName();
			case MicroserviceMetamodellPackage.MODULE__SUBMODULES:
				return getSubmodules();
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
			case MicroserviceMetamodellPackage.MODULE__MODEL_ELEMENTS:
				getModelElements().clear();
				getModelElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case MicroserviceMetamodellPackage.MODULE__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.MODULE__SUBMODULES:
				getSubmodules().clear();
				getSubmodules().addAll((Collection<? extends microserviceMetamodell.Module>)newValue);
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
			case MicroserviceMetamodellPackage.MODULE__MODEL_ELEMENTS:
				getModelElements().clear();
				return;
			case MicroserviceMetamodellPackage.MODULE__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.MODULE__SUBMODULES:
				getSubmodules().clear();
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
			case MicroserviceMetamodellPackage.MODULE__MODEL_ELEMENTS:
				return modelElements != null && !modelElements.isEmpty();
			case MicroserviceMetamodellPackage.MODULE__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case MicroserviceMetamodellPackage.MODULE__SUBMODULES:
				return submodules != null && !submodules.isEmpty();
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
		result.append(" (moduleName: ");
		result.append(moduleName);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
