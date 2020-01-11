package frc.robot.commands;


import edu.wpi.first.wpilibj.command.Command;

import frc.robot.Controls;
import frc.robot.Robot;

public class DriveCommand extends Command {
  
  Controls controls = Robot.controls;
  public DriveCommand() {
    
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //DRIVER.drive.tank(OI.getX, OI.getY);

    double y = controls.getY();
    double x = -controls.getX();

    Robot.drivetrain.leftMaster.set(x - y);
    Robot.drivetrain.rightMaster.set(x + y);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
