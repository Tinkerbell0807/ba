/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Repository#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link microserviceMetamodell.Repository#getRepositoryFor <em>Repository For</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getRepository_Behaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

	/**
	 * Returns the value of the '<em><b>Repository For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository For</em>' reference.
	 * @see #setRepositoryFor(Persistable)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getRepository_RepositoryFor()
	 * @model
	 * @generated
	 */
	Persistable getRepositoryFor();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Repository#getRepositoryFor <em>Repository For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository For</em>' reference.
	 * @see #getRepositoryFor()
	 * @generated
	 */
	void setRepositoryFor(Persistable value);

} // Repository
