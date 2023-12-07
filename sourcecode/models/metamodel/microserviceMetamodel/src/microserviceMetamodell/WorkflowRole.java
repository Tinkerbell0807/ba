/**
 */
package microserviceMetamodell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Workflow Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getWorkflowRole()
 * @model
 * @generated
 */
public enum WorkflowRole implements Enumerator {
	/**
	 * The '<em><b>ORCHESTRATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORCHESTRATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ORCHESTRATOR(0, "ORCHESTRATOR", "ORCHESTRATOR"),

	/**
	 * The '<em><b>ORCHESTRATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORCHESTRATED_VALUE
	 * @generated
	 * @ordered
	 */
	ORCHESTRATED(1, "ORCHESTRATED", "ORCHESTRATED"),

	/**
	 * The '<em><b>CHOREOGRAPH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOREOGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	CHOREOGRAPH(2, "CHOREOGRAPH", "CHOREOGRAPH");

	/**
	 * The '<em><b>ORCHESTRATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORCHESTRATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORCHESTRATOR_VALUE = 0;

	/**
	 * The '<em><b>ORCHESTRATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORCHESTRATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORCHESTRATED_VALUE = 1;

	/**
	 * The '<em><b>CHOREOGRAPH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOREOGRAPH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHOREOGRAPH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Workflow Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkflowRole[] VALUES_ARRAY =
		new WorkflowRole[] {
			ORCHESTRATOR,
			ORCHESTRATED,
			CHOREOGRAPH,
		};

	/**
	 * A public read-only list of all the '<em><b>Workflow Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WorkflowRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Workflow Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkflowRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkflowRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Workflow Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkflowRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkflowRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Workflow Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkflowRole get(int value) {
		switch (value) {
			case ORCHESTRATOR_VALUE: return ORCHESTRATOR;
			case ORCHESTRATED_VALUE: return ORCHESTRATED;
			case CHOREOGRAPH_VALUE: return CHOREOGRAPH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkflowRole(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //WorkflowRole
