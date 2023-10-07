/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Entity#getValueObjects <em>Value Objects</em>}</li>
 *   <li>{@link microserviceMetamodell.Entity#getBehaviours <em>Behaviours</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends ModelElement, Factorizeable, Persistable {
	/**
	 * Returns the value of the '<em><b>Value Objects</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Objects</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getEntity_ValueObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObject> getValueObjects();

	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getEntity_Behaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

} // Entity
