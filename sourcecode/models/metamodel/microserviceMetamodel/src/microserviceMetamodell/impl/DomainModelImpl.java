/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.DomainEvent;
import microserviceMetamodell.DomainModel;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.SharedModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DomainModelImpl#getDomainEvents <em>Domain Events</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainModelImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainModelImpl#getBoundedContext <em>Bounded Context</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainModelImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DomainModelImpl#getSharedModules <em>Shared Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainModelImpl extends MinimalEObjectImpl.Container implements DomainModel {
	/**
	 * The cached value of the '{@link #getDomainEvents() <em>Domain Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainEvent> domainEvents;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<microserviceMetamodell.Module> modules;

	/**
	 * The cached value of the '{@link #getBoundedContext() <em>Bounded Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedContext()
	 * @generated
	 * @ordered
	 */
	protected BoundedContext boundedContext;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSharedModules() <em>Shared Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedModules()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedModule> sharedModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOMAIN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainEvent> getDomainEvents() {
		if (domainEvents == null) {
			domainEvents = new EObjectWithInverseResolvingEList<DomainEvent>(DomainEvent.class, this, MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS, MicroserviceMetamodellPackage.DOMAIN_EVENT__DOMAIN_MODEL);
		}
		return domainEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<microserviceMetamodell.Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<microserviceMetamodell.Module>(microserviceMetamodell.Module.class, this, MicroserviceMetamodellPackage.DOMAIN_MODEL__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext getBoundedContext() {
		if (boundedContext != null && boundedContext.eIsProxy()) {
			InternalEObject oldBoundedContext = (InternalEObject)boundedContext;
			boundedContext = (BoundedContext)eResolveProxy(oldBoundedContext);
			if (boundedContext != oldBoundedContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT, oldBoundedContext, boundedContext));
			}
		}
		return boundedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext basicGetBoundedContext() {
		return boundedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundedContext(BoundedContext newBoundedContext, NotificationChain msgs) {
		BoundedContext oldBoundedContext = boundedContext;
		boundedContext = newBoundedContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT, oldBoundedContext, newBoundedContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundedContext(BoundedContext newBoundedContext) {
		if (newBoundedContext != boundedContext) {
			NotificationChain msgs = null;
			if (boundedContext != null)
				msgs = ((InternalEObject)boundedContext).eInverseRemove(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL, BoundedContext.class, msgs);
			if (newBoundedContext != null)
				msgs = ((InternalEObject)newBoundedContext).eInverseAdd(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL, BoundedContext.class, msgs);
			msgs = basicSetBoundedContext(newBoundedContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT, newBoundedContext, newBoundedContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DOMAIN_MODEL__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedModule> getSharedModules() {
		if (sharedModules == null) {
			sharedModules = new EObjectResolvingEList<SharedModule>(SharedModule.class, this, MicroserviceMetamodellPackage.DOMAIN_MODEL__SHARED_MODULES);
		}
		return sharedModules;
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomainEvents()).basicAdd(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT:
				if (boundedContext != null)
					msgs = ((InternalEObject)boundedContext).eInverseRemove(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL, BoundedContext.class, msgs);
				return basicSetBoundedContext((BoundedContext)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS:
				return ((InternalEList<?>)getDomainEvents()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT:
				return basicSetBoundedContext(null, msgs);
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS:
				return getDomainEvents();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODULES:
				return getModules();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT:
				if (resolve) return getBoundedContext();
				return basicGetBoundedContext();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODEL_NAME:
				return getModelName();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__SHARED_MODULES:
				return getSharedModules();
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS:
				getDomainEvents().clear();
				getDomainEvents().addAll((Collection<? extends DomainEvent>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends microserviceMetamodell.Module>)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT:
				setBoundedContext((BoundedContext)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__SHARED_MODULES:
				getSharedModules().clear();
				getSharedModules().addAll((Collection<? extends SharedModule>)newValue);
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS:
				getDomainEvents().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODULES:
				getModules().clear();
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT:
				setBoundedContext((BoundedContext)null);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__SHARED_MODULES:
				getSharedModules().clear();
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
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__DOMAIN_EVENTS:
				return domainEvents != null && !domainEvents.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODULES:
				return modules != null && !modules.isEmpty();
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT:
				return boundedContext != null;
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case MicroserviceMetamodellPackage.DOMAIN_MODEL__SHARED_MODULES:
				return sharedModules != null && !sharedModules.isEmpty();
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
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(')');
		return result.toString();
	}

} //DomainModelImpl
