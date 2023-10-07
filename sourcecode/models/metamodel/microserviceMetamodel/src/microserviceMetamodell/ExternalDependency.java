/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.ExternalDependency#getSharedKernel <em>Shared Kernel</em>}</li>
 *   <li>{@link microserviceMetamodell.ExternalDependency#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link microserviceMetamodell.ExternalDependency#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link microserviceMetamodell.ExternalDependency#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getExternalDependency()
 * @model
 * @generated
 */
public interface ExternalDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Shared Kernel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.SharedKernel#getImplementingLib <em>Implementing Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Kernel</em>' reference.
	 * @see #setSharedKernel(SharedKernel)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getExternalDependency_SharedKernel()
	 * @see microserviceMetamodell.SharedKernel#getImplementingLib
	 * @model opposite="implementingLib"
	 * @generated
	 */
	SharedKernel getSharedKernel();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.ExternalDependency#getSharedKernel <em>Shared Kernel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Kernel</em>' reference.
	 * @see #getSharedKernel()
	 * @generated
	 */
	void setSharedKernel(SharedKernel value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getExternalDependency_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.ExternalDependency#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getExternalDependency_ArtifactId()
	 * @model
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.ExternalDependency#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getExternalDependency_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.ExternalDependency#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ExternalDependency
