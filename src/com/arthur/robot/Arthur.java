package com.arthur.robot;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Arthur extends Robot{

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		// TODO Auto-generated method stub
		this.fire(1);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.turnLeft(this.getHeading() % 90);
		this.turnGunRight(90);
		while(true){
			this.ahead(1000);
			this.turnRight(90);
		}
	}

	
}
