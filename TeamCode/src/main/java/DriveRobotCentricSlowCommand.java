import com.arcrobotics.ftclib.command.CommandBase;

import java.util.function.DoubleSupplier;

public class DriveRobotCentricSlowCommand extends CommandBase {
    private final DriveSubsystem drive;
    private final DoubleSupplier strafe, forward, turn;

    public DriveRobotCentricSlowCommand(DriveSubsystem drive, DoubleSupplier strafe, DoubleSupplier forward, DoubleSupplier turn) {
        this.drive = drive;
        this.strafe = strafe;
        this.forward = forward;
        this.turn = turn;
        addRequirements(drive);
    }

    @Override
    public void execute() {
        drive.driveRobotCentricSlowMode(strafe.getAsDouble(), forward.getAsDouble(), turn.getAsDouble());
    }

}
