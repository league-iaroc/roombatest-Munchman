package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed = 700;
	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
  
 driveDirect(speed, speed);
 sleep(2500);
 driveDirect(0,90);
 sleep(3500);
 driveDirect(speed, speed);
 sleep(3500);
 driveDirect(90,0);
 sleep(3500);
 driveDirect(speed,speed);
	}

	public void loop() {
	
	}
}
