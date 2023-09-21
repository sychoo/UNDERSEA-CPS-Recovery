// this module can be used to log information about the 
package controllerMILP;


import controller.Knowledge;
import controller.Monitor;

public class MonitorMILP extends Monitor {

	public MonitorMILP() {
	}

	@Override
	public void run() {
		System.out.println("MonitorMILP is running...");
		System.out.println("System state changed? " + Knowledge.getInstance().systemStateChanged());

		boolean analysisRequired = Knowledge.getInstance().systemStateChanged();
		Knowledge.getInstance().analysisRequired  = analysisRequired;

		System.out.println("Number of Sensors Detected: " +  Knowledge.getInstance().sensorsMap.values().size());
	}	

}
