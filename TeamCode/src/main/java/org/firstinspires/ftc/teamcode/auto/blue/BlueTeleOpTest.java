package org.firstinspires.ftc.teamcode.auto.blue;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Blue TeleOp Test")
public class BlueTeleOpTest extends LinearOpMode {

    @Override
    public void runOpMode() {

        waitForStart();

        while(opModeIsActive()) {

            telemetry.addLine("Blue TeleOp Running");
            telemetry.update();
        }
    }
}