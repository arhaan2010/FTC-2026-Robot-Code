package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Hello FTC")
public class HelloFTC extends LinearOpMode {

    @Override
    public void runOpMode() {

       //telemetry.addData("Status", "Initialized");
        //telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Status", "Hello FTC");
            telemetry.update();
        }
    }
}