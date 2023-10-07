/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.EntityNode#getValueObjectNodes <em>Value Object Nodes</em>}</li>
 *   <li>{@link microserviceMetamodell.EntityNode#getBehaviours <em>Behaviours</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getEntityNode()
 * @model
 * @generated
 */
public interface EntityNode extends AggregateNode {
	/**
	 * Returns the value of the '<em><b>Value Object Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.ValueObjectNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Object Nodes</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getEntityNode_ValueObjectNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObjectNode> getValueObjectNodes();

	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getEntityNode_Behaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

} // EntityNode
