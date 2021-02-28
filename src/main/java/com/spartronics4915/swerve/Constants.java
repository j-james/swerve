package com.spartronics4915.swerve;

public final class Constants
{
    /* Ports and IDs */

    // CAN
    public static final int kFrontLeftDriveMotor = 1;
    public static final int kFrontLeftAngleMotor = 2;

    public static final int kFrontRightDriveMotor = 3;
    public static final int kFrontRightAngleMotor = 4;

    public static final int kBackLeftDriveMotor = 5;
    public static final int kBackLeftAngleMotor = 6;

    public static final int kBackRightDriveMotor = 7;
    public static final int kBackRightAngleMotor = 8;

    // Analog
    public static final int kFrontLeftAngleEncoder = 0;
    public static final int kFrontRightAngleEncoder = 1;
    public static final int kBackLeftAngleEncoder = 2;
    public static final int kBackRightAngleEncoder = 3;

    /* Physical Constants */

    // Positions
    public static enum ModulePosition {kFrontLeft, kFrontRight, kBackLeft, kBackRight};

    // Encoder Offsets
    public static final double kFrontLeftAngleEncoderOffset = -Math.toRadians(300);
    public static final double kFrontRightAngleEncoderOffset = -Math.toRadians(1.5);
    public static final double kBackLeftAngleEncoderOffset = -Math.toRadians(90);
    public static final double kBackRightAngleEncoderOffset = -Math.toRadians(300);

    // Distance between front and back wheels, in inches
    public static final double kWheelBase = 23.5;
    // Distance between left and right wheels, in inches
    public static final double kTrackWidth = 23.5;
}
