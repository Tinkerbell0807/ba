/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;
import microserviceMetamodell.Broker;
import microserviceMetamodell.KafkaConfiguration;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.Topic;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link microserviceMetamodell.impl.KafkaConfigurationImpl#getBrokers <em>Brokers</em>}</li>
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
	 * The cached value of the '{@link #getBrokers() <em>Brokers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokers()
	 * @generated
	 * @ordered
	 */
	protected EList<Broker> brokers;

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
	public EList<Broker> getBrokers() {
		if (brokers == null) {
			brokers = new EObjectContainmentEList<Broker>(Broker.class, this, MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BROKERS);
		}
		return brokers;
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
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BROKERS:
				return ((InternalEList<?>)getBrokers()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BROKERS:
				return getBrokers();
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
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BROKERS:
				getBrokers().clear();
				getBrokers().addAll((Collection<? extends Broker>)newValue);
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
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BROKERS:
				getBrokers().clear();
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
			case MicroserviceMetamodellPackage.KAFKA_CONFIGURATION__BROKERS:
				return brokers != null && !brokers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KafkaConfigurationImpl
