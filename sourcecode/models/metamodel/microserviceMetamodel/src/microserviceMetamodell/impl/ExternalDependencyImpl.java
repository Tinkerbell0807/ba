/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.ExternalDependency;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import microserviceMetamodell.SharedKernel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.ExternalDependencyImpl#getSharedKernel <em>Shared Kernel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalDependencyImpl extends MinimalEObjectImpl.Container implements ExternalDependency {
	/**
	 * The cached value of the '{@link #getSharedKernel() <em>Shared Kernel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedKernel()
	 * @generated
	 * @ordered
	 */
	protected SharedKernel sharedKernel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.EXTERNAL_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedKernel getSharedKernel() {
		if (sharedKernel != null && sharedKernel.eIsProxy()) {
			InternalEObject oldSharedKernel = (InternalEObject)sharedKernel;
			sharedKernel = (SharedKernel)eResolveProxy(oldSharedKernel);
			if (sharedKernel != oldSharedKernel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, oldSharedKernel, sharedKernel));
			}
		}
		return sharedKernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedKernel basicGetSharedKernel() {
		return sharedKernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedKernel(SharedKernel newSharedKernel, NotificationChain msgs) {
		SharedKernel oldSharedKernel = sharedKernel;
		sharedKernel = newSharedKernel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, oldSharedKernel, newSharedKernel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedKernel(SharedKernel newSharedKernel) {
		if (newSharedKernel != sharedKernel) {
			NotificationChain msgs = null;
			if (sharedKernel != null)
				msgs = ((InternalEObject)sharedKernel).eInverseRemove(this, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, SharedKernel.class, msgs);
			if (newSharedKernel != null)
				msgs = ((InternalEObject)newSharedKernel).eInverseAdd(this, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, SharedKernel.class, msgs);
			msgs = basicSetSharedKernel(newSharedKernel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, newSharedKernel, newSharedKernel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				if (sharedKernel != null)
					msgs = ((InternalEObject)sharedKernel).eInverseRemove(this, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, SharedKernel.class, msgs);
				return basicSetSharedKernel((SharedKernel)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				return basicSetSharedKernel(null, msgs);
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				if (resolve) return getSharedKernel();
				return basicGetSharedKernel();
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				setSharedKernel((SharedKernel)newValue);
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				setSharedKernel((SharedKernel)null);
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				return sharedKernel != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalDependencyImpl
