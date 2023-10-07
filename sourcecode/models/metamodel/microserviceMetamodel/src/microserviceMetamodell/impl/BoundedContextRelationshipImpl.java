/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.BoundedContextRelationship;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounded Context Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.BoundedContextRelationshipImpl#getRelationshipName <em>Relationship Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BoundedContextRelationshipImpl extends MinimalEObjectImpl.Container implements BoundedContextRelationship {
	/**
	 * The default value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected String relationshipName = RELATIONSHIP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedContextRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.BOUNDED_CONTEXT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationshipName() {
		return relationshipName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipName(String newRelationshipName) {
		String oldRelationshipName = relationshipName;
		relationshipName = newRelationshipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME, oldRelationshipName, relationshipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME:
				return getRelationshipName();
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME:
				setRelationshipName((String)newValue);
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME:
				setRelationshipName(RELATIONSHIP_NAME_EDEFAULT);
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT_RELATIONSHIP__RELATIONSHIP_NAME:
				return RELATIONSHIP_NAME_EDEFAULT == null ? relationshipName != null : !RELATIONSHIP_NAME_EDEFAULT.equals(relationshipName);
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
		result.append(" (relationshipName: ");
		result.append(relationshipName);
		result.append(')');
		return result.toString();
	}

} //BoundedContextRelationshipImpl
