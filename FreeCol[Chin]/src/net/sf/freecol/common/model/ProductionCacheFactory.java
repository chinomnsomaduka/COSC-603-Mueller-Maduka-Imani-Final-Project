package net.sf.freecol.common.model;



/**
 * The class <code>ProductionCacheFactory</code> implements static methods that return instances of the class <code>{@link ProductionCache}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ProductionCacheFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private ProductionCacheFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ProductionCache}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ProductionCache createProductionCache() {
		return new ProductionCache(ColonyFactory.createColony());
	}
}