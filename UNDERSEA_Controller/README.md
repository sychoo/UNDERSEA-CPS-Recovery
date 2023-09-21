# UNDERSEA CPS Recovery
This repository is based on the following repositories and documentation from UNDERSEA, which is a SEAMS artifact
- Paper (SEAMS '17): https://ieeexplore.ieee.org/document/7968135

# Installation of the repository 
For installation and troubleshooting, you can refer to https://www-users.york.ac.uk/~sg778/UNDERSEA/
- follow all the steps, except replace the UNDERSEA Controller folder under the UNDERSEA repository with this repository. The rest remains unchanged.
- Makes sure to execute `./build-missionParser.sh` to build the mission parser written in ANTLR and `./build-DSL.sh` to build the mission DSL.

# How to rebuild mission and controller 
- Run `./build-mission.sh <mission file config>` to build mission files
- Run `./build-controller.sh` to build controller

# When simulator doesn't show all the elements
- Run `./clean.sh -k` to kill all the processes

# Experiments
A simple scenario
``
SENSOR
{
  NAME		= SENSOR1
  RATE      = 5

  DEGRADATION	= 10:20:1
  DEGRADATION	= 20:30:0.1
}
``
# Pitfalls
- make sure to realize where the mission files are for the mission generation. Generally, use the missions in the `missions/` folder