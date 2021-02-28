package com.spartronics4915.swerve;

import com.spartronics4915.swerve.commands.*;
import com.spartronics4915.swerve.subsystems.*;

import edu.wpi.first.wpilibj.Joystick;

public class RobotContainer
{
    private final Drive mDrive;
    private final Joystick mJoystick;
    private final DriveCommand mDriveCommand;

    public RobotContainer()
    {
        mDrive = new Drive();
        mJoystick = new Joystick(0);
        mDriveCommand = new DriveCommand(mDrive, mJoystick);
        mDrive.setDefaultCommand(mDriveCommand);
    }
}
