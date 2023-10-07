/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Microservice#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getCorrespodingContext <em>Correspoding Context</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getImplementationTechnology <em>Implementation Technology</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getDeploymentConfiguration <em>Deployment Configuration</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getBuildConfiguration <em>Build Configuration</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getCalledEndpoints <em>Called Endpoints</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Microservice#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Correspoding Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.BoundedContext#getCorrespodingMicroservices <em>Correspoding Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspoding Context</em>' reference.
	 * @see #setCorrespodingContext(BoundedContext)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_CorrespodingContext()
	 * @see microserviceMetamodell.BoundedContext#getCorrespodingMicroservices
	 * @model opposite="correspodingMicroservices"
	 * @generated
	 */
	BoundedContext getCorrespodingContext();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Microservice#getCorrespodingContext <em>Correspoding Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correspoding Context</em>' reference.
	 * @see #getCorrespodingContext()
	 * @generated
	 */
	void setCorrespodingContext(BoundedContext value);

	/**
	 * Returns the value of the '<em><b>Implementation Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link microserviceMetamodell.ImplementationTechnology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Technology</em>' attribute.
	 * @see microserviceMetamodell.ImplementationTechnology
	 * @see #setImplementationTechnology(ImplementationTechnology)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_ImplementationTechnology()
	 * @model
	 * @generated
	 */
	ImplementationTechnology getImplementationTechnology();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Microservice#getImplementationTechnology <em>Implementation Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Technology</em>' attribute.
	 * @see microserviceMetamodell.ImplementationTechnology
	 * @see #getImplementationTechnology()
	 * @generated
	 */
	void setImplementationTechnology(ImplementationTechnology value);

	/**
	 * Returns the value of the '<em><b>Deployment Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.DeploymentConfiguration#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Configuration</em>' reference.
	 * @see #setDeploymentConfiguration(DeploymentConfiguration)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_DeploymentConfiguration()
	 * @see microserviceMetamodell.DeploymentConfiguration#getMicroservice
	 * @model opposite="microservice"
	 * @generated
	 */
	DeploymentConfiguration getDeploymentConfiguration();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Microservice#getDeploymentConfiguration <em>Deployment Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Configuration</em>' reference.
	 * @see #getDeploymentConfiguration()
	 * @generated
	 */
	void setDeploymentConfiguration(DeploymentConfiguration value);

	/**
	 * Returns the value of the '<em><b>Build Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.BuildConfiguration#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Configuration</em>' reference.
	 * @see #setBuildConfiguration(BuildConfiguration)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_BuildConfiguration()
	 * @see microserviceMetamodell.BuildConfiguration#getMicroservice
	 * @model opposite="microservice"
	 * @generated
	 */
	BuildConfiguration getBuildConfiguration();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Microservice#getBuildConfiguration <em>Build Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Configuration</em>' reference.
	 * @see #getBuildConfiguration()
	 * @generated
	 */
	void setBuildConfiguration(BuildConfiguration value);

	/**
	 * Returns the value of the '<em><b>Called Endpoints</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.RestEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Endpoints</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_CalledEndpoints()
	 * @model
	 * @generated
	 */
	EList<RestEndpoint> getCalledEndpoints();

} // Microservice
