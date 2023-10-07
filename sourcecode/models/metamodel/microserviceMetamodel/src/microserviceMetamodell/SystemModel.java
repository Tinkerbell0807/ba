/**
 */
package microserviceMetamodell;

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
 *   <li>{@link microserviceMetamodell.SystemModel#getDescription <em>Description</em>}</li>
 *   <li>{@link microserviceMetamodell.SystemModel#getDomainModelLayer <em>Domain Model Layer</em>}</li>
 *   <li>{@link microserviceMetamodell.SystemModel#getTechnicalLayer <em>Technical Layer</em>}</li>
 *   <li>{@link microserviceMetamodell.SystemModel#getInfrastructureLayer <em>Infrastructure Layer</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSystemModel()
 * @model
 * @generated
 */
public interface SystemModel extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Domain Model Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model Layer</em>' containment reference.
	 * @see #setDomainModelLayer(DomainModelLayer)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSystemModel_DomainModelLayer()
	 * @model containment="true"
	 * @generated
	 */
	DomainModelLayer getDomainModelLayer();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.SystemModel#getDomainModelLayer <em>Domain Model Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model Layer</em>' containment reference.
	 * @see #getDomainModelLayer()
	 * @generated
	 */
	void setDomainModelLayer(DomainModelLayer value);

	/**
	 * Returns the value of the '<em><b>Technical Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Layer</em>' containment reference.
	 * @see #setTechnicalLayer(TechnicalLayer)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSystemModel_TechnicalLayer()
	 * @model containment="true"
	 * @generated
	 */
	TechnicalLayer getTechnicalLayer();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.SystemModel#getTechnicalLayer <em>Technical Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Layer</em>' containment reference.
	 * @see #getTechnicalLayer()
	 * @generated
	 */
	void setTechnicalLayer(TechnicalLayer value);

	/**
	 * Returns the value of the '<em><b>Infrastructure Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Layer</em>' containment reference.
	 * @see #setInfrastructureLayer(InfrastructureLayer)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSystemModel_InfrastructureLayer()
	 * @model containment="true"
	 * @generated
	 */
	InfrastructureLayer getInfrastructureLayer();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.SystemModel#getInfrastructureLayer <em>Infrastructure Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure Layer</em>' containment reference.
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	void setInfrastructureLayer(InfrastructureLayer value);

} // SystemModel
