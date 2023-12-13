/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.RelationshipRole;
import microserviceMetamodell.UpstreamDownstreamRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Upstream Downstream Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.UpstreamDownstreamRelationshipImpl#getDownstream <em>Downstream</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.UpstreamDownstreamRelationshipImpl#getUpstream <em>Upstream</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UpstreamDownstreamRelationshipImpl extends MinimalEObjectImpl.Container implements UpstreamDownstreamRelationship {
	/**
	 * The cached value of the '{@link #getDownstream() <em>Downstream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstream()
	 * @generated
	 * @ordered
	 */
	protected RelationshipRole downstream;

	/**
	 * The cached value of the '{@link #getUpstream() <em>Upstream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstream()
	 * @generated
	 * @ordered
	 */
	protected RelationshipRole upstream;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpstreamDownstreamRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.UPSTREAM_DOWNSTREAM_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipRole getDownstream() {
		return downstream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDownstream(RelationshipRole newDownstream, NotificationChain msgs) {
		RelationshipRole oldDownstream = downstream;
		downstream = newDownstream;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM, oldDownstream, newDownstream);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownstream(RelationshipRole newDownstream) {
		if (newDownstream != downstream) {
			NotificationChain msgs = null;
			if (downstream != null)
				msgs = ((InternalEObject)downstream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM, null, msgs);
			if (newDownstream != null)
				msgs = ((InternalEObject)newDownstream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM, null, msgs);
			msgs = basicSetDownstream(newDownstream, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM, newDownstream, newDownstream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipRole getUpstream() {
		return upstream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpstream(RelationshipRole newUpstream, NotificationChain msgs) {
		RelationshipRole oldUpstream = upstream;
		upstream = newUpstream;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM, oldUpstream, newUpstream);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpstream(RelationshipRole newUpstream) {
		if (newUpstream != upstream) {
			NotificationChain msgs = null;
			if (upstream != null)
				msgs = ((InternalEObject)upstream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM, null, msgs);
			if (newUpstream != null)
				msgs = ((InternalEObject)newUpstream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM, null, msgs);
			msgs = basicSetUpstream(newUpstream, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM, newUpstream, newUpstream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM:
				return basicSetDownstream(null, msgs);
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM:
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
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM:
				return getDownstream();
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM:
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
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM:
				setDownstream((RelationshipRole)newValue);
				return;
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM:
				setUpstream((RelationshipRole)newValue);
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
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM:
				setDownstream((RelationshipRole)null);
				return;
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM:
				setUpstream((RelationshipRole)null);
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
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__DOWNSTREAM:
				return downstream != null;
			case MicroserviceMetamodellPackage.UPSTREAM_DOWNSTREAM_RELATIONSHIP__UPSTREAM:
				return upstream != null;
		}
		return super.eIsSet(featureID);
	}

} //UpstreamDownstreamRelationshipImpl
