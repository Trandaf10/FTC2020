package org.firstinspires.ftc.teamcode;

import android.graphics.Color;
import android.provider.CalendarContract;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

public class SenzorCuloare extends LinearOpMode {

    public ColorSensor culoare = null;

    @Override
    public void runOpMode() throws InterruptedException {

        culoare = hardwareMap.get(ColorSensor.class, "sen_culoare");


        waitForStart();

        while(opModeIsActive() && !isStopRequested()){

            // robotul se misca in pozitia x si trebuie sa recunoasca daca obiectul din fata lui este
            // rosu sau albastru

            if(culoare.blue() < 10 && culoare.green() < 10){
                telemetry.addLine("Obiectul este rosu");
                telemetry.update();
            }
            if(culoare.red() < 10 && culoare.green() < 10){
                telemetry.addLine("Obiectul este albastru");
                telemetry.update();
            }
            // culoare.alpha();

            culoare.blue(); culoare.red(); culoare.green(); culoare.alpha();

        }
    }
}
