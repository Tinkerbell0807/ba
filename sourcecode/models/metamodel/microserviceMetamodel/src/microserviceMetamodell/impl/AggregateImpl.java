/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.Aggregate;
import microserviceMetamodell.AggregateNode;
import microserviceMetamodell.EntityNode;
import microserviceMetamodell.Interface;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElement;
import microserviceMetamodell.Persistable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.AggregateImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.AggregateImpl#getReferencedInterfaces <em>Referenced Interfaces</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.AggregateImpl#getAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.AggregateImpl#getAggregateNode <em>Aggregate Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateImpl extends MinimalEObjectImpl.Container implements Aggregate {
	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getAggregateRoot() <em>Aggregate Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected EntityNode aggregateRoot;

	/**
	 * The cached value of the '{@link #getAggregateNode() <em>Aggregate Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateNode()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregateNode> aggregateNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.AGGREGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.AGGREGATE__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getReferencedInterfaces() {
		if (referencedInterfaces == null) {
			referencedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES, MicroserviceMetamodellPackage.INTERFACE__REFERENCED_ELEMENTS);
		}
		return referencedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNode getAggregateRoot() {
		return aggregateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateRoot(EntityNode newAggregateRoot, NotificationChain msgs) {
		EntityNode oldAggregateRoot = aggregateRoot;
		aggregateRoot = newAggregateRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, newAggregateRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateRoot(EntityNode newAggregateRoot) {
		if (newAggregateRoot != aggregateRoot) {
			NotificationChain msgs = null;
			if (aggregateRoot != null)
				msgs = ((InternalEObject)aggregateRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT, null, msgs);
			if (newAggregateRoot != null)
				msgs = ((InternalEObject)newAggregateRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT, null, msgs);
			msgs = basicSetAggregateRoot(newAggregateRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT, newAggregateRoot, newAggregateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregateNode> getAggregateNode() {
		if (aggregateNode == null) {
			aggregateNode = new EObjectContainmentEList<AggregateNode>(AggregateNode.class, this, MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_NODE);
		}
		return aggregateNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedInterfaces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES:
				return ((InternalEList<?>)getReferencedInterfaces()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT:
				return basicSetAggregateRoot(null, msgs);
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_NODE:
				return ((InternalEList<?>)getAggregateNode()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.AGGREGATE__ELEMENT_NAME:
				return getElementName();
			case MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES:
				return getReferencedInterfaces();
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT:
				return getAggregateRoot();
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_NODE:
				return getAggregateNode();
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
			case MicroserviceMetamodellPackage.AGGREGATE__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES:
				getReferencedInterfaces().clear();
				getReferencedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT:
				setAggregateRoot((EntityNode)newValue);
				return;
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_NODE:
				getAggregateNode().clear();
				getAggregateNode().addAll((Collection<? extends AggregateNode>)newValue);
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
			case MicroserviceMetamodellPackage.AGGREGATE__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES:
				getReferencedInterfaces().clear();
				return;
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT:
				setAggregateRoot((EntityNode)null);
				return;
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_NODE:
				getAggregateNode().clear();
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
			case MicroserviceMetamodellPackage.AGGREGATE__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES:
				return referencedInterfaces != null && !referencedInterfaces.isEmpty();
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_ROOT:
				return aggregateRoot != null;
			case MicroserviceMetamodellPackage.AGGREGATE__AGGREGATE_NODE:
				return aggregateNode != null && !aggregateNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case MicroserviceMetamodellPackage.AGGREGATE__ELEMENT_NAME: return MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME;
				case MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES: return MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == Persistable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case MicroserviceMetamodellPackage.MODEL_ELEMENT__ELEMENT_NAME: return MicroserviceMetamodellPackage.AGGREGATE__ELEMENT_NAME;
				case MicroserviceMetamodellPackage.MODEL_ELEMENT__REFERENCED_INTERFACES: return MicroserviceMetamodellPackage.AGGREGATE__REFERENCED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == Persistable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (elementName: ");
		result.append(elementName);
		result.append(')');
		return result.toString();
	}

} //AggregateImpl
