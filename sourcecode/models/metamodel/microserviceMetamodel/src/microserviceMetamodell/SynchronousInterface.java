/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronous Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.SynchronousInterface#getRestEndpoints <em>Rest Endpoints</em>}</li>
 *   <li>{@link microserviceMetamodell.SynchronousInterface#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSynchronousInterface()
 * @model
 * @generated
 */
public interface SynchronousInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Rest Endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.RestEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Endpoints</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSynchronousInterface_RestEndpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestEndpoint> getRestEndpoints();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getSynchronousInterface_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.SynchronousInterface#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // SynchronousInterface
