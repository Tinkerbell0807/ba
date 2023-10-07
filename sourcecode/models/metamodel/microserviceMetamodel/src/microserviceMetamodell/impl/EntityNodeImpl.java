/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.Behaviour;
import microserviceMetamodell.EntityNode;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ValueObjectNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.EntityNodeImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.EntityNodeImpl#getValueObjectNodes <em>Value Object Nodes</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.EntityNodeImpl#getBehaviours <em>Behaviours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityNodeImpl extends MinimalEObjectImpl.Container implements EntityNode {
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
	 * The cached value of the '{@link #getValueObjectNodes() <em>Value Object Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueObjectNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueObjectNode> valueObjectNodes;

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
	protected EntityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.ENTITY_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.ENTITY_NODE__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueObjectNode> getValueObjectNodes() {
		if (valueObjectNodes == null) {
			valueObjectNodes = new EObjectContainmentEList<ValueObjectNode>(ValueObjectNode.class, this, MicroserviceMetamodellPackage.ENTITY_NODE__VALUE_OBJECT_NODES);
		}
		return valueObjectNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getBehaviours() {
		if (behaviours == null) {
			behaviours = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, MicroserviceMetamodellPackage.ENTITY_NODE__BEHAVIOURS);
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
			case MicroserviceMetamodellPackage.ENTITY_NODE__VALUE_OBJECT_NODES:
				return ((InternalEList<?>)getValueObjectNodes()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.ENTITY_NODE__BEHAVIOURS:
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
			case MicroserviceMetamodellPackage.ENTITY_NODE__ELEMENT_NAME:
				return getElementName();
			case MicroserviceMetamodellPackage.ENTITY_NODE__VALUE_OBJECT_NODES:
				return getValueObjectNodes();
			case MicroserviceMetamodellPackage.ENTITY_NODE__BEHAVIOURS:
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
			case MicroserviceMetamodellPackage.ENTITY_NODE__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.ENTITY_NODE__VALUE_OBJECT_NODES:
				getValueObjectNodes().clear();
				getValueObjectNodes().addAll((Collection<? extends ValueObjectNode>)newValue);
				return;
			case MicroserviceMetamodellPackage.ENTITY_NODE__BEHAVIOURS:
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
			case MicroserviceMetamodellPackage.ENTITY_NODE__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.ENTITY_NODE__VALUE_OBJECT_NODES:
				getValueObjectNodes().clear();
				return;
			case MicroserviceMetamodellPackage.ENTITY_NODE__BEHAVIOURS:
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
			case MicroserviceMetamodellPackage.ENTITY_NODE__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case MicroserviceMetamodellPackage.ENTITY_NODE__VALUE_OBJECT_NODES:
				return valueObjectNodes != null && !valueObjectNodes.isEmpty();
			case MicroserviceMetamodellPackage.ENTITY_NODE__BEHAVIOURS:
				return behaviours != null && !behaviours.isEmpty();
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
		result.append(" (elementName: ");
		result.append(elementName);
		result.append(')');
		return result.toString();
	}

} //EntityNodeImpl
