package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>ModifierFactory</code> implements static methods that return instances of the class <code>{@link Modifier}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ModifierFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private ModifierFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier() {
		return Modifier.makeTimedModifier("", (Modifier) null, TurnFactory.createTurn());
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier2() {
		return Modifier.makeTimedModifier("An??t-1.0.txt", (Modifier) null, (Turn) null);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier3() {
		return Modifier.makeTimedModifier((String) null, (Modifier) null, (Turn) null);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier4() {
		return new Modifier("", -1.0f, Modifier.ModifierType.ADDITIVE);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier5()
		throws ClassNotFoundException {
		return new Modifier("", -1.0f, Modifier.ModifierType.ADDITIVE, FreeColObject.newInstance(Class.forName("")));
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier6()
		throws ClassNotFoundException {
		return new Modifier("", -1.0f, Modifier.ModifierType.ADDITIVE, FreeColObject.newInstance(Class.forName("")), 0);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier7()
		throws ClassNotFoundException {
		return new Modifier("", Float.MIN_VALUE, Modifier.ModifierType.ADDITIVE, FreeColObject.newInstance(Class.forName("")), Integer.MAX_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier8() {
		return new Modifier("", (Modifier) null);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier9() {
		return new Modifier("0123456789", 0.0f, Modifier.ModifierType.MULTIPLICATIVE);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier10() {
		return new Modifier("0123456789", 0.0f, Modifier.ModifierType.MULTIPLICATIVE, (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier11() {
		return new Modifier("0123456789", 0.0f, Modifier.ModifierType.MULTIPLICATIVE, (FreeColObject) null, 1);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier12() {
		return new Modifier("0123456789", (Modifier) null);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier13()
		throws ClassNotFoundException {
		return new Modifier("An??t-1.0.txt", -0.5f, Modifier.ModifierType.ADDITIVE, FreeColObject.newInstance(Class.forName("")), 7);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier14() {
		return new Modifier("An??t-1.0.txt", 1.0f, Modifier.ModifierType.PERCENTAGE);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier15() {
		return new Modifier("An??t-1.0.txt", 1.0f, Modifier.ModifierType.PERCENTAGE, (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier16() {
		return new Modifier(new IIOMetadataNode(""), new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier17() {
		return new Modifier(new IIOMetadataNode(), new Specification(new ByteArrayInputStream("".getBytes())));
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier18()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Modifier(new FreeColXMLReader(File.createTempFile("", "")), new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier19()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Modifier(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), new Specification(new ByteArrayInputStream("".getBytes())));
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier20() {
		return new Modifier(new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier21() {
		return new Modifier((Modifier) null);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier22() {
		return new Modifier((String) null, 0.5f, Modifier.ModifierType.ADDITIVE, (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link Modifier}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Modifier createModifier23() {
		return new Modifier((String) null, 0.5f, Modifier.ModifierType.MULTIPLICATIVE, (FreeColObject) null, -1);
	}
}