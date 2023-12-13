/**
 */
package microserviceMetamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Broker#getBrokerAddress <em>Broker Address</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBroker()
 * @model
 * @generated
 */
public interface Broker extends EObject {
	/**
	 * Returns the value of the '<em><b>Broker Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Address</em>' attribute.
	 * @see #setBrokerAddress(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getBroker_BrokerAddress()
	 * @model
	 * @generated
	 */
	String getBrokerAddress();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Broker#getBrokerAddress <em>Broker Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Address</em>' attribute.
	 * @see #getBrokerAddress()
	 * @generated
	 */
	void setBrokerAddress(String value);

} // Broker
