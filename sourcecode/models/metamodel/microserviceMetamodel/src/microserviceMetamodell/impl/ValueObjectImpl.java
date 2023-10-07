/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.Entity;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ValueObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.ValueObjectImpl#getReferencedEntities <em>Referenced Entities</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ValueObjectImpl#getValueObjects <em>Value Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueObjectImpl extends ModelElementImpl implements ValueObject {
	/**
	 * The cached value of the '{@link #getReferencedEntities() <em>Referenced Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> referencedEntities;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.VALUE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getReferencedEntities() {
		if (referencedEntities == null) {
			referencedEntities = new EObjectResolvingEList<Entity>(Entity.class, this, MicroserviceMetamodellPackage.VALUE_OBJECT__REFERENCED_ENTITIES);
		}
		return referencedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueObject> getValueObjects() {
		if (valueObjects == null) {
			valueObjects = new EObjectContainmentEList<ValueObject>(ValueObject.class, this, MicroserviceMetamodellPackage.VALUE_OBJECT__VALUE_OBJECTS);
		}
		return valueObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.VALUE_OBJECT__VALUE_OBJECTS:
				return ((InternalEList<?>)getValueObjects()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.VALUE_OBJECT__REFERENCED_ENTITIES:
				return getReferencedEntities();
			case MicroserviceMetamodellPackage.VALUE_OBJECT__VALUE_OBJECTS:
				return getValueObjects();
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
			case MicroserviceMetamodellPackage.VALUE_OBJECT__REFERENCED_ENTITIES:
				getReferencedEntities().clear();
				getReferencedEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case MicroserviceMetamodellPackage.VALUE_OBJECT__VALUE_OBJECTS:
				getValueObjects().clear();
				getValueObjects().addAll((Collection<? extends ValueObject>)newValue);
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
			case MicroserviceMetamodellPackage.VALUE_OBJECT__REFERENCED_ENTITIES:
				getReferencedEntities().clear();
				return;
			case MicroserviceMetamodellPackage.VALUE_OBJECT__VALUE_OBJECTS:
				getValueObjects().clear();
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
			case MicroserviceMetamodellPackage.VALUE_OBJECT__REFERENCED_ENTITIES:
				return referencedEntities != null && !referencedEntities.isEmpty();
			case MicroserviceMetamodellPackage.VALUE_OBJECT__VALUE_OBJECTS:
				return valueObjects != null && !valueObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueObjectImpl
