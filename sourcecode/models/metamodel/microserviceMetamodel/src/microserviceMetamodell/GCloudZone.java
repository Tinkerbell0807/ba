/**
 */
package microserviceMetamodell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GCloud Zone</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getGCloudZone()
 * @model
 * @generated
 */
public enum GCloudZone implements Enumerator {
	/**
	 * The '<em><b>EUROPE WEST1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUROPE_WEST1_VALUE
	 * @generated
	 * @ordered
	 */
	EUROPE_WEST1(0, "EUROPE_WEST1", "europe-west1"),

	/**
	 * The '<em><b>EUROPE WEST1 B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUROPE_WEST1_B_VALUE
	 * @generated
	 * @ordered
	 */
	EUROPE_WEST1_B(1, "EUROPE_WEST1_B", "europe-west1-b");

	/**
	 * The '<em><b>EUROPE WEST1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUROPE_WEST1
	 * @model literal="europe-west1"
	 * @generated
	 * @ordered
	 */
	public static final int EUROPE_WEST1_VALUE = 0;

	/**
	 * The '<em><b>EUROPE WEST1 B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUROPE_WEST1_B
	 * @model literal="europe-west1-b"
	 * @generated
	 * @ordered
	 */
	public static final int EUROPE_WEST1_B_VALUE = 1;

	/**
	 * An array of all the '<em><b>GCloud Zone</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GCloudZone[] VALUES_ARRAY =
		new GCloudZone[] {
			EUROPE_WEST1,
			EUROPE_WEST1_B,
		};

	/**
	 * A public read-only list of all the '<em><b>GCloud Zone</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GCloudZone> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GCloud Zone</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GCloudZone get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GCloudZone result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GCloud Zone</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GCloudZone getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GCloudZone result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GCloud Zone</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GCloudZone get(int value) {
		switch (value) {
			case EUROPE_WEST1_VALUE: return EUROPE_WEST1;
			case EUROPE_WEST1_B_VALUE: return EUROPE_WEST1_B;
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
	private GCloudZone(int value, String name, String literal) {
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
	
} //GCloudZone
