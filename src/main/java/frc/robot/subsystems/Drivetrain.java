package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.DrivetrainConstants;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.kinematics.DifferentialDriveOdometry;
import edu.wpi.first.math.kinematics.DifferentialDriveWheelSpeeds;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import com.ctre.phoenix.motorcontrol.TalonSRXSimCollection;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Drivetrain extends SubsystemBase {

    private WPI_TalonSRX m_leftSRX = new WPI_TalonSRX(DrivetrainConstants.kLeftSRXDrivePort);
    private WPI_TalonSRX m_leftSRX_1 = new WPI_TalonSRX(DrivetrainConstants.kLeftSRXDrivePort_1);
    MotorControllerGroup m_left = new MotorControllerGroup(m_leftSRX, m_leftSRX_1);

    private WPI_TalonSRX m_rightSRX = new WPI_TalonSRX(DrivetrainConstants.kRightSRXDrivePort);
    private WPI_TalonSRX m_rightSRX_1 = new WPI_TalonSRX(DrivetrainConstants.kRightSRXDrivePort_1);
    MotorControllerGroup m_right = new MotorControllerGroup(m_rightSRX, m_rightSRX_1);

    private DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);
    
}
