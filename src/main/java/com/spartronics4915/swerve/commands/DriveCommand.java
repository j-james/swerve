package com.spartronics4915.swerve.commands;

import com.spartronics4915.swerve.Constants;
import com.spartronics4915.swerve.subsystems.Drive;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;

public class DriveCommand extends CommandBase
{
    private final Drive mDrive;

    public DriveCommand(Drive drive)
    {
        mDrive = drive;
        addRequirements(mDrive);
    }

    @Override
    public void initialize()
    {

    }

    @Override
    public void execute()
    {

    }

    @Override
    public void isFinished()
    {

    }

    @Override
    public void end()
    {

    }
}
