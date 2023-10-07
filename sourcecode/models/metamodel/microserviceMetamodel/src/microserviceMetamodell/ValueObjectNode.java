/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.ValueObjectNode#getValueObjectNodes <em>Value Object Nodes</em>}</li>
 *   <li>{@link microserviceMetamodell.ValueObjectNode#getReferencedEntities <em>Referenced Entities</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getValueObjectNode()
 * @model
 * @generated
 */
public interface ValueObjectNode extends AggregateNode {
	/**
	 * Returns the value of the '<em><b>Value Object Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.ValueObjectNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Object Nodes</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getValueObjectNode_ValueObjectNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObjectNode> getValueObjectNodes();

	/**
	 * Returns the value of the '<em><b>Referenced Entities</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.EntityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Entities</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getValueObjectNode_ReferencedEntities()
	 * @model
	 * @generated
	 */
	EList<EntityNode> getReferencedEntities();

} // ValueObjectNode
