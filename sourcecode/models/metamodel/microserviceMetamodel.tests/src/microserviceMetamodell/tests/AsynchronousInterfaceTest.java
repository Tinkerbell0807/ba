/**
 */
package microserviceMetamodell.tests;

import junit.textui.TestRunner;

import microserviceMetamodell.AsynchronousInterface;
import microserviceMetamodell.MicroserviceMetamodellFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asynchronous Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchronousInterfaceTest extends InterfaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsynchronousInterfaceTest.class);
	}

	/**
	 * Constructs a new Asynchronous Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asynchronous Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsynchronousInterface getFixture() {
		return (AsynchronousInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createAsynchronousInterface());
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

} //AsynchronousInterfaceTest
