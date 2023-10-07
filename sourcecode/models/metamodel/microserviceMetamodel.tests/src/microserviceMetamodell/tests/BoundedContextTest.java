/**
 */
package microserviceMetamodell.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import microserviceMetamodell.BoundedContext;
import microserviceMetamodell.MicroserviceMetamodellFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bounded Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundedContextTest extends TestCase {

	/**
	 * The fixture for this Bounded Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedContext fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoundedContextTest.class);
	}

	/**
	 * Constructs a new Bounded Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContextTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bounded Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BoundedContext fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bounded Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedContext getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createBoundedContext());
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

} //BoundedContextTest
