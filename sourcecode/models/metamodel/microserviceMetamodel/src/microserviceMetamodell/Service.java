/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Service#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link microserviceMetamodell.Service#getReferencedElements <em>Referenced Elements</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getService()
 * @model
 * @generated
 */
public interface Service extends ModelElement, Factorizeable {
	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getService_Behaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

	/**
	 * Returns the value of the '<em><b>Referenced Elements</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Elements</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getService_ReferencedElements()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getReferencedElements();

} // Service
