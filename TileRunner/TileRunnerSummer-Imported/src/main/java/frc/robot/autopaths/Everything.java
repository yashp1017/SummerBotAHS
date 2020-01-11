package frc.robot.autopaths;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Everything extends CommandGroup {
    public Everything()
    {
        addSequential(new StraightYash());
        addSequential(new TurnYash());
        addSequential(new StraightYash());
        addSequential(new another());
        addSequential(new TurnYash());
        addSequential(new StraightYash());
        addSequential(new TurnYash());
    }
}
