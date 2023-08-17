import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorImpl;
import com.qualcomm.robotcore.hardware.DcMotorImplEx;
import com.qualcomm.robotcore.hardware.configuration.typecontainers.MotorConfigurationType;

public class DriveSubsystem extends SubsystemBase {


    private final MecanumDrive robot;
    public MotorEx leftBack, leftFront, rightBack, rightFront;
    public DriveSubsystem(MotorEx leftBack, MotorEx leftfront, MotorEx rightBack, MotorEx rightFront){
        this.leftBack = leftBack;
        this.leftFront = leftfront;
        this.rightBack = rightBack;
        this.rightFront = rightFront;
        robot = new MecanumDrive(leftFront, rightFront, leftBack, rightBack);
    }

    public void driveRobotCentric(double strafe, double forward, double turn) {
        robot.driveRobotCentric(strafe, forward, turn);
    }

    public void driveRobotCentricSlowMode(double strafe, double forward, double turn) {
        robot.driveRobotCentric(strafe/3, forward/3, turn/3);
    }


}
