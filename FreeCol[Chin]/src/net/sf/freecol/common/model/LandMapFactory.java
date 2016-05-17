package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import net.sf.freecol.common.option.OptionGroup;


/**
 * The class <code>LandMapFactory</code> implements static methods that return instances of the class <code>{@link LandMap}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class LandMapFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private LandMapFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link LandMap}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LandMap createLandMap() {
		return new LandMap(0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link LandMap}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LandMap createLandMap2() {
		return new LandMap(1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link LandMap}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LandMap createLandMap3() {
		return new LandMap(GameFactory.createGame());
	}


	/**
	 * Create an instance of the class <code>{@link LandMap}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LandMap createLandMap4()
		throws java.io.IOException {
		return new LandMap(OptionGroup.load(File.createTempFile("", ""), "", new Specification()), new Random());
	}


	/**
	 * Create an instance of the class <code>{@link LandMap}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LandMap createLandMap5()
		throws java.io.IOException {
		return new LandMap(OptionGroup.load(File.createTempFile("", "", (File) null), "0123456789", new Specification(new ByteArrayInputStream("".getBytes()))), new Random(-1L));
	}
}