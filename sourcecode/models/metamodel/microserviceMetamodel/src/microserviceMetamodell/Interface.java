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
 *   <li>{@link microserviceMetamodell.Interface#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link microserviceMetamodell.Interface#getReferencedElements <em>Referenced Elements</em>}</li>
 *   <li>{@link microserviceMetamodell.Interface#getReferencedRelationships <em>Referenced Relationships</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Referenced Elements</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.ModelElement}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.ModelElement#getReferencedInterfaces <em>Referenced Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Elements</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInterface_ReferencedElements()
	 * @see microserviceMetamodell.ModelElement#getReferencedInterfaces
	 * @model opposite="referencedInterfaces"
	 * @generated
	 */
	EList<ModelElement> getReferencedElements();

	/**
	 * Returns the value of the '<em><b>Referenced Relationships</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.CustomerSupplier}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.CustomerSupplier#getAffectedInterfaces <em>Affected Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Relationships</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getInterface_ReferencedRelationships()
	 * @see microserviceMetamodell.CustomerSupplier#getAffectedInterfaces
	 * @model opposite="affectedInterfaces"
	 * @generated
	 */
	EList<CustomerSupplier> getReferencedRelationships();

} // Interface
