/**
 */
package microserviceMetamodell.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import microserviceMetamodell.MicroserviceMetamodellFactory;
import microserviceMetamodell.TechnicalLayer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Technical Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnicalLayerTest extends TestCase {

	/**
	 * The fixture for this Technical Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnicalLayer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TechnicalLayerTest.class);
	}

	/**
	 * Constructs a new Technical Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalLayerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Technical Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TechnicalLayer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Technical Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnicalLayer getFixture() {
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
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createTechnicalLayer());
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

} //TechnicalLayerTest
