/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.GCloudConfiguration;
import microserviceMetamodell.GCloudZone;
import microserviceMetamodell.KubernetesClusterConfiguration;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCloud Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.GCloudConfigurationImpl#getArtifactRepositoryName <em>Artifact Repository Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.GCloudConfigurationImpl#getArtifactRepositoryZone <em>Artifact Repository Zone</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.GCloudConfigurationImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.GCloudConfigurationImpl#getClusterZone <em>Cluster Zone</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.GCloudConfigurationImpl#getKubernetesClusterConfiguration <em>Kubernetes Cluster Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCloudConfigurationImpl extends CloudConfigurationImpl implements GCloudConfiguration {
	/**
	 * The default value of the '{@link #getArtifactRepositoryName() <em>Artifact Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_REPOSITORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactRepositoryName() <em>Artifact Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected String artifactRepositoryName = ARTIFACT_REPOSITORY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactRepositoryZone() <em>Artifact Repository Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRepositoryZone()
	 * @generated
	 * @ordered
	 */
	protected static final GCloudZone ARTIFACT_REPOSITORY_ZONE_EDEFAULT = GCloudZone.EUROPE_WEST1;

	/**
	 * The cached value of the '{@link #getArtifactRepositoryZone() <em>Artifact Repository Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRepositoryZone()
	 * @generated
	 * @ordered
	 */
	protected GCloudZone artifactRepositoryZone = ARTIFACT_REPOSITORY_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected String projectId = PROJECT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClusterZone() <em>Cluster Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterZone()
	 * @generated
	 * @ordered
	 */
	protected static final GCloudZone CLUSTER_ZONE_EDEFAULT = GCloudZone.EUROPE_WEST1_B;

	/**
	 * The cached value of the '{@link #getClusterZone() <em>Cluster Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterZone()
	 * @generated
	 * @ordered
	 */
	protected GCloudZone clusterZone = CLUSTER_ZONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKubernetesClusterConfiguration() <em>Kubernetes Cluster Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubernetesClusterConfiguration()
	 * @generated
	 * @ordered
	 */
	protected KubernetesClusterConfiguration kubernetesClusterConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCloudConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.GCLOUD_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactRepositoryName() {
		return artifactRepositoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactRepositoryName(String newArtifactRepositoryName) {
		String oldArtifactRepositoryName = artifactRepositoryName;
		artifactRepositoryName = newArtifactRepositoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME, oldArtifactRepositoryName, artifactRepositoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCloudZone getArtifactRepositoryZone() {
		return artifactRepositoryZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactRepositoryZone(GCloudZone newArtifactRepositoryZone) {
		GCloudZone oldArtifactRepositoryZone = artifactRepositoryZone;
		artifactRepositoryZone = newArtifactRepositoryZone == null ? ARTIFACT_REPOSITORY_ZONE_EDEFAULT : newArtifactRepositoryZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE, oldArtifactRepositoryZone, artifactRepositoryZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectId() {
		return projectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectId(String newProjectId) {
		String oldProjectId = projectId;
		projectId = newProjectId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__PROJECT_ID, oldProjectId, projectId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCloudZone getClusterZone() {
		return clusterZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusterZone(GCloudZone newClusterZone) {
		GCloudZone oldClusterZone = clusterZone;
		clusterZone = newClusterZone == null ? CLUSTER_ZONE_EDEFAULT : newClusterZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__CLUSTER_ZONE, oldClusterZone, clusterZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KubernetesClusterConfiguration getKubernetesClusterConfiguration() {
		return kubernetesClusterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKubernetesClusterConfiguration(KubernetesClusterConfiguration newKubernetesClusterConfiguration, NotificationChain msgs) {
		KubernetesClusterConfiguration oldKubernetesClusterConfiguration = kubernetesClusterConfiguration;
		kubernetesClusterConfiguration = newKubernetesClusterConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION, oldKubernetesClusterConfiguration, newKubernetesClusterConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKubernetesClusterConfiguration(KubernetesClusterConfiguration newKubernetesClusterConfiguration) {
		if (newKubernetesClusterConfiguration != kubernetesClusterConfiguration) {
			NotificationChain msgs = null;
			if (kubernetesClusterConfiguration != null)
				msgs = ((InternalEObject)kubernetesClusterConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION, null, msgs);
			if (newKubernetesClusterConfiguration != null)
				msgs = ((InternalEObject)newKubernetesClusterConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION, null, msgs);
			msgs = basicSetKubernetesClusterConfiguration(newKubernetesClusterConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION, newKubernetesClusterConfiguration, newKubernetesClusterConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION:
				return basicSetKubernetesClusterConfiguration(null, msgs);
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
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME:
				return getArtifactRepositoryName();
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE:
				return getArtifactRepositoryZone();
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__PROJECT_ID:
				return getProjectId();
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__CLUSTER_ZONE:
				return getClusterZone();
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION:
				return getKubernetesClusterConfiguration();
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
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME:
				setArtifactRepositoryName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE:
				setArtifactRepositoryZone((GCloudZone)newValue);
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__PROJECT_ID:
				setProjectId((String)newValue);
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__CLUSTER_ZONE:
				setClusterZone((GCloudZone)newValue);
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION:
				setKubernetesClusterConfiguration((KubernetesClusterConfiguration)newValue);
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
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME:
				setArtifactRepositoryName(ARTIFACT_REPOSITORY_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE:
				setArtifactRepositoryZone(ARTIFACT_REPOSITORY_ZONE_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__PROJECT_ID:
				setProjectId(PROJECT_ID_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__CLUSTER_ZONE:
				setClusterZone(CLUSTER_ZONE_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION:
				setKubernetesClusterConfiguration((KubernetesClusterConfiguration)null);
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
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME:
				return ARTIFACT_REPOSITORY_NAME_EDEFAULT == null ? artifactRepositoryName != null : !ARTIFACT_REPOSITORY_NAME_EDEFAULT.equals(artifactRepositoryName);
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE:
				return artifactRepositoryZone != ARTIFACT_REPOSITORY_ZONE_EDEFAULT;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? projectId != null : !PROJECT_ID_EDEFAULT.equals(projectId);
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__CLUSTER_ZONE:
				return clusterZone != CLUSTER_ZONE_EDEFAULT;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION:
				return kubernetesClusterConfiguration != null;
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
		result.append(" (artifactRepositoryName: ");
		result.append(artifactRepositoryName);
		result.append(", artifactRepositoryZone: ");
		result.append(artifactRepositoryZone);
		result.append(", projectId: ");
		result.append(projectId);
		result.append(", clusterZone: ");
		result.append(clusterZone);
		result.append(')');
		return result.toString();
	}

} //GCloudConfigurationImpl
