// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.PWMVictorSPX;
//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TimedRobot;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Robot extends TimedRobot {
  WPI_VictorSPX motor;
  private static final int motorPort = 1;
  // private static final int joystickPort = 0;

  // private Joystick joystick;

  @Override
  public void robotInit() {
    motor = new WPI_VictorSPX(motorPort);
    // joystick = new Joystick(joystickPort);
  }

  @Override
  public void teleopPeriodic() {
    motor.set(0.5);
    // motor.set(joystick.getY());
  }
}
