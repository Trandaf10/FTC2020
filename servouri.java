package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class servouri extends LinearOpMode {

    public Servo abc = null;


    @Override
    public void runOpMode() throws InterruptedException {


        abc = hardwareMap.get(Servo.class, "cv");
        CRServo xyz = hardwareMap.get(CRServo.class, "xyz");

        waitForStart();

        while(opModeIsActive() && !isStopRequested()){

            abc.setPosition(0.5); // 0 -> 1
            xyz.setPower(1); // 0 -> 1

        }
    }
}
