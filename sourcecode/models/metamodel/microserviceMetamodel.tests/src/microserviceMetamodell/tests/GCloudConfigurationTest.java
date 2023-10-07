/**
 */
package microserviceMetamodell.tests;

import junit.textui.TestRunner;

import microserviceMetamodell.GCloudConfiguration;
import microserviceMetamodell.MicroserviceMetamodellFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GCloud Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GCloudConfigurationTest extends CloudConfigurationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GCloudConfigurationTest.class);
	}

	/**
	 * Constructs a new GCloud Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCloudConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GCloud Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GCloudConfiguration getFixture() {
		return (GCloudConfiguration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createGCloudConfiguration());
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

} //GCloudConfigurationTest
