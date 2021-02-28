package com.spartronics4915.swerve.commands;

import com.spartronics4915.swerve.subsystems.Drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveCommand extends CommandBase
{
    private final Drive mDrive;
    private final Joystick mJoystick;

    public DriveCommand(Drive drive, Joystick joystick)
    {
        mDrive = drive;
        mJoystick = joystick;
        addRequirements(mDrive);
    }

    @Override
    public void execute()
    {
        // Universal joystick convention is that forward and left are negative
        double x = -1 * mJoystick.getRawAxis(0); // TODO: Verify these
        double y = -1 * mJoystick.getRawAxis(1);
        double theta = -1 * mJoystick.getRawAxis(2); // x-direction on right stick

        // Deadband and apply response curve
        x = deadband(x);
        y = deadband(y);
        theta = deadband(theta);
        x = Math.copySign(Math.pow(Math.abs(x), 2.0), x);
        y = Math.copySign(Math.pow(Math.abs(y), 2.0), y);
        theta = Math.copySign(Math.pow(Math.abs(theta), 2.0), theta);

        mDrive.drive(x, y, theta, true);
    }

    public double deadband(double val)
    {
        if (Math.abs(val) < 0.1)
            return 0.0;
        return val;
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }
}
