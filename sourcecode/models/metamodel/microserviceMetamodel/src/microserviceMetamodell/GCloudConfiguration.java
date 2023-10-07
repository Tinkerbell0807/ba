/**
 */
package microserviceMetamodell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCloud Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.GCloudConfiguration#getArtifactRepositoryName <em>Artifact Repository Name</em>}</li>
 *   <li>{@link microserviceMetamodell.GCloudConfiguration#getArtifactRepositoryZone <em>Artifact Repository Zone</em>}</li>
 *   <li>{@link microserviceMetamodell.GCloudConfiguration#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link microserviceMetamodell.GCloudConfiguration#getClusterZone <em>Cluster Zone</em>}</li>
 *   <li>{@link microserviceMetamodell.GCloudConfiguration#getKubernetesClusterConfiguration <em>Kubernetes Cluster Configuration</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getGCloudConfiguration()
 * @model
 * @generated
 */
public interface GCloudConfiguration extends CloudConfiguration {
	/**
	 * Returns the value of the '<em><b>Artifact Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Repository Name</em>' attribute.
	 * @see #setArtifactRepositoryName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getGCloudConfiguration_ArtifactRepositoryName()
	 * @model
	 * @generated
	 */
	String getArtifactRepositoryName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.GCloudConfiguration#getArtifactRepositoryName <em>Artifact Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Repository Name</em>' attribute.
	 * @see #getArtifactRepositoryName()
	 * @generated
	 */
	void setArtifactRepositoryName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Repository Zone</b></em>' attribute.
	 * The default value is <code>"europe-west1"</code>.
	 * The literals are from the enumeration {@link microserviceMetamodell.GCloudZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Repository Zone</em>' attribute.
	 * @see microserviceMetamodell.GCloudZone
	 * @see #setArtifactRepositoryZone(GCloudZone)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getGCloudConfiguration_ArtifactRepositoryZone()
	 * @model default="europe-west1"
	 * @generated
	 */
	GCloudZone getArtifactRepositoryZone();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.GCloudConfiguration#getArtifactRepositoryZone <em>Artifact Repository Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Repository Zone</em>' attribute.
	 * @see microserviceMetamodell.GCloudZone
	 * @see #getArtifactRepositoryZone()
	 * @generated
	 */
	void setArtifactRepositoryZone(GCloudZone value);

	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getGCloudConfiguration_ProjectId()
	 * @model
	 * @generated
	 */
	String getProjectId();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.GCloudConfiguration#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(String value);

	/**
	 * Returns the value of the '<em><b>Cluster Zone</b></em>' attribute.
	 * The default value is <code>"europe-west1-b"</code>.
	 * The literals are from the enumeration {@link microserviceMetamodell.GCloudZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Zone</em>' attribute.
	 * @see microserviceMetamodell.GCloudZone
	 * @see #setClusterZone(GCloudZone)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getGCloudConfiguration_ClusterZone()
	 * @model default="europe-west1-b"
	 * @generated
	 */
	GCloudZone getClusterZone();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.GCloudConfiguration#getClusterZone <em>Cluster Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Zone</em>' attribute.
	 * @see microserviceMetamodell.GCloudZone
	 * @see #getClusterZone()
	 * @generated
	 */
	void setClusterZone(GCloudZone value);

	/**
	 * Returns the value of the '<em><b>Kubernetes Cluster Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kubernetes Cluster Configuration</em>' containment reference.
	 * @see #setKubernetesClusterConfiguration(KubernetesClusterConfiguration)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getGCloudConfiguration_KubernetesClusterConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	KubernetesClusterConfiguration getKubernetesClusterConfiguration();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.GCloudConfiguration#getKubernetesClusterConfiguration <em>Kubernetes Cluster Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kubernetes Cluster Configuration</em>' containment reference.
	 * @see #getKubernetesClusterConfiguration()
	 * @generated
	 */
	void setKubernetesClusterConfiguration(KubernetesClusterConfiguration value);

} // GCloudConfiguration
