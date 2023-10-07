/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.DomainModelLayer;
import microserviceMetamodell.InfrastructureLayer;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.SystemModel;
import microserviceMetamodell.TechnicalLayer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.SystemModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.SystemModelImpl#getDomainModelLayer <em>Domain Model Layer</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.SystemModelImpl#getTechnicalLayer <em>Technical Layer</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.SystemModelImpl#getInfrastructureLayer <em>Infrastructure Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemModelImpl extends MinimalEObjectImpl.Container implements SystemModel {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainModelLayer() <em>Domain Model Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModelLayer()
	 * @generated
	 * @ordered
	 */
	protected DomainModelLayer domainModelLayer;

	/**
	 * The cached value of the '{@link #getTechnicalLayer() <em>Technical Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalLayer()
	 * @generated
	 * @ordered
	 */
	protected TechnicalLayer technicalLayer;

	/**
	 * The cached value of the '{@link #getInfrastructureLayer() <em>Infrastructure Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructureLayer()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureLayer infrastructureLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.SYSTEM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SYSTEM_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModelLayer getDomainModelLayer() {
		return domainModelLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainModelLayer(DomainModelLayer newDomainModelLayer, NotificationChain msgs) {
		DomainModelLayer oldDomainModelLayer = domainModelLayer;
		domainModelLayer = newDomainModelLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER, oldDomainModelLayer, newDomainModelLayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModelLayer(DomainModelLayer newDomainModelLayer) {
		if (newDomainModelLayer != domainModelLayer) {
			NotificationChain msgs = null;
			if (domainModelLayer != null)
				msgs = ((InternalEObject)domainModelLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER, null, msgs);
			if (newDomainModelLayer != null)
				msgs = ((InternalEObject)newDomainModelLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER, null, msgs);
			msgs = basicSetDomainModelLayer(newDomainModelLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER, newDomainModelLayer, newDomainModelLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalLayer getTechnicalLayer() {
		return technicalLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnicalLayer(TechnicalLayer newTechnicalLayer, NotificationChain msgs) {
		TechnicalLayer oldTechnicalLayer = technicalLayer;
		technicalLayer = newTechnicalLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER, oldTechnicalLayer, newTechnicalLayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnicalLayer(TechnicalLayer newTechnicalLayer) {
		if (newTechnicalLayer != technicalLayer) {
			NotificationChain msgs = null;
			if (technicalLayer != null)
				msgs = ((InternalEObject)technicalLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER, null, msgs);
			if (newTechnicalLayer != null)
				msgs = ((InternalEObject)newTechnicalLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER, null, msgs);
			msgs = basicSetTechnicalLayer(newTechnicalLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER, newTechnicalLayer, newTechnicalLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureLayer getInfrastructureLayer() {
		return infrastructureLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfrastructureLayer(InfrastructureLayer newInfrastructureLayer, NotificationChain msgs) {
		InfrastructureLayer oldInfrastructureLayer = infrastructureLayer;
		infrastructureLayer = newInfrastructureLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER, oldInfrastructureLayer, newInfrastructureLayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfrastructureLayer(InfrastructureLayer newInfrastructureLayer) {
		if (newInfrastructureLayer != infrastructureLayer) {
			NotificationChain msgs = null;
			if (infrastructureLayer != null)
				msgs = ((InternalEObject)infrastructureLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER, null, msgs);
			if (newInfrastructureLayer != null)
				msgs = ((InternalEObject)newInfrastructureLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER, null, msgs);
			msgs = basicSetInfrastructureLayer(newInfrastructureLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER, newInfrastructureLayer, newInfrastructureLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER:
				return basicSetDomainModelLayer(null, msgs);
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER:
				return basicSetTechnicalLayer(null, msgs);
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER:
				return basicSetInfrastructureLayer(null, msgs);
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
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DESCRIPTION:
				return getDescription();
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER:
				return getDomainModelLayer();
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER:
				return getTechnicalLayer();
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER:
				return getInfrastructureLayer();
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
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER:
				setDomainModelLayer((DomainModelLayer)newValue);
				return;
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER:
				setTechnicalLayer((TechnicalLayer)newValue);
				return;
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER:
				setInfrastructureLayer((InfrastructureLayer)newValue);
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
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER:
				setDomainModelLayer((DomainModelLayer)null);
				return;
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER:
				setTechnicalLayer((TechnicalLayer)null);
				return;
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER:
				setInfrastructureLayer((InfrastructureLayer)null);
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
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__DOMAIN_MODEL_LAYER:
				return domainModelLayer != null;
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__TECHNICAL_LAYER:
				return technicalLayer != null;
			case MicroserviceMetamodellPackage.SYSTEM_MODEL__INFRASTRUCTURE_LAYER:
				return infrastructureLayer != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SystemModelImpl
