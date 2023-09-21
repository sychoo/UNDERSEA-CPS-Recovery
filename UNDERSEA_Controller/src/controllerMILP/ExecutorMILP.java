package controllerMILP;

import controller.Executor;
import controller.Knowledge;

public class ExecutorMILP extends Executor {
	
	public ExecutorMILP() {
	}

	@Override
	public void run () {
        System.out.println("Running ExecutorMILP: Executing commands");

		//construct command
		String sp = "SPEED="   + (Knowledge.getInstance().getUUVspeed());
		String s1 = "SENSOR1=" + (Knowledge.getInstance().getSensorState("SENSOR1"));
		String s2 = "SENSOR2=" + (Knowledge.getInstance().getSensorState("SENSOR2"));
		String s3 = "SENSOR3=" + (Knowledge.getInstance().getSensorState("SENSOR3"));
    	String s4 = "SENSOR4=" + (Knowledge.getInstance().getSensorState("SENSOR4"));
        // String s5 = "SENSOR5=" + (Knowledge.getInstance().getSensorState("SENSOR5"));


		command = sp +","+ s1 +","+ s2 +","+ s3 + "," + s4;
        //  "," + s5;
		System.out.println(command);
	}	
}
