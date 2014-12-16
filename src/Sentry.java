import org.asl.karelx.Uberbot;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot 
{
public Sentry()
   {
   super();
   }
   public Sentry (int x, int y)
   {
   super(x, y, Display.NORTH, Display.INFINITY);
}
	// Provide one or more constructors, as you wish
	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	public void patrol() {
		if(frontIsClear()) {
      move();
      }
      else {
      turnRight();
      }
      // TODO You implement this method.
	}
}
