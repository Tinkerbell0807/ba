/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.DeploymentConfiguration;
import microserviceMetamodell.GCloudMachineType;
import microserviceMetamodell.KubernetesClusterConfiguration;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kubernetes Cluster Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.KubernetesClusterConfigurationImpl#getClusterName <em>Cluster Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.KubernetesClusterConfigurationImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.KubernetesClusterConfigurationImpl#getMachineType <em>Machine Type</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.KubernetesClusterConfigurationImpl#getDeployments <em>Deployments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KubernetesClusterConfigurationImpl extends MinimalEObjectImpl.Container implements KubernetesClusterConfiguration {
	/**
	 * The default value of the '{@link #getClusterName() <em>Cluster Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterName() <em>Cluster Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterName()
	 * @generated
	 * @ordered
	 */
	protected String clusterName = CLUSTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodes() <em>Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int NODES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected int nodes = NODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMachineType() <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected static final GCloudMachineType MACHINE_TYPE_EDEFAULT = GCloudMachineType.E2_SMALL;

	/**
	 * The cached value of the '{@link #getMachineType() <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected GCloudMachineType machineType = MACHINE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentConfiguration> deployments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KubernetesClusterConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.KUBERNETES_CLUSTER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClusterName() {
		return clusterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusterName(String newClusterName) {
		String oldClusterName = clusterName;
		clusterName = newClusterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__CLUSTER_NAME, oldClusterName, clusterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(int newNodes) {
		int oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__NODES, oldNodes, nodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCloudMachineType getMachineType() {
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineType(GCloudMachineType newMachineType) {
		GCloudMachineType oldMachineType = machineType;
		machineType = newMachineType == null ? MACHINE_TYPE_EDEFAULT : newMachineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__MACHINE_TYPE, oldMachineType, machineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentConfiguration> getDeployments() {
		if (deployments == null) {
			deployments = new EObjectResolvingEList<DeploymentConfiguration>(DeploymentConfiguration.class, this, MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__DEPLOYMENTS);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__CLUSTER_NAME:
				return getClusterName();
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__NODES:
				return getNodes();
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__MACHINE_TYPE:
				return getMachineType();
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__DEPLOYMENTS:
				return getDeployments();
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
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__CLUSTER_NAME:
				setClusterName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__NODES:
				setNodes((Integer)newValue);
				return;
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__MACHINE_TYPE:
				setMachineType((GCloudMachineType)newValue);
				return;
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__DEPLOYMENTS:
				getDeployments().clear();
				getDeployments().addAll((Collection<? extends DeploymentConfiguration>)newValue);
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
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__CLUSTER_NAME:
				setClusterName(CLUSTER_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__NODES:
				setNodes(NODES_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__MACHINE_TYPE:
				setMachineType(MACHINE_TYPE_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__DEPLOYMENTS:
				getDeployments().clear();
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
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__CLUSTER_NAME:
				return CLUSTER_NAME_EDEFAULT == null ? clusterName != null : !CLUSTER_NAME_EDEFAULT.equals(clusterName);
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__NODES:
				return nodes != NODES_EDEFAULT;
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__MACHINE_TYPE:
				return machineType != MACHINE_TYPE_EDEFAULT;
			case MicroserviceMetamodellPackage.KUBERNETES_CLUSTER_CONFIGURATION__DEPLOYMENTS:
				return deployments != null && !deployments.isEmpty();
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
		result.append(" (clusterName: ");
		result.append(clusterName);
		result.append(", nodes: ");
		result.append(nodes);
		result.append(", machineType: ");
		result.append(machineType);
		result.append(')');
		return result.toString();
	}

} //KubernetesClusterConfigurationImpl
