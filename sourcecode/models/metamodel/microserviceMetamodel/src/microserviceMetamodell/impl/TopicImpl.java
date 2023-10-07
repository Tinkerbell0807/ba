/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.AsynchronousInterface;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.Topic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.TopicImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.TopicImpl#getAsynchronousInterfaces <em>Asynchronous Interfaces</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.TopicImpl#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.TopicImpl#getReplicationFactor <em>Replication Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends MinimalEObjectImpl.Container implements Topic {
	/**
	 * The default value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected String topicName = TOPIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsynchronousInterfaces() <em>Asynchronous Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchronousInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<AsynchronousInterface> asynchronousInterfaces;

	/**
	 * The default value of the '{@link #getPartitions() <em>Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected static final int PARTITIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected int partitions = PARTITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicationFactor() <em>Replication Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICATION_FACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicationFactor() <em>Replication Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationFactor()
	 * @generated
	 * @ordered
	 */
	protected int replicationFactor = REPLICATION_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicName() {
		return topicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicName(String newTopicName) {
		String oldTopicName = topicName;
		topicName = newTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsynchronousInterface> getAsynchronousInterfaces() {
		if (asynchronousInterfaces == null) {
			asynchronousInterfaces = new EObjectWithInverseResolvingEList<AsynchronousInterface>(AsynchronousInterface.class, this, MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES, MicroserviceMetamodellPackage.ASYNCHRONOUS_INTERFACE__TOPIC);
		}
		return asynchronousInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPartitions() {
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitions(int newPartitions) {
		int oldPartitions = partitions;
		partitions = newPartitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.TOPIC__PARTITIONS, oldPartitions, partitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicationFactor() {
		return replicationFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicationFactor(int newReplicationFactor) {
		int oldReplicationFactor = replicationFactor;
		replicationFactor = newReplicationFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.TOPIC__REPLICATION_FACTOR, oldReplicationFactor, replicationFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAsynchronousInterfaces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				return ((InternalEList<?>)getAsynchronousInterfaces()).basicRemove(otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME:
				return getTopicName();
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				return getAsynchronousInterfaces();
			case MicroserviceMetamodellPackage.TOPIC__PARTITIONS:
				return getPartitions();
			case MicroserviceMetamodellPackage.TOPIC__REPLICATION_FACTOR:
				return getReplicationFactor();
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
			case MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME:
				setTopicName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				getAsynchronousInterfaces().clear();
				getAsynchronousInterfaces().addAll((Collection<? extends AsynchronousInterface>)newValue);
				return;
			case MicroserviceMetamodellPackage.TOPIC__PARTITIONS:
				setPartitions((Integer)newValue);
				return;
			case MicroserviceMetamodellPackage.TOPIC__REPLICATION_FACTOR:
				setReplicationFactor((Integer)newValue);
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
			case MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				getAsynchronousInterfaces().clear();
				return;
			case MicroserviceMetamodellPackage.TOPIC__PARTITIONS:
				setPartitions(PARTITIONS_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.TOPIC__REPLICATION_FACTOR:
				setReplicationFactor(REPLICATION_FACTOR_EDEFAULT);
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
			case MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				return asynchronousInterfaces != null && !asynchronousInterfaces.isEmpty();
			case MicroserviceMetamodellPackage.TOPIC__PARTITIONS:
				return partitions != PARTITIONS_EDEFAULT;
			case MicroserviceMetamodellPackage.TOPIC__REPLICATION_FACTOR:
				return replicationFactor != REPLICATION_FACTOR_EDEFAULT;
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
		result.append(" (topicName: ");
		result.append(topicName);
		result.append(", partitions: ");
		result.append(partitions);
		result.append(", replicationFactor: ");
		result.append(replicationFactor);
		result.append(')');
		return result.toString();
	}

} //TopicImpl
