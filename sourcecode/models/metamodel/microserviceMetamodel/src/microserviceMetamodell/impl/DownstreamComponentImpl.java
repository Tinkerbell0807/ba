/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.DownstreamComponent;
import microserviceMetamodell.DownstreamRole;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Downstream Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DownstreamComponentImpl#getRelatedContext <em>Related Context</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DownstreamComponentImpl#getDownstreamRole <em>Downstream Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DownstreamComponentImpl extends MinimalEObjectImpl.Container implements DownstreamComponent {
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
	 * The default value of the '{@link #getDownstreamRole() <em>Downstream Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamRole()
	 * @generated
	 * @ordered
	 */
	protected static final DownstreamRole DOWNSTREAM_ROLE_EDEFAULT = DownstreamRole.ACL;

	/**
	 * The cached value of the '{@link #getDownstreamRole() <em>Downstream Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamRole()
	 * @generated
	 * @ordered
	 */
	protected DownstreamRole downstreamRole = DOWNSTREAM_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DownstreamComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOWNSTREAM_COMPONENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__RELATED_CONTEXT, oldRelatedContext, relatedContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__RELATED_CONTEXT, oldRelatedContext, relatedContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DownstreamRole getDownstreamRole() {
		return downstreamRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownstreamRole(DownstreamRole newDownstreamRole) {
		DownstreamRole oldDownstreamRole = downstreamRole;
		downstreamRole = newDownstreamRole == null ? DOWNSTREAM_ROLE_EDEFAULT : newDownstreamRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__DOWNSTREAM_ROLE, oldDownstreamRole, downstreamRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__RELATED_CONTEXT:
				if (resolve) return getRelatedContext();
				return basicGetRelatedContext();
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__DOWNSTREAM_ROLE:
				return getDownstreamRole();
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
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__RELATED_CONTEXT:
				setRelatedContext((BoundedContext)newValue);
				return;
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__DOWNSTREAM_ROLE:
				setDownstreamRole((DownstreamRole)newValue);
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
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__RELATED_CONTEXT:
				setRelatedContext((BoundedContext)null);
				return;
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__DOWNSTREAM_ROLE:
				setDownstreamRole(DOWNSTREAM_ROLE_EDEFAULT);
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
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__RELATED_CONTEXT:
				return relatedContext != null;
			case MicroserviceMetamodellPackage.DOWNSTREAM_COMPONENT__DOWNSTREAM_ROLE:
				return downstreamRole != DOWNSTREAM_ROLE_EDEFAULT;
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
		result.append(" (downstreamRole: ");
		result.append(downstreamRole);
		result.append(')');
		return result.toString();
	}

} //DownstreamComponentImpl
