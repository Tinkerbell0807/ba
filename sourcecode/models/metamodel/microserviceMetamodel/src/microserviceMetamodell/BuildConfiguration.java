/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.BuildConfiguration#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link microserviceMetamodell.BuildConfiguration#getExternalDependencies <em>External Dependencies</em>}</li>
 *   <li>{@link microserviceMetamodell.BuildConfiguration#getBuildTool <em>Build Tool</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBuildConfiguration()
 * @model
 * @generated
 */
public interface BuildConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.Microservice#getBuildConfiguration <em>Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' reference.
	 * @see #setMicroservice(Microservice)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBuildConfiguration_Microservice()
	 * @see microserviceMetamodell.Microservice#getBuildConfiguration
	 * @model opposite="buildConfiguration"
	 * @generated
	 */
	Microservice getMicroservice();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.BuildConfiguration#getMicroservice <em>Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice</em>' reference.
	 * @see #getMicroservice()
	 * @generated
	 */
	void setMicroservice(Microservice value);

	/**
	 * Returns the value of the '<em><b>External Dependencies</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.ExternalDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Dependencies</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBuildConfiguration_ExternalDependencies()
	 * @model
	 * @generated
	 */
	EList<ExternalDependency> getExternalDependencies();

	/**
	 * Returns the value of the '<em><b>Build Tool</b></em>' attribute.
	 * The literals are from the enumeration {@link microserviceMetamodell.BuildTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Tool</em>' attribute.
	 * @see microserviceMetamodell.BuildTool
	 * @see #setBuildTool(BuildTool)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBuildConfiguration_BuildTool()
	 * @model
	 * @generated
	 */
	BuildTool getBuildTool();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.BuildConfiguration#getBuildTool <em>Build Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Tool</em>' attribute.
	 * @see microserviceMetamodell.BuildTool
	 * @see #getBuildTool()
	 * @generated
	 */
	void setBuildTool(BuildTool value);

} // BuildConfiguration
