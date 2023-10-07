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
 *   <li>{@link microserviceMetamodell.KafkaConfiguration#getBootstrapServerPort <em>Bootstrap Server Port</em>}</li>
 *   <li>{@link microserviceMetamodell.KafkaConfiguration#getKafkaServiceName <em>Kafka Service Name</em>}</li>
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
	 * Returns the value of the '<em><b>Bootstrap Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bootstrap Server Port</em>' attribute.
	 * @see #setBootstrapServerPort(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKafkaConfiguration_BootstrapServerPort()
	 * @model
	 * @generated
	 */
	String getBootstrapServerPort();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.KafkaConfiguration#getBootstrapServerPort <em>Bootstrap Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bootstrap Server Port</em>' attribute.
	 * @see #getBootstrapServerPort()
	 * @generated
	 */
	void setBootstrapServerPort(String value);

	/**
	 * Returns the value of the '<em><b>Kafka Service Name</b></em>' attribute.
	 * The default value is <code>"kafka"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Service Name</em>' attribute.
	 * @see #setKafkaServiceName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getKafkaConfiguration_KafkaServiceName()
	 * @model default="kafka"
	 * @generated
	 */
	String getKafkaServiceName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.KafkaConfiguration#getKafkaServiceName <em>Kafka Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kafka Service Name</em>' attribute.
	 * @see #getKafkaServiceName()
	 * @generated
	 */
	void setKafkaServiceName(String value);

} // KafkaConfiguration
