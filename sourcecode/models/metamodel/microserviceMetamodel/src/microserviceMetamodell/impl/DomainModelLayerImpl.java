/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.BoundedContextRelationship;
import microserviceMetamodell.DomainEvent;
import microserviceMetamodell.DomainModel;
import microserviceMetamodell.DomainModelLayer;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DomainModelLayerImpl#getBoundedContexts <em>Bounded Contexts</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainModelLayerImpl#getDomainModels <em>Domain Models</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainModelLayerImpl#getDomainEvents <em>Domain Events</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainModelLayerImpl#getBoundedContextRelationships <em>Bounded Context Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainModelLayerImpl extends MinimalEObjectImpl.Container implements DomainModelLayer {
	/**
	 * The cached value of the '{@link #getBoundedContexts() <em>Bounded Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundedContext> boundedContexts;

	/**
	 * The cached value of the '{@link #getDomainModels() <em>Domain Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModels()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainModel> domainModels;

	/**
	 * The cached value of the '{@link #getDomainEvents() <em>Domain Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainEvent> domainEvents;

	/**
	 * The cached value of the '{@link #getBoundedContextRelationships() <em>Bounded Context Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedContextRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundedContextRelationship> boundedContextRelationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOMAIN_MODEL_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundedContext> getBoundedContexts() {
		if (boundedContexts == null) {
			boundedContexts = new EObjectContainmentEList<BoundedContext>(BoundedContext.class, this, MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS);
		}
		return boundedContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainModel> getDomainModels() {
		if (domainModels == null) {
			domainModels = new EObjectContainmentEList<DomainModel>(DomainModel.class, this, MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_MODELS);
		}
		return domainModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainEvent> getDomainEvents() {
		if (domainEvents == null) {
			domainEvents = new EObjectContainmentEList<DomainEvent>(DomainEvent.class, this, MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_EVENTS);
		}
		return domainEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundedContextRelationship> getBoundedContextRelationships() {
		if (boundedContextRelationships == null) {
			boundedContextRelationships = new EObjectContainmentEList<BoundedContextRelationship>(BoundedContextRelationship.class, this, MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS);
		}
		return boundedContextRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS:
				return ((InternalEList<?>)getBoundedContexts()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_MODELS:
				return ((InternalEList<?>)getDomainModels()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_EVENTS:
				return ((InternalEList<?>)getDomainEvents()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS:
				return ((InternalEList<?>)getBoundedContextRelationships()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS:
				return getBoundedContexts();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_MODELS:
				return getDomainModels();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_EVENTS:
				return getDomainEvents();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS:
				return getBoundedContextRelationships();
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS:
				getBoundedContexts().clear();
				getBoundedContexts().addAll((Collection<? extends BoundedContext>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_MODELS:
				getDomainModels().clear();
				getDomainModels().addAll((Collection<? extends DomainModel>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_EVENTS:
				getDomainEvents().clear();
				getDomainEvents().addAll((Collection<? extends DomainEvent>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS:
				getBoundedContextRelationships().clear();
				getBoundedContextRelationships().addAll((Collection<? extends BoundedContextRelationship>)newValue);
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS:
				getBoundedContexts().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_MODELS:
				getDomainModels().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_EVENTS:
				getDomainEvents().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS:
				getBoundedContextRelationships().clear();
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXTS:
				return boundedContexts != null && !boundedContexts.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_MODELS:
				return domainModels != null && !domainModels.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__DOMAIN_EVENTS:
				return domainEvents != null && !domainEvents.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL_LAYER__BOUNDED_CONTEXT_RELATIONSHIPS:
				return boundedContextRelationships != null && !boundedContextRelationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainModelLayerImpl
