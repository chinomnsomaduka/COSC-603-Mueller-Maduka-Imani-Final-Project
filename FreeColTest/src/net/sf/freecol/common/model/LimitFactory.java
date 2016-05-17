package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>LimitFactory</code> implements static methods that return instances of the class <code>{@link Limit}</code>.
 *
 * @generatedBy CodePro at 5/16/16 10:37 PM
 * @author jeek
 * @version $Revision: 1.0 $
 */
public class LimitFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/16/16 10:37 PM
	 */
	private LimitFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:37 PM
	 */
	public static Limit createLimit() {
		return new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:37 PM
	 */
	public static Limit createLimit2() {
		return new Limit("0123456789", new Operand(0), Limit.Operator.GE, new Operand(0));
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:37 PM
	 */
	public static Limit createLimit3() {
		return new Limit("An??t-1.0.txt", new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME), Limit.Operator.GT, new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME));
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:37 PM
	 */
	public static Limit createLimit4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Limit(new FreeColXMLReader(File.createTempFile("", "")), new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:37 PM
	 */
	public static Limit createLimit5()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Limit(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), new Specification(new ByteArrayInputStream("".getBytes())));
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:37 PM
	 */
	public static Limit createLimit6() {
		return new Limit(new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:37 PM
	 */
	public static Limit createLimit7() {
		return new Limit((String) null, new Operand(Operand.OperandType.FOUNDING_FATHERS, Operand.ScopeLevel.NONE), Limit.Operator.LE, new Operand(Operand.OperandType.FOUNDING_FATHERS, Operand.ScopeLevel.NONE));
	}
}