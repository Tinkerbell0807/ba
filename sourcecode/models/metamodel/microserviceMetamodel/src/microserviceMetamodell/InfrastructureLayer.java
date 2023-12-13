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
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getDeployementAbstractions <em>Deployement Abstractions</em>}</li>
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getBuildConfiguration <em>Build Configuration</em>}</li>
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getExternalDependency <em>External Dependency</em>}</li>
 *   <li>{@link microserviceMetamodell.InfrastructureLayer#getEventingConfigurations <em>Eventing Configurations</em>}</li>
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
	 * Returns the value of the '<em><b>Deployement Abstractions</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DeployementAbstraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployement Abstractions</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_DeployementAbstractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployementAbstraction> getDeployementAbstractions();

	/**
	 * Returns the value of the '<em><b>Build Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.BuildConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Configuration</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_BuildConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuildConfiguration> getBuildConfiguration();

	/**
	 * Returns the value of the '<em><b>External Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.ExternalDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Dependency</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_ExternalDependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalDependency> getExternalDependency();

	/**
	 * Returns the value of the '<em><b>Eventing Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.KafkaConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventing Configurations</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInfrastructureLayer_EventingConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<KafkaConfiguration> getEventingConfigurations();
} // InfrastructureLayer
