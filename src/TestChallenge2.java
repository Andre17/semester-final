
 import edu.fcps.karel2.Display; 
 import edu.fcps.karel2.Robot;
 import org.asl.karelx.Wanderer;
 
public class TestChallenge2 {
	// TODO Complete the Horse class, provided

	public static void main(String[] args) {
		Display.openWorld("maps/pasture.map");

      Display.setSize(15, 15);
      Display.setSpeed(7);
      Robot andre = new Wanderer(int i, int j);
      for(int n = 0; n<36; n++) {
                  for(int k=0; k<36; k++) {
                  andre.wander(); 
                  }
                  explode();
               
		// TODO Create an instance of a Horse inside the pasture
		// TODO Have the horse wander for 36 steps with a timer of 7
		// TODO Have the horse explode()
	}

}
