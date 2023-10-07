/**
 */
package microserviceMetamodell.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.SystemModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemModelTest extends TestCase {

	/**
	 * The fixture for this System Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemModelTest.class);
	}

	/**
	 * Constructs a new System Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this System Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SystemModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this System Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemModel getFixture() {
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
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createSystemModel());
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

} //SystemModelTest
