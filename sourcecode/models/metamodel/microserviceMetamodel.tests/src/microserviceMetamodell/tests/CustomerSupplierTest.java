/**
 */
package microserviceMetamodell.tests;

import junit.textui.TestRunner;

import microserviceMetamodell.CustomerSupplier;
import microserviceMetamodell.MicroserviceMetamodellFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Customer Supplier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerSupplierTest extends BoundedContextRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomerSupplierTest.class);
	}

	/**
	 * Constructs a new Customer Supplier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerSupplierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Customer Supplier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CustomerSupplier getFixture() {
		return (CustomerSupplier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createCustomerSupplier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CustomerSupplierTest
