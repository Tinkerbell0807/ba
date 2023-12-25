/**
 */
package microserviceMetamodell.impl;

import java.util.Collection;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.BuildConfiguration;
import microserviceMetamodell.DeployementAbstraction;
import microserviceMetamodell.ImplementationTechnology;
import microserviceMetamodell.Interface;
import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellPackage;
import microserviceMetamodell.ModelElementImplementation;
import microserviceMetamodell.RestEndpoint;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodell.impl.MicroserviceImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.MicroserviceImpl#getModelElementImplementations <em>Model Element Implementations</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.MicroserviceImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.MicroserviceImpl#getCorrespodingContext <em>Correspoding Context</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.MicroserviceImpl#getImplementationTechnology <em>Implementation Technology</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.MicroserviceImpl#getSendsRequestTo <em>Sends Request To</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.MicroserviceImpl#getDeployementAbstraction <em>Deployement Abstraction</em>}</li>
 *   <li>{@link microserviceMetamodell.impl.MicroserviceImpl#getBuildConfiguration <em>Build Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getModelElementImplementations() <em>Model Element Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElementImplementation> modelElementImplementations;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrespodingContext() <em>Correspoding Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespodingContext()
	 * @generated
	 * @ordered
	 */
	protected BoundedContext correspodingContext;

	/**
	 * The default value of the '{@link #getImplementationTechnology() <em>Implementation Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final ImplementationTechnology IMPLEMENTATION_TECHNOLOGY_EDEFAULT = ImplementationTechnology.JAVA_SPRING;

	/**
	 * The cached value of the '{@link #getImplementationTechnology() <em>Implementation Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationTechnology()
	 * @generated
	 * @ordered
	 */
	protected ImplementationTechnology implementationTechnology = IMPLEMENTATION_TECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSendsRequestTo() <em>Sends Request To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsRequestTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RestEndpoint> sendsRequestTo;

	/**
	 * The cached value of the '{@link #getDeployementAbstraction() <em>Deployement Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployementAbstraction()
	 * @generated
	 * @ordered
	 */
	protected DeployementAbstraction deployementAbstraction;

	/**
	 * The cached value of the '{@link #getBuildConfiguration() <em>Build Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildConfiguration()
	 * @generated
	 * @ordered
	 */
	protected BuildConfiguration buildConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, MicroserviceMetamodellPackage.MICROSERVICE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElementImplementation> getModelElementImplementations() {
		if (modelElementImplementations == null) {
			modelElementImplementations = new EObjectContainmentEList<ModelElementImplementation>(ModelElementImplementation.class, this, MicroserviceMetamodellPackage.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS);
		}
		return modelElementImplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MICROSERVICE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext getCorrespodingContext() {
		if (correspodingContext != null && correspodingContext.eIsProxy()) {
			InternalEObject oldCorrespodingContext = (InternalEObject)correspodingContext;
			correspodingContext = (BoundedContext)eResolveProxy(oldCorrespodingContext);
			if (correspodingContext != oldCorrespodingContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT, oldCorrespodingContext, correspodingContext));
			}
		}
		return correspodingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext basicGetCorrespodingContext() {
		return correspodingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespodingContext(BoundedContext newCorrespodingContext, NotificationChain msgs) {
		BoundedContext oldCorrespodingContext = correspodingContext;
		correspodingContext = newCorrespodingContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT, oldCorrespodingContext, newCorrespodingContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespodingContext(BoundedContext newCorrespodingContext) {
		if (newCorrespodingContext != correspodingContext) {
			NotificationChain msgs = null;
			if (correspodingContext != null)
				msgs = ((InternalEObject)correspodingContext).eInverseRemove(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES, BoundedContext.class, msgs);
			if (newCorrespodingContext != null)
				msgs = ((InternalEObject)newCorrespodingContext).eInverseAdd(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES, BoundedContext.class, msgs);
			msgs = basicSetCorrespodingContext(newCorrespodingContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT, newCorrespodingContext, newCorrespodingContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTechnology getImplementationTechnology() {
		return implementationTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationTechnology(ImplementationTechnology newImplementationTechnology) {
		ImplementationTechnology oldImplementationTechnology = implementationTechnology;
		implementationTechnology = newImplementationTechnology == null ? IMPLEMENTATION_TECHNOLOGY_EDEFAULT : newImplementationTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MICROSERVICE__IMPLEMENTATION_TECHNOLOGY, oldImplementationTechnology, implementationTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestEndpoint> getSendsRequestTo() {
		if (sendsRequestTo == null) {
			sendsRequestTo = new EObjectResolvingEList<RestEndpoint>(RestEndpoint.class, this, MicroserviceMetamodellPackage.MICROSERVICE__SENDS_REQUEST_TO);
		}
		return sendsRequestTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployementAbstraction getDeployementAbstraction() {
		if (deployementAbstraction != null && deployementAbstraction.eIsProxy()) {
			InternalEObject oldDeployementAbstraction = (InternalEObject)deployementAbstraction;
			deployementAbstraction = (DeployementAbstraction)eResolveProxy(oldDeployementAbstraction);
			if (deployementAbstraction != oldDeployementAbstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION, oldDeployementAbstraction, deployementAbstraction));
			}
		}
		return deployementAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployementAbstraction basicGetDeployementAbstraction() {
		return deployementAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployementAbstraction(DeployementAbstraction newDeployementAbstraction, NotificationChain msgs) {
		DeployementAbstraction oldDeployementAbstraction = deployementAbstraction;
		deployementAbstraction = newDeployementAbstraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION, oldDeployementAbstraction, newDeployementAbstraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployementAbstraction(DeployementAbstraction newDeployementAbstraction) {
		if (newDeployementAbstraction != deployementAbstraction) {
			NotificationChain msgs = null;
			if (deployementAbstraction != null)
				msgs = ((InternalEObject)deployementAbstraction).eInverseRemove(this, MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE, DeployementAbstraction.class, msgs);
			if (newDeployementAbstraction != null)
				msgs = ((InternalEObject)newDeployementAbstraction).eInverseAdd(this, MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE, DeployementAbstraction.class, msgs);
			msgs = basicSetDeployementAbstraction(newDeployementAbstraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION, newDeployementAbstraction, newDeployementAbstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildConfiguration getBuildConfiguration() {
		if (buildConfiguration != null && buildConfiguration.eIsProxy()) {
			InternalEObject oldBuildConfiguration = (InternalEObject)buildConfiguration;
			buildConfiguration = (BuildConfiguration)eResolveProxy(oldBuildConfiguration);
			if (buildConfiguration != oldBuildConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION, oldBuildConfiguration, buildConfiguration));
			}
		}
		return buildConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildConfiguration basicGetBuildConfiguration() {
		return buildConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildConfiguration(BuildConfiguration newBuildConfiguration, NotificationChain msgs) {
		BuildConfiguration oldBuildConfiguration = buildConfiguration;
		buildConfiguration = newBuildConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION, oldBuildConfiguration, newBuildConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildConfiguration(BuildConfiguration newBuildConfiguration) {
		if (newBuildConfiguration != buildConfiguration) {
			NotificationChain msgs = null;
			if (buildConfiguration != null)
				msgs = ((InternalEObject)buildConfiguration).eInverseRemove(this, MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE, BuildConfiguration.class, msgs);
			if (newBuildConfiguration != null)
				msgs = ((InternalEObject)newBuildConfiguration).eInverseAdd(this, MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE, BuildConfiguration.class, msgs);
			msgs = basicSetBuildConfiguration(newBuildConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION, newBuildConfiguration, newBuildConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT:
				if (correspodingContext != null)
					msgs = ((InternalEObject)correspodingContext).eInverseRemove(this, MicroserviceMetamodellPackage.BOUNDED_CONTEXT__CORRESPODING_MICROSERVICES, BoundedContext.class, msgs);
				return basicSetCorrespodingContext((BoundedContext)otherEnd, msgs);
			case MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION:
				if (deployementAbstraction != null)
					msgs = ((InternalEObject)deployementAbstraction).eInverseRemove(this, MicroserviceMetamodellPackage.DEPLOYEMENT_ABSTRACTION__MICROSERVICE, DeployementAbstraction.class, msgs);
				return basicSetDeployementAbstraction((DeployementAbstraction)otherEnd, msgs);
			case MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION:
				if (buildConfiguration != null)
					msgs = ((InternalEObject)buildConfiguration).eInverseRemove(this, MicroserviceMetamodellPackage.BUILD_CONFIGURATION__MICROSERVICE, BuildConfiguration.class, msgs);
				return basicSetBuildConfiguration((BuildConfiguration)otherEnd, msgs);
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
			case MicroserviceMetamodellPackage.MICROSERVICE__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS:
				return ((InternalEList<?>)getModelElementImplementations()).basicRemove(otherEnd, msgs);
			case MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT:
				return basicSetCorrespodingContext(null, msgs);
			case MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION:
				return basicSetDeployementAbstraction(null, msgs);
			case MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION:
				return basicSetBuildConfiguration(null, msgs);
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
			case MicroserviceMetamodellPackage.MICROSERVICE__INTERFACES:
				return getInterfaces();
			case MicroserviceMetamodellPackage.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS:
				return getModelElementImplementations();
			case MicroserviceMetamodellPackage.MICROSERVICE__SERVICE_NAME:
				return getServiceName();
			case MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT:
				if (resolve) return getCorrespodingContext();
				return basicGetCorrespodingContext();
			case MicroserviceMetamodellPackage.MICROSERVICE__IMPLEMENTATION_TECHNOLOGY:
				return getImplementationTechnology();
			case MicroserviceMetamodellPackage.MICROSERVICE__SENDS_REQUEST_TO:
				return getSendsRequestTo();
			case MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION:
				if (resolve) return getDeployementAbstraction();
				return basicGetDeployementAbstraction();
			case MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION:
				if (resolve) return getBuildConfiguration();
				return basicGetBuildConfiguration();
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
			case MicroserviceMetamodellPackage.MICROSERVICE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS:
				getModelElementImplementations().clear();
				getModelElementImplementations().addAll((Collection<? extends ModelElementImplementation>)newValue);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT:
				setCorrespodingContext((BoundedContext)newValue);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__IMPLEMENTATION_TECHNOLOGY:
				setImplementationTechnology((ImplementationTechnology)newValue);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__SENDS_REQUEST_TO:
				getSendsRequestTo().clear();
				getSendsRequestTo().addAll((Collection<? extends RestEndpoint>)newValue);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION:
				setDeployementAbstraction((DeployementAbstraction)newValue);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION:
				setBuildConfiguration((BuildConfiguration)newValue);
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
			case MicroserviceMetamodellPackage.MICROSERVICE__INTERFACES:
				getInterfaces().clear();
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS:
				getModelElementImplementations().clear();
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT:
				setCorrespodingContext((BoundedContext)null);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__IMPLEMENTATION_TECHNOLOGY:
				setImplementationTechnology(IMPLEMENTATION_TECHNOLOGY_EDEFAULT);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__SENDS_REQUEST_TO:
				getSendsRequestTo().clear();
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION:
				setDeployementAbstraction((DeployementAbstraction)null);
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION:
				setBuildConfiguration((BuildConfiguration)null);
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
			case MicroserviceMetamodellPackage.MICROSERVICE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case MicroserviceMetamodellPackage.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS:
				return modelElementImplementations != null && !modelElementImplementations.isEmpty();
			case MicroserviceMetamodellPackage.MICROSERVICE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case MicroserviceMetamodellPackage.MICROSERVICE__CORRESPODING_CONTEXT:
				return correspodingContext != null;
			case MicroserviceMetamodellPackage.MICROSERVICE__IMPLEMENTATION_TECHNOLOGY:
				return implementationTechnology != IMPLEMENTATION_TECHNOLOGY_EDEFAULT;
			case MicroserviceMetamodellPackage.MICROSERVICE__SENDS_REQUEST_TO:
				return sendsRequestTo != null && !sendsRequestTo.isEmpty();
			case MicroserviceMetamodellPackage.MICROSERVICE__DEPLOYEMENT_ABSTRACTION:
				return deployementAbstraction != null;
			case MicroserviceMetamodellPackage.MICROSERVICE__BUILD_CONFIGURATION:
				return buildConfiguration != null;
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
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", implementationTechnology: ");
		result.append(implementationTechnology);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
