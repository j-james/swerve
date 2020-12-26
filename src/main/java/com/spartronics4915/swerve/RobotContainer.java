package com.spartronics4915.swerve;

import com.spartronics4915.swerve.commands;
import com.spartronics4915.swerve.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class RobotContainer
{
    private final Drive mDrive;
    private final DriveCommands mDriveCommands;

    public RobotContainer()
    {
        mDrive = new Drive();
        mDriveCommands = new DriveCommands(mDrive);

        configureXboxBindings();
    }

    /**
     * (L): movement
     * (R): rotation
     * A, B, X, Y, L, R, LT, RT: free
     */
    private void configureXboxBindings()
    {

    }
}
