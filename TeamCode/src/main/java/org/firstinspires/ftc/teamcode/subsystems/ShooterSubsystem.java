package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ShooterSubsystem {

    private final DcMotorEx shooterL;
    private final DcMotorEx shooterR;

    private static final double TARGET_VELOCITY = 1800;
    private static final double SPINUP_THRESHOLD = 1750;

    public ShooterSubsystem(HardwareMap hardwareMap) {

        shooterL = hardwareMap.get(DcMotorEx.class, "ShooterL");
        shooterR = hardwareMap.get(DcMotorEx.class, "ShooterR");

        shooterL.setDirection(DcMotor.Direction.REVERSE);
        shooterR.setDirection(DcMotor.Direction.FORWARD);

        shooterL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        shooterR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        shooterL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        shooterR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        shooterL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        shooterR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // Tuned values based on your testing
        shooterL.setVelocityPIDFCoefficients(10, 0, 0, 14.8);
        shooterR.setVelocityPIDFCoefficients(10, 0, 0, 14.8);
    }

    public void shootFast() {

        double avgVelocity = getAverageVelocity();

        if (avgVelocity < SPINUP_THRESHOLD) {

            // Full power acceleration
            shooterL.setPower(1.0);
            shooterR.setPower(1.0);

        } else {

            // Velocity hold
            shooterL.setVelocity(TARGET_VELOCITY);
            shooterR.setVelocity(TARGET_VELOCITY);
        }
    }

    public void reverse() {

        shooterL.setPower(-1.0);
        shooterR.setPower(-1.0);
    }

    public void stop() {

        shooterL.setPower(0);
        shooterR.setPower(0);
    }

    public boolean readyToShoot() {

        return Math.abs(getAverageVelocity() - TARGET_VELOCITY) < 30;
    }

    public double getAverageVelocity() {

        return (Math.abs(shooterL.getVelocity())
                + Math.abs(shooterR.getVelocity())) / 2.0;
    }

    public double getLeftVelocity() {
        return shooterL.getVelocity();
    }

    public double getRightVelocity() {
        return shooterR.getVelocity();
    }

    public int getLeftPosition() {
        return shooterL.getCurrentPosition();
    }

    public int getRightPosition() {
        return shooterR.getCurrentPosition();
    }
}