package net.sf.freecol.common.model;

import java.util.Iterator;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LocationTest</code> contains tests for the class <code>{@link Location}</code>.
 *
 * @generatedBy CodePro at 5/17/16 2:08 AM
 * @author NFJ6TVK
 * @version $Revision: 1.0 $
 */
public class LocationTest {
	/**
	 * Run the int getRank(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	@Test
	public void testGetRank_1()
		throws Exception {
		Location loc = new HighSeas(GameFactory.createGame2());

		int result = Location.getRank(loc);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getRank(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	@Test
	public void testGetRank_2()
		throws Exception {
		Location loc = null;

		int result = Location.getRank(loc);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Location upLoc(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	@Test
	public void testUpLoc_1()
		throws Exception {
		Location loc = new HighSeas(GameFactory.createGame());

		Location result = Location.upLoc(loc);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Location upLoc(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	@Test
	public void testUpLoc_2()
		throws Exception {
		Location loc = null;

		Location result = Location.upLoc(loc);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
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
	 * @generatedBy CodePro at 5/17/16 2:08 AM
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
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LocationTest.class);
	}
}