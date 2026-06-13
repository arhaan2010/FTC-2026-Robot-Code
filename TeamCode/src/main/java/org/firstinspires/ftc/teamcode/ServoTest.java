package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Servo Test", group = "Test")
public class ServoTest extends LinearOpMode {

    private Servo Sservo;

    @Override
    public void runOpMode() {

        Sservo = hardwareMap.get(Servo.class, "Sservo");


        telemetry.addLine("Servo Test Ready");
        telemetry.addLine("A = Position 0.0");
        telemetry.addLine("B = Position 0.3");
        telemetry.addLine("Y = Position 1.0");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {

            if (gamepad1.a) {
                Sservo.setPosition(0.0);
            }

            if (gamepad1.b) {
                Sservo.setPosition(0.3);
            }

            if (gamepad1.y) {
                Sservo.setPosition(1.0);
            }

            telemetry.addData("Servo Position", Sservo.getPosition());
            telemetry.update();
        }
    }
}