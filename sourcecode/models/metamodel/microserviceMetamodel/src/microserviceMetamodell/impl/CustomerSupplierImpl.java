/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.CustomerSupplier;
import microserviceMetamodell.DownstreamRole;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import microserviceMetamodell.UpstreamRole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.CustomerSupplierImpl#getDownstream <em>Downstream</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.CustomerSupplierImpl#getUpstream <em>Upstream</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerSupplierImpl extends BoundedContextRelationshipImpl implements CustomerSupplier {
	/**
	 * The cached value of the '{@link #getDownstream() <em>Downstream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstream()
	 * @generated
	 * @ordered
	 */
	protected DownstreamRole downstream;
	/**
	 * The cached value of the '{@link #getUpstream() <em>Upstream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstream()
	 * @generated
	 * @ordered
	 */
	protected UpstreamRole upstream;

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
	public DownstreamRole getDownstream() {
		return downstream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDownstream(DownstreamRole newDownstream, NotificationChain msgs) {
		DownstreamRole oldDownstream = downstream;
		downstream = newDownstream;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM, oldDownstream, newDownstream);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownstream(DownstreamRole newDownstream) {
		if (newDownstream != downstream) {
			NotificationChain msgs = null;
			if (downstream != null)
				msgs = ((InternalEObject)downstream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM, null, msgs);
			if (newDownstream != null)
				msgs = ((InternalEObject)newDownstream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM, null, msgs);
			msgs = basicSetDownstream(newDownstream, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM, newDownstream, newDownstream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpstreamRole getUpstream() {
		return upstream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpstream(UpstreamRole newUpstream, NotificationChain msgs) {
		UpstreamRole oldUpstream = upstream;
		upstream = newUpstream;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM, oldUpstream, newUpstream);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpstream(UpstreamRole newUpstream) {
		if (newUpstream != upstream) {
			NotificationChain msgs = null;
			if (upstream != null)
				msgs = ((InternalEObject)upstream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM, null, msgs);
			if (newUpstream != null)
				msgs = ((InternalEObject)newUpstream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM, null, msgs);
			msgs = basicSetUpstream(newUpstream, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM, newUpstream, newUpstream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM:
				return basicSetDownstream(null, msgs);
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM:
				return basicSetUpstream(null, msgs);
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM:
				return getDownstream();
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM:
				return getUpstream();
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM:
				setDownstream((DownstreamRole)newValue);
				return;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM:
				setUpstream((UpstreamRole)newValue);
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM:
				setDownstream((DownstreamRole)null);
				return;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM:
				setUpstream((UpstreamRole)null);
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM:
				return downstream != null;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM:
				return upstream != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerSupplierImpl
