package net.sf.freecol.common.model.mission;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Unit;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>AbstractMissionTest</code> contains tests for the class <code>{@link AbstractMission}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:21 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class AbstractMissionTest {
	/**
	 * Run the int getRepeatCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testGetRepeatCount_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());

		int result = fixture.getRepeatCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertEquals(0, result);
	}

	/**
	 * Run the int getTurnCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testGetTurnCount_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());

		int result = fixture.getTurnCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertEquals(0, result);
	}

	/**
	 * Run the Unit getUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testGetUnit_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());

		Unit result = fixture.getUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testIsValid_3()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testIsValid_4()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testIsValidFor_1()
		throws Exception {
		Unit unit = new Unit(new Game(), new IIOMetadataNode());

		boolean result = AbstractMission.isValidFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Unit.<init>(Unit.java:219)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void setRepeatCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testSetRepeatCount_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		int newRepeatCount = 1;

		fixture.setRepeatCount(newRepeatCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void setTurnCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testSetTurnCount_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		int newTurnCount = 1;

		fixture.setTurnCount(newTurnCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void setUnit(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testSetUnit_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		Unit newUnit = new Unit(new Game(), new IIOMetadataNode());

		fixture.setUnit(newUnit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		AbstractMission fixture = new CompoundMission(new Game());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/16 5:21 AM
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
	 * @generatedBy CodePro at 5/17/16 5:21 AM
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
	 * @generatedBy CodePro at 5/17/16 5:21 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractMissionTest.class);
	}
}