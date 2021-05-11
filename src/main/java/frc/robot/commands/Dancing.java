package frc.robot.commands;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class Dancing extends Command {

  Timer Timer = new Timer();
  boolean dancing = false;

  @Override
  protected void initialize() {

   dancing = false;
  }
  
  @Override
  protected void execute() {
    if (OI.triggerAux.get() == true) {
      Timer.start();
      while (Timer.get() <= 3.0 && Timer.get() >= 0.0) {
        RobotMap.drive.tankDrive(-0.5,0.5);
      } 
      while (Timer.get() <= 5.0 && Timer.get() >= 3.0) {
        RobotMap.armEncoder.setPosition(0.2);
        Timer.delay(0.75);

      } 
      Timer.stop();
      Timer.reset();
    } 

  }
  
  @Override
  protected boolean isFinished() {
    return dancing;
  }
}
