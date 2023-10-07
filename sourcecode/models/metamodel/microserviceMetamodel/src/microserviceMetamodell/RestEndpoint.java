/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.RestEndpoint#getPath <em>Path</em>}</li>
 *   <li>{@link microserviceMetamodell.RestEndpoint#getHttpMethod <em>Http Method</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getRestEndpoint()
 * @model
 * @generated
 */
public interface RestEndpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getRestEndpoint_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.RestEndpoint#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link microserviceMetamodell.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see microserviceMetamodell.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getRestEndpoint_HttpMethod()
	 * @model
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.RestEndpoint#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see microserviceMetamodell.HttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethod value);

} // RestEndpoint
