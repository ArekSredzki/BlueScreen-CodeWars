package com.bluescreen.codewars;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import java.util.List;

import static android.hardware.Sensor.TYPE_GYROSCOPE;
/**
 * Created by sredzki on 2/22/2014.
 */
public class MainGyroscope extends Activity implements SensorEventListener {

    private SensorManager sManager;

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        //if sensor is unreliable, return void
        if (sensorEvent.accuracy == SensorManager.SENSOR_STATUS_UNRELIABLE)
        {
            return;
        }
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {



    }

    // Determines whether the gyroscope is available
    public boolean isAvailable() {
        Boolean sensorAvailable = false;
        List<Sensor> sensorList = sManager.getSensorList(Sensor.TYPE_ALL);
//        for(int i=0;i<sensorList.size();i++){
//
//            if(sensorList.get(i) == TYPE_GYROSCOPE){
//                sensorAvailable = true;
//            }
//        }
        if (sensorList.contains(TYPE_GYROSCOPE)) {
            sensorAvailable = true;
            System.out.print(sensorAvailable);
        }
        return sensorAvailable;
    }
}
