/**
 */
package microserviceMetamodell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GCloud Machine Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getGCloudMachineType()
 * @model
 * @generated
 */
public enum GCloudMachineType implements Enumerator {
	/**
	 * The '<em><b>E2 SMALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_SMALL_VALUE
	 * @generated
	 * @ordered
	 */
	E2_SMALL(0, "E2_SMALL", "e2-small"),

	/**
	 * The '<em><b>E2 MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	E2_MEDIUM(1, "E2_MEDIUM", "e2-medium"),

	/**
	 * The '<em><b>E2 STANDARD 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_STANDARD_2_VALUE
	 * @generated
	 * @ordered
	 */
	E2_STANDARD_2(2, "E2_STANDARD_2", "e2_standard_2"),

	/**
	 * The '<em><b>E2 STANDARD 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_STANDARD_4_VALUE
	 * @generated
	 * @ordered
	 */
	E2_STANDARD_4(3, "E2_STANDARD_4", "e2-standard-4");

	/**
	 * The '<em><b>E2 SMALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_SMALL
	 * @model literal="e2-small"
	 * @generated
	 * @ordered
	 */
	public static final int E2_SMALL_VALUE = 0;

	/**
	 * The '<em><b>E2 MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_MEDIUM
	 * @model literal="e2-medium"
	 * @generated
	 * @ordered
	 */
	public static final int E2_MEDIUM_VALUE = 1;

	/**
	 * The '<em><b>E2 STANDARD 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_STANDARD_2
	 * @model literal="e2_standard_2"
	 * @generated
	 * @ordered
	 */
	public static final int E2_STANDARD_2_VALUE = 2;

	/**
	 * The '<em><b>E2 STANDARD 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_STANDARD_4
	 * @model literal="e2-standard-4"
	 * @generated
	 * @ordered
	 */
	public static final int E2_STANDARD_4_VALUE = 3;

	/**
	 * An array of all the '<em><b>GCloud Machine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GCloudMachineType[] VALUES_ARRAY =
		new GCloudMachineType[] {
			E2_SMALL,
			E2_MEDIUM,
			E2_STANDARD_2,
			E2_STANDARD_4,
		};

	/**
	 * A public read-only list of all the '<em><b>GCloud Machine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GCloudMachineType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GCloud Machine Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GCloudMachineType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GCloudMachineType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GCloud Machine Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GCloudMachineType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GCloudMachineType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GCloud Machine Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GCloudMachineType get(int value) {
		switch (value) {
			case E2_SMALL_VALUE: return E2_SMALL;
			case E2_MEDIUM_VALUE: return E2_MEDIUM;
			case E2_STANDARD_2_VALUE: return E2_STANDARD_2;
			case E2_STANDARD_4_VALUE: return E2_STANDARD_4;
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
	private GCloudMachineType(int value, String name, String literal) {
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
	
} //GCloudMachineType
