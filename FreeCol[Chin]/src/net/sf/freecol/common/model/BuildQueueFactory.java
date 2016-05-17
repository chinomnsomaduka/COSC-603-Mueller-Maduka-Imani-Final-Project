package net.sf.freecol.common.model;



/**
 * The class <code>BuildQueueFactory</code> implements static methods that return instances of the class <code>{@link BuildQueue}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class BuildQueueFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private BuildQueueFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link BuildQueue}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static BuildQueue createBuildQueue() {
		return new BuildQueue(new Colony(GameFactory.createGame(), ""), BuildQueue.CompletionAction.ADD_RANDOM, 0);
	}


	/**
	 * Create an instance of the class <code>{@link BuildQueue}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static BuildQueue createBuildQueue2() {
		return new BuildQueue(new Colony(GameFactory.createGame(), new Player(GameFactory.createGame()), "", TileFactory.createTile()), BuildQueue.CompletionAction.REMOVE, 1);
	}


	/**
	 * Create an instance of the class <code>{@link BuildQueue}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static BuildQueue createBuildQueue3() {
		return new BuildQueue(new Colony(GameFactory.createGame(), new Player(GameFactory.createGame2(), "0123456789"), (String) null, TileFactory.createTile4()), BuildQueue.CompletionAction.REMOVE_EXCEPT_LAST, 7);
	}
}