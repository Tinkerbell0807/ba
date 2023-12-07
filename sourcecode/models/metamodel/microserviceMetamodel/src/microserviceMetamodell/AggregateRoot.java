/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.AggregateRoot#getRootEntity <em>Root Entity</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAggregateRoot()
 * @model
 * @generated
 */
public interface AggregateRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Entity</em>' reference.
	 * @see #setRootEntity(EntityNode)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAggregateRoot_RootEntity()
	 * @model required="true"
	 * @generated
	 */
	EntityNode getRootEntity();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.AggregateRoot#getRootEntity <em>Root Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Entity</em>' reference.
	 * @see #getRootEntity()
	 * @generated
	 */
	void setRootEntity(EntityNode value);

} // AggregateRoot
