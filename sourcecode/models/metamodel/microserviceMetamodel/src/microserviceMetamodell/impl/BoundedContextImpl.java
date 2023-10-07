/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.BoundedContextRelationship;
import microserviceMetamodell.DomainModel;
import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounded Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.BoundedContextImpl#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.BoundedContextImpl#getContextName <em>Context Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.BoundedContextImpl#getCorrespodingMicroservices <em>Correspoding Microservices</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.BoundedContextImpl#getBoundedContextRelationships <em>Bounded Context Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundedContextImpl extends MinimalEObjectImpl.Container implements BoundedContext {
	/**
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domainModel;

	/**
	 * The default value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected String contextName = CONTEXT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrespodingMicroservices() <em>Correspoding Microservices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespodingMicroservices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> correspodingMicroservices;

	/**
	 * The cached value of the '{@link #getBoundedContextRelationships() <em>Bounded Context Relationships</em>}' reference list.
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
	protected BoundedContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.BOUNDED_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getDomainModel() {
		if (domainModel != null && domainModel.eIsProxy()) {
			InternalEObject oldDomainModel = (InternalEObject)domainModel;
			domainModel = (DomainModel)eResolveProxy(oldDomainModel);
			if (domainModel != oldDomainModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL, oldDomainModel, domainModel));
			}
		}
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel basicGetDomainModel() {
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainModel(DomainModel newDomainModel, NotificationChain msgs) {
		DomainModel oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL, oldDomainModel, newDomainModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModel(DomainModel newDomainModel) {
		if (newDomainModel != domainModel) {
			NotificationChain msgs = null;
			if (domainModel != null)
				msgs = ((InternalEObject)domainModel).eInverseRemove(this, MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT, DomainModel.class, msgs);
			if (newDomainModel != null)
				msgs = ((InternalEObject)newDomainModel).eInverseAdd(this, MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT, DomainModel.class, msgs);
			msgs = basicSetDomainModel(newDomainModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL, newDomainModel, newDomainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextName() {
		return contextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextName(String newContextName) {
		String oldContextName = contextName;
		contextName = newContextName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CONTEXT_NAME, oldContextName, contextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getCorrespodingMicroservices() {
		if (correspodingMicroservices == null) {
			correspodingMicroservices = new EObjectWithInverseResolvingEList<Microservice>(Microservice.class, this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES, MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT);
		}
		return correspodingMicroservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundedContextRelationship> getBoundedContextRelationships() {
		if (boundedContextRelationships == null) {
			boundedContextRelationships = new EObjectResolvingEList<BoundedContextRelationship>(BoundedContextRelationship.class, this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__BOUNDED_CONTEXT_RELATIONSHIPS);
		}
		return boundedContextRelationships;
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL:
				if (domainModel != null)
					msgs = ((InternalEObject)domainModel).eInverseRemove(this, MicroserviceMetamodellPackage.DOMAIN_MODEL__BOUNDED_CONTEXT, DomainModel.class, msgs);
				return basicSetDomainModel((DomainModel)otherEnd, msgs);
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCorrespodingMicroservices()).basicAdd(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL:
				return basicSetDomainModel(null, msgs);
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES:
				return ((InternalEList<?>)getCorrespodingMicroservices()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL:
				if (resolve) return getDomainModel();
				return basicGetDomainModel();
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CONTEXT_NAME:
				return getContextName();
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES:
				return getCorrespodingMicroservices();
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__BOUNDED_CONTEXT_RELATIONSHIPS:
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL:
				setDomainModel((DomainModel)newValue);
				return;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CONTEXT_NAME:
				setContextName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES:
				getCorrespodingMicroservices().clear();
				getCorrespodingMicroservices().addAll((Collection<? extends Microservice>)newValue);
				return;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__BOUNDED_CONTEXT_RELATIONSHIPS:
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL:
				setDomainModel((DomainModel)null);
				return;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CONTEXT_NAME:
				setContextName(CONTEXT_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES:
				getCorrespodingMicroservices().clear();
				return;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__BOUNDED_CONTEXT_RELATIONSHIPS:
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
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__DOMAIN_MODEL:
				return domainModel != null;
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CONTEXT_NAME:
				return CONTEXT_NAME_EDEFAULT == null ? contextName != null : !CONTEXT_NAME_EDEFAULT.equals(contextName);
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES:
				return correspodingMicroservices != null && !correspodingMicroservices.isEmpty();
			case MicroserviceMetamodellPackage.BOUNDED_CONTEXT__BOUNDED_CONTEXT_RELATIONSHIPS:
				return boundedContextRelationships != null && !boundedContextRelationships.isEmpty();
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
		result.append(" (contextName: ");
		result.append(contextName);
		result.append(')');
		return result.toString();
	}

} //BoundedContextImpl
