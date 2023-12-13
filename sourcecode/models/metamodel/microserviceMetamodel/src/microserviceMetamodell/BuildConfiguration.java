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
 *   <li>{@link microserviceMetamodell.BuildConfiguration#getExternalDependency <em>External Dependency</em>}</li>
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
	 * Returns the value of the '<em><b>External Dependency</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.ExternalDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Dependency</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBuildConfiguration_ExternalDependency()
	 * @model
	 * @generated
	 */
	EList<ExternalDependency> getExternalDependency();
} // BuildConfiguration
