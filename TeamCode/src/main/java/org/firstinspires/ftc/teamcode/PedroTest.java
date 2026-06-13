package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.pedropathing.follower.Follower;
import com.pedropathing.ftc.FollowerBuilder;

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