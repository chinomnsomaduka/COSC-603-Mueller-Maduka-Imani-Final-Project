package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>LimitFactory</code> implements static methods that return instances of the class <code>{@link Limit}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class LimitFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private LimitFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Limit createLimit() {
		return new Limit("", OperandFactory.createOperand(), Limit.Operator.EQ, OperandFactory.createOperand());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Limit createLimit2() {
		return new Limit("0123456789", OperandFactory.createOperand2(), Limit.Operator.GE, OperandFactory.createOperand2());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Limit createLimit3() {
		return new Limit("An??t-1.0.txt", OperandFactory.createOperand3(), Limit.Operator.GT, OperandFactory.createOperand3());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Limit createLimit4() {
		return new Limit(SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Limit createLimit5()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Limit(new FreeColXMLReader(File.createTempFile("", "")), SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Limit createLimit6()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Limit(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), SpecificationFactory.createSpecification2());
	}


	/**
	 * Create an instance of the class <code>{@link Limit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Limit createLimit7() {
		return new Limit((String) null, OperandFactory.createOperand4(), Limit.Operator.LE, OperandFactory.createOperand4());
	}
}