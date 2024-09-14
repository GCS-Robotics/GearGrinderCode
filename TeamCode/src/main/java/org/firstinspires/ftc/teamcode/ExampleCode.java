package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Example Code")
public class ExampleCode extends LinearOpMode {
    DcMotor motor;
    Servo servo;
    @Override
    public void runOpMode() throws InterruptedException {
        motor = hardwareMap.dcMotor.get("Motor");
        servo = hardwareMap.servo.get("Servo1");
        waitForStart();
        while(opModeIsActive()) {
            if(gamepad1.start) {
                motor.setPower(1);
            }
            if(gamepad1.dpad_up) {
                servo.setPosition(0);
            }
        }
    }
}
