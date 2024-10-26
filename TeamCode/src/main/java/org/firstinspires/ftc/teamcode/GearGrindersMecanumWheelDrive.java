package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "Gear Grinders Wheel Test")
public class GearGrindersMecanumWheelDrive extends LinearOpMode{
    // Define Motors Here
    DcMotor leftFront;
    //port 0 Gobuilda 5202/3/4
    DcMotor leftRear;
    //port 1 Gobuilda 5202/3/4
    DcMotor rightFront;
    //port 2 Gobuilda 5202/3/4
    DcMotor rightRear;
    //port 3 Gobuilda 5202/3/4
    @Override
    public void runOpMode() throws InterruptedException {
        // On Init (Hardwaremap Motors Here)
        leftFront = hardwareMap.dcMotor.get("motor1");
        leftRear = hardwareMap.dcMotor.get("motor2");
        rightFront = hardwareMap.dcMotor.get("motor3");
        rightRear = hardwareMap.dcMotor.get("motor4");
        waitForStart();
        // On Play
        while (opModeIsActive()) {
            //Forward
            if (gamepad1.left_stick_y < -.50) {
                leftFront.setPower(0.4);
                leftRear.setPower(-0.4);
                rightFront.setPower(-0.4);
                rightRear.setPower(0.4);
            }

            //Backwards
            else if (gamepad1.left_stick_y > .50) {
                leftFront.setPower(-0.4);
                leftRear.setPower(0.4);
                rightFront.setPower(0.4);
                rightRear.setPower(-0.4);
            }
            //Left
            else if(gamepad1.left_stick_x<-.50){
                leftFront.setPower(-0.4);
                leftRear.setPower(-0.4);
                rightFront.setPower(-0.4);
                rightRear.setPower(-0.4);
            }

            //Right
            else if(gamepad1.left_stick_x>.50){
                leftFront.setPower(0.4);
                leftRear.setPower(0.4);
                rightFront.setPower(0.4);
                rightRear.setPower(0.4);
            }

            //RightForwardDiagonal
            else if(gamepad1.right_stick_y<-.50){
                leftFront.setPower(0.4);
                leftRear.setPower(0);
                rightFront.setPower(0);
                rightRear.setPower(0.4);
            }

            //LeftForwardDiagonal
            else if(gamepad1.right_stick_x<-.50){
                leftFront.setPower(0);
                leftRear.setPower(-0.4);
                rightFront.setPower(-0.4);
                rightRear.setPower(0);
            }

            //RightRearDiagonal
            else if(gamepad1.right_stick_y>.50){
                leftFront.setPower(-0.4);
                leftRear.setPower(0);
                rightFront.setPower(0);
                rightRear.setPower(-0.4);
            }

            //LeftRearDiagonal
            else if(gamepad1.right_stick_x>.50){
                leftFront.setPower(0);
                leftRear.setPower(0.4);
                rightFront.setPower(0.4);
                rightRear.setPower(0);
            }

            //ClockwiseTurn
            else if(gamepad1.right_bumper){
                leftFront.setPower(0.4);
                leftRear.setPower(-0.4);
                rightFront.setPower(0.4);
                rightRear.setPower(-0.4);
            }

            //CounterClockwiseTurn
            else if(gamepad1.left_bumper){
                leftFront.setPower(-0.4);
                leftRear.setPower(0.4);
                rightFront.setPower(-0.4);
                rightRear.setPower(0.4);
            }
            //ClockwiseTurnRearAxis
            else if (gamepad1.x){
                leftFront.setPower(0.4);
                leftRear.setPower(0);
                rightFront.setPower(0.4);
                rightRear.setPower(0);
            }

            //CounterClockwiseTurnRearAxis
            else if (gamepad1.y){
                leftFront.setPower(-0.4);
                leftRear.setPower(0);
                rightFront.setPower(-0.4);
                rightRear.setPower(0);
            }

            //ClockwiseTurnFrontAxis
            else if (gamepad1.a){
                leftFront.setPower(0);
                leftRear.setPower(-0.4);
                rightFront.setPower(0);
                rightRear.setPower(-0.4);
            }

            //CounterClockwiseTurnFrontAxis
            else if (gamepad1.b){
                leftFront.setPower(0);
                leftRear.setPower(0.4);
                rightFront.setPower(0);
                rightRear.setPower(0.4);
            }

            //RearRightCornering
            else if (gamepad1.dpad_up){
                leftFront.setPower(0.4);
                leftRear.setPower(-0.4);
                rightFront.setPower(0);
                rightRear.setPower(0);
            }

            //RearLeftCornering
            else if (gamepad1.dpad_down){
                leftFront.setPower(0);
                leftRear.setPower(0);
                rightFront.setPower(-0.4);
                rightRear.setPower(0.4);
            }

            //FrontRightCornering
            else if (gamepad1.dpad_left){
                leftFront.setPower(-0.4);
                leftRear.setPower(0.4);
                rightFront.setPower(0);
                rightRear.setPower(0);
            }

            //FrontLeftCornering
            else if (gamepad1.dpad_right){
                leftFront.setPower(0);
                leftRear.setPower(0);
                rightFront.setPower(0.4);
                rightRear.setPower(-0.4);
            }
            
            else{
                leftFront.setPower(0);
                leftRear.setPower(0);
                rightFront.setPower(0);
                rightRear.setPower(0);
            }
        }
    }
  }