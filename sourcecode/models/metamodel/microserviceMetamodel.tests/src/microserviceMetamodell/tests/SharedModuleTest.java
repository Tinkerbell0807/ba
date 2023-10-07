/**
 */
package microserviceMetamodell.tests;

import junit.textui.TestRunner;

import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.SharedModule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shared Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedModuleTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SharedModuleTest.class);
	}

	/**
	 * Constructs a new Shared Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedModuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Shared Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SharedModule getFixture() {
		return (SharedModule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createSharedModule());
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

} //SharedModuleTest
