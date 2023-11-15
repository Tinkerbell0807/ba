/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.SystemModel#getWebservices <em>Webservices</em>}</li>
 *   <li>{@link microserviceMetamodell.SystemModel#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSystemModel()
 * @model
 * @generated
 */
public interface SystemModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Webservices</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.DomainWebservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webservices</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSystemModel_Webservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainWebservice> getWebservices();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSystemModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.SystemModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SystemModel
