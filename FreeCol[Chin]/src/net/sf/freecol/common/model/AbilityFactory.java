package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>AbilityFactory</code> implements static methods that return instances of the class <code>{@link Ability}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class AbilityFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private AbilityFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility() {
		return new Ability("");
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility2() {
		return new Ability("", false);
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility3() {
		return new Ability("", FreeColSpecObjectTypeFactory.createcreateBuildingType(), false);
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility4() {
		return new Ability("0123456789", FreeColSpecObjectTypeFactory.createcreateBuildingType2(), true);
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility5() {
		return new Ability("0123456789", true);
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility6() {
		return new Ability("An??t-1.0.txt", FreeColSpecObjectTypeFactory.createcreateDisaster(), true);
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility7() {
		return new Ability(new IIOMetadataNode(""), new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility8() {
		return new Ability(new IIOMetadataNode(), new Specification(new ByteArrayInputStream("".getBytes())));
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility9()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Ability(new FreeColXMLReader(File.createTempFile("", "")), new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility10()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Ability(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), new Specification(new ByteArrayInputStream("".getBytes())));
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility11() {
		return new Ability(new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Ability}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Ability createAbility12() {
		return new Ability((Ability) null);
	}
}