/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.BuildConfiguration;
import microserviceMetamodell.BuildTool;
import microserviceMetamodell.ExternalDependency;
import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.BuildConfigurationImpl#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.BuildConfigurationImpl#getExternalDependencies <em>External Dependencies</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.BuildConfigurationImpl#getBuildTool <em>Build Tool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildConfigurationImpl extends MinimalEObjectImpl.Container implements BuildConfiguration {
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
	 * The cached value of the '{@link #getExternalDependencies() <em>External Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalDependency> externalDependencies;

	/**
	 * The default value of the '{@link #getBuildTool() <em>Build Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildTool()
	 * @generated
	 * @ordered
	 */
	protected static final BuildTool BUILD_TOOL_EDEFAULT = BuildTool.GRADLE;

	/**
	 * The cached value of the '{@link #getBuildTool() <em>Build Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildTool()
	 * @generated
	 * @ordered
	 */
	protected BuildTool buildTool = BUILD_TOOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.BUILD_CONFIGURATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE, oldMicroservice, microservice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE, oldMicroservice, newMicroservice);
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
				msgs = ((InternalEObject)microservice).eInverseRemove(this, MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION, Microservice.class, msgs);
			if (newMicroservice != null)
				msgs = ((InternalEObject)newMicroservice).eInverseAdd(this, MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION, Microservice.class, msgs);
			msgs = basicSetMicroservice(newMicroservice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE, newMicroservice, newMicroservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalDependency> getExternalDependencies() {
		if (externalDependencies == null) {
			externalDependencies = new EObjectResolvingEList<ExternalDependency>(ExternalDependency.class, this, MicroserviceMetamodellPackage.BUILD_CONFIGURATION__EXTERNAL_DEPENDENCIES);
		}
		return externalDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildTool getBuildTool() {
		return buildTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildTool(BuildTool newBuildTool) {
		BuildTool oldBuildTool = buildTool;
		buildTool = newBuildTool == null ? BUILD_TOOL_EDEFAULT : newBuildTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.BUILD_CONFIGURATION__BUILD_TOOL, oldBuildTool, buildTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE:
				if (microservice != null)
					msgs = ((InternalEObject)microservice).eInverseRemove(this, MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION, Microservice.class, msgs);
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
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE:
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
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE:
				if (resolve) return getMicroservice();
				return basicGetMicroservice();
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__EXTERNAL_DEPENDENCIES:
				return getExternalDependencies();
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__BUILD_TOOL:
				return getBuildTool();
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
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE:
				setMicroservice((Microservice)newValue);
				return;
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__EXTERNAL_DEPENDENCIES:
				getExternalDependencies().clear();
				getExternalDependencies().addAll((Collection<? extends ExternalDependency>)newValue);
				return;
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__BUILD_TOOL:
				setBuildTool((BuildTool)newValue);
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
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE:
				setMicroservice((Microservice)null);
				return;
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__EXTERNAL_DEPENDENCIES:
				getExternalDependencies().clear();
				return;
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__BUILD_TOOL:
				setBuildTool(BUILD_TOOL_EDEFAULT);
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
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE:
				return microservice != null;
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__EXTERNAL_DEPENDENCIES:
				return externalDependencies != null && !externalDependencies.isEmpty();
			case MicroserviceMetamodellPackage.BUILD_CONFIGURATION__BUILD_TOOL:
				return buildTool != BUILD_TOOL_EDEFAULT;
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
		result.append(" (buildTool: ");
		result.append(buildTool);
		result.append(')');
		return result.toString();
	}

} //BuildConfigurationImpl
