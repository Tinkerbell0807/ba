/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kubernetes Cluster Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.KubernetesClusterConfiguration#getClusterName <em>Cluster Name</em>}</li>
 *   <li>{@link microserviceMetamodell.KubernetesClusterConfiguration#getNodes <em>Nodes</em>}</li>
 *   <li>{@link microserviceMetamodell.KubernetesClusterConfiguration#getMachineType <em>Machine Type</em>}</li>
 *   <li>{@link microserviceMetamodell.KubernetesClusterConfiguration#getDeployments <em>Deployments</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKubernetesClusterConfiguration()
 * @model
 * @generated
 */
public interface KubernetesClusterConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Cluster Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Name</em>' attribute.
	 * @see #setClusterName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKubernetesClusterConfiguration_ClusterName()
	 * @model
	 * @generated
	 */
	String getClusterName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.KubernetesClusterConfiguration#getClusterName <em>Cluster Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Name</em>' attribute.
	 * @see #getClusterName()
	 * @generated
	 */
	void setClusterName(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' attribute.
	 * @see #setNodes(int)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKubernetesClusterConfiguration_Nodes()
	 * @model
	 * @generated
	 */
	int getNodes();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.KubernetesClusterConfiguration#getNodes <em>Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' attribute.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(int value);

	/**
	 * Returns the value of the '<em><b>Machine Type</b></em>' attribute.
	 * The default value is <code>"e2-small"</code>.
	 * The literals are from the enumeration {@link microserviceMetamodell.GCloudMachineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Type</em>' attribute.
	 * @see microserviceMetamodell.GCloudMachineType
	 * @see #setMachineType(GCloudMachineType)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKubernetesClusterConfiguration_MachineType()
	 * @model default="e2-small"
	 * @generated
	 */
	GCloudMachineType getMachineType();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.KubernetesClusterConfiguration#getMachineType <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Type</em>' attribute.
	 * @see microserviceMetamodell.GCloudMachineType
	 * @see #getMachineType()
	 * @generated
	 */
	void setMachineType(GCloudMachineType value);

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.DeploymentConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKubernetesClusterConfiguration_Deployments()
	 * @model
	 * @generated
	 */
	EList<DeploymentConfiguration> getDeployments();

} // KubernetesClusterConfiguration
