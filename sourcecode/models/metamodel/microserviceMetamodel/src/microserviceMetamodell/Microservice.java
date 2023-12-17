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
 *   <li>{@link microserviceMetamodell.Microservice#getModelElementImplementations <em>Model Element Implementations</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getWorkflowRole <em>Workflow Role</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getCorrespodingContext <em>Correspoding Context</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getImplementationTechnology <em>Implementation Technology</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getSendsRequestTo <em>Sends Request To</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getDeployementAbstraction <em>Deployement Abstraction</em>}</li>
 *   <li>{@link microserviceMetamodell.Microservice#getBuildConfiguration <em>Build Configuration</em>}</li>
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
	 * Returns the value of the '<em><b>Model Element Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.ModelElementImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element Implementations</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_ModelElementImplementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElementImplementation> getModelElementImplementations();

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
	 * Returns the value of the '<em><b>Workflow Role</b></em>' attribute.
	 * The default value is <code>"CHOREOGRAPH"</code>.
	 * The literals are from the enumeration {@link microserviceMetamodell.WorkflowRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Role</em>' attribute.
	 * @see microserviceMetamodell.WorkflowRole
	 * @see #setWorkflowRole(WorkflowRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_WorkflowRole()
	 * @model default="CHOREOGRAPH"
	 * @generated
	 */
	WorkflowRole getWorkflowRole();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Microservice#getWorkflowRole <em>Workflow Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Role</em>' attribute.
	 * @see microserviceMetamodell.WorkflowRole
	 * @see #getWorkflowRole()
	 * @generated
	 */
	void setWorkflowRole(WorkflowRole value);

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
	 * Returns the value of the '<em><b>Sends Request To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Request To</em>' reference.
	 * @see #setSendsRequestTo(RestEndpoint)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_SendsRequestTo()
	 * @model
	 * @generated
	 */
	RestEndpoint getSendsRequestTo();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Microservice#getSendsRequestTo <em>Sends Request To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sends Request To</em>' reference.
	 * @see #getSendsRequestTo()
	 * @generated
	 */
	void setSendsRequestTo(RestEndpoint value);

	/**
	 * Returns the value of the '<em><b>Deployement Abstraction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.DeployementAbstraction#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployement Abstraction</em>' reference.
	 * @see #setDeployementAbstraction(DeployementAbstraction)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getMicroservice_DeployementAbstraction()
	 * @see microserviceMetamodell.DeployementAbstraction#getMicroservice
	 * @model opposite="microservice"
	 * @generated
	 */
	DeployementAbstraction getDeployementAbstraction();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Microservice#getDeployementAbstraction <em>Deployement Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployement Abstraction</em>' reference.
	 * @see #getDeployementAbstraction()
	 * @generated
	 */
	void setDeployementAbstraction(DeployementAbstraction value);

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

} // Microservice
