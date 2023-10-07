/**
 */
package microserviceMetamodell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Upstream Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see microserviceMetamodell.MicroserviceMetamodellPackage#getUpstreamRole()
 * @model
 * @generated
 */
public enum UpstreamRole implements Enumerator {
	/**
	 * The '<em><b>OPENHOST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENHOST_VALUE
	 * @generated
	 * @ordered
	 */
	OPENHOST(0, "OPENHOST", "OPENHOST"),

	/**
	 * The '<em><b>PUBLISHEDLANGUAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHEDLANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISHEDLANGUAGE(1, "PUBLISHEDLANGUAGE", "PUBLISHEDLANGUAGE"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(2, "NONE", "NONE");

	/**
	 * The '<em><b>OPENHOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENHOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENHOST_VALUE = 0;

	/**
	 * The '<em><b>PUBLISHEDLANGUAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHEDLANGUAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISHEDLANGUAGE_VALUE = 1;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Upstream Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UpstreamRole[] VALUES_ARRAY =
		new UpstreamRole[] {
			OPENHOST,
			PUBLISHEDLANGUAGE,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Upstream Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UpstreamRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Upstream Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpstreamRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpstreamRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Upstream Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpstreamRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpstreamRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Upstream Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpstreamRole get(int value) {
		switch (value) {
			case OPENHOST_VALUE: return OPENHOST;
			case PUBLISHEDLANGUAGE_VALUE: return PUBLISHEDLANGUAGE;
			case NONE_VALUE: return NONE;
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
	private UpstreamRole(int value, String name, String literal) {
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
	
} //UpstreamRole
