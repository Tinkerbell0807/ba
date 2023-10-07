/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.UpstreamComponent;
import microserviceMetamodell.UpstreamRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Upstream Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.UpstreamComponentImpl#getRelatedContext <em>Related Context</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.UpstreamComponentImpl#getUpstreamRole <em>Upstream Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpstreamComponentImpl extends MinimalEObjectImpl.Container implements UpstreamComponent {
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
	 * The default value of the '{@link #getUpstreamRole() <em>Upstream Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamRole()
	 * @generated
	 * @ordered
	 */
	protected static final UpstreamRole UPSTREAM_ROLE_EDEFAULT = UpstreamRole.OPENHOST;

	/**
	 * The cached value of the '{@link #getUpstreamRole() <em>Upstream Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamRole()
	 * @generated
	 * @ordered
	 */
	protected UpstreamRole upstreamRole = UPSTREAM_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpstreamComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.UPSTREAM_COMPONENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__RELATED_CONTEXT, oldRelatedContext, relatedContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__RELATED_CONTEXT, oldRelatedContext, relatedContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpstreamRole getUpstreamRole() {
		return upstreamRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpstreamRole(UpstreamRole newUpstreamRole) {
		UpstreamRole oldUpstreamRole = upstreamRole;
		upstreamRole = newUpstreamRole == null ? UPSTREAM_ROLE_EDEFAULT : newUpstreamRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__UPSTREAM_ROLE, oldUpstreamRole, upstreamRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__RELATED_CONTEXT:
				if (resolve) return getRelatedContext();
				return basicGetRelatedContext();
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__UPSTREAM_ROLE:
				return getUpstreamRole();
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
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__RELATED_CONTEXT:
				setRelatedContext((BoundedContext)newValue);
				return;
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__UPSTREAM_ROLE:
				setUpstreamRole((UpstreamRole)newValue);
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
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__RELATED_CONTEXT:
				setRelatedContext((BoundedContext)null);
				return;
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__UPSTREAM_ROLE:
				setUpstreamRole(UPSTREAM_ROLE_EDEFAULT);
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
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__RELATED_CONTEXT:
				return relatedContext != null;
			case MicroserviceMetamodellPackage.UPSTREAM_COMPONENT__UPSTREAM_ROLE:
				return upstreamRole != UPSTREAM_ROLE_EDEFAULT;
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
		result.append(" (upstreamRole: ");
		result.append(upstreamRole);
		result.append(')');
		return result.toString();
	}

} //UpstreamComponentImpl
