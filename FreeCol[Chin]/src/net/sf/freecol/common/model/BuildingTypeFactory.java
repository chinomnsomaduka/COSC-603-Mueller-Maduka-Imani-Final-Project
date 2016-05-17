package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>BuildingTypeFactory</code> implements static methods that return instances of the class <code>{@link BuildingType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class BuildingTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private BuildingTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link BuildingType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static BuildingType createBuildingType() {
		return new BuildingType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link BuildingType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static BuildingType createBuildingType2() {
		return new BuildingType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}