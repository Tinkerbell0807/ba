/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Factory#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link microserviceMetamodell.Factory#getFactoryFor <em>Factory For</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getFactory()
 * @model
 * @generated
 */
public interface Factory extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getFactory_Behaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

	/**
	 * Returns the value of the '<em><b>Factory For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory For</em>' reference.
	 * @see #setFactoryFor(Factorizeable)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getFactory_FactoryFor()
	 * @model required="true"
	 * @generated
	 */
	Factorizeable getFactoryFor();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Factory#getFactoryFor <em>Factory For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory For</em>' reference.
	 * @see #getFactoryFor()
	 * @generated
	 */
	void setFactoryFor(Factorizeable value);

} // Factory
