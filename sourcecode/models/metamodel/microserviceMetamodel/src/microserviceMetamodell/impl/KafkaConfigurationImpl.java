/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.KafkaConfiguration;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.Topic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kafka Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.KafkaConfigurationImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.KafkaConfigurationImpl#getBootstrapServerPort <em>Bootstrap Server Port</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.KafkaConfigurationImpl#getKafkaServiceName <em>Kafka Service Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafkaConfigurationImpl extends MinimalEObjectImpl.Container implements KafkaConfiguration {
	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topics;

	/**
	 * The default value of the '{@link #getBootstrapServerPort() <em>Bootstrap Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootstrapServerPort()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOTSTRAP_SERVER_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBootstrapServerPort() <em>Bootstrap Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootstrapServerPort()
	 * @generated
	 * @ordered
	 */
	protected String bootstrapServerPort = BOOTSTRAP_SERVER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKafkaServiceName() <em>Kafka Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String KAFKA_SERVICE_NAME_EDEFAULT = "kafka";

	/**
	 * The cached value of the '{@link #getKafkaServiceName() <em>Kafka Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaServiceName()
	 * @generated
	 * @ordered
	 */
	protected String kafkaServiceName = KAFKA_SERVICE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafkaConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.KAFKA_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<Topic>(Topic.class, this, MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBootstrapServerPort() {
		return bootstrapServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBootstrapServerPort(String newBootstrapServerPort) {
		String oldBootstrapServerPort = bootstrapServerPort;
		bootstrapServerPort = newBootstrapServerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BOOTSTRAP_SERVER_PORT, oldBootstrapServerPort, bootstrapServerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKafkaServiceName() {
		return kafkaServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKafkaServiceName(String newKafkaServiceName) {
		String oldKafkaServiceName = kafkaServiceName;
		kafkaServiceName = newKafkaServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__KAFKA_SERVICE_NAME, oldKafkaServiceName, kafkaServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__TOPICS:
				return getTopics();
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BOOTSTRAP_SERVER_PORT:
				return getBootstrapServerPort();
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__KAFKA_SERVICE_NAME:
				return getKafkaServiceName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BOOTSTRAP_SERVER_PORT:
				setBootstrapServerPort((String)newValue);
				return;
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__KAFKA_SERVICE_NAME:
				setKafkaServiceName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__TOPICS:
				getTopics().clear();
				return;
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BOOTSTRAP_SERVER_PORT:
				setBootstrapServerPort(BOOTSTRAP_SERVER_PORT_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__KAFKA_SERVICE_NAME:
				setKafkaServiceName(KAFKA_SERVICE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__TOPICS:
				return topics != null && !topics.isEmpty();
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BOOTSTRAP_SERVER_PORT:
				return BOOTSTRAP_SERVER_PORT_EDEFAULT == null ? bootstrapServerPort != null : !BOOTSTRAP_SERVER_PORT_EDEFAULT.equals(bootstrapServerPort);
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__KAFKA_SERVICE_NAME:
				return KAFKA_SERVICE_NAME_EDEFAULT == null ? kafkaServiceName != null : !KAFKA_SERVICE_NAME_EDEFAULT.equals(kafkaServiceName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (bootstrapServerPort: ");
		result.append(bootstrapServerPort);
		result.append(", kafkaServiceName: ");
		result.append(kafkaServiceName);
		result.append(')');
		return result.toString();
	}

} //KafkaConfigurationImpl
