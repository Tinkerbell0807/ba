/**
 */
package microserviceMetamodell.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.RestEndpoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rest Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestEndpointTest extends TestCase {

	/**
	 * The fixture for this Rest Endpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestEndpoint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RestEndpointTest.class);
	}

	/**
	 * Constructs a new Rest Endpoint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestEndpointTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rest Endpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RestEndpoint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rest Endpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestEndpoint getFixture() {
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
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createRestEndpoint());
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

} //RestEndpointTest
