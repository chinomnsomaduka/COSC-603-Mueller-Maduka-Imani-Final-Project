package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>EquipmentTypeFactory</code> implements static methods that return instances of the class <code>{@link EquipmentType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class EquipmentTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private EquipmentTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link EquipmentType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static EquipmentType createEquipmentType() {
		return new EquipmentType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link EquipmentType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static EquipmentType createEquipmentType2() {
		return new EquipmentType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}