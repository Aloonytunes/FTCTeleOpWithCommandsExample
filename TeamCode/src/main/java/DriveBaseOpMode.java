import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;

public class DriveBaseOpMode extends CommandOpMode {
    protected MotorEx fL, fR, bL, bR;
    protected DriveSubsystem drive;
    protected GamepadEx gamepadEx1;

    /**
     * This code initializes the hardware inside the opmode
     * you also initialize your controllers and your subsystems here
     */
    @Override
    public void initialize() {
        fL = new MotorEx(hardwareMap, "frontLeft");
        fR = new MotorEx(hardwareMap, "frontRight");
        bL = new MotorEx(hardwareMap, "backLeft");
        bR = new MotorEx(hardwareMap, "backRight");
        drive = new DriveSubsystem(fL, fR, bL, bR);
        gamepadEx1 = new GamepadEx(gamepad1);
    }

    protected GamepadButton gb1(GamepadKeys.Button button) {
        return gamepadEx1.getGamepadButton(button);
    }


}
