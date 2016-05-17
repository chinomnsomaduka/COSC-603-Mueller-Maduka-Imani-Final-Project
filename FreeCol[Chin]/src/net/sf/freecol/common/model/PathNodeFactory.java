package net.sf.freecol.common.model;



/**
 * The class <code>PathNodeFactory</code> implements static methods that return instances of the class <code>{@link PathNode}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class PathNodeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private PathNodeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link PathNode}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static PathNode createPathNode() {
		return new PathNode(LocationFactory.createcreateHighSeas(), 0, 0, false, (PathNode) null, (PathNode) null);
	}


	/**
	 * Create an instance of the class <code>{@link PathNode}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static PathNode createPathNode2() {
		return new PathNode(LocationFactory.createcreateHighSeas2(), 1, 1, true, (PathNode) null, (PathNode) null);
	}


	/**
	 * Create an instance of the class <code>{@link PathNode}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static PathNode createPathNode3() {
		return new PathNode(LocationFactory.createcreateHighSeas3(), 7, 7, true, (PathNode) null, (PathNode) null);
	}


	/**
	 * Create an instance of the class <code>{@link PathNode}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static PathNode createPathNode4() {
		return new PathNode(LocationFactory.createcreateIndianSettlement(), -1, -1, true, (PathNode) null, (PathNode) null);
	}


	/**
	 * Create an instance of the class <code>{@link PathNode}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static PathNode createPathNode5() {
		return new PathNode(LocationFactory.createcreateIndianSettlement2(), Integer.MAX_VALUE, Integer.MAX_VALUE, true, (PathNode) null, (PathNode) null);
	}


	/**
	 * Create an instance of the class <code>{@link PathNode}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static PathNode createPathNode6() {
		return new PathNode(LocationFactory.createcreateIndianSettlement3(), Integer.MIN_VALUE, Integer.MIN_VALUE, true, (PathNode) null, (PathNode) null);
	}
}