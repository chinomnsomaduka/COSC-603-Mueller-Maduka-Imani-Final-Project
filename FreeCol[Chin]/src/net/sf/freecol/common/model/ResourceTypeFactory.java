package net.sf.freecol.common.model;



/**
 * The class <code>ResourceTypeFactory</code> implements static methods that return instances of the class <code>{@link ResourceType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ResourceTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private ResourceTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ResourceType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ResourceType createResourceType() {
		return new ResourceType("", SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link ResourceType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ResourceType createResourceType2() {
		return new ResourceType("0123456789", SpecificationFactory.createSpecification2());
	}
}