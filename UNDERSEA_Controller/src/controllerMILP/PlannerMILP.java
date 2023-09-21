package controllerMILP;


import java.util.Random;

import controller.Knowledge;
import controller.Planner;
import controller.uuv.UUVSensor;

public class PlannerMILP extends Planner {

	Random rand = new Random(System.currentTimeMillis());

	
	public PlannerMILP() {
	}

	@Override
	public void run () {
		// Knowledge.getInstance().setUUVspeed(rand.nextDouble() + rand.nextInt(4));
		
		// for (UUVSensor uuvSensor : Knowledge.getInstance().sensorsMap.values()){
		// 	Knowledge.getInstance().setSensorState(uuvSensor.getName(), rand.nextInt(2)-1);
		// }

        Knowledge.getInstance().setUUVspeed(0);

		for (UUVSensor uuvSensor : Knowledge.getInstance().sensorsMap.values()){
			Knowledge.getInstance().setSensorState(uuvSensor.getName(), 0);
		}
	}	

}
