package frc.robot.autopaths;
import java.sql.Time;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TurnYash extends Command {
    private boolean completed;
    private double starttime;

    public void initialize() {
        starttime = Timer.getFPGATimestamp();
    }
    public void execute() {
        if(Timer.getFPGATimestamp() - starttime <= 0.5){
            Robot.drivetrain.leftMaster.set(1.5);
            Robot.drivetrain.rightMaster.set(-0.5);
        }else {
            Robot.drivetrain.leftMaster.set(0);
            Robot.drivetrain.rightMaster.set(0);
            completed = true;
        }
    }
    @Override
    protected boolean isFinished() {
        return completed;
    }
}