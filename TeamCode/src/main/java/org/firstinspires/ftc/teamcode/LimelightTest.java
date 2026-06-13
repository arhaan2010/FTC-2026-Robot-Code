package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.hardware.limelightvision.LLResult;

@TeleOp(name = "Limelight Test", group = "Test")
public class LimelightTest extends LinearOpMode {

    private Limelight3A limelight;

    @Override
    public void runOpMode() {

        limelight = hardwareMap.get(
                Limelight3A.class,
                "limelight");

        telemetry.addLine("Limelight Initialized");
        telemetry.update();

        waitForStart();

        limelight.pipelineSwitch(0); // AprilTag pipeline
        limelight.start();

        while (opModeIsActive()) {

            LLResult result = limelight.getLatestResult();

            if (result != null && result.isValid()) {

                telemetry.addLine("TAG DETECTED");

                telemetry.addData("TX", result.getTx());
                telemetry.addData("TY", result.getTy());

            } else {

                telemetry.addLine("NO TAG FOUND");
            }

            telemetry.update();
        }

        limelight.stop();
    }
}