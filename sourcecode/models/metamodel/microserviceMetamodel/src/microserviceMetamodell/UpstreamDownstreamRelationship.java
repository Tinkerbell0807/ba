/**
 */
package microserviceMetamodell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upstream Downstream Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.UpstreamDownstreamRelationship#getDownstream <em>Downstream</em>}</li>
 *   <li>{@link microserviceMetamodell.UpstreamDownstreamRelationship#getUpstream <em>Upstream</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamDownstreamRelationship()
 * @model abstract="true"
 * @generated
 */
public interface UpstreamDownstreamRelationship extends BoundedContextRelationship {
	/**
	 * Returns the value of the '<em><b>Downstream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream</em>' containment reference.
	 * @see #setDownstream(RelationshipRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamDownstreamRelationship_Downstream()
	 * @model containment="true"
	 * @generated
	 */
	RelationshipRole getDownstream();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.UpstreamDownstreamRelationship#getDownstream <em>Downstream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downstream</em>' containment reference.
	 * @see #getDownstream()
	 * @generated
	 */
	void setDownstream(RelationshipRole value);

	/**
	 * Returns the value of the '<em><b>Upstream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream</em>' containment reference.
	 * @see #setUpstream(RelationshipRole)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamDownstreamRelationship_Upstream()
	 * @model containment="true"
	 * @generated
	 */
	RelationshipRole getUpstream();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.UpstreamDownstreamRelationship#getUpstream <em>Upstream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upstream</em>' containment reference.
	 * @see #getUpstream()
	 * @generated
	 */
	void setUpstream(RelationshipRole value);

} // UpstreamDownstreamRelationship
