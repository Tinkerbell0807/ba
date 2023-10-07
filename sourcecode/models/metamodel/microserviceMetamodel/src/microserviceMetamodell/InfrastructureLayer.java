/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getCloudConfiguration <em>Cloud Configuration</em>}</li>
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getDeploymentConfigurations <em>Deployment Configurations</em>}</li>
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getBuildConfigurations <em>Build Configurations</em>}</li>
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getExternalDependencies <em>External Dependencies</em>}</li>
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getKafkaConfiguration <em>Kafka Configuration</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer()
 * @model
 * @generated
 */
public interface InfrastructureLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloud Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Configuration</em>' containment reference.
	 * @see #setCloudConfiguration(CloudConfiguration)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_CloudConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	CloudConfiguration getCloudConfiguration();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.InfrastructureLayer#getCloudConfiguration <em>Cloud Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Configuration</em>' containment reference.
	 * @see #getCloudConfiguration()
	 * @generated
	 */
	void setCloudConfiguration(CloudConfiguration value);

	/**
	 * Returns the value of the '<em><b>Deployment Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DeploymentConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Configurations</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_DeploymentConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentConfiguration> getDeploymentConfigurations();

	/**
	 * Returns the value of the '<em><b>Build Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.BuildConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Configurations</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_BuildConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuildConfiguration> getBuildConfigurations();

	/**
	 * Returns the value of the '<em><b>External Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.ExternalDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Dependencies</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_ExternalDependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalDependency> getExternalDependencies();

	/**
	 * Returns the value of the '<em><b>Kafka Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Configuration</em>' containment reference.
	 * @see #setKafkaConfiguration(KafkaConfiguration)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_KafkaConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	KafkaConfiguration getKafkaConfiguration();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.InfrastructureLayer#getKafkaConfiguration <em>Kafka Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kafka Configuration</em>' containment reference.
	 * @see #getKafkaConfiguration()
	 * @generated
	 */
	void setKafkaConfiguration(KafkaConfiguration value);

} // InfrastructureLayer
