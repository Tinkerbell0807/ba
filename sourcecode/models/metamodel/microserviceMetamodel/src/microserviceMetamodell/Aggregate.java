/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Aggregate#getAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link microserviceMetamodell.Aggregate#getAggregateNode <em>Aggregate Node</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAggregate()
 * @model
 * @generated
 */
public interface Aggregate extends Factorizeable, ModelElement, Persistable {
	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' containment reference.
	 * @see #setAggregateRoot(EntityNode)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAggregate_AggregateRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntityNode getAggregateRoot();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Aggregate#getAggregateRoot <em>Aggregate Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' containment reference.
	 * @see #getAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(EntityNode value);

	/**
	 * Returns the value of the '<em><b>Aggregate Node</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.AggregateNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Node</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getAggregate_AggregateNode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AggregateNode> getAggregateNode();

} // Aggregate
