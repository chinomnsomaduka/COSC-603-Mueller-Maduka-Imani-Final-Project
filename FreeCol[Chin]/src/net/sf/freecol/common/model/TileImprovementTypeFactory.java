package net.sf.freecol.common.model;



/**
 * The class <code>TileImprovementTypeFactory</code> implements static methods that return instances of the class <code>{@link TileImprovementType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TileImprovementTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private TileImprovementTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovementType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovementType createTileImprovementType() {
		return new TileImprovementType("", SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovementType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovementType createTileImprovementType2() {
		return new TileImprovementType("0123456789", SpecificationFactory.createSpecification2());
	}
}