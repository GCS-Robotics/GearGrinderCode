package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Example Code")
public class ExampleCode extends LinearOpMode {
    DcMotor linearSlide;
    @Override
    public void runOpMode() throws InterruptedException {
        linearSlide = hardwareMap.dcMotor.get("Motor1");
        waitForStart();
        while(opModeIsActive()) {
            if(gamepad1.right_bumper){
                linearSlide.setPower(1);
                
            } else if (gamepad1.left_bumper) {
                linearSlide.setPower(-1);
                
            }else {
                linearSlide.setPower(0);
            }
        }
    }
}