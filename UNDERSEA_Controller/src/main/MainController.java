package main;

import controller.Analyser;
import controller.Controller;
import controller.Executor;
import controller.Monitor;
import controller.Planner;
import controllerPMC.AnalyserPMC;
import controllerPMC.ExecutorPMC;
import controllerPMC.MonitorPMC;
import controllerPMC.PlannerPMC;

import controllerRandom.AnalyserRandom;
import controllerRandom.ExecutorRandom;
import controllerRandom.MonitorRandom;
import controllerRandom.PlannerRandom;

import controllerMILP.MonitorMILP;
import controllerMILP.AnalyzerMILP;
import controllerMILP.ExecutorMILP;
import controllerMILP.PlannerMILP;

public class MainController {

	public static String controllerName = "MILP"; // "Default", "MILP", "PMC", "CT", "Random
	public static String configFile = "resources/config.properties";	

	public static void main(String[] args) {
		//Default controller: does nothing
//	    Monitor monitor  	= new MonitorDefault();
//	    Analyser analyser	= new AnalyserDefault();
//	    Planner planner		= new PlannerDefault();
//	    Executor executor	= new ExecutorDefault();

		// controller declaration
		Monitor monitor  	= null;
		Analyser analyser	= null;
		Planner planner		= null;
		Executor executor	= null;

		// MILP controller
		if (controllerName.equals("MILP")) {
			monitor  	= new MonitorMILP();
			analyser	= new AnalyzerMILP();
			planner		= new PlannerMILP();
			executor	= new ExecutorMILP();
		}

	    // // Random controller
		if (controllerName.equals("Random")) {
			monitor  	= new MonitorRandom();
			analyser	= new AnalyserRandom();
			planner		= new PlannerRandom();
	    	executor	= new ExecutorRandom();
		}


// 		//PMC-based controller
// 	    Monitor monitor  	= new MonitorPMC();
// 	    Analyser analyser	= new AnalyserPMC();
// 	    Planner planner		= new PlannerPMC();
// 	    Executor executor	= new ExecutorPMC();
		
// 		//CT-based controller
// //	    Monitor monitor  	= new MonitorCT();
// //	    Analyser analyser	= new AnalyserCT();
// //	    Planner planner		= new PlannerCT();
// //	    Executor executor	= new ExecutorCT();
		
		//create new controller
		Controller controller = new Controller(monitor, analyser, planner, executor);
					
		//start engine
		ControllerEngine.start(controller);
		System.out.println("Main Controller Shutdown!");
	}

}
