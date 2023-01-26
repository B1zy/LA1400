import robocode.*;
import java.awt.Color;
import java.util.Random;

public class MasterOfPuppets extends JuniorRobot {
    private Random rand = new Random();
    private double distance;

	public void run() {
	setColors(yellow, black, yellow, yellow, black);

		int heightdistance;
		int widthdistance;
		heightdistance = fieldHeight - robotY;
		widthdistance = fieldWidth - robotX;
		turnTo(0);
		ahead(heightdistance);
		turnTo(90);
		ahead(widthdistance);
		}
	

 
	
	public void onScannedRobot() {
	
		out.println(scannedDistance);
		out.println(scannedVelocity);
		
	
		turnGunTo(scannedAngle );
		
		
	if (scannedDistance < 100)
		{
			fire (3);
		} 
		if (scannedDistance < 200)
		{
			fire (2.2);
		} 
		else
		{
			fire (1.5);
		}

		
	}
	public void onHitByBullet() {

		back(30);
		if (hitByBulletBearing >90)
		{
		turnLeft( 90 + hitByBulletBearing);
		}
	}
	public void onHitWall() {
	
		turnRight(90);
		ahead(50);
	}	
    
}