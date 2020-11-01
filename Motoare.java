package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Motoare extends LinearOpMode {

    // MOTOARE


    // DECLARARE

    public DcMotor left = null;






    @Override
    public void runOpMode() throws InterruptedException {

        left = hardwareMap.get(DcMotor.class, "left");
        DcMotor right = hardwareMap.get(DcMotor.class, "right");


        left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        left.setDirection(DcMotorSimple.Direction.FORWARD);
        right.setDirection(DcMotorSimple.Direction.REVERSE);

        left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT); // sau BRAKE
        right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        left.setPower(0);
        right.setPower(0);

        waitForStart();
        if(opModeIsActive()){}

        left.setPower(1);
        right.setPower(1);

        sleep(5000);

        left.setPower(0);
        right.setPower(0);




    }
}
