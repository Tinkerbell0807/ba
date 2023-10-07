/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Module#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link microserviceMetamodell.Module#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link microserviceMetamodell.Module#getSubmodules <em>Submodules</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModule_ModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelElements();

	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModule_ModuleName()
	 * @model
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Module#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Submodules</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodules</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getModule_Submodules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getSubmodules();

} // Module
