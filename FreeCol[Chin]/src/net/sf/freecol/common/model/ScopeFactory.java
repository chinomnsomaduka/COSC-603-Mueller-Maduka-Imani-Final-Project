package net.sf.freecol.common.model;

import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>ScopeFactory</code> implements static methods that return instances of the class <code>{@link Scope}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ScopeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private ScopeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Scope}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Scope createmakeNegatedPersonScope() {
		return Scope.makeNegatedPersonScope();
	}


	/**
	 * Create an instance of the class <code>{@link Scope}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Scope createScope() {
		return new Scope();
	}


	/**
	 * Create an instance of the class <code>{@link Scope}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Scope createScope2()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Scope(new FreeColXMLReader(File.createTempFile("", "")));
	}
}