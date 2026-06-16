package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "Pedro Test")
public class PedroTest extends LinearOpMode {

    @Override
    public void runOpMode() {

        telemetry.addLine("PedroPathing Found");
        telemetry.update();

        waitForStart();

        while(opModeIsActive()) {

            telemetry.addLine("Running");
            telemetry.update();
        }
    }
}