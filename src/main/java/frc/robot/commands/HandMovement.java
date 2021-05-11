package frc.robot.commands;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.RobotMap;

public class HandMovement extends Command {

boolean shake = false;

  @Override
  protected void initialize() {
    shake = false;
  }
  
  @Override
  protected void execute() {
    if (OI.button006Aux.get() == true) {


      
    } 
    if (!OI.button006Aux.get()) {
      RobotMap.shake.set(0.0D);
    } 
  }
  
  @Override
  protected boolean isFinished() {
    return this.shake;
  }
}
