package com.spartronics4915.swerve.subsystems;

import com.spartronics4915.swerve.Constants;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase
{
    private SwerveModule mFrontLeftModule;
    private SwerveModule mFrontRightModule;
    private SwerveModule mBackLeftModule;
    private SwerveModule mBackRightModule;
    // private Gyroscope mGyroscope;

    public Drive()
    {
        mFrontLeftModule = new SwerveModule(
            Constants.ModulePosition.kFrontLeft, Constants.kFrontLeftDriveMotor,
            Constants.kFrontLeftAngleMotor, Constants.kFrontLeftAngleEncoder,
            Constants.kFrontLeftAngleEncoderOffset);
        mFrontRightModule = new SwerveModule(
            Constants.ModulePosition.kFrontRight, Constants.kFrontRightDriveMotor,
            Constants.kFrontRightAngleMotor, Constants.kFrontRightAngleEncoder,
            Constants.kFrontRightAngleEncoderOffset);
        mBackLeftModule = new SwerveModule(
            Constants.ModulePosition.kBackLeft, Constants.kBackLeftDriveMotor,
            Constants.kBackLeftAngleMotor, Constants.kBackLeftAngleEncoder,
            Constants.kBackLeftAngleEncoderOffset);
        mBackRightModule = new SwerveModule(
            Constants.ModulePosition.kBackRight, Constants.kBackRightDriveMotor,
            Constants.kBackRightAngleMotor, Constants.kBackRightAngleEncoder,
            Constants.kBackRightAngleEncoderOffset);
        // mGyroscope = new NavX(SPI.Port.kMXP);
    }

    @Override
    public void periodic()
    {
        // Logging
    }

    public void drive(double x, double y, double theta, boolean headless)
    {
        mFrontLeftModule.setTargetVelocity();
        mFrontLeftModule.setTargetRotation();

        mFrontRightModule.setTargetVelocity();
        mFrontRightModule.setTargetRotation();

        mBackLeftModule.setTargetVelocity();
        mBackLeftModule.setTargetRotation();

        mBackRightModule.setTargetVelocity();
        mBackRightModule.setTargetRotation();
    }

    public void reset()
    {
        // Reset Gyroscope
    }
}
