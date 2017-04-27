package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
static int speed=900;
	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	goStraight(1500);
	driveDirect(0,90);
	sleep(2760);
	goStraight(1000);
	driveDirect(90,0);
	sleep(2500);
	goStraight(1000);
	driveDirect(0,90);
	sleep(2500);
	goStraight(1000);
	driveDirect(90,0);
	sleep(2500);
	goStraight(1000);
	}

	public void loop() {
	
	}
	void goStraight(int time){
		driveDirect(speed,speed);
		sleep(time);
	}
}
