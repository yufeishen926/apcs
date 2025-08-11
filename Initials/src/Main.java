import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(12);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(2,8,East,9);
		
    // examples of commands you can invoke on a Robot
    r.move();// move one step in the direction it is facing
    r.turnLeft();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.turnLeft();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.turnLeft();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();

    Robot m = new Robot(8,4,North,100);
    m.move();
    m.putBeeper();
    m.turnLeft();
    m.turnLeft();
    m.move();
    m.move();
    m.move();
    m.move();
    m.move();
    m.putBeeper();
    m.move();
    m.putBeeper();
    m.move();
    m.turnLeft();
    m.turnLeft();
    m.turnLeft();
    m.move();
    m.putBeeper();
    m.move();
    m.putBeeper();
    m.turnLeft();
    m.turnLeft();
    m.move();
    m.move();
    m.move();
    m.turnLeft();
    m.move();
    m.move();
    m.move();
    m.move();
    m.move();
    m.move();
    m.move();
    m.turnLeft();
    m.move();
    m.move();
    m.move();
    m.move();
    m.putBeeper();
    m.turnLeft();
    m.turnLeft();
    m.turnLeft();
    m.move();
    m.putBeeper();
    m.move();
    m.putBeeper();
    m.move();
    m.putBeeper();
    m.move();
    m.putBeeper();


    //r.putBeeper();
    //r.move();
	r.putBeeper();

  }
}