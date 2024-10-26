package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Primary Drive Mode")
public class PrimaryDrive extends LinearOpMode {
    // Define Motors Here
    DcMotor leftFront; //port 0 Gobuilda 5202/3/4
    DcMotor leftRear; //port 1 Gobuilda 5202/3/4
    DcMotor rightFront; //port 2 Gobuilda 5202/3/4
    DcMotor rightRear; //port 3 Gobuilda 5202/3/4
    DcMotor linearSlide; //expansionHub port 0 Gobuilda 5202/3/4
    @Override
    public void runOpMode() throws InterruptedException {
        // On Init (Hardwaremap Motors Here)
        leftFront=hardwareMap.dcMotor.get("motor1");
        leftRear=hardwareMap.dcMotor.get("motor2");
        rightFront=hardwareMap.dcMotor.get("motor3");
        rightRear=hardwareMap.dcMotor.get("motor4");
        linearSlide=hardwareMap.dcMotor.get("motor5");
        waitForStart();
        // On Play
        while(opModeIsActive()) {
            /// LINEAR SLIDE
            if (gamepad2.left_stick_y<.5){
                linearSlide.setPower(-0.1);
            }
            else if (gamepad2.left_stick_y>.5) {
                linearSlide.setPower(0.1);
            }
            else {
                linearSlide.setPower(0);
            }
            // DRIVING

        }
    }
}
