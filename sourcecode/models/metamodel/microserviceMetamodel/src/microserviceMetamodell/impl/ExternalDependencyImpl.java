/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.ExternalDependency;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.SharedKernel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.ExternalDependencyImpl#getSharedKernel <em>Shared Kernel</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ExternalDependencyImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ExternalDependencyImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.ExternalDependencyImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalDependencyImpl extends MinimalEObjectImpl.Container implements ExternalDependency {
	/**
	 * The cached value of the '{@link #getSharedKernel() <em>Shared Kernel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedKernel()
	 * @generated
	 * @ordered
	 */
	protected SharedKernel sharedKernel;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected String artifactId = ARTIFACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.EXTERNAL_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedKernel getSharedKernel() {
		if (sharedKernel != null && sharedKernel.eIsProxy()) {
			InternalEObject oldSharedKernel = (InternalEObject)sharedKernel;
			sharedKernel = (SharedKernel)eResolveProxy(oldSharedKernel);
			if (sharedKernel != oldSharedKernel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, oldSharedKernel, sharedKernel));
			}
		}
		return sharedKernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedKernel basicGetSharedKernel() {
		return sharedKernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedKernel(SharedKernel newSharedKernel, NotificationChain msgs) {
		SharedKernel oldSharedKernel = sharedKernel;
		sharedKernel = newSharedKernel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, oldSharedKernel, newSharedKernel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedKernel(SharedKernel newSharedKernel) {
		if (newSharedKernel != sharedKernel) {
			NotificationChain msgs = null;
			if (sharedKernel != null)
				msgs = ((InternalEObject)sharedKernel).eInverseRemove(this, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, SharedKernel.class, msgs);
			if (newSharedKernel != null)
				msgs = ((InternalEObject)newSharedKernel).eInverseAdd(this, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, SharedKernel.class, msgs);
			msgs = basicSetSharedKernel(newSharedKernel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL, newSharedKernel, newSharedKernel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactId() {
		return artifactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactId(String newArtifactId) {
		String oldArtifactId = artifactId;
		artifactId = newArtifactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__ARTIFACT_ID, oldArtifactId, artifactId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				if (sharedKernel != null)
					msgs = ((InternalEObject)sharedKernel).eInverseRemove(this, MicroserviceMetamodellPackage.SHARED_KERNEL__IMPLEMENTING_LIB, SharedKernel.class, msgs);
				return basicSetSharedKernel((SharedKernel)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				return basicSetSharedKernel(null, msgs);
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				if (resolve) return getSharedKernel();
				return basicGetSharedKernel();
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__GROUP_ID:
				return getGroupId();
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__ARTIFACT_ID:
				return getArtifactId();
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__VERSION:
				return getVersion();
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				setSharedKernel((SharedKernel)newValue);
				return;
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__VERSION:
				setVersion((String)newValue);
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				setSharedKernel((SharedKernel)null);
				return;
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__SHARED_KERNEL:
				return sharedKernel != null;
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case MicroserviceMetamodellPackage.EXTERNAL_DEPENDENCY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(", artifactId: ");
		result.append(artifactId);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ExternalDependencyImpl
