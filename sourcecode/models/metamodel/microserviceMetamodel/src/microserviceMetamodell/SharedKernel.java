/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Kernel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.SharedKernel#getRelatedContexts <em>Related Contexts</em>}</li>
 *   <li>{@link microserviceMetamodell.SharedKernel#getImplementingLib <em>Implementing Lib</em>}</li>
 *   <li>{@link microserviceMetamodell.SharedKernel#getSharedModules <em>Shared Modules</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSharedKernel()
 * @model
 * @generated
 */
public interface SharedKernel extends BoundedContextRelationship {
	/**
	 * Returns the value of the '<em><b>Related Contexts</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.BoundedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Contexts</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSharedKernel_RelatedContexts()
	 * @model lower="2"
	 * @generated
	 */
	EList<BoundedContext> getRelatedContexts();

	/**
	 * Returns the value of the '<em><b>Implementing Lib</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.ExternalDependency#getSharedKernel <em>Shared Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementing Lib</em>' reference.
	 * @see #setImplementingLib(ExternalDependency)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSharedKernel_ImplementingLib()
	 * @see microserviceMetamodell.ExternalDependency#getSharedKernel
	 * @model opposite="sharedKernel"
	 * @generated
	 */
	ExternalDependency getImplementingLib();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.SharedKernel#getImplementingLib <em>Implementing Lib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Lib</em>' reference.
	 * @see #getImplementingLib()
	 * @generated
	 */
	void setImplementingLib(ExternalDependency value);

	/**
	 * Returns the value of the '<em><b>Shared Modules</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.SharedModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Modules</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSharedKernel_SharedModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharedModule> getSharedModules();

} // SharedKernel
