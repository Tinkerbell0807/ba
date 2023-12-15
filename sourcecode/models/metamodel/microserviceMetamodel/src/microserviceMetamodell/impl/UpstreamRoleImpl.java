/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.UpstreamRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Upstream Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.UpstreamRoleImpl#getRelatedContext <em>Related Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UpstreamRoleImpl extends MinimalEObjectImpl.Container implements UpstreamRole {
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
	protected UpstreamRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.UPSTREAM_ROLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.UPSTREAM_ROLE__RELATED_CONTEXT, oldRelatedContext, relatedContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.UPSTREAM_ROLE__RELATED_CONTEXT, oldRelatedContext, relatedContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.UPSTREAM_ROLE__RELATED_CONTEXT:
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
			case MicroserviceMetamodellPackage.UPSTREAM_ROLE__RELATED_CONTEXT:
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
			case MicroserviceMetamodellPackage.UPSTREAM_ROLE__RELATED_CONTEXT:
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
			case MicroserviceMetamodellPackage.UPSTREAM_ROLE__RELATED_CONTEXT:
				return relatedContext != null;
		}
		return super.eIsSet(featureID);
	}

} //UpstreamRoleImpl
