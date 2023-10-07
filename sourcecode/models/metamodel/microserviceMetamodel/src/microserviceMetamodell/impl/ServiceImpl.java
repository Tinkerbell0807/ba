/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.Behaviour;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElement;
import microserviceMetamodell.RestEndpoint;
import microserviceMetamodell.Service;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.ServiceImpl#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ServiceImpl#getReferencedElements <em>Referenced Elements</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ServiceImpl#getSendsRequestTo <em>Sends Request To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ModelElementImpl implements Service {
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
	 * The cached value of the '{@link #getReferencedElements() <em>Referenced Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> referencedElements;

	/**
	 * The cached value of the '{@link #getSendsRequestTo() <em>Sends Request To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsRequestTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RestEndpoint> sendsRequestTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getBehaviours() {
		if (behaviours == null) {
			behaviours = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, MicroserviceMetamodellPackage.SERVICE__BEHAVIOURS);
		}
		return behaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getReferencedElements() {
		if (referencedElements == null) {
			referencedElements = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, MicroserviceMetamodellPackage.SERVICE__REFERENCED_ELEMENTS);
		}
		return referencedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestEndpoint> getSendsRequestTo() {
		if (sendsRequestTo == null) {
			sendsRequestTo = new EObjectResolvingEList<RestEndpoint>(RestEndpoint.class, this, MicroserviceMetamodellPackage.SERVICE__SENDS_REQUEST_TO);
		}
		return sendsRequestTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.SERVICE__BEHAVIOURS:
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
			case MicroserviceMetamodellPackage.SERVICE__BEHAVIOURS:
				return getBehaviours();
			case MicroserviceMetamodellPackage.SERVICE__REFERENCED_ELEMENTS:
				return getReferencedElements();
			case MicroserviceMetamodellPackage.SERVICE__SENDS_REQUEST_TO:
				return getSendsRequestTo();
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
			case MicroserviceMetamodellPackage.SERVICE__BEHAVIOURS:
				getBehaviours().clear();
				getBehaviours().addAll((Collection<? extends Behaviour>)newValue);
				return;
			case MicroserviceMetamodellPackage.SERVICE__REFERENCED_ELEMENTS:
				getReferencedElements().clear();
				getReferencedElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case MicroserviceMetamodellPackage.SERVICE__SENDS_REQUEST_TO:
				getSendsRequestTo().clear();
				getSendsRequestTo().addAll((Collection<? extends RestEndpoint>)newValue);
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
			case MicroserviceMetamodellPackage.SERVICE__BEHAVIOURS:
				getBehaviours().clear();
				return;
			case MicroserviceMetamodellPackage.SERVICE__REFERENCED_ELEMENTS:
				getReferencedElements().clear();
				return;
			case MicroserviceMetamodellPackage.SERVICE__SENDS_REQUEST_TO:
				getSendsRequestTo().clear();
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
			case MicroserviceMetamodellPackage.SERVICE__BEHAVIOURS:
				return behaviours != null && !behaviours.isEmpty();
			case MicroserviceMetamodellPackage.SERVICE__REFERENCED_ELEMENTS:
				return referencedElements != null && !referencedElements.isEmpty();
			case MicroserviceMetamodellPackage.SERVICE__SENDS_REQUEST_TO:
				return sendsRequestTo != null && !sendsRequestTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
