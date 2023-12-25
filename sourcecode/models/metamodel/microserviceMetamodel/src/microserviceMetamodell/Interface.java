/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Interface#getInterfaceFor <em>Interface For</em>}</li>
 *   <li>{@link microserviceMetamodell.Interface#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface For</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface For</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInterface_InterfaceFor()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getInterfaceFor();

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInterface_InterfaceName()
	 * @model
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Interface#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

} // Interface
