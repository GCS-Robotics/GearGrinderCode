package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Arm Code")
public class ArmCode extends LinearOpMode {
    DcMotor geoffry;
    @Override
    public void runOpMode() throws InterruptedException {
        geoffry=hardwareMap.dcMotor.get("motor1");
        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.left_bumper){
                geoffry.setPower(0.1);
            }
            else if (gamepad1.right_bumper){
                geoffry.setPower(-0.1);

            }
            else{
                geoffry.setPower(0);
            }
        }
    }
}