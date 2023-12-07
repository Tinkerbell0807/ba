/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.ModelElement#getIsImplementedTrough <em>Is Implemented Trough</em>}</li>
 *   <li>{@link microserviceMetamodell.ModelElement#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Implemented Trough</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.ModelElementImplementation#getCorrespondingModelElement <em>Corresponding Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Implemented Trough</em>' reference.
	 * @see #setIsImplementedTrough(ModelElementImplementation)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElement_IsImplementedTrough()
	 * @see microserviceMetamodell.ModelElementImplementation#getCorrespondingModelElement
	 * @model opposite="correspondingModelElement"
	 * @generated
	 */
	ModelElementImplementation getIsImplementedTrough();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.ModelElement#getIsImplementedTrough <em>Is Implemented Trough</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implemented Trough</em>' reference.
	 * @see #getIsImplementedTrough()
	 * @generated
	 */
	void setIsImplementedTrough(ModelElementImplementation value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElement_ElementName()
	 * @model
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.ModelElement#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

} // ModelElement
