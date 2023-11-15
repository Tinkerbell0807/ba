/**
 */
package microserviceMetamodell.util;

import microserviceMetamodell.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellPackage
 * @generated
 */
public class MicroserviceMetamodellAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicroserviceMetamodellPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceMetamodellAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MicroserviceMetamodellPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceMetamodellSwitch<Adapter> modelSwitch =
		new MicroserviceMetamodellSwitch<Adapter>() {
			@Override
			public Adapter caseDomainObject(DomainObject object) {
				return createDomainObjectAdapter();
			}
			@Override
			public Adapter caseDomainObjectController(DomainObjectController object) {
				return createDomainObjectControllerAdapter();
			}
			@Override
			public Adapter caseRestEndpoint(RestEndpoint object) {
				return createRestEndpointAdapter();
			}
			@Override
			public Adapter caseDomainObjectService(DomainObjectService object) {
				return createDomainObjectServiceAdapter();
			}
			@Override
			public Adapter caseDomainObjectRepository(DomainObjectRepository object) {
				return createDomainObjectRepositoryAdapter();
			}
			@Override
			public Adapter caseSystemModel(SystemModel object) {
				return createSystemModelAdapter();
			}
			@Override
			public Adapter caseDomainWebservice(DomainWebservice object) {
				return createDomainWebserviceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DomainObject
	 * @generated
	 */
	public Adapter createDomainObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DomainObjectController <em>Domain Object Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DomainObjectController
	 * @generated
	 */
	public Adapter createDomainObjectControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.RestEndpoint <em>Rest Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.RestEndpoint
	 * @generated
	 */
	public Adapter createRestEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DomainObjectService <em>Domain Object Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DomainObjectService
	 * @generated
	 */
	public Adapter createDomainObjectServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DomainObjectRepository <em>Domain Object Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DomainObjectRepository
	 * @generated
	 */
	public Adapter createDomainObjectRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.SystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.SystemModel
	 * @generated
	 */
	public Adapter createSystemModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodell.DomainWebservice <em>Domain Webservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodell.DomainWebservice
	 * @generated
	 */
	public Adapter createDomainWebserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MicroserviceMetamodellAdapterFactory
