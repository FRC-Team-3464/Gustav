package frc.robot;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
  public static int 
    leftStickPort = 0,  
    rightStickPort = 1,
    auxPort = 2,

   encoderA = 0,
   encoderB = 1,
   ePivot = 0,
  
   leftBackMotor = 6,
   leftFrontMotor = 5,
   rightBackMotor = 8,
   rightFrontMotor = 7,
   shakeInteger = 2,
   armInteger = 1;

  
  public static CANSparkMax
    shake = new CANSparkMax(shakeInteger, CANSparkMaxLowLevel.MotorType.kBrushless),
    arm = new CANSparkMax(armInteger, CANSparkMaxLowLevel.MotorType.kBrushless),
    leftBack = new CANSparkMax(leftBackMotor, CANSparkMaxLowLevel.MotorType.kBrushless),
    leftFront = new CANSparkMax(leftFrontMotor, CANSparkMaxLowLevel.MotorType.kBrushless),
    rightFront = new CANSparkMax(rightFrontMotor, CANSparkMaxLowLevel.MotorType.kBrushless),
    rightBack = new CANSparkMax(rightBackMotor, CANSparkMaxLowLevel.MotorType.kBrushless);
  
  public static CANEncoder 
    armEncoder = arm.getEncoder();

  //public static Spark 
  //  random = new Spark();
  
  public static Solenoid 
    intakeSolenoid1 = new Solenoid(1);
  
  public static DifferentialDrive drive = new DifferentialDrive((SpeedController)new SpeedControllerGroup((SpeedController)leftBack, new SpeedController[] { (SpeedController)leftFront }), (SpeedController)new SpeedControllerGroup((SpeedController)rightBack, new SpeedController[] { (SpeedController)rightFront }));
}

