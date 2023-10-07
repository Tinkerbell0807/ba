/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.BuildConfiguration;
import microserviceMetamodell.CloudConfiguration;
import microserviceMetamodell.DeploymentConfiguration;
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
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getDeploymentConfigurations <em>Deployment Configurations</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getBuildConfigurations <em>Build Configurations</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getExternalDependencies <em>External Dependencies</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.InfrastructureLayerImpl#getKafkaConfiguration <em>Kafka Configuration</em>}</li>
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
	 * The cached value of the '{@link #getDeploymentConfigurations() <em>Deployment Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentConfiguration> deploymentConfigurations;

	/**
	 * The cached value of the '{@link #getBuildConfigurations() <em>Build Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildConfiguration> buildConfigurations;

	/**
	 * The cached value of the '{@link #getExternalDependencies() <em>External Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalDependency> externalDependencies;

	/**
	 * The cached value of the '{@link #getKafkaConfiguration() <em>Kafka Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaConfiguration()
	 * @generated
	 * @ordered
	 */
	protected KafkaConfiguration kafkaConfiguration;

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
	public EList<DeploymentConfiguration> getDeploymentConfigurations() {
		if (deploymentConfigurations == null) {
			deploymentConfigurations = new EObjectContainmentEList<DeploymentConfiguration>(DeploymentConfiguration.class, this, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS);
		}
		return deploymentConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildConfiguration> getBuildConfigurations() {
		if (buildConfigurations == null) {
			buildConfigurations = new EObjectContainmentEList<BuildConfiguration>(BuildConfiguration.class, this, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS);
		}
		return buildConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalDependency> getExternalDependencies() {
		if (externalDependencies == null) {
			externalDependencies = new EObjectContainmentEList<ExternalDependency>(ExternalDependency.class, this, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES);
		}
		return externalDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaConfiguration getKafkaConfiguration() {
		return kafkaConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKafkaConfiguration(KafkaConfiguration newKafkaConfiguration, NotificationChain msgs) {
		KafkaConfiguration oldKafkaConfiguration = kafkaConfiguration;
		kafkaConfiguration = newKafkaConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION, oldKafkaConfiguration, newKafkaConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKafkaConfiguration(KafkaConfiguration newKafkaConfiguration) {
		if (newKafkaConfiguration != kafkaConfiguration) {
			NotificationChain msgs = null;
			if (kafkaConfiguration != null)
				msgs = ((InternalEObject)kafkaConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION, null, msgs);
			if (newKafkaConfiguration != null)
				msgs = ((InternalEObject)newKafkaConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION, null, msgs);
			msgs = basicSetKafkaConfiguration(newKafkaConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION, newKafkaConfiguration, newKafkaConfiguration));
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS:
				return ((InternalEList<?>)getDeploymentConfigurations()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS:
				return ((InternalEList<?>)getBuildConfigurations()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES:
				return ((InternalEList<?>)getExternalDependencies()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION:
				return basicSetKafkaConfiguration(null, msgs);
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS:
				return getDeploymentConfigurations();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS:
				return getBuildConfigurations();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES:
				return getExternalDependencies();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION:
				return getKafkaConfiguration();
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS:
				getDeploymentConfigurations().clear();
				getDeploymentConfigurations().addAll((Collection<? extends DeploymentConfiguration>)newValue);
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				getBuildConfigurations().addAll((Collection<? extends BuildConfiguration>)newValue);
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES:
				getExternalDependencies().clear();
				getExternalDependencies().addAll((Collection<? extends ExternalDependency>)newValue);
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION:
				setKafkaConfiguration((KafkaConfiguration)newValue);
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS:
				getDeploymentConfigurations().clear();
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES:
				getExternalDependencies().clear();
				return;
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION:
				setKafkaConfiguration((KafkaConfiguration)null);
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
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__DEPLOYMENT_CONFIGURATIONS:
				return deploymentConfigurations != null && !deploymentConfigurations.isEmpty();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__BUILD_CONFIGURATIONS:
				return buildConfigurations != null && !buildConfigurations.isEmpty();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__EXTERNAL_DEPENDENCIES:
				return externalDependencies != null && !externalDependencies.isEmpty();
			case MicroserviceMetamodellPackage.INFRASTRUCTURE_LAYER__KAFKA_CONFIGURATION:
				return kafkaConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureLayerImpl
