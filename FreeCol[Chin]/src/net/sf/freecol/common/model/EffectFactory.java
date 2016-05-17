package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>EffectFactory</code> implements static methods that return instances of the class <code>{@link Effect}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class EffectFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private EffectFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Effect}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Effect createEffect() {
		return new Effect();
	}


	/**
	 * Create an instance of the class <code>{@link Effect}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Effect createEffect2()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Effect(new FreeColXMLReader(File.createTempFile("", "")), SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link Effect}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Effect createEffect3()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Effect(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), SpecificationFactory.createSpecification2());
	}


	/**
	 * Create an instance of the class <code>{@link Effect}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Effect createEffect4() {
		return new Effect((Effect) null);
	}
}