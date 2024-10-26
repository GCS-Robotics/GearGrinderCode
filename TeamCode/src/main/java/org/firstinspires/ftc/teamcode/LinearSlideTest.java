package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "LinearSlideTest")
public class LinearSlideTest extends LinearOpMode{
    // Define Motors Here
    DcMotor linearSlide;
    //expansionHub port 0 Gobuilda 5202/3/4
    @Override
    public void runOpMode() throws InterruptedException{
        // On Init (Hardwaremap Motors Here)
        linearSlide=hardwareMap.dcMotor.get("motor5");
        waitForStart();
        // On Play
        while(opModeIsActive()) {
            if (gamepad1.a){
                linearSlide.setPower(-1);
            }
            else if (gamepad1.b) {
                linearSlide.setPower(1);
            }
            else {
                linearSlide.setPower(0);
            }
        }
    }
}
