/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.ValueObject#getReferencedEntities <em>Referenced Entities</em>}</li>
 *   <li>{@link microserviceMetamodell.ValueObject#getValueObjects <em>Value Objects</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getValueObject()
 * @model
 * @generated
 */
public interface ValueObject extends ModelElement, Factorizeable {
	/**
	 * Returns the value of the '<em><b>Referenced Entities</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Entities</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getValueObject_ReferencedEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getReferencedEntities();

	/**
	 * Returns the value of the '<em><b>Value Objects</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Objects</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getValueObject_ValueObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObject> getValueObjects();

} // ValueObject
