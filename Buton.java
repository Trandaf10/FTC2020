package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DigitalChannel;

public class Buton extends LinearOpMode {

    DigitalChannel culisantaCoborataLaMaxim = null;

    @Override
    public void runOpMode() throws InterruptedException {

        culisantaCoborataLaMaxim = hardwareMap.get(DigitalChannel.class, "butonCulisanta");

        culisantaCoborataLaMaxim.setMode(DigitalChannel.Mode.INPUT);
        waitForStart();

        while(opModeIsActive() && !isStopRequested()){

            if (culisantaCoborataLaMaxim.getState() == true) {
                telemetry.addLine("Butonul nu este apasat");
            } else {
                telemetry.addLine("Butonul este apasat");
            }

            telemetry.update();
        }



    }
}
