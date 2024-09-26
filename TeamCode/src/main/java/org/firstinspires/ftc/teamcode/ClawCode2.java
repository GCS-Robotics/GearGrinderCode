package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Claw Code 2")
public class ClawCode2 extends LinearOpMode {
    CRServo geoffry;

    @Override
    public void runOpMode() throws InterruptedException {
        geoffry = hardwareMap.get(CRServo.class, "servo1");
        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.left_bumper) {
                geoffry.setPower(1); // Move in one direction
                telemetry.addData("Pressing Left Bumper", true);
            } else if (gamepad1.right_bumper) {
                geoffry.setPower(-1); // Move in the opposite direction
                telemetry.addData("Pressing Right Bumper", true);
            } else {
                geoffry.setPower(0); // Stop the servo when no bumper is pressed
                telemetry.addData("Pressing Left Bumper", false);
                telemetry.addData("Pressing Right Bumper", false);
            }
            telemetry.update();
        }
    }
}