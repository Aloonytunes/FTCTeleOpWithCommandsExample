import com.arcrobotics.ftclib.command.CommandBase;

import java.util.function.DoubleSupplier;

public class DriveRobotCentricCommand extends CommandBase {
    private final DriveSubsystem drive;

    private final DoubleSupplier strafeSpeed, forwardSpeed, turnSpeed;

    public DriveRobotCentricCommand(DriveSubsystem drive, DoubleSupplier strafeSpeed, DoubleSupplier forwardSpeed, DoubleSupplier turnSpeed) {
        this.drive = drive;
        this.forwardSpeed = forwardSpeed;
        this.strafeSpeed = strafeSpeed;
        this.turnSpeed = turnSpeed;

        addRequirements(drive);
    }

    @Override
    public void execute() {
        drive.driveRobotCentric(strafeSpeed.getAsDouble(), forwardSpeed.getAsDouble(), turnSpeed.getAsDouble());
    }
}
