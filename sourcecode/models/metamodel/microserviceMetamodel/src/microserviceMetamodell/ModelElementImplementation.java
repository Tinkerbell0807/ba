/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.ModelElementImplementation#getCorrespondingModelElement <em>Corresponding Model Element</em>}</li>
 *   <li>{@link microserviceMetamodell.ModelElementImplementation#getClassName <em>Class Name</em>}</li>
 *   <li>{@link microserviceMetamodell.ModelElementImplementation#getSendsRequestTo <em>Sends Request To</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElementImplementation()
 * @model
 * @generated
 */
public interface ModelElementImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Corresponding Model Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.ModelElement#getIsImplementedTrough <em>Is Implemented Trough</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Model Element</em>' reference.
	 * @see #setCorrespondingModelElement(ModelElement)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElementImplementation_CorrespondingModelElement()
	 * @see microserviceMetamodell.ModelElement#getIsImplementedTrough
	 * @model opposite="isImplementedTrough"
	 * @generated
	 */
	ModelElement getCorrespondingModelElement();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.ModelElementImplementation#getCorrespondingModelElement <em>Corresponding Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Model Element</em>' reference.
	 * @see #getCorrespondingModelElement()
	 * @generated
	 */
	void setCorrespondingModelElement(ModelElement value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElementImplementation_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.ModelElementImplementation#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Sends Request To</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.RestEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Request To</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElementImplementation_SendsRequestTo()
	 * @model
	 * @generated
	 */
	EList<RestEndpoint> getSendsRequestTo();

} // ModelElementImplementation
