/**
 */
package microserviceMetamodell.impl;

import microserviceMetamodell.DownstreamRole;
import microserviceMetamodell.MicroserviceMetamodellPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Downstream Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DownstreamRoleImpl extends RelationshipRoleImpl implements DownstreamRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DownstreamRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceMetamodellPackage.Literals.DOWNSTREAM_ROLE;
	}

} //DownstreamRoleImpl
