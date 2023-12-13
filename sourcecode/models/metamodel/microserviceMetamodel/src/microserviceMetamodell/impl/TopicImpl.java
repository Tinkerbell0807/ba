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
 *   <li>{@link microserviceMetamodell.impl.TopicImpl#getTopicNameAbbreviation <em>Topic Name Abbreviation</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.TopicImpl#getAsynchronousInterfaces <em>Asynchronous Interfaces</em>}</li>
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
	 * The default value of the '{@link #getTopicNameAbbreviation() <em>Topic Name Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicNameAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_ABBREVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicNameAbbreviation() <em>Topic Name Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicNameAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String topicNameAbbreviation = TOPIC_NAME_ABBREVIATION_EDEFAULT;

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
	public String getTopicNameAbbreviation() {
		return topicNameAbbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicNameAbbreviation(String newTopicNameAbbreviation) {
		String oldTopicNameAbbreviation = topicNameAbbreviation;
		topicNameAbbreviation = newTopicNameAbbreviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME_ABBREVIATION, oldTopicNameAbbreviation, topicNameAbbreviation));
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
			case MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME_ABBREVIATION:
				return getTopicNameAbbreviation();
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				return getAsynchronousInterfaces();
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
			case MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME_ABBREVIATION:
				setTopicNameAbbreviation((String)newValue);
				return;
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				getAsynchronousInterfaces().clear();
				getAsynchronousInterfaces().addAll((Collection<? extends AsynchronousInterface>)newValue);
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
			case MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME_ABBREVIATION:
				setTopicNameAbbreviation(TOPIC_NAME_ABBREVIATION_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				getAsynchronousInterfaces().clear();
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
			case MicroserviceMetamodellPackage.TOPIC__TOPIC_NAME_ABBREVIATION:
				return TOPIC_NAME_ABBREVIATION_EDEFAULT == null ? topicNameAbbreviation != null : !TOPIC_NAME_ABBREVIATION_EDEFAULT.equals(topicNameAbbreviation);
			case MicroserviceMetamodellPackage.TOPIC__ASYNCHRONOUS_INTERFACES:
				return asynchronousInterfaces != null && !asynchronousInterfaces.isEmpty();
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
		result.append(", topicNameAbbreviation: ");
		result.append(topicNameAbbreviation);
		result.append(')');
		return result.toString();
	}

} //TopicImpl
