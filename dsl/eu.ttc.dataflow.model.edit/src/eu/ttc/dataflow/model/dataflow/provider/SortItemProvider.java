/**
 */
package eu.ttc.dataflow.model.dataflow.provider;


import eu.ttc.dataflow.model.dataflow.DataflowFactory;
import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.dataflow.Sort;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.ttc.dataflow.model.dataflow.Sort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SortItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DataflowPackage.Literals.SORT__SORT_BY);
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
	 * This returns Sort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sort"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Sort)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Sort_type") :
			getString("_UI_Sort_type") + " " + label;
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

		switch (notification.getFeatureID(Sort.class)) {
			case DataflowPackage.SORT__SORT_BY:
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
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createFieldReference()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.SORT__SORT_BY,
				 DataflowFactory.eINSTANCE.createConditionalExpression()));
	}

}
