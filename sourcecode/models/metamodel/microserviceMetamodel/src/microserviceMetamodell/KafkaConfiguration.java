/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kafka Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.KafkaConfiguration#getTopics <em>Topics</em>}</li>
 *   <li>{@link microserviceMetamodell.KafkaConfiguration#getBrokers <em>Brokers</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKafkaConfiguration()
 * @model
 * @generated
 */
public interface KafkaConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKafkaConfiguration_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Brokers</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodell.Broker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brokers</em>' containment reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKafkaConfiguration_Brokers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Broker> getBrokers();

} // KafkaConfiguration
