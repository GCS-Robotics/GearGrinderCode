package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Claw Code")
public class ClawCode extends LinearOpMode {
    DcMotor geoffry;
    @Override
    public void runOpMode() throws InterruptedException {
        geoffry=hardwareMap.dcMotor.get("servo1");
        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.left_bumper){
                geoffry.setPower(0.2);
            }
            else if (gamepad1.right_bumper){
                geoffry.setPower(-0.2);

            }
            else{
                geoffry.setPower(0);
            }
        }
    }
}