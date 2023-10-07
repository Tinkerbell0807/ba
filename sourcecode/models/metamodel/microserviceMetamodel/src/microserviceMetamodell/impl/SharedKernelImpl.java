/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.ExternalDependency;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.SharedKernel;
import microserviceMetamodell.SharedModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Kernel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.SharedKernelImpl#getRelatedContexts <em>Related Contexts</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.SharedKernelImpl#getImplementingLib <em>Implementing Lib</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.SharedKernelImpl#getSharedModules <em>Shared Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedKernelImpl extends BoundedContextRelationshipImpl implements SharedKernel {
	/**
	 * The cached value of the '{@link #getRelatedContexts() <em>Related Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundedContext> relatedContexts;

	/**
	 * The cached value of the '{@link #getImplementingLib() <em>Implementing Lib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingLib()
	 * @generated
	 * @ordered
	 */
	protected ExternalDependency implementingLib;

	/**
	 * The cached value of the '{@link #getSharedModules() <em>Shared Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedModules()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedModule> sharedModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedKernelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.SHARED_KERNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundedContext> getRelatedContexts() {
		if (relatedContexts == null) {
			relatedContexts = new EObjectResolvingEList<BoundedContext>(BoundedContext.class, this, MicroserviceMetamodellPackage.SHARED_KERNEL__RELATED_CONTEXTS);
		}
		return relatedContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDependency getImplementingLib() {
		if (implementingLib != null && implementingLib.eIsProxy()) {
			InternalEObject oldImplementingLib = (InternalEObject)implementingLib;
			implementingLib = (ExternalDependency)eResolveProxy(oldImplementingLib);
			if (implementingLib != oldImplementingLib) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, oldImplementingLib, implementingLib));
			}
		}
		return implementingLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDependency basicGetImplementingLib() {
		return implementingLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementingLib(ExternalDependency newImplementingLib, NotificationChain msgs) {
		ExternalDependency oldImplementingLib = implementingLib;
		implementingLib = newImplementingLib;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, oldImplementingLib, newImplementingLib);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementingLib(ExternalDependency newImplementingLib) {
		if (newImplementingLib != implementingLib) {
			NotificationChain msgs = null;
			if (implementingLib != null)
				msgs = ((InternalEObject)implementingLib).eInverseRemove(this, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, ExternalDependency.class, msgs);
			if (newImplementingLib != null)
				msgs = ((InternalEObject)newImplementingLib).eInverseAdd(this, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, ExternalDependency.class, msgs);
			msgs = basicSetImplementingLib(newImplementingLib, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, newImplementingLib, newImplementingLib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedModule> getSharedModules() {
		if (sharedModules == null) {
			sharedModules = new EObjectContainmentEList<SharedModule>(SharedModule.class, this, MicroserviceMetamodellPackage.SHARED_KERNEL__SHARED_MODULES);
		}
		return sharedModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB:
				if (implementingLib != null)
					msgs = ((InternalEObject)implementingLib).eInverseRemove(this, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, ExternalDependency.class, msgs);
				return basicSetImplementingLib((ExternalDependency)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB:
				return basicSetImplementingLib(null, msgs);
			case MicroserviceMetamodellPackage.SHARED_KERNEL__SHARED_MODULES:
				return ((InternalEList<?>)getSharedModules()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.SHARED_KERNEL__RELATED_CONTEXTS:
				return getRelatedContexts();
			case MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB:
				if (resolve) return getImplementingLib();
				return basicGetImplementingLib();
			case MicroserviceMetamodellPackage.SHARED_KERNEL__SHARED_MODULES:
				return getSharedModules();
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
			case MicroserviceMetamodellPackage.SHARED_KERNEL__RELATED_CONTEXTS:
				getRelatedContexts().clear();
				getRelatedContexts().addAll((Collection<? extends BoundedContext>)newValue);
				return;
			case MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB:
				setImplementingLib((ExternalDependency)newValue);
				return;
			case MicroserviceMetamodellPackage.SHARED_KERNEL__SHARED_MODULES:
				getSharedModules().clear();
				getSharedModules().addAll((Collection<? extends SharedModule>)newValue);
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
			case MicroserviceMetamodellPackage.SHARED_KERNEL__RELATED_CONTEXTS:
				getRelatedContexts().clear();
				return;
			case MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB:
				setImplementingLib((ExternalDependency)null);
				return;
			case MicroserviceMetamodellPackage.SHARED_KERNEL__SHARED_MODULES:
				getSharedModules().clear();
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
			case MicroserviceMetamodellPackage.SHARED_KERNEL__RELATED_CONTEXTS:
				return relatedContexts != null && !relatedContexts.isEmpty();
			case MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB:
				return implementingLib != null;
			case MicroserviceMetamodellPackage.SHARED_KERNEL__SHARED_MODULES:
				return sharedModules != null && !sharedModules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SharedKernelImpl
