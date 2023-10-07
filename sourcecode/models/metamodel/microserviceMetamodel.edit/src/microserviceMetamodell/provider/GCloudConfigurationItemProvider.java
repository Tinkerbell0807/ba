/**
 */
package microserviceMetamodell.provider;


import java.util.Collection;
import java.util.List;

import microserviceMetamodell.GCloudConfiguration;
import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link microserviceMetamodell.GCloudConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GCloudConfigurationItemProvider extends CloudConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCloudConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addArtifactRepositoryNamePropertyDescriptor(object);
			addArtifactRepositoryZonePropertyDescriptor(object);
			addProjectIdPropertyDescriptor(object);
			addClusterZonePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Artifact Repository Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactRepositoryNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GCloudConfiguration_artifactRepositoryName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GCloudConfiguration_artifactRepositoryName_feature", "_UI_GCloudConfiguration_type"),
				 MicroserviceMetamodellPackage.Literals.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Repository Zone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactRepositoryZonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GCloudConfiguration_artifactRepositoryZone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GCloudConfiguration_artifactRepositoryZone_feature", "_UI_GCloudConfiguration_type"),
				 MicroserviceMetamodellPackage.Literals.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GCloudConfiguration_projectId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GCloudConfiguration_projectId_feature", "_UI_GCloudConfiguration_type"),
				 MicroserviceMetamodellPackage.Literals.GCLOUD_CONFIGURATION__PROJECT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cluster Zone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClusterZonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GCloudConfiguration_clusterZone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GCloudConfiguration_clusterZone_feature", "_UI_GCloudConfiguration_type"),
				 MicroserviceMetamodellPackage.Literals.GCLOUD_CONFIGURATION__CLUSTER_ZONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(MicroserviceMetamodellPackage.Literals.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION);
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
	 * This returns GCloudConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GCloudConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GCloudConfiguration)object).getArtifactRepositoryName();
		return label == null || label.length() == 0 ?
			getString("_UI_GCloudConfiguration_type") :
			getString("_UI_GCloudConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(GCloudConfiguration.class)) {
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_NAME:
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__ARTIFACT_REPOSITORY_ZONE:
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__PROJECT_ID:
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__CLUSTER_ZONE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MicroserviceMetamodellPackage.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION:
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
				(MicroserviceMetamodellPackage.Literals.GCLOUD_CONFIGURATION__KUBERNETES_CLUSTER_CONFIGURATION,
				 MicroserviceMetamodellFactory.eINSTANCE.createKubernetesClusterConfiguration()));
	}

}
