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
} // ExternalDependency
