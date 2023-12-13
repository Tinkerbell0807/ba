/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;
import microserviceMetamodell.BuildConfiguration;
import microserviceMetamodell.CloudConfiguration;
import microserviceMetamodell.DeployementAbstraction;
import microserviceMetamodell.ExternalDependency;
import microserviceMetamodell.InfrastructureLayer;
import microserviceMetamodell.KafkaConfiguration;
import microserviceMetamodell.MicroserviceMetamodellPackage;

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
 * An implementation of the model object '<em><b>Infrastructure Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getCloudConfiguration <em>Cloud Configuration</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getDeployementAbstractions <em>Deployement Abstractions</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getBuildConfiguration <em>Build Configuration</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getExternalDependency <em>External Dependency</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getEventingConfigurations <em>Eventing Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureLayerImpl extends MinimalEObjectImpl.Container implements InfrastructureLayer {
	/**
	 * The cached value of the '{@link #getCloudConfiguration() <em>Cloud Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CloudConfiguration cloudConfiguration;
	/**
	 * The cached value of the '{@link #getDeployementAbstractions() <em>Deployement Abstractions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployementAbstractions()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployementAbstraction> deployementAbstractions;
	/**
	 * The cached value of the '{@link #getBuildConfiguration() <em>Build Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildConfiguration> buildConfiguration;
	/**
	 * The cached value of the '{@link #getExternalDependency() <em>External Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalDependency> externalDependency;
	/**
	 * The cached value of the '{@link #getEventingConfigurations() <em>Eventing Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventingConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<KafkaConfiguration> eventingConfigurations;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.INFRASTRUCTURE_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudConfiguration getCloudConfiguration() {
		return cloudConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloudConfiguration(CloudConfiguration newCloudConfiguration, NotificationChain msgs) {
		CloudConfiguration oldCloudConfiguration = cloudConfiguration;
		cloudConfiguration = newCloudConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION, oldCloudConfiguration, newCloudConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudConfiguration(CloudConfiguration newCloudConfiguration) {
		if (newCloudConfiguration != cloudConfiguration) {
			NotificationChain msgs = null;
			if (cloudConfiguration != null)
				msgs = ((InternalEObject)cloudConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION, null, msgs);
			if (newCloudConfiguration != null)
				msgs = ((InternalEObject)newCloudConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION, null, msgs);
			msgs = basicSetCloudConfiguration(newCloudConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION, newCloudConfiguration, newCloudConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployementAbstraction> getDeployementAbstractions() {
		if (deployementAbstractions == null) {
			deployementAbstractions = new EObjectContainmentEList<DeployementAbstraction>(DeployementAbstraction.class, this, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYEMENT_ABSTRACTIONS);
		}
		return deployementAbstractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildConfiguration> getBuildConfiguration() {
		if (buildConfiguration == null) {
			buildConfiguration = new EObjectContainmentEList<BuildConfiguration>(BuildConfiguration.class, this, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATION);
		}
		return buildConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalDependency> getExternalDependency() {
		if (externalDependency == null) {
			externalDependency = new EObjectContainmentEList<ExternalDependency>(ExternalDependency.class, this, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCY);
		}
		return externalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafkaConfiguration> getEventingConfigurations() {
		if (eventingConfigurations == null) {
			eventingConfigurations = new EObjectContainmentEList<KafkaConfiguration>(KafkaConfiguration.class, this, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EVENTING_CONFIGURATIONS);
		}
		return eventingConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION:
				return basicSetCloudConfiguration(null, msgs);
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYEMENT_ABSTRACTIONS:
				return ((InternalEList<?>)getDeployementAbstractions()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATION:
				return ((InternalEList<?>)getBuildConfiguration()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCY:
				return ((InternalEList<?>)getExternalDependency()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EVENTING_CONFIGURATIONS:
				return ((InternalEList<?>)getEventingConfigurations()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION:
				return getCloudConfiguration();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYEMENT_ABSTRACTIONS:
				return getDeployementAbstractions();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATION:
				return getBuildConfiguration();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCY:
				return getExternalDependency();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EVENTING_CONFIGURATIONS:
				return getEventingConfigurations();
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION:
				setCloudConfiguration((CloudConfiguration)newValue);
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYEMENT_ABSTRACTIONS:
				getDeployementAbstractions().clear();
				getDeployementAbstractions().addAll((Collection<? extends DeployementAbstraction>)newValue);
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATION:
				getBuildConfiguration().clear();
				getBuildConfiguration().addAll((Collection<? extends BuildConfiguration>)newValue);
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCY:
				getExternalDependency().clear();
				getExternalDependency().addAll((Collection<? extends ExternalDependency>)newValue);
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EVENTING_CONFIGURATIONS:
				getEventingConfigurations().clear();
				getEventingConfigurations().addAll((Collection<? extends KafkaConfiguration>)newValue);
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION:
				setCloudConfiguration((CloudConfiguration)null);
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYEMENT_ABSTRACTIONS:
				getDeployementAbstractions().clear();
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATION:
				getBuildConfiguration().clear();
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCY:
				getExternalDependency().clear();
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EVENTING_CONFIGURATIONS:
				getEventingConfigurations().clear();
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__CLOUD_CONFIGURATION:
				return cloudConfiguration != null;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYEMENT_ABSTRACTIONS:
				return deployementAbstractions != null && !deployementAbstractions.isEmpty();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATION:
				return buildConfiguration != null && !buildConfiguration.isEmpty();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCY:
				return externalDependency != null && !externalDependency.isEmpty();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EVENTING_CONFIGURATIONS:
				return eventingConfigurations != null && !eventingConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureLayerImpl
