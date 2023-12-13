/**
 */
package microserviceMetamodell.provider;


import java.util.Collection;
import java.util.List;

import microserviceMetamodell.Microservice;
import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link microserviceMetamodell.Microservice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroserviceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addServiceNamePropertyDescriptor(object);
			addWorkflowRolePropertyDescriptor(object);
			addCorrespodingContextPropertyDescriptor(object);
			addImplementationTechnologyPropertyDescriptor(object);
			addSendsRequestToPropertyDescriptor(object);
			addDeployementAbstractionPropertyDescriptor(object);
			addBuildConfigurationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Service Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_serviceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_serviceName_feature", "_UI_Microservice_type"),
				 MicroserviceMetamodellPackage.Literals.MICROSERVICE__SERVICE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workflow Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkflowRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_workflowRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_workflowRole_feature", "_UI_Microservice_type"),
				 MicroserviceMetamodellPackage.Literals.MICROSERVICE__WORKFLOW_ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Correspoding Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrespodingContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_correspodingContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_correspodingContext_feature", "_UI_Microservice_type"),
				 MicroserviceMetamodellPackage.Literals.MICROSERVICE__CORRESPODING_CONTEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_implementationTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_implementationTechnology_feature", "_UI_Microservice_type"),
				 MicroserviceMetamodellPackage.Literals.MICROSERVICE__IMPLEMENTATION_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sends Request To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendsRequestToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_sendsRequestTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_sendsRequestTo_feature", "_UI_Microservice_type"),
				 MicroserviceMetamodellPackage.Literals.MICROSERVICE__SENDS_REQUEST_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployement Abstraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployementAbstractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_deployementAbstraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_deployementAbstraction_feature", "_UI_Microservice_type"),
				 MicroserviceMetamodellPackage.Literals.MICROSERVICE__DEPLOYEMENT_ABSTRACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build Configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildConfigurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_buildConfiguration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_buildConfiguration_feature", "_UI_Microservice_type"),
				 MicroserviceMetamodellPackage.Literals.MICROSERVICE__BUILD_CONFIGURATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MicroserviceMetamodellPackage.Literals.MICROSERVICE__INTERFACES);
			childrenFeatures.add(MicroserviceMetamodellPackage.Literals.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Microservice.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Microservice"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Microservice)object).getServiceName();
		return label == null || label.length() == 0 ?
			getString("_UI_Microservice_type") :
			getString("_UI_Microservice_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Microservice.class)) {
			case MicroserviceMetamodellPackage.MICROSERVICE__SERVICE_NAME:
			case MicroserviceMetamodellPackage.MICROSERVICE__WORKFLOW_ROLE:
			case MicroserviceMetamodellPackage.MICROSERVICE__IMPLEMENTATION_TECHNOLOGY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MicroserviceMetamodellPackage.MICROSERVICE__INTERFACES:
			case MicroserviceMetamodellPackage.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MicroserviceMetamodellPackage.Literals.MICROSERVICE__INTERFACES,
				 MicroserviceMetamodellFactory.eINSTANCE.createSynchronousInterface()));

		newChildDescriptors.add
			(createChildParameter
				(MicroserviceMetamodellPackage.Literals.MICROSERVICE__INTERFACES,
				 MicroserviceMetamodellFactory.eINSTANCE.createAsynchronousInterface()));

		newChildDescriptors.add
			(createChildParameter
				(MicroserviceMetamodellPackage.Literals.MICROSERVICE__MODEL_ELEMENT_IMPLEMENTATIONS,
				 MicroserviceMetamodellFactory.eINSTANCE.createModelElementImplementation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MicroserviceMetamodelEditPlugin.INSTANCE;
	}

}
