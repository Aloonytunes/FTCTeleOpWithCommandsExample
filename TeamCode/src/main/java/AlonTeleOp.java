import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp(name = "AlonFTCTeleOP")
public class AlonTeleOp extends DriveBaseOpMode{

    private DriveRobotCentricCommand robotCentricCommand;
    private DriveRobotCentricSlowCommand robotCentricSlowCommand;
    @Override
    public void initialize() {
        super.initialize();
        robotCentricSlowCommand = new DriveRobotCentricSlowCommand(drive, gamepadEx1::getLeftX, gamepadEx1::getLeftY, gamepadEx1::getRightX);
        robotCentricCommand = new DriveRobotCentricCommand(drive, gamepadEx1::getLeftX, gamepadEx1::getLeftY, gamepadEx1::getRightX);
        gb1(GamepadKeys.Button.A).toggleWhenPressed(robotCentricSlowCommand);
        register(drive);
        drive.setDefaultCommand(robotCentricCommand);
    }



}
