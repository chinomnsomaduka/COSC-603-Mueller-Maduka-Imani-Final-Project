package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.CharArrayWriter;
import java.io.InputStream;
import net.sf.freecol.server.ai.AIMain;
import java.io.PipedInputStream;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import net.sf.freecol.common.option.OptionGroup;
import java.util.UUID;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.server.FreeColServer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GameTest</code> contains tests for the class <code>{@link Game}</code>.
 *
 * @generatedBy CodePro at 5/16/16 10:59 PM
 * @author jeek
 * @version $Revision: 1.0 $
 */
public class GameTest {
	/**
	 * Run the Game() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGame_1()
		throws Exception {

		Game result = new Game();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getMap());
		assertEquals(false, result.getSpanishSuccession());
		assertEquals(null, result.getInitialActiveUnit());
		assertEquals(true, result.allPlayersReadyToLaunch());
		assertEquals(null, result.getNextPlayer());
		assertEquals(null, result.getFirstPlayer());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getUnknownEnemy());
		assertEquals(null, result.getClientPlayer());
		assertEquals(false, result.isInClient());
		assertEquals(true, result.isInServer());
		assertEquals(false, result.isInRevengeMode());
		assertEquals(null, result.getCurrentPlayer());
		assertEquals(null, result.getNationOptions());
		assertEquals("game", result.getXMLTagName());
		assertEquals(false, result.isDisposed());
		assertEquals(true, result.isInitialized());
		assertEquals(true, result.isInternable());
		assertEquals("net.sf.freecol.common.model.Game:0", result.toString());
		assertEquals("0", result.getId());
		assertEquals("0", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("0", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the Game(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGame_2()
		throws Exception {
		Specification specification = new Specification();

		Game result = new Game(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getMap());
		assertEquals(2, result.getAge());
		assertEquals(null, result.getDifficultyOptionGroup());
		assertEquals(false, result.getSpanishSuccession());
		assertEquals(null, result.getInitialActiveUnit());
		assertEquals(true, result.allPlayersReadyToLaunch());
		assertEquals(null, result.getNextPlayer());
		assertEquals(null, result.getFirstPlayer());
		assertEquals(null, result.getUnknownEnemy());
		assertEquals(null, result.getClientPlayer());
		assertEquals(false, result.isInClient());
		assertEquals(true, result.isInServer());
		assertEquals(false, result.isInRevengeMode());
		assertEquals(null, result.getCurrentPlayer());
		assertEquals(null, result.getNationOptions());
		assertEquals("game", result.getXMLTagName());
		assertEquals(false, result.isDisposed());
		assertEquals(true, result.isInitialized());
		assertEquals(true, result.isInternable());
		assertEquals("net.sf.freecol.common.model.Game:0", result.toString());
		assertEquals("0", result.getId());
		assertEquals("0", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("0", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the boolean addPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testAddPlayer_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Player player = PlayerFactory.createPlayer5();

		boolean result = fixture.addPlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer5(PlayerFactory.java:71)
		assertTrue(result);
	}

	/**
	 * Run the boolean addPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testAddPlayer_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player player = PlayerFactory.createPlayer();

		boolean result = fixture.addPlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		assertTrue(result);
	}

	/**
	 * Run the boolean addPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testAddPlayer_3()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Player player = PlayerFactory.createPlayer2();

		boolean result = fixture.addPlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		assertTrue(result);
	}

	/**
	 * Run the boolean allPlayersReadyToLaunch() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testAllPlayersReadyToLaunch_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		boolean result = fixture.allPlayersReadyToLaunch();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean allPlayersReadyToLaunch() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testAllPlayersReadyToLaunch_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		boolean result = fixture.allPlayersReadyToLaunch();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canAddNewPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCanAddNewPlayer_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		boolean result = fixture.canAddNewPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.getVacantNation(Game.java:802)
		//       at net.sf.freecol.common.model.Game.canAddNewPlayer(Game.java:824)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAddNewPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCanAddNewPlayer_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		boolean result = fixture.canAddNewPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.getVacantNation(Game.java:802)
		//       at net.sf.freecol.common.model.Game.canAddNewPlayer(Game.java:824)
		assertTrue(result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		boolean fix = false;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = PlayerFactory.createPlayer2();

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = PlayerFactory.createPlayer3();

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_3()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = null;

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_4()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = PlayerFactory.createPlayer4();

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_5()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = PlayerFactory.createPlayer5();

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_6()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = null;

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_7()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = PlayerFactory.createPlayer();

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_8()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = PlayerFactory.createPlayer2();

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_9()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = null;

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the void checkOwners(Ownable,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testCheckOwners_10()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Ownable o = new Europe(GameFactory.createGame2(), "");
		Player oldOwner = PlayerFactory.createPlayer3();

		fixture.checkOwners(o, oldOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Object o = GameFactory.createGame();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Location findFreeColLocation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testFindFreeColLocation_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";

		Location result = fixture.findFreeColLocation(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Location findFreeColLocation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testFindFreeColLocation_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";

		Location result = fixture.findFreeColLocation(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getAge() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetAge_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		int result = fixture.getAge();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.getAge(Game.java:851)
		assertEquals(0, result);
	}

	/**
	 * Run the List<Colony> getAllColonies(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetAllColonies_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player player = PlayerFactory.createPlayer4();

		List<Colony> result = fixture.getAllColonies(player);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Player getClientPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetClientPlayer_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		Player result = fixture.getClientPlayer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the CombatModel getCombatModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetCombatModel_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		CombatModel result = fixture.getCombatModel();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Player getCurrentPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetCurrentPlayer_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Player result = fixture.getCurrentPlayer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup getDifficultyOptionGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetDifficultyOptionGroup_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		OptionGroup result = fixture.getDifficultyOptionGroup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.getDifficultyOptionGroup(Game.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the Player getFirstPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFirstPlayer_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Player result = fixture.getFirstPlayer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Player getFirstPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFirstPlayer_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		Player result = fixture.getFirstPlayer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFreeColGameObject_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = null;

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFreeColGameObject_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFreeColGameObject_3()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFreeColGameObject_4()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFreeColGameObject_5()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";

		FreeColGameObject result = fixture.getFreeColGameObject(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObject getFreeColGameObject(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFreeColGameObject_6()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;

		FreeColGameObject result = fixture.getFreeColGameObject(id, returnClass);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Iterator<FreeColGameObject> getFreeColGameObjectIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFreeColGameObjectIterator_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Iterator<FreeColGameObject> result = fixture.getFreeColGameObjectIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNext());
	}

	/**
	 * Run the Iterable<FreeColGameObject> getFreeColGameObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetFreeColGameObjects_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		Iterable<FreeColGameObject> result = fixture.getFreeColGameObjects();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Game getGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetGame_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Game result = fixture.getGame();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getMap());
		assertEquals(false, result.getSpanishSuccession());
		assertEquals(null, result.getInitialActiveUnit());
		assertEquals(true, result.allPlayersReadyToLaunch());
		assertEquals(null, result.getNextPlayer());
		assertEquals(null, result.getFirstPlayer());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getUnknownEnemy());
		assertEquals(null, result.getClientPlayer());
		assertEquals(false, result.isInClient());
		assertEquals(true, result.isInServer());
		assertEquals(false, result.isInRevengeMode());
		assertEquals(null, result.getCurrentPlayer());
		assertEquals(null, result.getNationOptions());
		assertEquals("game", result.getXMLTagName());
		assertEquals(false, result.isDisposed());
		assertEquals(true, result.isInitialized());
		assertEquals(true, result.isInternable());
		assertEquals("net.sf.freecol.common.model.Game:0", result.toString());
		assertEquals("0", result.getId());
		assertEquals("0", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("0", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the OptionGroup getGameOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetGameOptions_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		OptionGroup result = fixture.getGameOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: gameOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:957)
		//       at net.sf.freecol.common.model.Specification.getGameOptions(Specification.java:1654)
		//       at net.sf.freecol.common.model.Game.getGameOptions(Game.java:260)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getInitialActiveUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetInitialActiveUnit_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Unit result = fixture.getInitialActiveUnit();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Unit getInitialActiveUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetInitialActiveUnit_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		Unit result = fixture.getInitialActiveUnit();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Player> getLiveEuropeanPlayers(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetLiveEuropeanPlayers_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Player other = PlayerFactory.createPlayer2();

		List<Player> result = fixture.getLiveEuropeanPlayers(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> getLiveNativePlayers(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetLiveNativePlayers_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player other = PlayerFactory.createPlayer3();

		List<Player> result = fixture.getLiveNativePlayers(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: XML failure
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:824)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer3(PlayerFactory.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the List<Player> getLivePlayers(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetLivePlayers_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player other = PlayerFactory.createPlayer();

		List<Player> result = fixture.getLivePlayers(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the Class<? extends FreeColGameObject> getLocationClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetLocationClass_1()
		throws Exception {
		String id = "";

		Class<? extends FreeColGameObject> result = Game.getLocationClass(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at net.sf.freecol.common.model.Game.getLocationClass(Game.java:1095)
		assertNotNull(result);
	}

	/**
	 * Run the Map getMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetMap_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Map result = fixture.getMap();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the OptionGroup getMapGeneratorOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetMapGeneratorOptions_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		OptionGroup result = fixture.getMapGeneratorOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing OptionGroup: mapGeneratorOptions
		//       at net.sf.freecol.common.model.Specification.getOptionGroup(Specification.java:957)
		//       at net.sf.freecol.common.model.Specification.getMapGeneratorOptions(Specification.java:1663)
		//       at net.sf.freecol.common.model.Game.getMapGeneratorOptions(Game.java:279)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject getMessageDisplay(ModelMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetMessageDisplay_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		ModelMessage message = new ModelMessage();
		message.setDisplayId((String) null);
		message.setSourceId("");

		FreeColObject result = fixture.getMessageDisplay(message);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObject getMessageSource(ModelMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetMessageSource_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		ModelMessage message = new ModelMessage();
		message.setSourceId("");

		FreeColGameObject result = fixture.getMessageSource(message);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the NationOptions getNationOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetNationOptions_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		NationOptions result = fixture.getNationOptions();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNextId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetNextId_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		String result = fixture.getNextId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Player getNextPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetNextPlayer_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		Player result = fixture.getNextPlayer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Player> getOtherLivePlayers(Player[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetOtherLivePlayers_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		List<Player> result = fixture.getOtherLivePlayers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Player> getOtherLivePlayers(Player[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetOtherLivePlayers_2()
		throws Exception {
		Game fixture = GameFactory.createGame();

		List<Player> result = fixture.getOtherLivePlayers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerAfter_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player beforePlayer = PlayerFactory.createPlayer4();

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerAfter_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Player beforePlayer = PlayerFactory.createPlayer5();

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer5(PlayerFactory.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerAfter_3()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player beforePlayer = PlayerFactory.createPlayer();

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerAfter_4()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Player beforePlayer = PlayerFactory.createPlayer2();

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerAfter_5()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player beforePlayer = PlayerFactory.createPlayer3();

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: XML failure
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:824)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer3(PlayerFactory.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the Player getPlayerAfter(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerAfter_6()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Player beforePlayer = PlayerFactory.createPlayer4();

		Player result = fixture.getPlayerAfter(beforePlayer);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Player getPlayerByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerByName_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String name = "";

		Player result = fixture.getPlayerByName(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Player getPlayerByNation(Nation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerByNation_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Nation nation = new Nation("", new Specification());

		Player result = fixture.getPlayerByNation(nation);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Player getPlayerByNationId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayerByNationId_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String nationId = "";

		Player result = fixture.getPlayerByNationId(nationId);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Player> getPlayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetPlayers_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		List<Player> result = fixture.getPlayers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Settlement getSettlementByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetSettlementByName_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String name = "";

		Settlement result = fixture.getSettlementByName(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Settlement getSettlementByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetSettlementByName_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String name = "";

		Settlement result = fixture.getSettlementByName(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Settlement getSettlementByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetSettlementByName_3()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String name = "";

		Settlement result = fixture.getSettlementByName(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Settlement getSettlementByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetSettlementByName_4()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String name = "";

		Settlement result = fixture.getSettlementByName(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean getSpanishSuccession() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetSpanishSuccession_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		boolean result = fixture.getSpanishSuccession();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getSpanishSuccession() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetSpanishSuccession_2()
		throws Exception {
		Game fixture = GameFactory.createGame();

		boolean result = fixture.getSpanishSuccession();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Specification getSpecification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetSpecification_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Specification result = fixture.getSpecification();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the java.util.Map<String, String> getStatistics() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetStatistics_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		java.util.Map<String, String> result = fixture.getStatistics();

		// add additional test code here
		assertNotNull(result);
		assertEquals(5, result.size());
		assertEquals("910", result.get("totalMemory"));
		assertEquals("1", result.get("Game"));
		assertEquals("0", result.get("disposed"));
		assertEquals("285", result.get("freeMemory"));
		assertEquals("910", result.get("maxMemory"));
	}

	/**
	 * Run the java.util.Map<String, String> getStatistics() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetStatistics_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		java.util.Map<String, String> result = fixture.getStatistics();

		// add additional test code here
		assertNotNull(result);
		assertEquals(5, result.size());
		assertEquals("910", result.get("totalMemory"));
		assertEquals("1", result.get("Game"));
		assertEquals("0", result.get("disposed"));
		assertEquals("285", result.get("freeMemory"));
		assertEquals("910", result.get("maxMemory"));
	}

	/**
	 * Run the java.util.Map<String, String> getStatistics() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetStatistics_3()
		throws Exception {
		Game fixture = GameFactory.createGame();

		java.util.Map<String, String> result = fixture.getStatistics();

		// add additional test code here
		assertNotNull(result);
		assertEquals(5, result.size());
		assertEquals("796", result.get("totalMemory"));
		assertEquals("1", result.get("Game"));
		assertEquals("0", result.get("disposed"));
		assertEquals("171", result.get("freeMemory"));
		assertEquals("910", result.get("maxMemory"));
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = Game.getTagName();

		// add additional test code here
		assertEquals("game", result);
	}

	/**
	 * Run the Turn getTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetTurn_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Turn result = fixture.getTurn();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals(1492, result.getYear());
		assertEquals(false, result.isFirstSeasonTurn());
		assertEquals("1492", result.getSaveGameSuffix());
		assertEquals(-1, result.getSeason());
		assertEquals(true, result.isFirstTurn());
	}

	/**
	 * Run the UUID getUUID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetUUID_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		UUID result = fixture.getUUID();

		// add additional test code here
		assertNotNull(result);
		assertEquals("66aa7b2e-b61e-46c5-abee-e51fb3bcd69d", result.toString());
		assertEquals(4, result.version());
		assertEquals(2, result.variant());
		assertEquals(-6057652524444494179L, result.getLeastSignificantBits());
		assertEquals(7397860778463610565L, result.getMostSignificantBits());
	}

	/**
	 * Run the Player getUnknownEnemy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetUnknownEnemy_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		Player result = fixture.getUnknownEnemy();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Nation getVacantNation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetVacantNation_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		Nation result = fixture.getVacantNation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.getVacantNation(Game.java:802)
		assertNotNull(result);
	}

	/**
	 * Run the Nation getVacantNation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetVacantNation_2()
		throws Exception {
		Game fixture = GameFactory.createGame();

		Nation result = fixture.getVacantNation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.getVacantNation(Game.java:802)
		assertNotNull(result);
	}

	/**
	 * Run the List<Nation> getVacantNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetVacantNations_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		List<Nation> result = fixture.getVacantNations();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.getVacantNations(Game.java:813)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("game", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(48, result);
	}

	/**
	 * Run the boolean isInClient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testIsInClient_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		boolean result = fixture.isInClient();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInRevengeMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testIsInRevengeMode_1()
		throws Exception {
		Game fixture = GameFactory.createGame();

		boolean result = fixture.isInRevengeMode();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInRevengeMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testIsInRevengeMode_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		boolean result = fixture.isInRevengeMode();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testIsInServer_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();

		boolean result = fixture.isInServer();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the FreeColObject newInstance(Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testNewInstance_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Class<FreeColObject> returnClass = FreeColObject.class;
		boolean server = true;

		FreeColObject result = fixture.newInstance(returnClass, server);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColObject newInstance(Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testNewInstance_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Class<FreeColObject> returnClass = FreeColObject.class;
		boolean server = false;

		FreeColObject result = fixture.newInstance(returnClass, server);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void notifyOwnerChanged(FreeColGameObject,Player,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testNotifyOwnerChanged_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColGameObject source = new Game();
		Player oldOwner = PlayerFactory.createPlayer3();
		Player newOwner = PlayerFactory.createPlayer4();

		fixture.notifyOwnerChanged(source, oldOwner, newOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: XML failure
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:824)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer3(PlayerFactory.java:51)
	}

	/**
	 * Run the void notifyOwnerChanged(FreeColGameObject,Player,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testNotifyOwnerChanged_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColGameObject source = new Game();
		Player oldOwner = PlayerFactory.createPlayer5();
		Player newOwner = PlayerFactory.createPlayer();

		fixture.notifyOwnerChanged(source, oldOwner, newOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer5(PlayerFactory.java:71)
	}

	/**
	 * Run the void notifyRemoveFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testNotifyRemoveFreeColGameObject_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";

		fixture.notifyRemoveFreeColGameObject(id);

		// add additional test code here
	}

	/**
	 * Run the void notifyRemoveFreeColGameObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testNotifyRemoveFreeColGameObject_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";

		fixture.notifyRemoveFreeColGameObject(id);

		// add additional test code here
	}

	/**
	 * Run the void notifySetFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testNotifySetFreeColGameObject_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";
		FreeColGameObject fcgo = new Game();

		fixture.notifySetFreeColGameObject(id, fcgo);

		// add additional test code here
	}

	/**
	 * Run the void notifySetFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testNotifySetFreeColGameObject_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";
		FreeColGameObject fcgo = new Game();

		fixture.notifySetFreeColGameObject(id, fcgo);

		// add additional test code here
	}

	/**
	 * Run the boolean playerNameInUse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testPlayerNameInUse_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String name = "";

		boolean result = fixture.playerNameInUse(name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean playerNameInUse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testPlayerNameInUse_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String name = "";

		boolean result = fixture.playerNameInUse(name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Game fixture = GameFactory.createGame();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Game fixture = GameFactory.createGame();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		Game fixture = GameFactory.createGame();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		Game fixture = GameFactory.createGame();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		Game fixture = GameFactory.createGame();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		Game fixture = GameFactory.createGame();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		Game fixture = GameFactory.createGame2();
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testRemoveFreeColGameObject_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Empty identifier.
		//       at net.sf.freecol.common.model.Game.removeFreeColGameObject(Game.java:379)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testRemoveFreeColGameObject_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Empty identifier.
		//       at net.sf.freecol.common.model.Game.removeFreeColGameObject(Game.java:379)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testRemoveFreeColGameObject_3()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Empty identifier.
		//       at net.sf.freecol.common.model.Game.removeFreeColGameObject(Game.java:379)
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRemoveFreeColGameObject_4()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = null;
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
	}

	/**
	 * Run the void removeFreeColGameObject(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRemoveFreeColGameObject_5()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";
		String reason = "";

		fixture.removeFreeColGameObject(id, reason);

		// add additional test code here
	}

	/**
	 * Run the boolean removePlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testRemovePlayer_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player player = PlayerFactory.createPlayer3();

		boolean result = fixture.removePlayer(player);

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
	 * Run the boolean removePlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testRemovePlayer_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Player player = PlayerFactory.createPlayer4();

		boolean result = fixture.removePlayer(player);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean removePlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testRemovePlayer_3()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player player = PlayerFactory.createPlayer5();

		boolean result = fixture.removePlayer(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer5(PlayerFactory.java:71)
		assertTrue(result);
	}

	/**
	 * Run the void setCombatModel(CombatModel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetCombatModel_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		CombatModel newCombatModel = new SimpleCombatModel();

		fixture.setCombatModel(newCombatModel);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetCurrentPlayer_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Player newCurrentPlayer = PlayerFactory.createPlayer2();

		fixture.setCurrentPlayer(newCurrentPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetFreeColGameObject_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";
		FreeColGameObject fcgo = new Game();

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetFreeColGameObject_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = null;
		FreeColGameObject fcgo = new Game();

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetFreeColGameObject_3()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";
		FreeColGameObject fcgo = new Game();

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetFreeColGameObject_4()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String id = "";
		FreeColGameObject fcgo = null;

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
	}

	/**
	 * Run the void setFreeColGameObject(String,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetFreeColGameObject_5()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String id = "";
		FreeColGameObject fcgo = new Game();

		fixture.setFreeColGameObject(id, fcgo);

		// add additional test code here
	}

	/**
	 * Run the void setFreeColGameObjectListener(FreeColGameObjectListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetFreeColGameObjectListener_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColGameObjectListener fcgol = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));

		fixture.setFreeColGameObjectListener(fcgol);

		// add additional test code here
	}

	/**
	 * Run the void setGame(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetGame_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Game game = GameFactory.createGame();

		fixture.setGame(game);

		// add additional test code here
	}

	/**
	 * Run the void setGameOptions(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetGameOptions_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		OptionGroup go = new OptionGroup("");

		fixture.setGameOptions(go);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.setGameOptions(Game.java:269)
	}

	/**
	 * Run the void setInitialActiveUnitId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetInitialActiveUnitId_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		String initialActiveUnitId = "";

		fixture.setInitialActiveUnitId(initialActiveUnitId);

		// add additional test code here
	}

	/**
	 * Run the void setMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetMap_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Map newMap = new Map(GameFactory.createGame(), 1, 1);

		fixture.setMap(newMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Map.<init>(Map.java:280)
	}

	/**
	 * Run the void setMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetMap_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Map newMap = new Map(GameFactory.createGame(), 1, 1);

		fixture.setMap(newMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Map.<init>(Map.java:280)
	}

	/**
	 * Run the void setMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetMap_3()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Map newMap = new Map(GameFactory.createGame(), 1, 1);

		fixture.setMap(newMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Map.<init>(Map.java:280)
	}

	/**
	 * Run the void setMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetMap_4()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Map newMap = new Map(GameFactory.createGame(), 1, 1);

		fixture.setMap(newMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Map.<init>(Map.java:280)
	}

	/**
	 * Run the void setMapGeneratorOptions(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetMapGeneratorOptions_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		OptionGroup mgo = new OptionGroup("");

		fixture.setMapGeneratorOptions(mgo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.setMapGeneratorOptions(Game.java:289)
	}

	/**
	 * Run the void setNationOptions(NationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetNationOptions_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		NationOptions newNationOptions = new NationOptions(new Specification());

		fixture.setNationOptions(newNationOptions);

		// add additional test code here
	}

	/**
	 * Run the void setSpanishSuccession(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetSpanishSuccession_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		boolean spanishSuccession = true;

		fixture.setSpanishSuccession(spanishSuccession);

		// add additional test code here
	}

	/**
	 * Run the void setSpecification(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetSpecification_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Specification specification = new Specification();

		fixture.setSpecification(specification);

		// add additional test code here
	}

	/**
	 * Run the void setTurn(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetTurn_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		Turn newTurn = new Turn(1);

		fixture.setTurn(newTurn);

		// add additional test code here
	}

	/**
	 * Run the void setUnknownEnemy(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testSetUnknownEnemy_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		Player player = PlayerFactory.createPlayer();

		fixture.setUnknownEnemy(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
	}

	/**
	 * Run the FreeColObject unserialize(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testUnserialize_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		String xml = "";
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.unserialize(xml, returnClass);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_12()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_13()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_14()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_15()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.writeChildren(Game.java:1278)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:416)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2731)
		//       at net.sf.freecol.common.model.Game.writeChildren(Game.java:1278)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.writeChildren(Game.java:1278)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:416)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2731)
		//       at net.sf.freecol.common.model.Game.writeChildren(Game.java:1278)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.writeChildren(Game.java:1278)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		Game fixture = GameFactory.createGame2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeAttribute(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:416)
		//       at net.sf.freecol.common.model.Specification.toXML(Specification.java:2731)
		//       at net.sf.freecol.common.model.Game.writeChildren(Game.java:1278)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		Game fixture = GameFactory.createGame();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Game.writeChildren(Game.java:1278)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/16/16 10:59 PM
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
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
	 * @generatedBy CodePro at 5/16/16 10:59 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GameTest.class);
	}
}