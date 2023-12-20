/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;
import microserviceMetamodell.CustomerSupplier;
import microserviceMetamodell.DownstreamComponent;
import microserviceMetamodell.Interface;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import microserviceMetamodell.UpstreamComponent;
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
 *   <li>{@link microserviceMetamodell.impl.CustomerSupplierImpl#getDownstreamComponent <em>Downstream Component</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.CustomerSupplierImpl#getUpstreamComponent <em>Upstream Component</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.CustomerSupplierImpl#getReferencedInterfaces <em>Referenced Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerSupplierImpl extends BoundedContextRelationshipImpl implements CustomerSupplier {
	/**
	 * The cached value of the '{@link #getDownstreamComponent() <em>Downstream Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamComponent()
	 * @generated
	 * @ordered
	 */
	protected DownstreamComponent downstreamComponent;
	/**
	 * The cached value of the '{@link #getUpstreamComponent() <em>Upstream Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamComponent()
	 * @generated
	 * @ordered
	 */
	protected UpstreamComponent upstreamComponent;
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
	public DownstreamComponent getDownstreamComponent() {
		return downstreamComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDownstreamComponent(DownstreamComponent newDownstreamComponent, NotificationChain msgs) {
		DownstreamComponent oldDownstreamComponent = downstreamComponent;
		downstreamComponent = newDownstreamComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT, oldDownstreamComponent, newDownstreamComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownstreamComponent(DownstreamComponent newDownstreamComponent) {
		if (newDownstreamComponent != downstreamComponent) {
			NotificationChain msgs = null;
			if (downstreamComponent != null)
				msgs = ((InternalEObject)downstreamComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT, null, msgs);
			if (newDownstreamComponent != null)
				msgs = ((InternalEObject)newDownstreamComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT, null, msgs);
			msgs = basicSetDownstreamComponent(newDownstreamComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT, newDownstreamComponent, newDownstreamComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpstreamComponent getUpstreamComponent() {
		return upstreamComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpstreamComponent(UpstreamComponent newUpstreamComponent, NotificationChain msgs) {
		UpstreamComponent oldUpstreamComponent = upstreamComponent;
		upstreamComponent = newUpstreamComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT, oldUpstreamComponent, newUpstreamComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpstreamComponent(UpstreamComponent newUpstreamComponent) {
		if (newUpstreamComponent != upstreamComponent) {
			NotificationChain msgs = null;
			if (upstreamComponent != null)
				msgs = ((InternalEObject)upstreamComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT, null, msgs);
			if (newUpstreamComponent != null)
				msgs = ((InternalEObject)newUpstreamComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT, null, msgs);
			msgs = basicSetUpstreamComponent(newUpstreamComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT, newUpstreamComponent, newUpstreamComponent));
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT:
				return basicSetDownstreamComponent(null, msgs);
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT:
				return basicSetUpstreamComponent(null, msgs);
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT:
				return getDownstreamComponent();
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT:
				return getUpstreamComponent();
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT:
				setDownstreamComponent((DownstreamComponent)newValue);
				return;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT:
				setUpstreamComponent((UpstreamComponent)newValue);
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT:
				setDownstreamComponent((DownstreamComponent)null);
				return;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT:
				setUpstreamComponent((UpstreamComponent)null);
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
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__DOWNSTREAM_COMPONENT:
				return downstreamComponent != null;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__UPSTREAM_COMPONENT:
				return upstreamComponent != null;
			case MicroserviceMetamodellPackage.CUSTOMER_SUPPLIER__REFERENCED_INTERFACES:
				return referencedInterfaces != null && !referencedInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerSupplierImpl
