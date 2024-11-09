package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp(name = "GearGrindersMainDriveCode")
public class GearGrindersMainDriveCode extends LinearOpMode{
    CRServo claw;
    // Define Motors Here
    DcMotor leftFront;
    //port 0 Gobuilda 5202/3/4
    DcMotor leftRear;
    //port 1 Gobuilda 5202/3/4
    DcMotor rightFront;
    //port 2 Gobuilda 5202/3/4
    DcMotor rightRear;
    //port 3 Gobuilda 5202/3/4
    DcMotor arm;
    public void runOpMode() throws InterruptedException {
        claw = hardwareMap.crservo.get("servo1");
        leftFront = hardwareMap.dcMotor.get("motor1");
        leftRear = hardwareMap.dcMotor.get("motor2");
        rightFront = hardwareMap.dcMotor.get("motor3");
        rightRear = hardwareMap.dcMotor.get("motor4");
        arm = hardwareMap.dcMotor.get("motor5");
        //TODO: Implement MecanumDrive class
        //MecanumDrive drive = new MecanumDrive(leftFront, rightFront, leftRear, rightRear, .4, true, true, true, true);
        waitForStart();
        // On Play
        while (opModeIsActive()) {
            if(gamepad2.left_stick_y<-.50){
                claw.setPower(100);
            }
            else if(gamepad2.left_stick_y>.50){
                claw.setPower(-100);
            }
            else {
                claw.setPower(0);
            }
            if(gamepad2.right_stick_y<-.50){
                arm.setPower(.5);
            }
            else if(gamepad2.right_stick_y>.50){
                arm.setPower(-.5);
            }
            else {
                arm.setPower(0);
            }

            //Forwards
            if (gamepad1.left_stick_y < -.50) {
                leftFront.setPower(-1);
                leftRear.setPower(-1);
                rightFront.setPower(1);
                rightRear.setPower(1);
            }

            //Backwards
            else if (gamepad1.left_stick_y > .50) {
                leftFront.setPower(1);
                leftRear.setPower(1);
                rightFront.setPower(-1);
                rightRear.setPower(-1);
            }
            //Left
            else if(gamepad1.left_stick_x<-.50){
                leftFront.setPower(1);
                leftRear.setPower(-1);
                rightFront.setPower(1);
                rightRear.setPower(-1);
            }

            //Right
            else if(gamepad1.left_stick_x>.50){
                leftFront.setPower(-1);
                leftRear.setPower(1);
                rightFront.setPower(-1);
                rightRear.setPower(1);
            }

            //RightForwardDiagonal
            else if(gamepad1.right_stick_y<-.50){
                leftFront.setPower(-1);
                leftRear.setPower(0);
                rightFront.setPower(0);
                rightRear.setPower(-1);
            }

            //LeftForwardDiagonal
            else if(gamepad1.right_stick_x<-.50){
                leftFront.setPower(-1);
                leftRear.setPower(0);
                rightFront.setPower(0);
                rightRear.setPower(-1);
            }

            //RightRearDiagonal
            else if(gamepad1.right_stick_y>.50){
                leftFront.setPower(-0.75);
                leftRear.setPower(0);
                rightFront.setPower(0);
                rightRear.setPower(-0.75);
            }

            //LeftRearDiagonal
            else if(gamepad1.right_stick_x>.50){
                leftFront.setPower(0);
                leftRear.setPower(0.75);
                rightFront.setPower(0.75);
                rightRear.setPower(0);
            }

            //ClockwiseTurn
            else if(gamepad1.right_bumper){
                leftFront.setPower(0.75);
                leftRear.setPower(-0.75);
                rightFront.setPower(0.75);
                rightRear.setPower(-0.75);
            }

            //CounterClockwiseTurn
            else if(gamepad1.left_bumper){
                leftFront.setPower(-0.75);
                leftRear.setPower(0.75);
                rightFront.setPower(-0.75);
                rightRear.setPower(0.75);
            }
            //ClockwiseTurnRearAxis
            else if (gamepad1.x){
                leftFront.setPower(0.75);
                leftRear.setPower(0);
                rightFront.setPower(0.75);
                rightRear.setPower(0);
            }

            //CounterClockwiseTurnRearAxis
            else if (gamepad1.y){
                leftFront.setPower(-0.75);
                leftRear.setPower(0);
                rightFront.setPower(-0.75);
                rightRear.setPower(0);
            }

            //ClockwiseTurnFrontAxis
            else if (gamepad1.a){
                leftFront.setPower(0);
                leftRear.setPower(-0.75);
                rightFront.setPower(0);
                rightRear.setPower(-0.75);
            }

            //CounterClockwiseTurnFrontAxis
            else if (gamepad1.b){
                leftFront.setPower(0);
                leftRear.setPower(0.75);
                rightFront.setPower(0);
                rightRear.setPower(0.75);
            }

            //RearRightCornering
            else if (gamepad1.dpad_up){
                leftFront.setPower(0.75);
                leftRear.setPower(-0.75);
                rightFront.setPower(0);
                rightRear.setPower(0);
            }

            //RearLeftCornering
            else if (gamepad1.dpad_down){
                leftFront.setPower(0);
                leftRear.setPower(0);
                rightFront.setPower(-0.75);
                rightRear.setPower(0.75);
            }

            //FrontRightCornering
            else if (gamepad1.dpad_left){
                leftFront.setPower(-0.75);
                leftRear.setPower(0.75);
                rightFront.setPower(0);
                rightRear.setPower(0);
            }

            //FrontLeftCornering
            else if (gamepad1.dpad_right){
                leftFront.setPower(0);
                leftRear.setPower(0);
                rightFront.setPower(0.75);
                rightRear.setPower(-0.75);
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
