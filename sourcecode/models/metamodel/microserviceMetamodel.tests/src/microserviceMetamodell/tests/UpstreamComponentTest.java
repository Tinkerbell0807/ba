/**
 */
package microserviceMetamodell.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.UpstreamComponent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Upstream Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpstreamComponentTest extends TestCase {

	/**
	 * The fixture for this Upstream Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpstreamComponent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpstreamComponentTest.class);
	}

	/**
	 * Constructs a new Upstream Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpstreamComponentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Upstream Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UpstreamComponent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Upstream Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpstreamComponent getFixture() {
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
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createUpstreamComponent());
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

} //UpstreamComponentTest
