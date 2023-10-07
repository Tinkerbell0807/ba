/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.DeploymentConfiguration#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link microserviceMetamodell.DeploymentConfiguration#getPort <em>Port</em>}</li>
 *   <li>{@link microserviceMetamodell.DeploymentConfiguration#getNodePort <em>Node Port</em>}</li>
 *   <li>{@link microserviceMetamodell.DeploymentConfiguration#getReplicas <em>Replicas</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDeploymentConfiguration()
 * @model
 * @generated
 */
public interface DeploymentConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.Microservice#getDeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' reference.
	 * @see #setMicroservice(Microservice)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDeploymentConfiguration_Microservice()
	 * @see microserviceMetamodell.Microservice#getDeploymentConfiguration
	 * @model opposite="deploymentConfiguration"
	 * @generated
	 */
	Microservice getMicroservice();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DeploymentConfiguration#getMicroservice <em>Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice</em>' reference.
	 * @see #getMicroservice()
	 * @generated
	 */
	void setMicroservice(Microservice value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDeploymentConfiguration_Port()
	 * @model
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DeploymentConfiguration#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Node Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Port</em>' attribute.
	 * @see #setNodePort(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDeploymentConfiguration_NodePort()
	 * @model
	 * @generated
	 */
	String getNodePort();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DeploymentConfiguration#getNodePort <em>Node Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Port</em>' attribute.
	 * @see #getNodePort()
	 * @generated
	 */
	void setNodePort(String value);

	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getDeploymentConfiguration_Replicas()
	 * @model
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.DeploymentConfiguration#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

} // DeploymentConfiguration
