/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.DeploymentConfiguration;
import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.DeploymentConfigurationImpl#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DeploymentConfigurationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DeploymentConfigurationImpl#getNodePort <em>Node Port</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.DeploymentConfigurationImpl#getReplicas <em>Replicas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentConfigurationImpl extends MinimalEObjectImpl.Container implements DeploymentConfiguration {
	/**
	 * The cached value of the '{@link #getMicroservice() <em>Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservice()
	 * @generated
	 * @ordered
	 */
	protected Microservice microservice;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodePort() <em>Node Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePort()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodePort() <em>Node Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePort()
	 * @generated
	 * @ordered
	 */
	protected String nodePort = NODE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected int replicas = REPLICAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DEPLOYMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice getMicroservice() {
		if (microservice != null && microservice.eIsProxy()) {
			InternalEObject oldMicroservice = (InternalEObject)microservice;
			microservice = (Microservice)eResolveProxy(oldMicroservice);
			if (microservice != oldMicroservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE, oldMicroservice, microservice));
			}
		}
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice basicGetMicroservice() {
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicroservice(Microservice newMicroservice, NotificationChain msgs) {
		Microservice oldMicroservice = microservice;
		microservice = newMicroservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE, oldMicroservice, newMicroservice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicroservice(Microservice newMicroservice) {
		if (newMicroservice != microservice) {
			NotificationChain msgs = null;
			if (microservice != null)
				msgs = ((InternalEObject)microservice).eInverseRemove(this, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYMENT_CONFIGURATION, Microservice.class, msgs);
			if (newMicroservice != null)
				msgs = ((InternalEObject)newMicroservice).eInverseAdd(this, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYMENT_CONFIGURATION, Microservice.class, msgs);
			msgs = basicSetMicroservice(newMicroservice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE, newMicroservice, newMicroservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodePort() {
		return nodePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodePort(String newNodePort) {
		String oldNodePort = nodePort;
		nodePort = newNodePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__NODE_PORT, oldNodePort, nodePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicas() {
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicas(int newReplicas) {
		int oldReplicas = replicas;
		replicas = newReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__REPLICAS, oldReplicas, replicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE:
				if (microservice != null)
					msgs = ((InternalEObject)microservice).eInverseRemove(this, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYMENT_CONFIGURATION, Microservice.class, msgs);
				return basicSetMicroservice((Microservice)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE:
				return basicSetMicroservice(null, msgs);
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
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE:
				if (resolve) return getMicroservice();
				return basicGetMicroservice();
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__PORT:
				return getPort();
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__NODE_PORT:
				return getNodePort();
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__REPLICAS:
				return getReplicas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE:
				setMicroservice((Microservice)newValue);
				return;
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__PORT:
				setPort((String)newValue);
				return;
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__NODE_PORT:
				setNodePort((String)newValue);
				return;
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__REPLICAS:
				setReplicas((Integer)newValue);
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
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE:
				setMicroservice((Microservice)null);
				return;
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__NODE_PORT:
				setNodePort(NODE_PORT_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
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
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__MICROSERVICE:
				return microservice != null;
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__NODE_PORT:
				return NODE_PORT_EDEFAULT == null ? nodePort != null : !NODE_PORT_EDEFAULT.equals(nodePort);
			case MicroserviceMetamodellPackage.DEPLOYMENT_CONFIGURATION__REPLICAS:
				return replicas != REPLICAS_EDEFAULT;
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
		result.append(" (port: ");
		result.append(port);
		result.append(", nodePort: ");
		result.append(nodePort);
		result.append(", replicas: ");
		result.append(replicas);
		result.append(')');
		return result.toString();
	}

} //DeploymentConfigurationImpl
