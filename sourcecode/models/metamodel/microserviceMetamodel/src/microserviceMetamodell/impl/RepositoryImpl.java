/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.Behaviour;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.Persistable;
import microserviceMetamodell.Repository;

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
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.RepositoryImpl#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.RepositoryImpl#getRepositoryFor <em>Repository For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends ModelElementImpl implements Repository {
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
	 * The cached value of the '{@link #getRepositoryFor() <em>Repository For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryFor()
	 * @generated
	 * @ordered
	 */
	protected Persistable repositoryFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getBehaviours() {
		if (behaviours == null) {
			behaviours = new EObjectContainmentEList<Behaviour>(Behaviour.class, this, MicroserviceMetamodellPackage.REPOSITORY__BEHAVIOURS);
		}
		return behaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistable getRepositoryFor() {
		if (repositoryFor != null && repositoryFor.eIsProxy()) {
			InternalEObject oldRepositoryFor = (InternalEObject)repositoryFor;
			repositoryFor = (Persistable)eResolveProxy(oldRepositoryFor);
			if (repositoryFor != oldRepositoryFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.REPOSITORY__REPOSITORY_FOR, oldRepositoryFor, repositoryFor));
			}
		}
		return repositoryFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistable basicGetRepositoryFor() {
		return repositoryFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryFor(Persistable newRepositoryFor) {
		Persistable oldRepositoryFor = repositoryFor;
		repositoryFor = newRepositoryFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.REPOSITORY__REPOSITORY_FOR, oldRepositoryFor, repositoryFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.REPOSITORY__BEHAVIOURS:
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
			case MicroserviceMetamodellPackage.REPOSITORY__BEHAVIOURS:
				return getBehaviours();
			case MicroserviceMetamodellPackage.REPOSITORY__REPOSITORY_FOR:
				if (resolve) return getRepositoryFor();
				return basicGetRepositoryFor();
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
			case MicroserviceMetamodellPackage.REPOSITORY__BEHAVIOURS:
				getBehaviours().clear();
				getBehaviours().addAll((Collection<? extends Behaviour>)newValue);
				return;
			case MicroserviceMetamodellPackage.REPOSITORY__REPOSITORY_FOR:
				setRepositoryFor((Persistable)newValue);
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
			case MicroserviceMetamodellPackage.REPOSITORY__BEHAVIOURS:
				getBehaviours().clear();
				return;
			case MicroserviceMetamodellPackage.REPOSITORY__REPOSITORY_FOR:
				setRepositoryFor((Persistable)null);
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
			case MicroserviceMetamodellPackage.REPOSITORY__BEHAVIOURS:
				return behaviours != null && !behaviours.isEmpty();
			case MicroserviceMetamodellPackage.REPOSITORY__REPOSITORY_FOR:
				return repositoryFor != null;
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
