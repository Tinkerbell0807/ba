/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link microserviceMetamodell.ModelElement#getElementName <em>Element Name</em>}</li>
 *   <li>{@link microserviceMetamodell.ModelElement#getReferencedInterfaces <em>Referenced Interfaces</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Referenced Interfaces</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.Interface}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.Interface#getReferencedElements <em>Referenced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Interfaces</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModelElement_ReferencedInterfaces()
	 * @see microserviceMetamodell.Interface#getReferencedElements
	 * @model opposite="referencedElements"
	 * @generated
	 */
	EList<Interface> getReferencedInterfaces();

} // ModelElement
