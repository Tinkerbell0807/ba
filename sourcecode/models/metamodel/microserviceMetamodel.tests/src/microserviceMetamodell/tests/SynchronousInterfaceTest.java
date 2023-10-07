/**
 */
package microserviceMetamodell.tests;

import junit.textui.TestRunner;

import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.SynchronousInterface;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synchronous Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronousInterfaceTest extends InterfaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynchronousInterfaceTest.class);
	}

	/**
	 * Constructs a new Synchronous Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Synchronous Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SynchronousInterface getFixture() {
		return (SynchronousInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createSynchronousInterface());
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

} //SynchronousInterfaceTest
