/**
 */
package microserviceMetamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.Topic#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link microserviceMetamodell.Topic#getAsynchronousInterfaces <em>Asynchronous Interfaces</em>}</li>
 *   <li>{@link microserviceMetamodell.Topic#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link microserviceMetamodell.Topic#getReplicationFactor <em>Replication Factor</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getTopic_TopicName()
	 * @model
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Topic#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Asynchronous Interfaces</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodell.AsynchronousInterface}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodell.AsynchronousInterface#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynchronous Interfaces</em>' reference list.
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getTopic_AsynchronousInterfaces()
	 * @see microserviceMetamodell.AsynchronousInterface#getTopic
	 * @model opposite="topic"
	 * @generated
	 */
	EList<AsynchronousInterface> getAsynchronousInterfaces();

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' attribute.
	 * @see #setPartitions(int)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getTopic_Partitions()
	 * @model
	 * @generated
	 */
	int getPartitions();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Topic#getPartitions <em>Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partitions</em>' attribute.
	 * @see #getPartitions()
	 * @generated
	 */
	void setPartitions(int value);

	/**
	 * Returns the value of the '<em><b>Replication Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication Factor</em>' attribute.
	 * @see #setReplicationFactor(int)
	 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getTopic_ReplicationFactor()
	 * @model
	 * @generated
	 */
	int getReplicationFactor();

	/**
	 * Sets the value of the '{@link microserviceMetamodell.Topic#getReplicationFactor <em>Replication Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Factor</em>' attribute.
	 * @see #getReplicationFactor()
	 * @generated
	 */
	void setReplicationFactor(int value);

} // Topic
