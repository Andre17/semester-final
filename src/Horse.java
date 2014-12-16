import org.asl.karelx.Wanderer;

public class Horse extends Wanderer {
{
public Horse()
   {
   super();
   }
   public Horse (int i, int j)
   {
   super(i, j, Display.NORTH, Display.INFINITY);
}

	//  TODO Add one or more constructors, as needed
	
	/**
	 * Wander around in random directions until a specified number of steps have been taken.
	 * At regular intervals specified by timer, drop a beeper.
	 * 
	 * @param count		the total number of steps to take
	 * @param timer		the interval at which to drop a beeper
	 * 
	 * Ex. horse.wander(13, 4) should drop a beeper every four steps until thirteen steps are taken
	 */
	public void wander(int count, int timer) {
		wander();
      
	}
}
