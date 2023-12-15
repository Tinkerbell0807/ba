/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;
import microserviceMetamodell.CustomerSupplier;
import microserviceMetamodell.DownstreamRole;
import microserviceMetamodell.Interface;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import microserviceMetamodell.UpstreamRole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.CustomerSupplierImpl#getDownstreamRole <em>Downstream Role</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.CustomerSupplierImpl#getUpstreamRole <em>Upstream Role</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.CustomerSupplierImpl#getReferencedInterfaces <em>Referenced Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerSupplierImpl extends BoundedContextRelationshipImpl implements CustomerSupplier {
	/**
	 * The cached value of the '{@link #getDownstreamRole() <em>Downstream Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamRole()
	 * @generated
	 * @ordered
	 */
	protected DownstreamRole downstreamRole;
	/**
	 * The cached value of the '{@link #getUpstreamRole() <em>Upstream Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamRole()
	 * @generated
	 * @ordered
	 */
	protected UpstreamRole upstreamRole;
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
	protected CustomerSupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.CUSTOMER_SUPPLIER;
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
	public NotificationChain basicSetDownstreamRole(DownstreamRole newDownstreamRole, NotificationChain msgs) {
		DownstreamRole oldDownstreamRole = downstreamRole;
		downstreamRole = newDownstreamRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE, oldDownstreamRole, newDownstreamRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownstreamRole(DownstreamRole newDownstreamRole) {
		if (newDownstreamRole != downstreamRole) {
			NotificationChain msgs = null;
			if (downstreamRole != null)
				msgs = ((InternalEObject)downstreamRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE, null, msgs);
			if (newDownstreamRole != null)
				msgs = ((InternalEObject)newDownstreamRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE, null, msgs);
			msgs = basicSetDownstreamRole(newDownstreamRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE, newDownstreamRole, newDownstreamRole));
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
	public NotificationChain basicSetUpstreamRole(UpstreamRole newUpstreamRole, NotificationChain msgs) {
		UpstreamRole oldUpstreamRole = upstreamRole;
		upstreamRole = newUpstreamRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE, oldUpstreamRole, newUpstreamRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpstreamRole(UpstreamRole newUpstreamRole) {
		if (newUpstreamRole != upstreamRole) {
			NotificationChain msgs = null;
			if (upstreamRole != null)
				msgs = ((InternalEObject)upstreamRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE, null, msgs);
			if (newUpstreamRole != null)
				msgs = ((InternalEObject)newUpstreamRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE, null, msgs);
			msgs = basicSetUpstreamRole(newUpstreamRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE, newUpstreamRole, newUpstreamRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getReferencedInterfaces() {
		if (referencedInterfaces == null) {
			referencedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__REFERENCED_INTERFACES);
		}
		return referencedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE:
				return basicSetDownstreamRole(null, msgs);
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE:
				return basicSetUpstreamRole(null, msgs);
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE:
				return getDownstreamRole();
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE:
				return getUpstreamRole();
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__REFERENCED_INTERFACES:
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE:
				setDownstreamRole((DownstreamRole)newValue);
				return;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE:
				setUpstreamRole((UpstreamRole)newValue);
				return;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__REFERENCED_INTERFACES:
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE:
				setDownstreamRole((DownstreamRole)null);
				return;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE:
				setUpstreamRole((UpstreamRole)null);
				return;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__REFERENCED_INTERFACES:
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_ROLE:
				return downstreamRole != null;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_ROLE:
				return upstreamRole != null;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__REFERENCED_INTERFACES:
				return referencedInterfaces != null && !referencedInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerSupplierImpl
