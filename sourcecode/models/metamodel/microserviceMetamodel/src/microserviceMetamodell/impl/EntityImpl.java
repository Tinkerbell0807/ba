/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.Behaviour;
import microserviceMetamodell.Entity;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ValueObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.EntityImpl#getValueObjects <em>Value Objects</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.EntityImpl#getBehaviours <em>Behaviours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends ModelElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getValueObjects() <em>Value Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueObject> valueObjects;

	/**
	 * The cached value of the '{@link #getBehaviours() <em>Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<Behaviour> behaviours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueObject> getValueObjects() {
		if (valueObjects == null) {
			valueObjects = new EObjectContainmentEList<ValueObject>(ValueObject.class, this, MicroserviceMetamodellPackage.ENTITY__VALUE_OBJECTS);
		}
		return valueObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getBehaviours() {
		if (behaviours == null) {
			behaviours = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, MicroserviceMetamodellPackage.ENTITY__BEHAVIOURS);
		}
		return behaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.ENTITY__VALUE_OBJECTS:
				return ((InternalEList<?>)getValueObjects()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.ENTITY__BEHAVIOURS:
				return ((InternalEList<?>)getBehaviours()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.ENTITY__VALUE_OBJECTS:
				return getValueObjects();
			case MicroserviceMetamodellPackage.ENTITY__BEHAVIOURS:
				return getBehaviours();
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
			case MicroserviceMetamodellPackage.ENTITY__VALUE_OBJECTS:
				getValueObjects().clear();
				getValueObjects().addAll((Collection<? extends ValueObject>)newValue);
				return;
			case MicroserviceMetamodellPackage.ENTITY__BEHAVIOURS:
				getBehaviours().clear();
				getBehaviours().addAll((Collection<? extends Behaviour>)newValue);
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
			case MicroserviceMetamodellPackage.ENTITY__VALUE_OBJECTS:
				getValueObjects().clear();
				return;
			case MicroserviceMetamodellPackage.ENTITY__BEHAVIOURS:
				getBehaviours().clear();
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
			case MicroserviceMetamodellPackage.ENTITY__VALUE_OBJECTS:
				return valueObjects != null && !valueObjects.isEmpty();
			case MicroserviceMetamodellPackage.ENTITY__BEHAVIOURS:
				return behaviours != null && !behaviours.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
