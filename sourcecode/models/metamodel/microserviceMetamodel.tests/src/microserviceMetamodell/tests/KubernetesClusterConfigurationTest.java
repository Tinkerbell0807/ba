/**
 */
package microserviceMetamodell.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import microserviceMetamodell.KubernetesClusterConfiguration;
import microserviceMetamodell.MicroserviceMetamodellFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kubernetes Cluster Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KubernetesClusterConfigurationTest extends TestCase {

	/**
	 * The fixture for this Kubernetes Cluster Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KubernetesClusterConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KubernetesClusterConfigurationTest.class);
	}

	/**
	 * Constructs a new Kubernetes Cluster Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KubernetesClusterConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Kubernetes Cluster Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(KubernetesClusterConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Kubernetes Cluster Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KubernetesClusterConfiguration getFixture() {
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
		setFixture(MicroserviceMetamodellFactory.eINSTANCE.createKubernetesClusterConfiguration());
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

} //KubernetesClusterConfigurationTest
