/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.AggregateRoot;
import microserviceMetamodell.EntityNode;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.AggregateRootImpl#getRootEntity <em>Root Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateRootImpl extends MinimalEObjectImpl.Container implements AggregateRoot {
	/**
	 * The cached value of the '{@link #getRootEntity() <em>Root Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntity()
	 * @generated
	 * @ordered
	 */
	protected EntityNode rootEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.AGGREGATE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNode getRootEntity() {
		if (rootEntity != null && rootEntity.eIsProxy()) {
			InternalEObject oldRootEntity = (InternalEObject)rootEntity;
			rootEntity = (EntityNode)eResolveProxy(oldRootEntity);
			if (rootEntity != oldRootEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.AGGREGATE_ROOT__ROOT_ENTITY, oldRootEntity, rootEntity));
			}
		}
		return rootEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNode basicGetRootEntity() {
		return rootEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootEntity(EntityNode newRootEntity) {
		EntityNode oldRootEntity = rootEntity;
		rootEntity = newRootEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.AGGREGATE_ROOT__ROOT_ENTITY, oldRootEntity, rootEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.AGGREGATE_ROOT__ROOT_ENTITY:
				if (resolve) return getRootEntity();
				return basicGetRootEntity();
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
			case MicroserviceMetamodellPackage.AGGREGATE_ROOT__ROOT_ENTITY:
				setRootEntity((EntityNode)newValue);
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
			case MicroserviceMetamodellPackage.AGGREGATE_ROOT__ROOT_ENTITY:
				setRootEntity((EntityNode)null);
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
			case MicroserviceMetamodellPackage.AGGREGATE_ROOT__ROOT_ENTITY:
				return rootEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregateRootImpl
