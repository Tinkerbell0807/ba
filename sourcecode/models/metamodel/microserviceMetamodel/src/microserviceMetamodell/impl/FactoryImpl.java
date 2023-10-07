/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.Behaviour;
import microserviceMetamodell.Factorizeable;
import microserviceMetamodell.Factory;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.FactoryImpl#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.FactoryImpl#getFactoryFor <em>Factory For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends ModelElementImpl implements Factory {
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
	 * The cached value of the '{@link #getFactoryFor() <em>Factory For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryFor()
	 * @generated
	 * @ordered
	 */
	protected Factorizeable factoryFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getBehaviours() {
		if (behaviours == null) {
			behaviours = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, MicroserviceMetamodellPackage.FACTORY__BEHAVIOURS);
		}
		return behaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factorizeable getFactoryFor() {
		if (factoryFor != null && factoryFor.eIsProxy()) {
			InternalEObject oldFactoryFor = (InternalEObject)factoryFor;
			factoryFor = (Factorizeable)eResolveProxy(oldFactoryFor);
			if (factoryFor != oldFactoryFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.FACTORY__FACTORY_FOR, oldFactoryFor, factoryFor));
			}
		}
		return factoryFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factorizeable basicGetFactoryFor() {
		return factoryFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryFor(Factorizeable newFactoryFor) {
		Factorizeable oldFactoryFor = factoryFor;
		factoryFor = newFactoryFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.FACTORY__FACTORY_FOR, oldFactoryFor, factoryFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.FACTORY__BEHAVIOURS:
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
			case MicroserviceMetamodellPackage.FACTORY__BEHAVIOURS:
				return getBehaviours();
			case MicroserviceMetamodellPackage.FACTORY__FACTORY_FOR:
				if (resolve) return getFactoryFor();
				return basicGetFactoryFor();
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
			case MicroserviceMetamodellPackage.FACTORY__BEHAVIOURS:
				getBehaviours().clear();
				getBehaviours().addAll((Collection<? extends Behaviour>)newValue);
				return;
			case MicroserviceMetamodellPackage.FACTORY__FACTORY_FOR:
				setFactoryFor((Factorizeable)newValue);
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
			case MicroserviceMetamodellPackage.FACTORY__BEHAVIOURS:
				getBehaviours().clear();
				return;
			case MicroserviceMetamodellPackage.FACTORY__FACTORY_FOR:
				setFactoryFor((Factorizeable)null);
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
			case MicroserviceMetamodellPackage.FACTORY__BEHAVIOURS:
				return behaviours != null && !behaviours.isEmpty();
			case MicroserviceMetamodellPackage.FACTORY__FACTORY_FOR:
				return factoryFor != null;
		}
		return super.eIsSet(featureID);
	}

} //FactoryImpl
