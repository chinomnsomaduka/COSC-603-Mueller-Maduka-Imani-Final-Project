package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.CharArrayWriter;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LimitTest</code> contains tests for the class <code>{@link Limit}</code>.
 *
 * @generatedBy CodePro at 5/16/16 11:11 PM
 * @author jeek
 * @version $Revision: 1.0 $
 */
public class LimitTest {
	/**
	 * Run the Limit(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testLimit_1()
		throws Exception {
		Specification specification = new Specification();

		Limit result = new Limit(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null null null", result.toString());
		assertEquals("limit", result.getXMLTagName());
		assertEquals(null, result.getOperator());
		assertEquals(null, result.getLeftHandSide());
		assertEquals(null, result.getRightHandSide());
		assertEquals(false, result.isAbstractType());
		assertEquals("null.name", result.getNameKey());
		assertEquals("null.description", result.getDescriptionKey());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getGame());
	}

	/**
	 * Run the Limit(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testLimit_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));
		Specification specification = new Specification();

		Limit result = new Limit(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
		assertNotNull(result);
	}

	/**
	 * Run the Limit(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testLimit_3()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));
		Specification specification = new Specification();

		Limit result = new Limit(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
		assertNotNull(result);
	}

	/**
	 * Run the Limit(String,Operand,Operator,Operand) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testLimit_4()
		throws Exception {
		String id = "";
		Operand lhs = new Operand();
		Limit.Operator op = Limit.Operator.EQ;
		Operand rhs = new Operand();

		Limit result = new Limit(id, lhs, op, rhs);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Operand type=NONE scopeLevel=NONE null matches-null] EQ [Operand type=NONE scopeLevel=NONE null matches-null]", result.toString());
		assertEquals("limit", result.getXMLTagName());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<limit id=\"\" operator=\"eq\"><left-hand-side match-negated=\"false\" matches-null=\"true\" operand-type=\"none\" scope-level=\"none\"></left-hand-side><right-hand-side match-negated=\"false\" matches-null=\"true\" operand-type=\"none\" scope-level=\"none\"></right-hand-side></limit>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getGame());
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testAppliesTo_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit7();
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testAppliesTo_2()
		throws Exception {
		Limit fixture = LimitFactory.createLimit();
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean evaluate(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit2();
		Game game = GameFactory.createGame();

		boolean result = fixture.evaluate(game);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean evaluate(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_2()
		throws Exception {
		Limit fixture = LimitFactory.createLimit3();
		Game game = GameFactory.createGame2();

		boolean result = fixture.evaluate(game);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean evaluate(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_3()
		throws Exception {
		Limit fixture = LimitFactory.createLimit4();
		Player player = PlayerFactory.createPlayer();

		boolean result = fixture.evaluate(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit4(LimitFactory.java:65)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_4()
		throws Exception {
		Limit fixture = LimitFactory.createLimit5();
		Player player = PlayerFactory.createPlayer2();

		boolean result = fixture.evaluate(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Load specification stream error
		//       at net.sf.freecol.common.model.Specification.load(Specification.java:378)
		//       at net.sf.freecol.common.model.Specification.<init>(Specification.java:360)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit5(LimitFactory.java:76)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_5()
		throws Exception {
		Limit fixture = LimitFactory.createLimit6();
		Player player = PlayerFactory.createPlayer3();

		boolean result = fixture.evaluate(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: XML failure
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:824)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer3(PlayerFactory.java:51)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_6()
		throws Exception {
		Limit fixture = LimitFactory.createLimit7();
		Settlement settlement = new Colony(GameFactory.createGame(), "");

		boolean result = fixture.evaluate(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_7()
		throws Exception {
		Limit fixture = LimitFactory.createLimit();
		Colony settlement = new Colony(GameFactory.createGame2(), "");
		settlement.owner = PlayerFactory.createPlayer4();

		boolean result = fixture.evaluate(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_8()
		throws Exception {
		Limit fixture = LimitFactory.createLimit2();
		Settlement settlement = new Colony(GameFactory.createGame(), "");

		boolean result = fixture.evaluate(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testEvaluate_9()
		throws Exception {
		Limit fixture = LimitFactory.createLimit3();
		Settlement settlement = new Colony(GameFactory.createGame2(), "");

		boolean result = fixture.evaluate(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertTrue(result);
	}

	/**
	 * Run the Operand getLeftHandSide() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testGetLeftHandSide_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit3();

		Operand result = fixture.getLeftHandSide();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Operand type=BUILDINGS scopeLevel=GAME null matches-null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getType());
		assertEquals(null, result.getMethodName());
		assertEquals("scope", result.getXMLTagName());
		assertEquals(null, result.getAbilityId());
		assertEquals(null, result.getMethodValue());
		assertEquals(true, result.isMatchesNull());
		assertEquals(false, result.isMatchNegated());
		assertEquals(true, result.getAbilityValue());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("<scope match-negated=\"false\" matches-null=\"true\" operand-type=\"buildings\" scope-level=\"game\"></scope>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getGame());
	}

	/**
	 * Run the Limit.Operator getOperator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testGetOperator_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit();

		Limit.Operator result = fixture.getOperator();

		// add additional test code here
		assertNotNull(result);
		assertEquals("EQ", result.name());
		assertEquals("EQ", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the Operand getRightHandSide() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testGetRightHandSide_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit5();

		Operand result = fixture.getRightHandSide();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Load specification stream error
		//       at net.sf.freecol.common.model.Specification.load(Specification.java:378)
		//       at net.sf.freecol.common.model.Specification.<init>(Specification.java:360)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit5(LimitFactory.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = Limit.getTagName();

		// add additional test code here
		assertEquals("limit", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit4();

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit4(LimitFactory.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasOperandType(OperandType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testHasOperandType_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit4();
		Operand.OperandType type = Operand.OperandType.BUILDINGS;

		boolean result = fixture.hasOperandType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit4(LimitFactory.java:65)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasOperandType(OperandType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testHasOperandType_2()
		throws Exception {
		Limit fixture = LimitFactory.createLimit5();
		Operand.OperandType type = Operand.OperandType.BUILDINGS;

		boolean result = fixture.hasOperandType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Load specification stream error
		//       at net.sf.freecol.common.model.Specification.load(Specification.java:378)
		//       at net.sf.freecol.common.model.Specification.<init>(Specification.java:360)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit5(LimitFactory.java:76)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasOperandType(OperandType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testHasOperandType_3()
		throws Exception {
		Limit fixture = LimitFactory.createLimit6();
		Operand.OperandType type = Operand.OperandType.BUILDINGS;

		boolean result = fixture.hasOperandType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Limit.hasOperandType(Limit.java:266)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit7();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Limit fixture = LimitFactory.createLimit();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit2();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Limit fixture = LimitFactory.createLimit3();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Limit fixture = LimitFactory.createLimit4();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit4(LimitFactory.java:65)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Limit fixture = LimitFactory.createLimit5();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Load specification stream error
		//       at net.sf.freecol.common.model.Specification.load(Specification.java:378)
		//       at net.sf.freecol.common.model.Specification.<init>(Specification.java:360)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit5(LimitFactory.java:76)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		Limit fixture = LimitFactory.createLimit6();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		Limit fixture = LimitFactory.createLimit7();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		Limit fixture = LimitFactory.createLimit();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		Limit fixture = LimitFactory.createLimit2();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void setLeftHandSide(Operand) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testSetLeftHandSide_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit4();
		Operand newLeftHandSide = new Operand();

		fixture.setLeftHandSide(newLeftHandSide);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit4(LimitFactory.java:65)
	}

	/**
	 * Run the void setOperator(Operator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testSetOperator_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit2();
		Limit.Operator newOperator = Limit.Operator.EQ;

		fixture.setOperator(newOperator);

		// add additional test code here
	}

	/**
	 * Run the void setRightHandSide(Operand) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testSetRightHandSide_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit6();
		Operand newRightHandSide = new Operand();

		fixture.setRightHandSide(newRightHandSide);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[Operand type=BUILDINGS scopeLevel=GAME null matches-null] GT [Operand type=BUILDINGS scopeLevel=GAME null matches-null]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit7();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Limit fixture = LimitFactory.createLimit();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Limit fixture = LimitFactory.createLimit2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Limit fixture = LimitFactory.createLimit3();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Limit fixture = LimitFactory.createLimit4();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit4(LimitFactory.java:65)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Limit fixture = LimitFactory.createLimit5();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Load specification stream error
		//       at net.sf.freecol.common.model.Specification.load(Specification.java:378)
		//       at net.sf.freecol.common.model.Specification.<init>(Specification.java:360)
		//       at net.sf.freecol.common.model.LimitFactory.createLimit5(LimitFactory.java:76)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Limit fixture = LimitFactory.createLimit6();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Limit.writeChildren(Limit.java:319)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/16/16 11:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LimitTest.class);
	}
}